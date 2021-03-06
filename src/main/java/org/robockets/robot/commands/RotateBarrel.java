package org.robockets.robot.commands;

import org.robockets.robot.Robot;
import org.robockets.robot.RobotMap;
import org.robockets.robot.XAxisRelativeDirection;

import edu.wpi.first.wpilibj.command.Command;

/**
 * A Command that rotates the Barrel
 * @author Jake Backer
 */

public class RotateBarrel extends Command {

	private XAxisRelativeDirection direction;

    private boolean started;
    private boolean finished;
	
    public RotateBarrel(XAxisRelativeDirection direction) {
        requires(Robot.barrel);
        this.direction = direction;

    }

    protected void initialize() {
        started = true;
        finished = false;
    }

    protected void execute() {
        Robot.barrel.rotate(direction);

        if (started) {
            started = !RobotMap.barrelLimitSwitch.get();
        } else {
            finished = !RobotMap.barrelLimitSwitch.get();
        }

    }

    protected boolean isFinished() {
        return finished;
    }

    protected void end() {
    	RobotMap.barrelRotationMotor.set(0);
    }
    
    protected void interrupted() {
    	end();
    }
}

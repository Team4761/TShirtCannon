package org.usfirst.frc.team4761.robot.commands;

import org.usfirst.frc.team4761.robot.Robot;
import org.usfirst.frc.team4761.robot.RobotMap;
import org.usfirst.frc.team4761.robot.XAxisRelativeDirection;

import edu.wpi.first.wpilibj.command.Command;

/**
 * A Command that rotates the Barrel
 * @author Jake Backer
 */

public class RotateBarrel extends Command {

	private XAxisRelativeDirection direction;

    //private double initialCount;
    //private final double TICKS_PER_BARREL = 442.0;
	
    public RotateBarrel(XAxisRelativeDirection direction) {
        requires(Robot.barrel);
        this.direction = direction;
    }

    protected void initialize() {
        //setTimeout(1);
        //initialCount = RobotMap.barrelRotationEncoder.get();
    }

    protected void execute() {
        Robot.barrel.rotate(direction);
        /*if (RobotMap.barrelLimitSwitch.get()) {
            Robot.barrel.stop();
        }*/
    }

    protected boolean isFinished() {
        //return isTimedOut();
        //return ((Math.abs(RobotMap.barrelRotationEncoder.get() - initialCount) >= TICKS_PER_BARREL) || RobotMap.barrelLimitSwitch.get());
        return RobotMap.barrelLimitSwitch.get();
        //return false;
    }

    protected void end() {
    	RobotMap.barrelRotationMotor.set(0);
    }
    
    protected void interrupted() {
    	end();
    }
}

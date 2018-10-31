package org.robockets.robot.commands;

import org.robockets.robot.Robot;
import org.robockets.robot.RobotMap;
import org.robockets.robot.ZAxisRelativeDirection;

import edu.wpi.first.wpilibj.command.Command;

/**
 * @author Brian Shin
 * A Command to adjust the barrel angle.
 */
public class AdjustShooterAngle extends Command {

    private ZAxisRelativeDirection direction;

    public AdjustShooterAngle(ZAxisRelativeDirection direction) {
    	requires(Robot.shooter);
        this.direction = direction;
    }

    protected void initialize() {
//        setTimeout(0.4);
    }

    protected void execute() {
        Robot.shooter.changeAngle(direction);
    }

    protected boolean isFinished() {
       // return isTimedOut();
        return false;
    }

    protected void end() {
        RobotMap.barrelAngleMotor.set(0);
    }

    protected void interrupted() {
    	end();
    }
}

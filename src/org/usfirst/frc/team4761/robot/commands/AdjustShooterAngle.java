package org.usfirst.frc.team4761.robot.commands;

import org.usfirst.frc.team4761.robot.Robot;
import org.usfirst.frc.team4761.robot.RobotMap;
import org.usfirst.frc.team4761.robot.ZAxisRelativeDirection;

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
        setTimeout(1);
    }

    protected void execute() {
        /*if (stop) {
            Robot.shooter.stop();
        } else {*/
            Robot.shooter.changeAngle(direction);
        //}
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
        RobotMap.barrelAngleMotor.set(0);
    }

    protected void interrupted() {
    	end();
    }
}

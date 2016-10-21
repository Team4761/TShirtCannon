package org.usfirst.frc.team4761.robot.commands;

import org.usfirst.frc.team4761.robot.Robot;
import org.usfirst.frc.team4761.robot.ZAxisRelativeDirection;

import edu.wpi.first.wpilibj.command.Command;

/**
 * @author Brian Shin
 * A Command to adjust the barrel angle.
 */
public class AdjustShooterAngle extends Command {

	ZAxisRelativeDirection direction;
	
    public AdjustShooterAngle(ZAxisRelativeDirection direction) {
    	requires(Robot.shooter);
    	this.direction = direction;
    }

    protected void initialize() {
    	Robot.shooter.rotate(direction);
    }

    protected void execute() {
    	
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    	
    }

    protected void interrupted() {
    	end();
    }
}

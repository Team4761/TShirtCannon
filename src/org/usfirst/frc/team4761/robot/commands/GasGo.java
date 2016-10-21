package org.usfirst.frc.team4761.robot.commands;

import org.usfirst.frc.team4761.robot.OI;
import org.usfirst.frc.team4761.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * @author Brian Shin
 * Drive command, connects the user input with the robot.
 */
public class GasGo extends Command {

	double translate;
	double rotate;
	
    public GasGo() {
        requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	translate = OI.joystick.getRawAxis(1);
    	rotate = OI.joystick.getRawAxis(4);
    	
    	Robot.drivetrain.driveArcade(translate, -rotate);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}

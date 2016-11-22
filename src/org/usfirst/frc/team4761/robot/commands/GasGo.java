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

    protected void initialize() {
    }

    protected void execute() {
    	translate = OI.joystick.getRawAxis(1);
    	rotate = OI.joystick.getRawAxis(4);
    	
    	Robot.drivetrain.driveArcade(translate, -rotate);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.drivetrain.stop();
    }

    protected void interrupted() {
    	end();
    }
}

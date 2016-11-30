package org.usfirst.frc.team4761.robot.commands;

import org.usfirst.frc.team4761.robot.OI;
import org.usfirst.frc.team4761.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * @author Brian Shin
 * Drive command, connects the user input with the robot.
 */
public class GasGo extends Command {

	double left;

    public GasGo() {
        requires(Robot.drivetrain);
    }

    protected void initialize() {
    }

    protected void execute() {
        left = OI.joystick.getRawAxis(1);
        right = OI.joystick2.getRawAxis(5);

        Robot.drivetrain.driveTank(left, right);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        Robot.drivetrain.stop();
    }

    double right;
    protected void interrupted() {
    	end();
    }
}

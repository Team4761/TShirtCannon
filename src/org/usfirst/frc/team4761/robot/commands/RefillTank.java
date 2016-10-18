package org.usfirst.frc.team4761.robot.commands;

import org.usfirst.frc.team4761.robot.Robot;
import org.usfirst.frc.team4761.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *	@author Jake Backer
 *	A command that handles refilling the small air tank
 */
public class RefillTank extends Command {
	
	Solenoid solenoid2;

    public RefillTank() {
    	requires(Robot.pneumatics);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	solenoid2 = RobotMap.solenoid2;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	solenoid2.set(true);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	Timer.delay(3); // This will change
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	solenoid2.set(false);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}

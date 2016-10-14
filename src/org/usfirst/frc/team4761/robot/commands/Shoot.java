package org.usfirst.frc.team4761.robot.commands;

import org.usfirst.frc.team4761.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * A Command used for shooting the t-shirt cannon.
 */
public class Shoot extends Command {

    public Shoot() {
        requires(Robot.shooter);
    }

    protected void initialize() {
    	
    }

    protected void execute() {
    	
    }

    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	
    }

    protected void interrupted() {
    	end();
    }
}

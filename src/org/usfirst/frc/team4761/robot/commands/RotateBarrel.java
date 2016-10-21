package org.usfirst.frc.team4761.robot.commands;

import org.usfirst.frc.team4761.robot.Robot;
import org.usfirst.frc.team4761.robot.XAxisRelativeDirection;

import edu.wpi.first.wpilibj.command.Command;

/**
 * A Command that rotates the Barrel
 * @author Jake Backer
 */
public class RotateBarrel extends Command {

	XAxisRelativeDirection direction;
	
    public RotateBarrel(XAxisRelativeDirection direction) {
        requires(Robot.barrel);
        this.direction = direction;
    }

    protected void initialize() {
    	Robot.barrel.rotate(direction);
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

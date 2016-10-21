package org.usfirst.frc.team4761.robot.commands;

import org.usfirst.frc.team4761.robot.Robot;
import org.usfirst.frc.team4761.robot.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 * A Command used for shooting the t-shirt cannon.
 */
public class Shoot extends Command {

    public Shoot() {
        requires(Robot.shooter);
        requires(Robot.pneumatics);
    }

    protected void initialize() {
        Robot.shooter.shoot(RobotMap.solenoid1);
    }

    protected void execute() {
        
    }

    protected boolean isFinished() {
    	Timer.delay(3);
        return true;
    }

    protected void end() {
    	
    }

    protected void interrupted() {
    	end();
    }
}

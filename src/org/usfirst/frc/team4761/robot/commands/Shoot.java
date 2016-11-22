package org.usfirst.frc.team4761.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
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
    }

    protected void initialize() {
        Robot.shooter.shoot(RobotMap.solenoid);
        setTimeout(SmartDashboard.getNumber("SolenoidTimeout"));
    }

    protected void execute() {

    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    	Robot.shooter.stop(RobotMap.solenoid);
    }

    protected void interrupted() {
    	end();
    }
}

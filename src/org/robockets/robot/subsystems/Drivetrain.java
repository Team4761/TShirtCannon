package org.robockets.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.robockets.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * A Subsystem for controlling the drivetrain
 * @author Jake Backer and Brian Shin
 */
public class Drivetrain extends Subsystem {

	public static final double DEFAULT_SPEED = 0.75;

    public void initDefaultCommand() {
    	
    }
    
    public void driveArcade(double leftValue, double rightValue) {
    	double speedMultiplier = SmartDashboard.getNumber("Driving Speed", DEFAULT_SPEED);

    	RobotMap.robotDrive.arcadeDrive(-leftValue*speedMultiplier, rightValue*speedMultiplier);
    }

    /*
    public void driveTank(double leftValue, double rightValue) {
    	RobotMap.robotDrive.tankDrive(leftValue, rightValue);
    }*/
    
    public void stop() {
    	driveArcade(0, 0);
    }
}


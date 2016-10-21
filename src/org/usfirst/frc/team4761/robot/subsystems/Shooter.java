package org.usfirst.frc.team4761.robot.subsystems;

import org.usfirst.frc.team4761.robot.DummyPIDOutput;
import org.usfirst.frc.team4761.robot.EncoderPIDSource;
import org.usfirst.frc.team4761.robot.Robot;
import org.usfirst.frc.team4761.robot.RobotMap;
import org.usfirst.frc.team4761.robot.ZAxisRelativeDirection;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * A Subsystem that controls the shooter
 */
public class Shooter extends Subsystem {
	
	public final PIDController controller;

	public Shooter() {
		controller = new PIDController(0, 0, 0, 
		new EncoderPIDSource(RobotMap.barrelAngleEncoder, 1, PIDSourceType.kDisplacement), new DummyPIDOutput());
		
		controller.disable();
		controller.setOutputRange(-1.0, 1.0);
		controller.setPercentTolerance(5.0); // This is subject to change
		
	}
	
    public void initDefaultCommand() {
    	
    }
    
    public void shoot(Solenoid solenoid) {
    	Robot.pneumatics.shooterFill(solenoid);
    }
    
    public void rotate(ZAxisRelativeDirection direction) {
    	// TODO: Implement turning (must be very precise)
    	if (direction == ZAxisRelativeDirection.UP) {
    		controller.setSetpoint(controller.getSetpoint() + 10);
    		RobotMap.barrelAngleMotor.set(-controller.get()); // Subject to change
    	} else {
    		controller.setSetpoint(controller.getSetpoint() - 10);
    		RobotMap.barrelAngleMotor.set(controller.get()); 
    	}
    }
}


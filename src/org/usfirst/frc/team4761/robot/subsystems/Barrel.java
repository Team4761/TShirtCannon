package org.usfirst.frc.team4761.robot.subsystems;

import org.usfirst.frc.team4761.robot.DummyPIDOutput;
import org.usfirst.frc.team4761.robot.EncoderPIDSource;
import org.usfirst.frc.team4761.robot.RobotMap;
import org.usfirst.frc.team4761.robot.XAxisRelativeDirection;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * @author Simon Andrews and Jake Backer (but mostly Jake Backer)
 */
public class Barrel extends Subsystem {
	
	public static PIDController controller;

    public Barrel() {
    	controller = new PIDController(0, 0, 0,
    	new EncoderPIDSource(RobotMap.barrelRotationEncoder, 1, PIDSourceType.kDisplacement), new DummyPIDOutput());
    	
    	controller.disable();
		controller.setOutputRange(-1.0, 1.0);
		controller.setPercentTolerance(1.0); // This is subject to change

		SmartDashboard.putNumber("RotationP", controller.getP());
		SmartDashboard.putNumber("RotationI", controller.getI());
		SmartDashboard.putNumber("RotationD", controller.getD());
		SmartDashboard.putNumber("RotationSetpoint", 0);

	}

	public void initDefaultCommand() {
		
    }
	
	public void rotate(XAxisRelativeDirection direction) {
		if(direction == XAxisRelativeDirection.LEFT) {
			//controller.setSetpoint(controller.getSetpoint()-1);
			//RobotMap.barrelRotationMotor.set(-controller.get());
			RobotMap.barrelRotationMotor.set(0.7);
		} else if (direction == XAxisRelativeDirection.RIGHT) {
			//controller.setSetpoint(controller.getSetpoint()+1);
			//RobotMap.barrelRotationMotor.set(controller.get());
			RobotMap.barrelRotationMotor.set(-0.6);
		} else {
			RobotMap.barrelRotationMotor.set(0);
		}
	}

	public void rotatePID(XAxisRelativeDirection direction) {
		// controller.setPID(SmartDashboard.getNumber("RotationP"),SmartDashboard.getNumber("RotationI"),SmartDashboard.getNumber("RotationD"));
		// controller.enable();
		/*if (direction == XAxisRelativeDirection.LEFT) {
			controller.setSetpoint(controller.getSetpoint()-10); // Subject to change
			RobotMap.barrelRotationMotor.set(controller.get());
		} else if (direction == XAxisRelativeDirection.RIGHT) {
			controller.setSetpoint(controller.getSetpoint() + 10); // Subject to change
			RobotMap.barrelRotationMotor.set(controller.get());
		}*/

		//controller.setSetpoint(controller.getSetpoint() + 10); // Subject to change

		RobotMap.barrelRotationMotor.set(controller.get());
	}

	public void startPID() {
		controller.setPID(SmartDashboard.getNumber("RotationP"),SmartDashboard.getNumber("RotationI"),SmartDashboard.getNumber("RotationD"));
		controller.setSetpoint(SmartDashboard.getNumber("RotationSetpoint"));
		System.out.println(controller.getP());
		System.out.println(controller.getSetpoint());
		controller.enable();

	}

	public void stop() {
		controller.disable();
		RobotMap.barrelRotationMotor.set(0);
	}
}


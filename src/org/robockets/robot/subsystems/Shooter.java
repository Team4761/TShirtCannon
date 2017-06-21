package org.robockets.robot.subsystems;

import org.robockets.robot.RobotMap;
import org.robockets.robot.ZAxisRelativeDirection;
import org.usfirst.frc.team4761.robot.*;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * A Subsystem that controls the shooter
 */
public class Shooter extends Subsystem {

	public Shooter() {

	}
	
    public void initDefaultCommand() {
    	
    }
    
    public void shoot(Solenoid solenoid) {
    	//Robot.pneumatics.shooterFill(solenoid);
		solenoid.set(true);
    }
    
    public void changeAngle(ZAxisRelativeDirection direction) {

		if (direction == ZAxisRelativeDirection.UP) {
			RobotMap.barrelAngleMotor.set(0.5);
		} else if (direction == ZAxisRelativeDirection.DOWN) {
			RobotMap.barrelAngleMotor.set(-0.5);
		}

		/*if (OI.joystick.getRawButton(1)) {
			RobotMap.barrelAngleMotor.set(1); // Subject to change

		} else if (OI.joystick.getRawButton(2)) {
			RobotMap.barrelAngleMotor.set(-1);
		} else {
			RobotMap.barrelAngleMotor.set(0);
		}*/
    }

	public void stop(Solenoid solenoid) {
		solenoid.set(false);
		RobotMap.barrelAngleMotor.set(0);
	}
}


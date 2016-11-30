package org.usfirst.frc.team4761.robot.subsystems;

import org.usfirst.frc.team4761.robot.RobotMap;
import org.usfirst.frc.team4761.robot.XAxisRelativeDirection;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * @author Simon Andrews, Jake Backer (but mostly Jake Backer)
 */
public class Barrel extends Subsystem {

    public Barrel() {

	}

	public void initDefaultCommand() {
		
    }
	
	public void rotate(XAxisRelativeDirection direction) {
		if(direction == XAxisRelativeDirection.LEFT) {
			RobotMap.barrelRotationMotor.set(0.7);
		} else if (direction == XAxisRelativeDirection.RIGHT) {
			RobotMap.barrelRotationMotor.set(-0.7);
		} else {
			RobotMap.barrelRotationMotor.set(0);
		}
	}

	public void stop() {
		RobotMap.barrelRotationMotor.set(0);
	}
}


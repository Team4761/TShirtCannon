package org.usfirst.frc.team4761.robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDSourceType;

public class BarrelRotationPIDSource implements PIDSource {

	Encoder encoder = RobotMap.barrelAngleEncoder;
	double factor = 1.0;
	
	@Override
	public void setPIDSourceType(PIDSourceType pidSource) {
		encoder.setPIDSourceType(pidSource);
	}

	@Override
	public PIDSourceType getPIDSourceType() {
		// Currently ignoring
		return encoder.getPIDSourceType();
	}

	@Override
	public double pidGet() {
		return encoder.getDistance() * factor;
	}

}
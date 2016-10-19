package org.usfirst.frc.team4761.robot;

import edu.wpi.first.wpilibj.PIDOutput;

public class DummyPIDOutput implements PIDOutput{

	private double value = 0;
	
	@Override
	public void pidWrite(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return this.value;
	}

}

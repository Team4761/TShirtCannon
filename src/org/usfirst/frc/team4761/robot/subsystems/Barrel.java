package org.usfirst.frc.team4761.robot.subsystems;

import org.usfirst.frc.team4761.robot.XAxisRelativeDirection;

import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 * @author Simon Andrews
 */
public class Barrel extends PIDSubsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public Barrel(double p, double i, double d) {
		super(p, i, d);
	}

	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

	@Override
	protected double returnPIDInput() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected void usePIDOutput(double arg0) {
		// TODO Auto-generated method stub
		
	}
}


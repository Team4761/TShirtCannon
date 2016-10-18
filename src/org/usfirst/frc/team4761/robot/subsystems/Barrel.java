package org.usfirst.frc.team4761.robot.subsystems;

import org.usfirst.frc.team4761.robot.RobotMap;
import org.usfirst.frc.team4761.robot.XAxisRelativeDirection;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 * @author Simon Andrews
 */
public class Barrel extends PIDSubsystem {
	
	Encoder angleEncoder = RobotMap.barrelAngleEncoder;
	
    public Barrel(double p, double i, double d) {
		super("Barrel", p, i, d);
	}

	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

	@Override
	protected double returnPIDInput() {
		// TODO Auto-generated method stub
		return angleEncoder.pidGet();
	}

	@Override
	protected void usePIDOutput(double arg0) {
		// TODO Auto-generated method stub
		
	}
}


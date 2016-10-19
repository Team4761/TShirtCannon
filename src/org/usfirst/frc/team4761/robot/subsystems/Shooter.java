package org.usfirst.frc.team4761.robot.subsystems;

import org.usfirst.frc.team4761.robot.XAxisRelativeDirection;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * A Subsystem that controls the shooter
 */
public class Shooter extends Subsystem {
	
	public final PIDController controller;

    public void initDefaultCommand() {
    	
    }
    
    public void shoot(Solenoid solenoid) {
    	// TODO: Implement shooting
    	
    }
    
    public void rotate(XAxisRelativeDirection direction) {
    	// TODO: Implement turning (must be very precise)
    }
}


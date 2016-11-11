package org.usfirst.frc.team4761.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * A subsystem for controlling the pneumatics on the robot
 */
public class PneumaticsSubsystem extends Subsystem {
	
    public void initDefaultCommand() {
    	
    }
    
    /**
     * Method to shoot and refill the tank
     * @author Jake Backer and Michael Capone
     * @param solenoid Solenoid to open and close
     */
    public void shooterFill(Solenoid solenoid) { // Michael named this
    	solenoid.set(true);

    	solenoid.set(false);
    }
}


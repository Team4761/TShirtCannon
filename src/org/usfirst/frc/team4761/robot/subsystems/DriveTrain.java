package org.usfirst.frc.team4761.robot.subsystems;

import org.usfirst.frc.team4761.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
	public void drive(double x, double y, double twist){
		RobotMap.robotDrive.mecanumDrive_Cartesian(x, y, twist, 0);
	}
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public DriveTrain(){
		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}


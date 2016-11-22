package org.usfirst.frc.team4761.robot;

import edu.wpi.first.wpilibj.*;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static TalonSRX frontLeft = new TalonSRX(3);
	public static TalonSRX frontRight = new TalonSRX(2);
	public static TalonSRX backLeft = new TalonSRX(1);
	public static TalonSRX backRight = new TalonSRX(0);
	
	public static RobotDrive robotDrive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
	
	// Dummy ports on the encoders for now
	public static Encoder barrelRotationEncoder = new Encoder(8, 9);
	
	public static TalonSRX barrelRotationMotor = new TalonSRX(4);
	public static TalonSRX barrelAngleMotor = new TalonSRX(5);

	public static Solenoid solenoid = new Solenoid(0);

	public static DigitalInput barrelLimitSwitch = new DigitalInput(8);
	
}

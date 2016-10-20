package org.usfirst.frc.team4761.robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.TalonSRX;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static TalonSRX frontLeft = new TalonSRX(1);
	public static TalonSRX frontRight = new TalonSRX(0);
	public static TalonSRX backLeft = new TalonSRX(3);
	public static TalonSRX backRight = new TalonSRX(2);
	
	public static RobotDrive robotDrive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
	
	// Dummy ports on the encoders for now
	public static Encoder barrelRotationEncoder = new Encoder(0, 1);
	public static Encoder barrelAngleEncoder = new Encoder(2, 3);
	
	public static TalonSRX barrelRotationMotor = new TalonSRX(4);
	public static TalonSRX barrelAngleMotor = new TalonSRX(9);

	public static Solenoid solenoid1 = new Solenoid(5); // TEMP PORT
	public static Solenoid solenoid2 = new Solenoid(6);
	
	public static Encoder shooterEncoder = new Encoder(7, 8); // Ports maybe
	public static Encoder angleEncoder = new Encoder(10, 11);
}

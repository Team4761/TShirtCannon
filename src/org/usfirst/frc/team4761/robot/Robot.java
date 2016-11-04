package org.usfirst.frc.team4761.robot;

import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team4761.robot.commands.AdjustShooterAngle;
import org.usfirst.frc.team4761.robot.commands.GasGo;
import org.usfirst.frc.team4761.robot.commands.RotateBarrel;
import org.usfirst.frc.team4761.robot.commands.Shoot;
import org.usfirst.frc.team4761.robot.subsystems.Barrel;
import org.usfirst.frc.team4761.robot.subsystems.Drivetrain;
import org.usfirst.frc.team4761.robot.subsystems.PneumaticsSubsystem;
import org.usfirst.frc.team4761.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static OI oi;
	public static Shooter shooter;
	public static PneumaticsSubsystem pneumatics;
	public static Barrel barrel;
	public static Drivetrain drivetrain;

    Command autonomousCommand;
    Command gasGo;
	//Command adjustAngle;
    SendableChooser chooser;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		oi = new OI();
		shooter = new Shooter();
		pneumatics = new PneumaticsSubsystem();
		barrel = new Barrel();
		drivetrain = new Drivetrain();
		gasGo = new GasGo();
		//adjustAngle = new AdjustShooterAngle();
    }
	
	/**
     * This function is called once each time the robot enters Disabled mode.
     * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
     */
    public void disabledInit(){
    	
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select between different autonomous modes
	 * using the dashboard. The sendable chooser code works with the Java SmartDashboard. If you prefer the LabVIEW
	 * Dashboard, remove all of the chooser code and uncomment the getString code to get the auto name from the text box
	 * below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the chooser code above (like the commented example)
	 * or additional comparisons to the switch structure below with additional strings & commands.
	 */
    public void autonomousInit() {
       
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		NetworkTable.flush();
    	gasGo.start();
		//adjustAngle.start();
		SmartDashboard.putData(new Shoot());
		//SmartDashboard.putData(new RotateBarrel());
		SmartDashboard.putData("Rotate Left", new RotateBarrel(XAxisRelativeDirection.LEFT));
		SmartDashboard.putData("Rotate Right", new RotateBarrel(XAxisRelativeDirection.RIGHT));
		SmartDashboard.putData("Rotate Stop", new RotateBarrel(true)); // Stop

		SmartDashboard.putData("Angle Up", new AdjustShooterAngle(ZAxisRelativeDirection.UP));
		SmartDashboard.putData("Angle Down", new AdjustShooterAngle(ZAxisRelativeDirection.DOWN));
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();

		// This location is temporary
		Barrel.controller.setPID(SmartDashboard.getNumber("RotationP", 0), SmartDashboard.getNumber("RotationI", 0), SmartDashboard.getNumber("RotationD", 0));
		Barrel.controller.setSetpoint(SmartDashboard.getNumber("RotationSetpoint", 0));

		if (SmartDashboard.getBoolean("RotationPIDGo", false) && Barrel.controller.isEnabled()) {
			Barrel.controller.enable();
		} else {
			Barrel.controller.disable();
		}

		SmartDashboard.putNumber("Encoder Value", RobotMap.barrelRotationEncoder.get());
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}

package org.robockets.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.robockets.robot.commands.AdjustShooterAngle;
import org.robockets.robot.commands.RotateBarrel;
import org.robockets.robot.commands.Rotaterotate;
import org.robockets.robot.commands.Shoot;
import org.robockets.robot.commands.ShootNRotate;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static Joystick joystick = new Joystick(0);

	JoystickButton aButton = new JoystickButton(joystick, 1);
	JoystickButton bButton = new JoystickButton(joystick, 2);
	JoystickButton xButton = new JoystickButton(joystick, 3);
	JoystickButton yButton = new JoystickButton(joystick, 4);
	JoystickButton leftBumperButton = new JoystickButton(joystick, 5);
	JoystickButton rightBumperButton = new JoystickButton(joystick, 6);
	JoystickButton selectButton = new JoystickButton(joystick, 7);
	JoystickButton startButton = new JoystickButton(joystick, 8);

	public OI() {
		leftBumperButton.whenReleased(new Shoot());
		rightBumperButton.whenReleased(new ShootNRotate());
		bButton.whenReleased(new RotateBarrel(XAxisRelativeDirection.RIGHT));
		xButton.whenReleased(new RotateBarrel(XAxisRelativeDirection.LEFT));
		yButton.whileHeld(new AdjustShooterAngle(ZAxisRelativeDirection.UP));
		aButton.whileHeld(new AdjustShooterAngle(ZAxisRelativeDirection.DOWN));
		selectButton.whileHeld(new Rotaterotate(XAxisRelativeDirection.LEFT));
		startButton.whileHeld(new Rotaterotate(XAxisRelativeDirection.RIGHT));
	}
}

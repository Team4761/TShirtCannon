package org.usfirst.frc.team4761.robot.commands;

import javafx.scene.transform.Rotate;
import org.usfirst.frc.team4761.robot.Robot;
import org.usfirst.frc.team4761.robot.RobotMap;
import org.usfirst.frc.team4761.robot.XAxisRelativeDirection;

import edu.wpi.first.wpilibj.command.Command;

/**
 * A Command that rotates the Barrel
 * @author Jake Backer
 */
public class RotateBarrel extends Command {

	XAxisRelativeDirection direction;

    boolean stop;
	
    public RotateBarrel(XAxisRelativeDirection direction) {
        requires(Robot.barrel);
        this.direction = direction;
    }

    public RotateBarrel(boolean stop) {
        this.stop = stop;
    }

    protected void initialize() {
        setTimeout(1);
    }

    protected void execute() {
        Robot.barrel.rotate(direction);
        System.out.println("PRINT");
        /*if (stop) {
            Robot.barrel.stop();
        } else {*/

        //}
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    	RobotMap.barrelRotationMotor.set(0);
    }
    
    protected void interrupted() {
    	end();
    }
}

package org.usfirst.frc.team4761.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4761.robot.Robot;
import org.usfirst.frc.team4761.robot.XAxisRelativeDirection;

/**
 * @author Jake Backer
 */
public class Rotaterotate extends Command {

    XAxisRelativeDirection direction;

    public Rotaterotate(XAxisRelativeDirection direction) {
        this.direction = direction;
    }

    protected void initialize() {

    }

    protected void execute() {
        Robot.barrel.rotate(direction);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        Robot.barrel.stop();
    }

    protected void interrupted() {
        end();
    }
}

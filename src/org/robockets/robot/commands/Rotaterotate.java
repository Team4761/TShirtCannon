package org.robockets.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.robockets.robot.Robot;
import org.robockets.robot.XAxisRelativeDirection;

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

    }

    protected void interrupted() {
        end();
    }
}

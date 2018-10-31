package org.robockets.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 * @author Jake Backer
 */
public class Wait extends Command {

    public Wait() {

    }

    protected void initialize() {
        setTimeout(1);
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {

    }

    protected void interrupted() {
        end();
    }
}

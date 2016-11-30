package org.usfirst.frc.team4761.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 * @author Jake Backer, Mathias Kools
 */
public class Wait extends Command {

    public double time = 0.75;

    public Wait(double time) {
        this.time = time;
    }

    public Wait() {

    }

    protected void initialize() {
        setTimeout(time);
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

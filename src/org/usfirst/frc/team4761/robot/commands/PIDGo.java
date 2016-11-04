package org.usfirst.frc.team4761.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4761.robot.Robot;

/**
 * @author Jake Backer
 */
public class PIDGo extends Command {

    public PIDGo() {
        requires(Robot.barrel);
    }

    protected void initialize() {
        Robot.barrel.startPID();
    }

    protected void execute() {

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

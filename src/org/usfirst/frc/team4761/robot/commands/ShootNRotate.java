package org.usfirst.frc.team4761.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team4761.robot.XAxisRelativeDirection;

/**
 * @author Jake Backer
 */
public class ShootNRotate extends CommandGroup {

    public ShootNRotate() {
        addSequential(new Shoot());
        addSequential(new Wait());
        addSequential(new RotateBarrel(XAxisRelativeDirection.LEFT));
    }
}

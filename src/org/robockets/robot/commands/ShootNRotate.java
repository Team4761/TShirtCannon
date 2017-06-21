package org.robockets.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.robockets.robot.XAxisRelativeDirection;

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

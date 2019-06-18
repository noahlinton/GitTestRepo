package org.usfirst.frc.team2910.robot;

import org.usfirst.frc.team2910.robot.commands.*;
import org.usfirst.frc.team2910.robot.input.DPadButton;
import org.usfirst.frc.team2910.robot.input.IGamepad;
import org.usfirst.frc.team2910.robot.input.XboxGamepad;
import org.usfirst.frc.team2910.robot.subsystems.ElevatorSubsystem;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    private static final double SOFT_PLACEMENT_VELOCITY = 2.0;
    private static final double SOFT_PLACEMENT_ACCELERATION = 0.5;

    private IGamepad primaryController = new XboxGamepad(0);
    private IGamepad secondaryController = new XboxGamepad(1);

    private Robot mRobot;

    public OI(Robot robot) {
        mRobot = robot;
    }

    public void registerControls() {

        if (true){
<<<<<<< HEAD


            primaryController.getLeftBumperButton().whenPressed(new SetFieldOrientedCommand(mRobot.getDrivetrain(), false));
            primaryController.getLeftBumperButton().whenReleased(new SetFieldOrientedCommand(mRobot.getDrivetrain(), true));
            primaryController.getStartButton().whenPressed(new ZeroDrivetrainGyroCommand(mRobot.getDrivetrain()));
              //hey there
            primaryController.getAButton().whileHeld(new SoftCubePlaceCommand(mRobot.getDrivetrain(), mRobot.getGatherer(), SOFT_PLACEMENT_VELOCITY, SOFT_PLACEMENT_ACCELERATION));
            primaryController.getBButton().whenPressed(new LaunchCubeCommand(mRobot.getGatherer(), 1, 0.5));
            primaryController.getXButton().whenPressed(new LaunchCubeCommand(mRobot.getGatherer(), 1, 0.75));
            primaryController.getYButton().whenPressed(new LaunchCubeCommand(mRobot.getGatherer(), 1, 1));
=======
            if (false){
        
                primaryController.getLeftBumperButton().whenPressed(new SetFieldOrientedCommand(mRobot.getDrivetrain(), false));
                primaryController.getLeftBumperButton().whenReleased(new SetFieldOrientedCommand(mRobot.getDrivetrain(), true));
                primaryController.getStartButton().whenPressed(new ZeroDrivetrainGyroCommand(mRobot.getDrivetrain()));

                primaryController.getAButton().whileHeld(new SoftCubePlaceCommand(mRobot.getDrivetrain(), mRobot.getGatherer(), SOFT_PLACEMENT_VELOCITY, SOFT_PLACEMENT_ACCELERATION));
                primaryController.getBButton().whenPressed(new LaunchCubeCommand(mRobot.getGatherer(), 1, 0.5));
                primaryController.getXButton().whenPressed(new LaunchCubeCommand(mRobot.getGatherer(), 1, 0.75));
                primaryController.getYButton().whenPressed(new LaunchCubeCommand(mRobot.getGatherer(), 1, 1));
>>>>>>> 6c885a164b6535c701fd53131a590a2c15b33f0b

                secondaryController.getLeftJoystickButton().whenPressed(new ChangeElevatorModeCommand(mRobot.getElevator(), ElevatorSubsystem.Mode.CLIMBING));
                secondaryController.getRightJoystickButton().whenPressed(new ChangeElevatorModeCommand(mRobot.getElevator(), ElevatorSubsystem.Mode.REGULAR));

                secondaryController.getLeftBumperButton().whileHeld(new IntakeCubeNoRequireCommand(mRobot.getGatherer(), -0.45, 0, Double.MAX_VALUE));
                secondaryController.getRightBumperButton().whenPressed(new SetElevatorPositionCommand(mRobot.getElevator(), ElevatorSubsystem.GROUND_POSITION));

                secondaryController.getStartButton().whenPressed(new SetElevatorLockCommand(mRobot.getElevator(), true));
                secondaryController.getYButton().whenPressed(new SetElevatorLockCommand(mRobot.getElevator(), false));

                secondaryController.getBButton().whenPressed(new SetElevatorPositionCommand(mRobot.getElevator(), ElevatorSubsystem.CLIMB_POSITION));
                secondaryController.getAButton().whenPressed(new CalibrateElevatorEncoderCommand(mRobot.getElevator()));

                secondaryController.getLeftTriggerButton().whileHeld(new ActuateGathererCommand(mRobot.getGatherer(), true));
                secondaryController.getRightTriggerButton().whileHeld(new ActuateGathererCommand(mRobot.getGatherer(), false));

            }
        }

        // another primaryController
        // another secondaryController

        //another ChangeElevatorModeCommand


    }

    public IGamepad getPrimaryController() {
        return primaryController;
    }

    public IGamepad getSecondaryController() {
        return secondaryController;
    }
}

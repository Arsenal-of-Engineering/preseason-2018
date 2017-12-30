package frc.team6223.robot.commands

import edu.wpi.first.wpilibj.command.Command
import frc.team6223.robot.OI
import frc.team6223.robot.controllers.ArcadeDriveController
import frc.team6223.robot.driveSubsystem
import frc.team6223.robot.operatorInterface

class DriveTrainMovement: Command() {
    override fun initialize() {
        super.initialize()
        driveSubsystem.driveMode = ArcadeDriveController(operatorInterface.primaryJoystick)
    }

    override fun execute() {
        super.execute()
        driveSubsystem.driveMotors()
    }

    override fun isFinished(): Boolean {
        return false
    }

    init {
        requires(driveSubsystem)
    }
}
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.shooter;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotContainer;

public class ShooterShootCommand extends Command {
  /** Creates a new ShooterShootCommand. */
  double speed;

  // creates command to shoot
  public ShooterShootCommand() {
    
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(RobotContainer.m_ShooterSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() 
  {

    RobotContainer.m_ShooterSubsystem.Shooter(RobotContainer.driver.getR2Axis());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) 
  {
    RobotContainer.m_ShooterSubsystem.stopShooter();
  }
  

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

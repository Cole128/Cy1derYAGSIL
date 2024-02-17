// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ElevatorSubsystem extends SubsystemBase {
  private CANSparkMax extendMotorLeft = new CANSparkMax(Constants.MotorConstants.MOTOR_ELEVATOR_LEFT_ID, MotorType.kBrushless);
  private CANSparkMax extendMotorRight = new CANSparkMax(Constants.MotorConstants.MOTOR_ELEVATOR_RIGHT_ID, MotorType.kBrushless);

  /** Creates a new ElevatorSubsystem. */
  public ElevatorSubsystem() {
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void climbExtend(double speed) {
    extendMotorLeft.set(speed);
    extendMotorRight.set(speed);
  }
}
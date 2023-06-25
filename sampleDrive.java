package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "CampRobot (Blocks to Java)")
public class CampRobot extends LinearOpMode {

  private DcMotor left;
  private DcMotor right;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    left = hardwareMap.get(DcMotor.class, "left");
    right = hardwareMap.get(DcMotor.class, "right");

    // Put initialization blocks here.
    left.setDirection(DcMotorSimple.Direction.REVERSE);
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
        // Put loop blocks here.
        left.setPower(-gamepad1.left_stick_y);
        right.setPower(-gamepad1.left_stick_y);
        left.setPower(-gamepad1.right_stick_x);
        right.setPower(gamepad1.right_stick_x);
        telemetry.addData("It is working", "Yes");
        telemetry.update();
      }
    }
  }
}
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class TeleOp extends LinearOpMode {

    DcMotor frontRight;
    DcMotor frontLeft;
    DcMotor backRight;
    DcMotor backLeft;

    @Override
    //remember to comment you slop.
    public void runOpMode() throws InterruptedException {
        initialize();
        //initialize evrything,

        waitForStart();
        //wait for the start button.

        //do what we want to do(where stuff goes wrong)
        moveForeward();



    }

    private void moveForeward() {
        //find the value the gamepad joystick reads.
        double power = gamepad1.right_stick_y;
        //power 1 to -1
        frontRight.setPower(power);
        frontLeft.setPower(power);
        backLeft.setPower(power);
        backRight.setPower(power);
    }

    public void initialize(){
        //do the init stuff


         frontRight = hardwareMap.get(DcMotor.class,"fr");
         frontLeft = hardwareMap.get(DcMotor.class,"fl");
         backRight = hardwareMap.get(DcMotor.class,"br");
         backLeft = hardwareMap.get(DcMotor.class,"bl");
        frontRight.setPower(0);
        frontLeft.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);

    }
}

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="forward")
public class Tutorial extends LinearOpMode {
    private DcMotor motor1;
    private DcMotor motor2;
    private DcMotor motor3;
    private DcMotor motor4;

    @Override
    public void runOpMode() {
        // Initialize motors
        motor1 = hardwareMap.get(DcMotor.class, "motor1");
        motor2 = hardwareMap.get(DcMotor.class, "motor2");
        motor3 = hardwareMap.get(DcMotor.class, "motor3");
        motor4 = hardwareMap.get(DcMotor.class, "motor4");

        waitForStart();

        while (opModeIsActive()) {
            if (gamepad1.a) {
                motor1.setPower(0.25);
                motor3.setPower(0.25);
                motor2.setPower(-0.25);
                motor4.setPower(-0.25);
            } else if (gamepad1.b) {
                motor1.setPower(-0.25);
                motor3.setPower(-0.25);
                motor2.setPower(0.25);
                motor4.setPower(0.25);
            } else {
                // Stop motors if button not pressed
                motor1.setPower(0);
                motor2.setPower(0);
                motor3.setPower(0);
                motor4.setPower(0);
            }
        }
    }
}

// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3319.MyRobot;

import org.usfirst.frc3319.MyRobot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    public Joystick stick;
	public JoystickButton gripperClose;
	public JoystickButton gripperOpen;
	public JoystickButton gripperRaise;
	public JoystickButton gripperLower;
	public JoystickButton elevatorLower;
	public JoystickButton elevatorRaise;
		
	private double SWITCH_HEIGHT = 70000;

    public OI() {

        stick = new Joystick(0);     
		gripperClose = new JoystickButton(stick, 6);
		gripperOpen = new JoystickButton(stick, 5);
		gripperRaise = new JoystickButton(stick, 3);
		gripperLower = new JoystickButton(stick, 4);
		elevatorLower = new JoystickButton(stick, 1);
		elevatorRaise = new JoystickButton(stick, 2);

		
		
		gripperClose.whenPressed(new CloseGripper());
		gripperOpen.whenPressed(new OpenGripper());
		gripperRaise.whenPressed(new RaiseGripper());
		gripperLower.whenPressed(new LowerGripper());
		
		elevatorLower.whileHeld(new LowerElevator());
		elevatorRaise.whileHeld(new RaiseElevator());
		
		


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("DriveWithJoystick", new DriveWithJoystick());
		SmartDashboard.putData("CloseGripper", new CloseGripper());
		SmartDashboard.putData("OpenGripper", new OpenGripper());
		SmartDashboard.putData("RaiseGripper", new RaiseGripper());
		SmartDashboard.putData("LowerGripper", new LowerGripper());
		SmartDashboard.putData("LowerGripper", new LowerElevator());
		SmartDashboard.putData("ZeroEncoders", new ZeroEncoders());
		SmartDashboard.putData("RaiseSwitchHeight", new SetElevatorSetpoint(15000));
		SmartDashboard.putData("LowerToDefaultHeight", new SetElevatorSetpoint(0));
		
		SmartDashboard.putNumber("Proportional", 0.5);
		SmartDashboard.putNumber("Integral", 0.0);
		SmartDashboard.putNumber("Differential", 2.0);
		
    }

    public Joystick getstick() {
        return stick;
    }
    
    public double getXValue() {
    	return stick.getX();
    }
    
    public double getYValue() {
    	return stick.getY();
    }
    
    
    
    public double getRotationLeft() {
    	return stick.getRawAxis(2);
    }
    
    public double getRotationRight() {
    	return stick.getRawAxis(3);
    }
    


}


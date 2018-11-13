package org.usfirst.frc3319.MyRobot.subsystems;

import org.usfirst.frc3319.MyRobot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {
	
	private final SpeedController lift = RobotMap.armLift;
	private final SpeedController left = RobotMap.armLeft;
	private final SpeedController right = RobotMap.armRight;

	@Override
	protected void initDefaultCommand() {

	    

	}
	
	public void driveLeft(double power) {
	    	left.set(power);
	    	right.set(power);
	    }
	    
	public void driveLift(double power) {
	    	lift.set(power);
	    }
}

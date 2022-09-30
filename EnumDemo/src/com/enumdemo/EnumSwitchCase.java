package com.enumdemo;

public class EnumSwitchCase {

	enum Direction {
		NORTH, SOUTH, EAST, WEST
	}

	public static void main(String[] args) {

		Direction dir = Direction.NORTH;

		switch (dir) {
		case NORTH -> System.out.println("North direction");
		case SOUTH -> System.out.println("South direction");
		case EAST -> System.out.println("East direction");
		case WEST -> System.out.println("West direction");
		default -> System.out.println("Not a direction");
		}

	}
}

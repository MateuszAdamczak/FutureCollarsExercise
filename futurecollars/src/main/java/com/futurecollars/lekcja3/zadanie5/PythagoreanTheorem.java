package com.futurecollars.lekcja3.zadanie5;

public class PythagoreanTheorem {

    public static boolean isTriangleRectangular(int firstSideNearRectangleRightAngle, int secoundSideNearRectangleRightAngle, int SideOppositeRectangleRightAngle) {
        int SideAorBtoSquared = firstSideNearRectangleRightAngle * firstSideNearRectangleRightAngle + secoundSideNearRectangleRightAngle * secoundSideNearRectangleRightAngle;
        int SideCtoSquared = SideOppositeRectangleRightAngle * SideOppositeRectangleRightAngle;

        if (SideAorBtoSquared == SideCtoSquared)
            return true;
        return false;
    }
}

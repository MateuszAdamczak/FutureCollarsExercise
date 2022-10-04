package com.futurecollars.lekcja3.zadanie5;

public class PythagoreanTheorem {

    public static boolean isTriangleRectangular(int firstSideNearRectangleRightAngle, int secoundSideNearRectangleRightAngle, int sideOppositeRectangleRightAngle) {
        int sideAorBtoSquared = firstSideNearRectangleRightAngle * firstSideNearRectangleRightAngle + secoundSideNearRectangleRightAngle * secoundSideNearRectangleRightAngle;
        int sideCtoSquared = sideOppositeRectangleRightAngle * sideOppositeRectangleRightAngle;

        if (sideAorBtoSquared == sideCtoSquared)
            return true;
        return false;
    }
}

package com.example.unitconverter
import kotlin.math.PI
class PlaneAngle(val from: String, val to: String, val quantity: Double) {

    fun convert(): Double {
        when (from) {
            "Degree" -> {
                val amount = degreeToRadian(quantity)
                when (to) {
                    "Degree" -> return radianToDegree(amount)
                    "Gradian" -> return radianToGradian(amount)
                    "Milliradian" -> return radianToMilliradian(amount)
                    "Minute of arc" -> return radianToMinuteOfArc(amount)
                    "Radian" -> return radianToRadian(amount)
                    "Second of arc" -> return radianToSecondOfArc(amount)
                }
            }
            "Gradian" -> {
                val amount = gradianToRadian(quantity)
                when (to) {
                    "Degree" -> return radianToDegree(amount)
                    "Gradian" -> return radianToGradian(amount)
                    "Milliradian" -> return radianToMilliradian(amount)
                    "Minute of arc" -> return radianToMinuteOfArc(amount)
                    "Radian" -> return radianToRadian(amount)
                    "Second of arc" -> return radianToSecondOfArc(amount)
                }
            }
            "Milliradian" -> {
                val amount = milliradianToRadian(quantity)
                when (to) {
                    "Degree" -> return radianToDegree(amount)
                    "Gradian" -> return radianToGradian(amount)
                    "Milliradian" -> return radianToMilliradian(amount)
                    "Minute of arc" -> return radianToMinuteOfArc(amount)
                    "Radian" -> return radianToRadian(amount)
                    "Second of arc" -> return radianToSecondOfArc(amount)
                }
            }
            "Minute of arc" -> {
                val amount = minuteOfArcToRadian(quantity)
                when (to) {
                    "Degree" -> return radianToDegree(amount)
                    "Gradian" -> return radianToGradian(amount)
                    "Milliradian" -> return radianToMilliradian(amount)
                    "Minute of arc" -> return radianToMinuteOfArc(amount)
                    "Radian" -> return radianToRadian(amount)
                    "Second of arc" -> return radianToSecondOfArc(amount)
                }
            }
            "Radian" -> {
                val amount = radianToRadian(quantity)
                when (to) {
                    "Degree" -> return radianToDegree(amount)
                    "Gradian" -> return radianToGradian(amount)
                    "Milliradian" -> return radianToMilliradian(amount)
                    "Minute of arc" -> return radianToMinuteOfArc(amount)
                    "Radian" -> return radianToRadian(amount)
                    "Second of arc" -> return radianToSecondOfArc(amount)
                }
            }
            "Second of arc" -> {
                val amount = secondOfArcToRadian(quantity)
                when (to) {
                    "Degree" -> return radianToDegree(amount)
                    "Gradian" -> return radianToGradian(amount)
                    "Milliradian" -> return radianToMilliradian(amount)
                    "Minute of arc" -> return radianToMinuteOfArc(amount)
                    "Radian" -> return radianToRadian(amount)
                    "Second of arc" -> return radianToSecondOfArc(amount)
                }
            }
        }
        return quantity
    }

    private fun radianToDegree(quantity: Double): Double {
        return (quantity * (180.0 / PI))
    }
    private fun radianToGradian(quantity: Double): Double {
        return (quantity * (200.0 / PI))
    }
    private fun radianToMilliradian(quantity: Double): Double {
        return (quantity * 1000.0)
    }
    private fun radianToMinuteOfArc(quantity: Double): Double {
        return (quantity * ((60.0 * 180.0) / PI))
    }
    private fun radianToRadian(quantity: Double): Double {
        return quantity
    }
    private fun radianToSecondOfArc(quantity: Double): Double {
        return (quantity * ((3600.0 * 180.0) / PI))
    }

    private fun degreeToRadian(quantity: Double): Double {
        return (quantity / (180.0 / PI))
    }
    private fun gradianToRadian(quantity: Double): Double {
        return (quantity / (200.0 / PI))
    }
    private fun milliradianToRadian(quantity: Double): Double {
        return (quantity / 1000.0)
    }
    private fun minuteOfArcToRadian(quantity: Double): Double {
        return (quantity / ((60.0 * 180.0) / PI))
    }
    private fun secondOfArcToRadian(quantity: Double): Double {
        return (quantity / ((3600.0 * 180.0) / PI))
    }
}
package com.example.unitconverter

class Speed(val from: String, val to: String, val quantity: Double) {

    fun convert(): Double {
        when (from) {
            "Miles per hour" -> {
                val amount = milesPerHourToMeterPerSecond(quantity)
                when (to) {
                    "Miles per hour" -> return meterPerSecondToMilesPerHour(amount)
                    "Foot per second" -> return meterPerSecondToFootPerSecond(amount)
                    "Meter per second" -> return meterPerSecondToMeterPerSecond(amount)
                    "Kilometre per hour" -> return meterPerSecondToKilometrePerHour(amount)
                    "Knot" -> return meterPerSecondToKnot(amount)
                }
            }
            "Foot per second" -> {
                val amount = footPerSecondToMeterPerSecond(quantity)
                when (to) {
                    "Miles per hour" -> return meterPerSecondToMilesPerHour(amount)
                    "Foot per second" -> return meterPerSecondToFootPerSecond(amount)
                    "Meter per second" -> return meterPerSecondToMeterPerSecond(amount)
                    "Kilometre per hour" -> return meterPerSecondToKilometrePerHour(amount)
                    "Knot" -> return meterPerSecondToKnot(amount)
                }
            }
            "Meter per second" -> {
                val amount = meterPerSecondToMeterPerSecond(quantity)
                when (to) {
                    "Miles per hour" -> return meterPerSecondToMilesPerHour(amount)
                    "Foot per second" -> return meterPerSecondToFootPerSecond(amount)
                    "Meter per second" -> return meterPerSecondToMeterPerSecond(amount)
                    "Kilometre per hour" -> return meterPerSecondToKilometrePerHour(amount)
                    "Knot" -> return meterPerSecondToKnot(amount)
                }
            }
            "Kilometre per hour" -> {
                val amount = kilometrePerHourToMeterPerSecond(quantity)
                when (to) {
                    "Miles per hour" -> return meterPerSecondToMilesPerHour(amount)
                    "Foot per second" -> return meterPerSecondToFootPerSecond(amount)
                    "Meter per second" -> return meterPerSecondToMeterPerSecond(amount)
                    "Kilometre per hour" -> return meterPerSecondToKilometrePerHour(amount)
                    "Knot" -> return meterPerSecondToKnot(amount)
                }
            }
            "Knot" -> {
                val amount = knotToMeterPerSecond(quantity)
                when (to) {
                    "Miles per hour" -> return meterPerSecondToMilesPerHour(amount)
                    "Foot per second" -> return meterPerSecondToFootPerSecond(amount)
                    "Meter per second" -> return meterPerSecondToMeterPerSecond(amount)
                    "Kilometre per hour" -> return meterPerSecondToKilometrePerHour(amount)
                    "Knot" -> return meterPerSecondToKnot(amount)
                }
            }
        }
        return quantity
    }

    private fun meterPerSecondToMilesPerHour(quantity: Double): Double {
        return (quantity * 2.2369362921)
    }
    private fun meterPerSecondToFootPerSecond(quantity: Double): Double {
        return (quantity * 3.280839895)
    }
    private fun meterPerSecondToMeterPerSecond(quantity: Double): Double {
        return quantity
    }
    private fun meterPerSecondToKilometrePerHour(quantity: Double): Double {
        return (quantity * 3.6)
    }
    private fun meterPerSecondToKnot(quantity: Double): Double {
        return (quantity * 1.9438444924)
    }

    private fun milesPerHourToMeterPerSecond(quantity: Double): Double {
        return (quantity / 2.2369362921)
    }
    private fun footPerSecondToMeterPerSecond(quantity: Double): Double {
        return (quantity / 3.280839895)
    }
    fun kilometrePerHourToMeterPerSecond(quantity: Double): Double {
        return (quantity / 3.6)
    }
    fun knotToMeterPerSecond(quantity: Double): Double {
        return (quantity / 1.9438444924)
    }
}
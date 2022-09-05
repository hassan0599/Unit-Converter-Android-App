package com.example.unitconverter

class Time(val from: String, val to: String, val quantity: Double) {

    fun convert(): Double {
        when (from) {
            "Nanosecond" -> {
                val amount = nanosecondToSecond(quantity)
                when (to) {
                    "Nanosecond" -> return secondToNanosecond(amount)
                    "Microsecond" -> return secondToMicrosecond(amount)
                    "Millisecond" -> return secondToMillisecond(amount)
                    "Second" -> return secondToSecond(amount)
                    "Minute" -> return secondToMinute(amount)
                    "Hour" -> return secondToHour(amount)
                    "Day" -> return secondToDay(amount)
                    "Week" -> return secondToWeek(amount)
                    "Month" -> return secondToMonth(amount)
                    "Calendar year" -> return secondToCalendarYear(amount)
                    "Decade" -> return secondToDecade(amount)
                    "Century" -> return secondToCentury(amount)
                }

            }
            "Microsecond" -> {
                val amount = microsecondToSecond(quantity)
                when (to) {
                    "Nanosecond" -> return secondToNanosecond(amount)
                    "Microsecond" -> return secondToMicrosecond(amount)
                    "Millisecond" -> return secondToMillisecond(amount)
                    "Second" -> return secondToSecond(amount)
                    "Minute" -> return secondToMinute(amount)
                    "Hour" -> return secondToHour(amount)
                    "Day" -> return secondToDay(amount)
                    "Week" -> return secondToWeek(amount)
                    "Month" -> return secondToMonth(amount)
                    "Calendar year" -> return secondToCalendarYear(amount)
                    "Decade" -> return secondToDecade(amount)
                    "Century" -> return secondToCentury(amount)
                }

            }
            "Millisecond" -> {
                val amount = millisecondToSecond(quantity)
                when (to) {
                    "Nanosecond" -> return secondToNanosecond(amount)
                    "Microsecond" -> return secondToMicrosecond(amount)
                    "Millisecond" -> return secondToMillisecond(amount)
                    "Second" -> return secondToSecond(amount)
                    "Minute" -> return secondToMinute(amount)
                    "Hour" -> return secondToHour(amount)
                    "Day" -> return secondToDay(amount)
                    "Week" -> return secondToWeek(amount)
                    "Month" -> return secondToMonth(amount)
                    "Calendar year" -> return secondToCalendarYear(amount)
                    "Decade" -> return secondToDecade(amount)
                    "Century" -> return secondToCentury(amount)
                }

            }
            "Second" -> {
                val amount = secondToSecond(quantity)
                when (to) {
                    "Nanosecond" -> return secondToNanosecond(amount)
                    "Microsecond" -> return secondToMicrosecond(amount)
                    "Millisecond" -> return secondToMillisecond(amount)
                    "Second" -> return secondToSecond(amount)
                    "Minute" -> return secondToMinute(amount)
                    "Hour" -> return secondToHour(amount)
                    "Day" -> return secondToDay(amount)
                    "Week" -> return secondToWeek(amount)
                    "Month" -> return secondToMonth(amount)
                    "Calendar year" -> return secondToCalendarYear(amount)
                    "Decade" -> return secondToDecade(amount)
                    "Century" -> return secondToCentury(amount)
                }

            }
            "Minute" -> {
                val amount = minuteToSecond(quantity)
                when (to) {
                    "Nanosecond" -> return secondToNanosecond(amount)
                    "Microsecond" -> return secondToMicrosecond(amount)
                    "Millisecond" -> return secondToMillisecond(amount)
                    "Second" -> return secondToSecond(amount)
                    "Minute" -> return secondToMinute(amount)
                    "Hour" -> return secondToHour(amount)
                    "Day" -> return secondToDay(amount)
                    "Week" -> return secondToWeek(amount)
                    "Month" -> return secondToMonth(amount)
                    "Calendar year" -> return secondToCalendarYear(amount)
                    "Decade" -> return secondToDecade(amount)
                    "Century" -> return secondToCentury(amount)
                }

            }
            "Hour" -> {
                val amount = hourToSecond(quantity)
                when (to) {
                    "Nanosecond" -> return secondToNanosecond(amount)
                    "Microsecond" -> return secondToMicrosecond(amount)
                    "Millisecond" -> return secondToMillisecond(amount)
                    "Second" -> return secondToSecond(amount)
                    "Minute" -> return secondToMinute(amount)
                    "Hour" -> return secondToHour(amount)
                    "Day" -> return secondToDay(amount)
                    "Week" -> return secondToWeek(amount)
                    "Month" -> return secondToMonth(amount)
                    "Calendar year" -> return secondToCalendarYear(amount)
                    "Decade" -> return secondToDecade(amount)
                    "Century" -> return secondToCentury(amount)
                }

            }
            "Day" -> {
                val amount = dayToSecond(quantity)
                when (to) {
                    "Nanosecond" -> return secondToNanosecond(amount)
                    "Microsecond" -> return secondToMicrosecond(amount)
                    "Millisecond" -> return secondToMillisecond(amount)
                    "Second" -> return secondToSecond(amount)
                    "Minute" -> return secondToMinute(amount)
                    "Hour" -> return secondToHour(amount)
                    "Day" -> return secondToDay(amount)
                    "Week" -> return secondToWeek(amount)
                    "Month" -> return secondToMonth(amount)
                    "Calendar year" -> return secondToCalendarYear(amount)
                    "Decade" -> return secondToDecade(amount)
                    "Century" -> return secondToCentury(amount)
                }

            }
            "Week" -> {
                val amount = weekToSecond(quantity)
                when (to) {
                    "Nanosecond" -> return secondToNanosecond(amount)
                    "Microsecond" -> return secondToMicrosecond(amount)
                    "Millisecond" -> return secondToMillisecond(amount)
                    "Second" -> return secondToSecond(amount)
                    "Minute" -> return secondToMinute(amount)
                    "Hour" -> return secondToHour(amount)
                    "Day" -> return secondToDay(amount)
                    "Week" -> return secondToWeek(amount)
                    "Month" -> return secondToMonth(amount)
                    "Calendar year" -> return secondToCalendarYear(amount)
                    "Decade" -> return secondToDecade(amount)
                    "Century" -> return secondToCentury(amount)
                }

            }
            "Month" -> {
                val amount = monthToSecond(quantity)
                when (to) {
                    "Nanosecond" -> return secondToNanosecond(amount)
                    "Microsecond" -> return secondToMicrosecond(amount)
                    "Millisecond" -> return secondToMillisecond(amount)
                    "Second" -> return secondToSecond(amount)
                    "Minute" -> return secondToMinute(amount)
                    "Hour" -> return secondToHour(amount)
                    "Day" -> return secondToDay(amount)
                    "Week" -> return secondToWeek(amount)
                    "Month" -> return secondToMonth(amount)
                    "Calendar year" -> return secondToCalendarYear(amount)
                    "Decade" -> return secondToDecade(amount)
                    "Century" -> return secondToCentury(amount)
                }

            }
            "Calendar year" -> {
                val amount = calendarYearToSecond(quantity)
                when (to) {
                    "Nanosecond" -> return secondToNanosecond(amount)
                    "Microsecond" -> return secondToMicrosecond(amount)
                    "Millisecond" -> return secondToMillisecond(amount)
                    "Second" -> return secondToSecond(amount)
                    "Minute" -> return secondToMinute(amount)
                    "Hour" -> return secondToHour(amount)
                    "Day" -> return secondToDay(amount)
                    "Week" -> return secondToWeek(amount)
                    "Month" -> return secondToMonth(amount)
                    "Calendar year" -> return secondToCalendarYear(amount)
                    "Decade" -> return secondToDecade(amount)
                    "Century" -> return secondToCentury(amount)
                }

            }
            "Decade" -> {
                val amount = decadeToSecond(quantity)
                when (to) {
                    "Nanosecond" -> return secondToNanosecond(amount)
                    "Microsecond" -> return secondToMicrosecond(amount)
                    "Millisecond" -> return secondToMillisecond(amount)
                    "Second" -> return secondToSecond(amount)
                    "Minute" -> return secondToMinute(amount)
                    "Hour" -> return secondToHour(amount)
                    "Day" -> return secondToDay(amount)
                    "Week" -> return secondToWeek(amount)
                    "Month" -> return secondToMonth(amount)
                    "Calendar year" -> return secondToCalendarYear(amount)
                    "Decade" -> return secondToDecade(amount)
                    "Century" -> return secondToCentury(amount)
                }

            }
            "Century" -> {
                val amount = centuryToSecond(quantity)
                when (to) {
                    "Nanosecond" -> return secondToNanosecond(amount)
                    "Microsecond" -> return secondToMicrosecond(amount)
                    "Millisecond" -> return secondToMillisecond(amount)
                    "Second" -> return secondToSecond(amount)
                    "Minute" -> return secondToMinute(amount)
                    "Hour" -> return secondToHour(amount)
                    "Day" -> return secondToDay(amount)
                    "Week" -> return secondToWeek(amount)
                    "Month" -> return secondToMonth(amount)
                    "Calendar year" -> return secondToCalendarYear(amount)
                    "Decade" -> return secondToDecade(amount)
                    "Century" -> return secondToCentury(amount)
                }

            }
        }
        return quantity
    }

    private fun secondToNanosecond(quantity: Double): Double {
        return (quantity * 1000000000.0)
    }
    private fun secondToMicrosecond(quantity: Double): Double {
        return (quantity * 1000000.0)
    }
    private fun secondToMillisecond(quantity: Double): Double {
        return (quantity * 1000.0)
    }
    private fun secondToSecond(quantity: Double): Double {
        return quantity
    }
    private fun secondToMinute(quantity: Double): Double {
        return (quantity / 60.0)
    }
    private fun secondToHour(quantity: Double): Double {
        return (quantity / 3600.0)
    }
    private fun secondToDay(quantity: Double): Double {
        return (quantity / 86400.0)
    }
    private fun secondToWeek(quantity: Double): Double {
        return (quantity / 604800.0)
    }
    private fun secondToMonth(quantity: Double): Double {
        return (quantity / 2628000.0)
    }
    private fun secondToCalendarYear(quantity: Double): Double {
        return (quantity / 31557600.0)
    }
    private fun secondToDecade(quantity: Double): Double {
        return (quantity / 315576000.0)
    }
    private fun secondToCentury(quantity: Double): Double {
        return (quantity / 3155760000.0)
    }

    private fun nanosecondToSecond(quantity: Double): Double {
        return (quantity / 1000000000.0)
    }
    private fun microsecondToSecond(quantity: Double): Double {
        return (quantity / 1000000.0)
    }
    private fun millisecondToSecond(quantity: Double): Double {
        return (quantity / 1000.0)
    }
    private fun minuteToSecond(quantity: Double): Double {
        return (quantity * 60.0)
    }
    private fun hourToSecond(quantity: Double): Double {
        return (quantity * 3600.0)
    }
    private fun dayToSecond(quantity: Double): Double {
        return (quantity * 86400.0)
    }
    private fun weekToSecond(quantity: Double): Double {
        return (quantity * 604800.0)
    }
    private fun monthToSecond(quantity: Double): Double {
        return (quantity * 2628000.0)
    }
    private fun calendarYearToSecond(quantity: Double): Double {
        return (quantity * 31557600.0)
    }
    private fun decadeToSecond(quantity: Double): Double {
        return (quantity * 315576000.0)
    }
    private fun centuryToSecond(quantity: Double): Double {
        return (quantity * 3155760000.0)
    }
}
package com.example.unitconverter

class Length(val from: String, val to: String, val quantity: Double) {

    fun convert(): Double {
        when (from) {
            "Kilometre" -> {
                val amount = kilometreToMeter(quantity)
                when (to) {
                    "Kilometre" -> return meterToKilometre(amount)
                    "Meter" -> return meterToMeter(amount)
                    "Centimeter" -> return meterToCentimeter(amount)
                    "Millimetre" -> return meterToMillimetre(amount)
                    "Micrometre" -> return meterToMicrometre(amount)
                    "Nanometre" -> return meterToNanometre(amount)
                    "Mile" -> return meterToMile(amount)
                    "Yard" -> return meterToYard(amount)
                    "Foot" -> return meterToFoot(amount)
                    "Inch" -> return meterToInch(amount)
                    "Nautical mile" -> return meterToNauticalMile(amount)
                }
            }
            "Meter" -> {
                val amount = meterToMeter(quantity)
                when (to) {
                    "Kilometre" -> return meterToKilometre(amount)
                    "Meter" -> return meterToMeter(amount)
                    "Centimeter" -> return meterToCentimeter(amount)
                    "Millimetre" -> return meterToMillimetre(amount)
                    "Micrometre" -> return meterToMicrometre(amount)
                    "Nanometre" -> return meterToNanometre(amount)
                    "Mile" -> return meterToMile(amount)
                    "Yard" -> return meterToYard(amount)
                    "Foot" -> return meterToFoot(amount)
                    "Inch" -> return meterToInch(amount)
                    "Nautical mile" -> return meterToNauticalMile(amount)
                }
            }
            "Centimeter" -> {
                val amount = centimeterToMeter(quantity)
                when (to) {
                    "Kilometre" -> return meterToKilometre(amount)
                    "Meter" -> return meterToMeter(amount)
                    "Centimeter" -> return meterToCentimeter(amount)
                    "Millimetre" -> return meterToMillimetre(amount)
                    "Micrometre" -> return meterToMicrometre(amount)
                    "Nanometre" -> return meterToNanometre(amount)
                    "Mile" -> return meterToMile(amount)
                    "Yard" -> return meterToYard(amount)
                    "Foot" -> return meterToFoot(amount)
                    "Inch" -> return meterToInch(amount)
                    "Nautical mile" -> return meterToNauticalMile(amount)
                }
            }
            "Millimetre" -> {
                val amount = millimetreToMeter(quantity)
                when (to) {
                    "Kilometre" -> return meterToKilometre(amount)
                    "Meter" -> return meterToMeter(amount)
                    "Centimeter" -> return meterToCentimeter(amount)
                    "Millimetre" -> return meterToMillimetre(amount)
                    "Micrometre" -> return meterToMicrometre(amount)
                    "Nanometre" -> return meterToNanometre(amount)
                    "Mile" -> return meterToMile(amount)
                    "Yard" -> return meterToYard(amount)
                    "Foot" -> return meterToFoot(amount)
                    "Inch" -> return meterToInch(amount)
                    "Nautical mile" -> return meterToNauticalMile(amount)
                }
            }
            "Micrometre" -> {
                val amount = micrometreToMeter(quantity)
                when (to) {
                    "Kilometre" -> return meterToKilometre(amount)
                    "Meter" -> return meterToMeter(amount)
                    "Centimeter" -> return meterToCentimeter(amount)
                    "Millimetre" -> return meterToMillimetre(amount)
                    "Micrometre" -> return meterToMicrometre(amount)
                    "Nanometre" -> return meterToNanometre(amount)
                    "Mile" -> return meterToMile(amount)
                    "Yard" -> return meterToYard(amount)
                    "Foot" -> return meterToFoot(amount)
                    "Inch" -> return meterToInch(amount)
                    "Nautical mile" -> return meterToNauticalMile(amount)
                }
            }
            "Nanometre" -> {
                val amount = nanometreToMeter(quantity)
                when (to) {
                    "Kilometre" -> return meterToKilometre(amount)
                    "Meter" -> return meterToMeter(amount)
                    "Centimeter" -> return meterToCentimeter(amount)
                    "Millimetre" -> return meterToMillimetre(amount)
                    "Micrometre" -> return meterToMicrometre(amount)
                    "Nanometre" -> return meterToNanometre(amount)
                    "Mile" -> return meterToMile(amount)
                    "Yard" -> return meterToYard(amount)
                    "Foot" -> return meterToFoot(amount)
                    "Inch" -> return meterToInch(amount)
                    "Nautical mile" -> return meterToNauticalMile(amount)
                }
            }
            "Mile" -> {
                val amount = mileToMeter(quantity)
                when (to) {
                    "Kilometre" -> return meterToKilometre(amount)
                    "Meter" -> return meterToMeter(amount)
                    "Centimeter" -> return meterToCentimeter(amount)
                    "Millimetre" -> return meterToMillimetre(amount)
                    "Micrometre" -> return meterToMicrometre(amount)
                    "Nanometre" -> return meterToNanometre(amount)
                    "Mile" -> return meterToMile(amount)
                    "Yard" -> return meterToYard(amount)
                    "Foot" -> return meterToFoot(amount)
                    "Inch" -> return meterToInch(amount)
                    "Nautical mile" -> return meterToNauticalMile(amount)
                }
            }
            "Yard" -> {
                val amount = yardToMeter(quantity)
                when (to) {
                    "Kilometre" -> return meterToKilometre(amount)
                    "Meter" -> return meterToMeter(amount)
                    "Centimeter" -> return meterToCentimeter(amount)
                    "Millimetre" -> return meterToMillimetre(amount)
                    "Micrometre" -> return meterToMicrometre(amount)
                    "Nanometre" -> return meterToNanometre(amount)
                    "Mile" -> return meterToMile(amount)
                    "Yard" -> return meterToYard(amount)
                    "Foot" -> return meterToFoot(amount)
                    "Inch" -> return meterToInch(amount)
                    "Nautical mile" -> return meterToNauticalMile(amount)
                }
            }
            "Foot" -> {
                val amount = footToMeter(quantity)
                when (to) {
                    "Kilometre" -> return meterToKilometre(amount)
                    "Meter" -> return meterToMeter(amount)
                    "Centimeter" -> return meterToCentimeter(amount)
                    "Millimetre" -> return meterToMillimetre(amount)
                    "Micrometre" -> return meterToMicrometre(amount)
                    "Nanometre" -> return meterToNanometre(amount)
                    "Mile" -> return meterToMile(amount)
                    "Yard" -> return meterToYard(amount)
                    "Foot" -> return meterToFoot(amount)
                    "Inch" -> return meterToInch(amount)
                    "Nautical mile" -> return meterToNauticalMile(amount)
                }
            }
            "Inch" -> {
                val amount = inchToMeter(quantity)
                when (to) {
                    "Kilometre" -> return meterToKilometre(amount)
                    "Meter" -> return meterToMeter(amount)
                    "Centimeter" -> return meterToCentimeter(amount)
                    "Millimetre" -> return meterToMillimetre(amount)
                    "Micrometre" -> return meterToMicrometre(amount)
                    "Nanometre" -> return meterToNanometre(amount)
                    "Mile" -> return meterToMile(amount)
                    "Yard" -> return meterToYard(amount)
                    "Foot" -> return meterToFoot(amount)
                    "Inch" -> return meterToInch(amount)
                    "Nautical mile" -> return meterToNauticalMile(amount)
                }
            }
            "Nautical mile" -> {
                val amount = nauticalMileToMeter(quantity)
                when (to) {
                    "Kilometre" -> return meterToKilometre(amount)
                    "Meter" -> return meterToMeter(amount)
                    "Centimeter" -> return meterToCentimeter(amount)
                    "Millimetre" -> return meterToMillimetre(amount)
                    "Micrometre" -> return meterToMicrometre(amount)
                    "Nanometre" -> return meterToNanometre(amount)
                    "Mile" -> return meterToMile(amount)
                    "Yard" -> return meterToYard(amount)
                    "Foot" -> return meterToFoot(amount)
                    "Inch" -> return meterToInch(amount)
                    "Nautical mile" -> return meterToNauticalMile(amount)
                }
            }
        }
        return quantity
    }
    private fun meterToKilometre(quantity: Double): Double {
        return (quantity * 0.001)
    }
    private fun meterToMeter(quantity: Double): Double {
        return quantity
    }
    private fun meterToCentimeter(quantity: Double): Double {
        return (quantity * 100.0)
    }
    private fun meterToMillimetre(quantity: Double): Double {
        return (quantity * 1000.0)
    }
    private fun meterToMicrometre(quantity: Double): Double {
        return (quantity * 1000000.0)
    }
    private fun meterToNanometre(quantity: Double): Double {
        return (quantity * 1000000000.0)
    }
    private fun meterToMile(quantity: Double): Double {
        return (quantity * 0.0006213712)
    }
    private fun meterToYard(quantity: Double): Double {
        return (quantity * 1.0936132983)
    }
    private fun meterToFoot(quantity: Double): Double {
        return (quantity * 3.280839895)
    }
    private fun meterToInch(quantity: Double): Double {
        return (quantity * 39.37007874)
    }
    private fun meterToNauticalMile(quantity: Double): Double {
        return (quantity * 0.000539956803)
    }
    private fun kilometreToMeter(quantity: Double): Double {
        return (quantity * 1000.0)
    }
    private fun centimeterToMeter(quantity: Double): Double {
        return (quantity * 0.01)
    }
    private fun millimetreToMeter(quantity: Double): Double {
        return (quantity * 0.001)
    }
    private fun micrometreToMeter(quantity: Double): Double {
        return (quantity * 0.000001)
    }
    private fun nanometreToMeter(quantity: Double): Double {
        return (quantity * 0.000000001)
    }
    private fun mileToMeter(quantity: Double): Double {
        return (quantity * 1609.344)
    }
    private fun yardToMeter(quantity: Double): Double {
        return (quantity * 0.9144)
    }
    private fun footToMeter(quantity: Double): Double {
        return (quantity * 0.3048)
    }
    private fun inchToMeter(quantity: Double): Double {
        return (quantity * 0.0254)
    }
    private fun nauticalMileToMeter(quantity: Double): Double {
        return (quantity * 1852.0)
    }
    
}
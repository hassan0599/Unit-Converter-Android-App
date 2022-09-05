package com.example.unitconverter

class Pressure(val from: String, val to: String, val quantity: Double) {

    fun convert(): Double {
        when (from) {
            "Bar" -> {
                val amount = barToPascal(quantity)
                when (to) {
                    "Bar" -> return pascalToBar(amount)
                    "Pascal" -> return pascalToPascal(amount)
                    "Pound per square inch" -> return pascalToPoundPerSquareInch(amount)
                    "Standard atmosphere" -> return pascalToStandardAtmosphere(amount)
                    "Torr" -> return pascalToTorr(amount)
                }
            }
            "Pascal" -> {
                val amount = pascalToPascal(quantity)
                when (to) {
                    "Bar" -> return pascalToBar(amount)
                    "Pascal" -> return pascalToPascal(amount)
                    "Pound per square inch" -> return pascalToPoundPerSquareInch(amount)
                    "Standard atmosphere" -> return pascalToStandardAtmosphere(amount)
                    "Torr" -> return pascalToTorr(amount)
                }
            }
            "Pound per square inch" -> {
                val amount = poundPerSquareInchToPascal(quantity)
                when (to) {
                    "Bar" -> return pascalToBar(amount)
                    "Pascal" -> return pascalToPascal(amount)
                    "Pound per square inch" -> return pascalToPoundPerSquareInch(amount)
                    "Standard atmosphere" -> return pascalToStandardAtmosphere(amount)
                    "Torr" -> return pascalToTorr(amount)
                }
            }
            "Standard atmosphere" -> {
                val amount = standardAtmosphereToPascal(quantity)
                when (to) {
                    "Bar" -> return pascalToBar(amount)
                    "Pascal" -> return pascalToPascal(amount)
                    "Pound per square inch" -> return pascalToPoundPerSquareInch(amount)
                    "Standard atmosphere" -> return pascalToStandardAtmosphere(amount)
                    "Torr" -> return pascalToTorr(amount)
                }
            }
            "Torr" -> {
                val amount = torrToPascal(quantity)
                when (to) {
                    "Bar" -> return pascalToBar(amount)
                    "Pascal" -> return pascalToPascal(amount)
                    "Pound per square inch" -> return pascalToPoundPerSquareInch(amount)
                    "Standard atmosphere" -> return pascalToStandardAtmosphere(amount)
                    "Torr" -> return pascalToTorr(amount)
                }
            }
        }
        return quantity
    }

    private fun pascalToBar(quantity: Double): Double {
        return (quantity * 0.00001)
    }
    private fun pascalToPascal(quantity: Double): Double {
        return quantity
    }
    private fun pascalToPoundPerSquareInch(quantity: Double): Double {
        return (quantity * 0.0001450377)
    }
    private fun pascalToStandardAtmosphere(quantity: Double): Double {
        return (quantity * 0.0000098692)
    }
    private fun pascalToTorr(quantity: Double): Double {
        return (quantity * 0.0075006168)
    }

    private fun barToPascal(quantity: Double): Double {
        return (quantity / 0.00001)
    }
    private fun poundPerSquareInchToPascal(quantity: Double): Double {
        return (quantity / 0.0001450377)
    }
    private fun standardAtmosphereToPascal(quantity: Double): Double {
        return (quantity / 0.0000098692)
    }
    private fun torrToPascal(quantity: Double): Double {
        return (quantity / 0.0075006168)
    }
}
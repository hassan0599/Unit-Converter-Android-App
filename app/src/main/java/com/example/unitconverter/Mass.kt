package com.example.unitconverter

class Mass(val from: String, val to: String, val quantity: Double) {
    fun convert(): Double {
        when (from) {
            "Tonne" -> {
                val amount = tonneToGram(quantity)
                when (to) {
                    "Tonne" -> return gramToTonne(amount)
                    "Kilogram" -> return gramToKilogram(amount)
                    "Gram" -> return gramToGram(amount)
                    "Milligram" -> return gramToMilligram(amount)
                    "Microgram" -> return gramToMicrogram(amount)
                    "Imperial ton" -> return gramToImperialTon(amount)
                    "US ton" -> return gramToUSTon(amount)
                    "Stone" -> return gramToStone(amount)
                    "Pound" -> return gramToPound(amount)
                    "Ounce" -> return gramToOunce(amount)
                }
            }
            "Kilogram" -> {
                val amount = kilogramToGram(quantity)
                when (to) {
                    "Tonne" -> return gramToTonne(amount)
                    "Kilogram" -> return gramToKilogram(amount)
                    "Gram" -> return gramToGram(amount)
                    "Milligram" -> return gramToMilligram(amount)
                    "Microgram" -> return gramToMicrogram(amount)
                    "Imperial ton" -> return gramToImperialTon(amount)
                    "US ton" -> return gramToUSTon(amount)
                    "Stone" -> return gramToStone(amount)
                    "Pound" -> return gramToPound(amount)
                    "Ounce" -> return gramToOunce(amount)
                }
            }
            "Gram" -> {
                val amount = gramToGram(quantity)
                when (to) {
                    "Tonne" -> return gramToTonne(amount)
                    "Kilogram" -> return gramToKilogram(amount)
                    "Gram" -> return gramToGram(amount)
                    "Milligram" -> return gramToMilligram(amount)
                    "Microgram" -> return gramToMicrogram(amount)
                    "Imperial ton" -> return gramToImperialTon(amount)
                    "US ton" -> return gramToUSTon(amount)
                    "Stone" -> return gramToStone(amount)
                    "Pound" -> return gramToPound(amount)
                    "Ounce" -> return gramToOunce(amount)
                }
            }
            "Milligram" -> {
                val amount = milligramToGram(quantity)
                when (to) {
                    "Tonne" -> return gramToTonne(amount)
                    "Kilogram" -> return gramToKilogram(amount)
                    "Gram" -> return gramToGram(amount)
                    "Milligram" -> return gramToMilligram(amount)
                    "Microgram" -> return gramToMicrogram(amount)
                    "Imperial ton" -> return gramToImperialTon(amount)
                    "US ton" -> return gramToUSTon(amount)
                    "Stone" -> return gramToStone(amount)
                    "Pound" -> return gramToPound(amount)
                    "Ounce" -> return gramToOunce(amount)
                }
            }
            "Microgram" -> {
                val amount = microgramToGram(quantity)
                when (to) {
                    "Tonne" -> return gramToTonne(amount)
                    "Kilogram" -> return gramToKilogram(amount)
                    "Gram" -> return gramToGram(amount)
                    "Milligram" -> return gramToMilligram(amount)
                    "Microgram" -> return gramToMicrogram(amount)
                    "Imperial ton" -> return gramToImperialTon(amount)
                    "US ton" -> return gramToUSTon(amount)
                    "Stone" -> return gramToStone(amount)
                    "Pound" -> return gramToPound(amount)
                    "Ounce" -> return gramToOunce(amount)
                }
            }
            "Imperial ton" -> {
                val amount = imperialTonToGram(quantity)
                when (to) {
                    "Tonne" -> return gramToTonne(amount)
                    "Kilogram" -> return gramToKilogram(amount)
                    "Gram" -> return gramToGram(amount)
                    "Milligram" -> return gramToMilligram(amount)
                    "Microgram" -> return gramToMicrogram(amount)
                    "Imperial ton" -> return gramToImperialTon(amount)
                    "US ton" -> return gramToUSTon(amount)
                    "Stone" -> return gramToStone(amount)
                    "Pound" -> return gramToPound(amount)
                    "Ounce" -> return gramToOunce(amount)
                }
            }
            "US ton" -> {
                val amount = usTonToGram(quantity)
                when (to) {
                    "Tonne" -> return gramToTonne(amount)
                    "Kilogram" -> return gramToKilogram(amount)
                    "Gram" -> return gramToGram(amount)
                    "Milligram" -> return gramToMilligram(amount)
                    "Microgram" -> return gramToMicrogram(amount)
                    "Imperial ton" -> return gramToImperialTon(amount)
                    "US ton" -> return gramToUSTon(amount)
                    "Stone" -> return gramToStone(amount)
                    "Pound" -> return gramToPound(amount)
                    "Ounce" -> return gramToOunce(amount)
                }
            }
            "Stone" -> {
                val amount = stoneToGram(quantity)
                when (to) {
                    "Tonne" -> return gramToTonne(amount)
                    "Kilogram" -> return gramToKilogram(amount)
                    "Gram" -> return gramToGram(amount)
                    "Milligram" -> return gramToMilligram(amount)
                    "Microgram" -> return gramToMicrogram(amount)
                    "Imperial ton" -> return gramToImperialTon(amount)
                    "US ton" -> return gramToUSTon(amount)
                    "Stone" -> return gramToStone(amount)
                    "Pound" -> return gramToPound(amount)
                    "Ounce" -> return gramToOunce(amount)
                }
            }
            "Pound" -> {
                val amount = poundToGram(quantity)
                when (to) {
                    "Tonne" -> return gramToTonne(amount)
                    "Kilogram" -> return gramToKilogram(amount)
                    "Gram" -> return gramToGram(amount)
                    "Milligram" -> return gramToMilligram(amount)
                    "Microgram" -> return gramToMicrogram(amount)
                    "Imperial ton" -> return gramToImperialTon(amount)
                    "US ton" -> return gramToUSTon(amount)
                    "Stone" -> return gramToStone(amount)
                    "Pound" -> return gramToPound(amount)
                    "Ounce" -> return gramToOunce(amount)
                }
            }
            "Ounce" -> {
                val amount = ounceToGram(quantity)
                when (to) {
                    "Tonne" -> return gramToTonne(amount)
                    "Kilogram" -> return gramToKilogram(amount)
                    "Gram" -> return gramToGram(amount)
                    "Milligram" -> return gramToMilligram(amount)
                    "Microgram" -> return gramToMicrogram(amount)
                    "Imperial ton" -> return gramToImperialTon(amount)
                    "US ton" -> return gramToUSTon(amount)
                    "Stone" -> return gramToStone(amount)
                    "Pound" -> return gramToPound(amount)
                    "Ounce" -> return gramToOunce(amount)
                }
            }
        }
        return quantity
    }
    
    
    private fun gramToTonne(quantity: Double): Double {
        return (quantity * 0.000001)
    }
    private fun gramToKilogram(quantity: Double): Double {
        return (quantity * 0.001)
    }
    private fun gramToGram(quantity: Double): Double {
        return quantity
    }
    private fun gramToMilligram(quantity: Double): Double {
        return (quantity * 1000.0)
    }
    private fun gramToMicrogram(quantity: Double): Double {
        return (quantity * 1000000.0)
    }
    private fun gramToImperialTon(quantity: Double): Double {
        return (quantity * 0.0000009842065276)
    }
    private fun gramToUSTon(quantity: Double): Double {
        return (quantity * 0.0000011023)
    }
    private fun gramToStone(quantity: Double): Double {
        return (quantity * 0.000157473)
    }
    private fun gramToPound(quantity: Double): Double {
        return (quantity * 0.0022046226)
    }
    private fun gramToOunce(quantity: Double): Double {
        return (quantity * 0.0352739619)
    }

    private fun tonneToGram(quantity: Double): Double {
        return (quantity * 1000000.0)
    }
    private fun kilogramToGram(quantity: Double): Double {
        return (quantity * 1000.0)
    }
    private fun milligramToGram(quantity: Double): Double {
        return (quantity * 0.001)
    }
    private fun microgramToGram(quantity: Double): Double {
        return (quantity * 0.000001)
    }
    private fun imperialTonToGram(quantity: Double): Double {
        return (quantity * 1016046.9088)
    }
    private fun usTonToGram(quantity: Double): Double {
        return (quantity * 907184.74)
    }
    private fun stoneToGram(quantity: Double): Double {
        return (quantity * 6350.29318)
    }
    private fun poundToGram(quantity: Double): Double {
        return (quantity * 453.59237)
    }
    private fun ounceToGram(quantity: Double): Double {
        return (quantity * 28.349523125)
    }
}
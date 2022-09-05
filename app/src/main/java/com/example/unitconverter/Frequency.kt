package com.example.unitconverter

class Frequency(val from: String, val to: String, val quantity: Double) {

    fun convert(): Double {
        when (from) {
            "Hertz" -> {
                val amount = hertzToHertz(quantity)
                when (to) {
                    "Hertz" -> return hertzToHertz(amount)
                    "Kilohertz" -> return hertzToKilohertz(amount)
                    "Megahertz" -> return hertzToMegahertz(amount)
                    "Gigahertz" -> return hertzToGigahertz(amount)
                }
            }
            "Kilohertz" -> {
                val amount = kilohertzToHertz(quantity)
                when (to) {
                    "Hertz" -> return hertzToHertz(amount)
                    "Kilohertz" -> return hertzToKilohertz(amount)
                    "Megahertz" -> return hertzToMegahertz(amount)
                    "Gigahertz" -> return hertzToGigahertz(amount)
                }
            }
            "Megahertz" -> {
                val amount = megahertzToHertz(quantity)
                when (to) {
                    "Hertz" -> return hertzToHertz(amount)
                    "Kilohertz" -> return hertzToKilohertz(amount)
                    "Megahertz" -> return hertzToMegahertz(amount)
                    "Gigahertz" -> return hertzToGigahertz(amount)
                }
            }
            "Gigahertz" -> {
                val amount = gigahertzToHertz(quantity)
                when (to) {
                    "Hertz" -> return hertzToHertz(amount)
                    "Kilohertz" -> return hertzToKilohertz(amount)
                    "Megahertz" -> return hertzToMegahertz(amount)
                    "Gigahertz" -> return hertzToGigahertz(amount)
                }
            }
        }
        return quantity
    }

    private fun hertzToHertz(quantity: Double): Double {
        return quantity
    }
    private fun hertzToKilohertz(quantity: Double): Double {
        return (quantity * 0.001)
    }
    private fun hertzToMegahertz(quantity: Double): Double {
        return (quantity * 0.000001)
    }
    private fun hertzToGigahertz(quantity: Double): Double {
        return (quantity * 0.000000001)
    }

    private fun kilohertzToHertz(quantity: Double): Double {
        return (quantity * 1000.0)
    }
    private fun megahertzToHertz(quantity: Double): Double {
        return (quantity * 1000000.0)
    }
    private fun gigahertzToHertz(quantity: Double): Double {
        return (quantity * 1000000000.0)
    }
}
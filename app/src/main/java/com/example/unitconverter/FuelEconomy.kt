package com.example.unitconverter

class FuelEconomy(val from: String, val to: String, val quantity: Double) {

    fun convert(): Double {
        when (from) {
            "Miles per gallon" -> {
                val amount = milesPerGallonToKilometrePerLiter(quantity)
                when (to) {
                    "Miles per gallon" -> return kilometrePerLiterToMilesPerGallon(amount)
                    "Miles per gallon (Imperial)" -> kilometrePerLiterToMilesPerGallonImperial(amount)
                    "Kilometre per liter" -> kilometrePerLiterToKilometrePerLiter(amount)
                    "Liter per 100 kilometres" -> kilometrePerLiterToLiterPer100Kilometres(amount)
                }
            }
            "Miles per gallon (Imperial)" -> {
                val amount = milesPerGallonImperialToKilometrePerLiter(quantity)
                when (to) {
                    "Miles per gallon" -> return kilometrePerLiterToMilesPerGallon(amount)
                    "Miles per gallon (Imperial)" -> kilometrePerLiterToMilesPerGallonImperial(amount)
                    "Kilometre per liter" -> kilometrePerLiterToKilometrePerLiter(amount)
                    "Liter per 100 kilometres" -> kilometrePerLiterToLiterPer100Kilometres(amount)
                }
            }
            "Kilometre per liter" -> {
                val amount = kilometrePerLiterToKilometrePerLiter(quantity)
                when (to) {
                    "Miles per gallon" -> return kilometrePerLiterToMilesPerGallon(amount)
                    "Miles per gallon (Imperial)" -> kilometrePerLiterToMilesPerGallonImperial(amount)
                    "Kilometre per liter" -> kilometrePerLiterToKilometrePerLiter(amount)
                    "Liter per 100 kilometres" -> kilometrePerLiterToLiterPer100Kilometres(amount)
                }
            }
            "Liter per 100 kilometres" -> {
                val amount = literPer100KilometresToKilometrePerLiter(quantity)
                when (to) {
                    "Miles per gallon" -> return kilometrePerLiterToMilesPerGallon(amount)
                    "Miles per gallon (Imperial)" -> kilometrePerLiterToMilesPerGallonImperial(amount)
                    "Kilometre per liter" -> kilometrePerLiterToKilometrePerLiter(amount)
                    "Liter per 100 kilometres" -> kilometrePerLiterToLiterPer100Kilometres(amount)
                }
            }
        }
        return quantity
    }

    private fun kilometrePerLiterToMilesPerGallon(quantity: Double): Double {
        return (quantity * 2.3521458329)
    }
    private fun kilometrePerLiterToMilesPerGallonImperial(quantity: Double): Double {
        return (quantity * 2.8248093628)
    }
    private fun kilometrePerLiterToKilometrePerLiter(quantity: Double): Double {
        return quantity
    }
    private fun kilometrePerLiterToLiterPer100Kilometres(quantity: Double): Double {
        return (quantity * 100.0)
    }

    private fun milesPerGallonToKilometrePerLiter(quantity: Double): Double {
        return (quantity / 2.3521458329)
    }
    private fun milesPerGallonImperialToKilometrePerLiter(quantity: Double): Double {
        return (quantity / 2.8248093628)
    }
    private fun literPer100KilometresToKilometrePerLiter(quantity: Double): Double {
        return (quantity / 100.0)
    }
    
}
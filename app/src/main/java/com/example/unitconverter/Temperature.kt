package com.example.unitconverter

class Temperature(val from: String, val to: String, val quantity: Double) {
    fun convert(): Double {
        when (from) {
            "Celsius" -> {
                when (to) {
                    "Celsius" -> return celsiusToCelsius(quantity)
                    "Kelvin" -> return celsiusToKelvin(quantity)
                    "Fahrenheit" -> return celsiusToFahrenheit(quantity)
                }
            }
            "Kelvin" -> {
                val amount = kelvinToCelsius(quantity)
                when (to) {
                    "Celsius" -> return celsiusToCelsius(amount)
                    "Kelvin" -> return celsiusToKelvin(amount)
                    "Fahrenheit" -> return celsiusToFahrenheit(amount)
                }
            }
            "Fahrenheit" -> {
                val amount = fahrenheitToCelsius(quantity)
                when (to) {
                    "Celsius" -> return celsiusToCelsius(amount)
                    "Kelvin" -> return celsiusToKelvin(amount)
                    "Fahrenheit" -> return celsiusToFahrenheit(amount)
                }
            }
        }
        return quantity
    }
    private fun celsiusToCelsius(quantity: Double): Double {
        return quantity
    }
    private fun celsiusToFahrenheit(quantity: Double): Double {
        return (((9.0/5.0) * quantity) +32.0)
    }
    private fun celsiusToKelvin(quantity: Double): Double {
        return (quantity + 273.15)
    }
    private fun kelvinToCelsius(quantity: Double): Double {
        return (quantity - 273.15)
    }
    private fun fahrenheitToCelsius(quantity: Double): Double {
        return ((quantity - 32.0) * (5.0/9.0))
    }
}
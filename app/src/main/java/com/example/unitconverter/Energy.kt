package com.example.unitconverter

class Energy(val from: String, val to: String, val quantity: Double) {

    fun convert(): Double {
        when (from) {
            "Joule" -> {
                val amount = jouleToJoule(quantity)
                when (to) {
                    "Joule" -> jouleToJoule(amount)
                    "Kilojoule" -> jouleToKilojoule(amount)
                    "Gram calorie" -> jouleToGramCalorie(amount)
                    "Kilocalorie" -> jouleToKilocalorie(amount)
                    "Watt hour" -> jouleToWattHour(amount)
                    "Kilowatt hour" -> jouleToKilowattHour(amount)
                    "Electronvolt" -> jouleToElectronvolt(amount)
                    "British thermal unit" -> jouleToBritishThermalUnit(amount)
                    "US therm" -> jouleToUSTherm(amount)
                    "Foot-pound" -> jouleToFootPound(amount)
                }
            }
            "Kilojoule" -> {
                val amount = kilojouleToJoule(quantity)
                when (to) {
                    "Joule" -> jouleToJoule(amount)
                    "Kilojoule" -> jouleToKilojoule(amount)
                    "Gram calorie" -> jouleToGramCalorie(amount)
                    "Kilocalorie" -> jouleToKilocalorie(amount)
                    "Watt hour" -> jouleToWattHour(amount)
                    "Kilowatt hour" -> jouleToKilowattHour(amount)
                    "Electronvolt" -> jouleToElectronvolt(amount)
                    "British thermal unit" -> jouleToBritishThermalUnit(amount)
                    "US therm" -> jouleToUSTherm(amount)
                    "Foot-pound" -> jouleToFootPound(amount)
                }
            }
            "Gram calorie" -> {
                val amount = gramCalorieToJoule(quantity)
                when (to) {
                    "Joule" -> jouleToJoule(amount)
                    "Kilojoule" -> jouleToKilojoule(amount)
                    "Gram calorie" -> jouleToGramCalorie(amount)
                    "Kilocalorie" -> jouleToKilocalorie(amount)
                    "Watt hour" -> jouleToWattHour(amount)
                    "Kilowatt hour" -> jouleToKilowattHour(amount)
                    "Electronvolt" -> jouleToElectronvolt(amount)
                    "British thermal unit" -> jouleToBritishThermalUnit(amount)
                    "US therm" -> jouleToUSTherm(amount)
                    "Foot-pound" -> jouleToFootPound(amount)
                }
            }
            "Kilocalorie" -> {
                val amount = kilocalorieToJoule(quantity)
                when (to) {
                    "Joule" -> jouleToJoule(amount)
                    "Kilojoule" -> jouleToKilojoule(amount)
                    "Gram calorie" -> jouleToGramCalorie(amount)
                    "Kilocalorie" -> jouleToKilocalorie(amount)
                    "Watt hour" -> jouleToWattHour(amount)
                    "Kilowatt hour" -> jouleToKilowattHour(amount)
                    "Electronvolt" -> jouleToElectronvolt(amount)
                    "British thermal unit" -> jouleToBritishThermalUnit(amount)
                    "US therm" -> jouleToUSTherm(amount)
                    "Foot-pound" -> jouleToFootPound(amount)
                }
            }
            "Watt hour" -> {
                val amount = wattHourToJoule(quantity)
                when (to) {
                    "Joule" -> jouleToJoule(amount)
                    "Kilojoule" -> jouleToKilojoule(amount)
                    "Gram calorie" -> jouleToGramCalorie(amount)
                    "Kilocalorie" -> jouleToKilocalorie(amount)
                    "Watt hour" -> jouleToWattHour(amount)
                    "Kilowatt hour" -> jouleToKilowattHour(amount)
                    "Electronvolt" -> jouleToElectronvolt(amount)
                    "British thermal unit" -> jouleToBritishThermalUnit(amount)
                    "US therm" -> jouleToUSTherm(amount)
                    "Foot-pound" -> jouleToFootPound(amount)
                }
            }
            "Kilowatt hour" -> {
                val amount = kilowattHourToJoule(quantity)
                when (to) {
                    "Joule" -> jouleToJoule(amount)
                    "Kilojoule" -> jouleToKilojoule(amount)
                    "Gram calorie" -> jouleToGramCalorie(amount)
                    "Kilocalorie" -> jouleToKilocalorie(amount)
                    "Watt hour" -> jouleToWattHour(amount)
                    "Kilowatt hour" -> jouleToKilowattHour(amount)
                    "Electronvolt" -> jouleToElectronvolt(amount)
                    "British thermal unit" -> jouleToBritishThermalUnit(amount)
                    "US therm" -> jouleToUSTherm(amount)
                    "Foot-pound" -> jouleToFootPound(amount)
                }
            }
            "Electronvolt" -> {
                val amount = electronvoltToJoule(quantity)
                when (to) {
                    "Joule" -> jouleToJoule(amount)
                    "Kilojoule" -> jouleToKilojoule(amount)
                    "Gram calorie" -> jouleToGramCalorie(amount)
                    "Kilocalorie" -> jouleToKilocalorie(amount)
                    "Watt hour" -> jouleToWattHour(amount)
                    "Kilowatt hour" -> jouleToKilowattHour(amount)
                    "Electronvolt" -> jouleToElectronvolt(amount)
                    "British thermal unit" -> jouleToBritishThermalUnit(amount)
                    "US therm" -> jouleToUSTherm(amount)
                    "Foot-pound" -> jouleToFootPound(amount)
                }
            }
            "British thermal unit" -> {
                val amount = britishThermalUnitToJoule(quantity)
                when (to) {
                    "Joule" -> jouleToJoule(amount)
                    "Kilojoule" -> jouleToKilojoule(amount)
                    "Gram calorie" -> jouleToGramCalorie(amount)
                    "Kilocalorie" -> jouleToKilocalorie(amount)
                    "Watt hour" -> jouleToWattHour(amount)
                    "Kilowatt hour" -> jouleToKilowattHour(amount)
                    "Electronvolt" -> jouleToElectronvolt(amount)
                    "British thermal unit" -> jouleToBritishThermalUnit(amount)
                    "US therm" -> jouleToUSTherm(amount)
                    "Foot-pound" -> jouleToFootPound(amount)
                }
            }
            "US therm" -> {
                val amount = usThermToJoule(quantity)
                when (to) {
                    "Joule" -> jouleToJoule(amount)
                    "Kilojoule" -> jouleToKilojoule(amount)
                    "Gram calorie" -> jouleToGramCalorie(amount)
                    "Kilocalorie" -> jouleToKilocalorie(amount)
                    "Watt hour" -> jouleToWattHour(amount)
                    "Kilowatt hour" -> jouleToKilowattHour(amount)
                    "Electronvolt" -> jouleToElectronvolt(amount)
                    "British thermal unit" -> jouleToBritishThermalUnit(amount)
                    "US therm" -> jouleToUSTherm(amount)
                    "Foot-pound" -> jouleToFootPound(amount)
                }
            }
            "Foot-pound" -> {
                val amount = footPoundToJoule(quantity)
                when (to) {
                    "Joule" -> jouleToJoule(amount)
                    "Kilojoule" -> jouleToKilojoule(amount)
                    "Gram calorie" -> jouleToGramCalorie(amount)
                    "Kilocalorie" -> jouleToKilocalorie(amount)
                    "Watt hour" -> jouleToWattHour(amount)
                    "Kilowatt hour" -> jouleToKilowattHour(amount)
                    "Electronvolt" -> jouleToElectronvolt(amount)
                    "British thermal unit" -> jouleToBritishThermalUnit(amount)
                    "US therm" -> jouleToUSTherm(amount)
                    "Foot-pound" -> jouleToFootPound(amount)
                }
            }
        }
        return quantity
    }

    private fun jouleToJoule(quantity: Double): Double {
        return quantity
    }
    private fun jouleToKilojoule(quantity: Double): Double {
        return (quantity * 0.001)
    }
    private fun jouleToGramCalorie(quantity: Double): Double {
        return (quantity / 4.184)
    }
    private fun jouleToKilocalorie(quantity: Double): Double {
        return (quantity / 4184.0)
    }
    private fun jouleToWattHour(quantity: Double): Double {
        return (quantity / 3600.0)
    }
    private fun jouleToKilowattHour(quantity: Double): Double {
        return (quantity / 3600000.0)
    }
    private fun jouleToElectronvolt(quantity: Double): Double {
        return (quantity * 6241506363094000000.0)
    }
    private fun jouleToBritishThermalUnit(quantity: Double): Double {
        return (quantity * 0.0009478171)
    }
    private fun jouleToUSTherm(quantity: Double): Double {
        return (quantity * 9480434279.0)
    }
    private fun jouleToFootPound(quantity: Double): Double {
        return (quantity * 0.7375621493)
    }

    private fun kilojouleToJoule(quantity: Double): Double {
        return (quantity / 0.001)
    }
    private fun gramCalorieToJoule(quantity: Double): Double {
        return (quantity * 4.184)
    }
    private fun kilocalorieToJoule(quantity: Double): Double {
        return (quantity * 4184.0)
    }
    private fun wattHourToJoule(quantity: Double): Double {
        return (quantity * 3600.0)
    }
    private fun kilowattHourToJoule(quantity: Double): Double {
        return (quantity * 3600000.0)
    }
    private fun electronvoltToJoule(quantity: Double): Double {
        return (quantity / 6241506363094000000.0)
    }
    private fun britishThermalUnitToJoule(quantity: Double): Double {
        return (quantity / 0.0009478171)
    }
    private fun usThermToJoule(quantity: Double): Double {
        return (quantity / 9480434279.0)
    }
    private fun footPoundToJoule(quantity: Double): Double {
        return (quantity / 0.7375621493)
    }
}
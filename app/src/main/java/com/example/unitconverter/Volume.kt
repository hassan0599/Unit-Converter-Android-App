package com.example.unitconverter

class Volume(val from: String, val to: String, val quantity: Double) {

    fun convert(): Double {
        when (from) {
            "US liquid gallon" -> {
                val amount = usLiquidGallonToLitre(quantity)
                    when (to) {
                        "US liquid gallon" -> return litreToUSLiquidGallon(amount)
                        "US liquid quart" -> return litreToUSLiquidQuart(amount)
                        "US liquid pint" -> return litreToUSLiquidPint(amount)
                        "US legal cup" -> return litreToUSLegalCup(amount)
                        "US fluid ounce" -> return litreToUSFluidOunce(amount)
                        "US tablespoon" -> return litreToUSTablespoon(amount)
                        "US teaspoon" -> return litreToUSTeaspoon(amount)
                        "Cubic meter" -> return litreToCubicMeter(amount)
                        "Litre" -> return litreToLitre(amount)
                        "Millilitre" -> return litreToMillilitre(amount)
                        "Imperial gallon" -> return litreToImperialGallon(amount)
                        "Imperial quart" -> return litreToImperialQuart(amount)
                        "Imperial pint" -> return litreToImperialPint(amount)
                        "Imperial cup" -> return litreToImperialCup(amount)
                        "Imperial fluid ounce" -> return litreToImperialFluidOunce(amount)
                        "Imperial tablespoon" -> return litreToImperialTablespoon(amount)
                        "Imperial teaspoon" -> return litreToImperialTeaspoon(amount)
                        "Cubic foot" -> return litreToCubicFoot(amount)
                        "Cubic inches" -> return litreToCubicInches(amount)
                    }
            }
            "US liquid quart" -> {
                val amount = usLiquidQuartToLitre(quantity)
                    when (to) {
                        "US liquid gallon" -> return litreToUSLiquidGallon(amount)
                        "US liquid quart" -> return litreToUSLiquidQuart(amount)
                        "US liquid pint" -> return litreToUSLiquidPint(amount)
                        "US legal cup" -> return litreToUSLegalCup(amount)
                        "US fluid ounce" -> return litreToUSFluidOunce(amount)
                        "US tablespoon" -> return litreToUSTablespoon(amount)
                        "US teaspoon" -> return litreToUSTeaspoon(amount)
                        "Cubic meter" -> return litreToCubicMeter(amount)
                        "Litre" -> return litreToLitre(amount)
                        "Millilitre" -> return litreToMillilitre(amount)
                        "Imperial gallon" -> return litreToImperialGallon(amount)
                        "Imperial quart" -> return litreToImperialQuart(amount)
                        "Imperial pint" -> return litreToImperialPint(amount)
                        "Imperial cup" -> return litreToImperialCup(amount)
                        "Imperial fluid ounce" -> return litreToImperialFluidOunce(amount)
                        "Imperial tablespoon" -> return litreToImperialTablespoon(amount)
                        "Imperial teaspoon" -> return litreToImperialTeaspoon(amount)
                        "Cubic foot" -> return litreToCubicFoot(amount)
                        "Cubic inches" -> return litreToCubicInches(amount)
                    }
            }
            "US liquid pint" -> {
                val amount = usLiquidPintToLitre(quantity)
                    when (to) {
                        "US liquid gallon" -> return litreToUSLiquidGallon(amount)
                        "US liquid quart" -> return litreToUSLiquidQuart(amount)
                        "US liquid pint" -> return litreToUSLiquidPint(amount)
                        "US legal cup" -> return litreToUSLegalCup(amount)
                        "US fluid ounce" -> return litreToUSFluidOunce(amount)
                        "US tablespoon" -> return litreToUSTablespoon(amount)
                        "US teaspoon" -> return litreToUSTeaspoon(amount)
                        "Cubic meter" -> return litreToCubicMeter(amount)
                        "Litre" -> return litreToLitre(amount)
                        "Millilitre" -> return litreToMillilitre(amount)
                        "Imperial gallon" -> return litreToImperialGallon(amount)
                        "Imperial quart" -> return litreToImperialQuart(amount)
                        "Imperial pint" -> return litreToImperialPint(amount)
                        "Imperial cup" -> return litreToImperialCup(amount)
                        "Imperial fluid ounce" -> return litreToImperialFluidOunce(amount)
                        "Imperial tablespoon" -> return litreToImperialTablespoon(amount)
                        "Imperial teaspoon" -> return litreToImperialTeaspoon(amount)
                        "Cubic foot" -> return litreToCubicFoot(amount)
                        "Cubic inches" -> return litreToCubicInches(amount)
                    }
            }
            "US legal cup" -> {
                val amount = usLegalCupToLitre(quantity)
                    when (to) {
                        "US liquid gallon" -> return litreToUSLiquidGallon(amount)
                        "US liquid quart" -> return litreToUSLiquidQuart(amount)
                        "US liquid pint" -> return litreToUSLiquidPint(amount)
                        "US legal cup" -> return litreToUSLegalCup(amount)
                        "US fluid ounce" -> return litreToUSFluidOunce(amount)
                        "US tablespoon" -> return litreToUSTablespoon(amount)
                        "US teaspoon" -> return litreToUSTeaspoon(amount)
                        "Cubic meter" -> return litreToCubicMeter(amount)
                        "Litre" -> return litreToLitre(amount)
                        "Millilitre" -> return litreToMillilitre(amount)
                        "Imperial gallon" -> return litreToImperialGallon(amount)
                        "Imperial quart" -> return litreToImperialQuart(amount)
                        "Imperial pint" -> return litreToImperialPint(amount)
                        "Imperial cup" -> return litreToImperialCup(amount)
                        "Imperial fluid ounce" -> return litreToImperialFluidOunce(amount)
                        "Imperial tablespoon" -> return litreToImperialTablespoon(amount)
                        "Imperial teaspoon" -> return litreToImperialTeaspoon(amount)
                        "Cubic foot" -> return litreToCubicFoot(amount)
                        "Cubic inches" -> return litreToCubicInches(amount)
                    }
            }
            "US fluid ounce" -> {
                val amount = usFluidOunceToLitre(quantity)
                    when (to) {
                        "US liquid gallon" -> return litreToUSLiquidGallon(amount)
                        "US liquid quart" -> return litreToUSLiquidQuart(amount)
                        "US liquid pint" -> return litreToUSLiquidPint(amount)
                        "US legal cup" -> return litreToUSLegalCup(amount)
                        "US fluid ounce" -> return litreToUSFluidOunce(amount)
                        "US tablespoon" -> return litreToUSTablespoon(amount)
                        "US teaspoon" -> return litreToUSTeaspoon(amount)
                        "Cubic meter" -> return litreToCubicMeter(amount)
                        "Litre" -> return litreToLitre(amount)
                        "Millilitre" -> return litreToMillilitre(amount)
                        "Imperial gallon" -> return litreToImperialGallon(amount)
                        "Imperial quart" -> return litreToImperialQuart(amount)
                        "Imperial pint" -> return litreToImperialPint(amount)
                        "Imperial cup" -> return litreToImperialCup(amount)
                        "Imperial fluid ounce" -> return litreToImperialFluidOunce(amount)
                        "Imperial tablespoon" -> return litreToImperialTablespoon(amount)
                        "Imperial teaspoon" -> return litreToImperialTeaspoon(amount)
                        "Cubic foot" -> return litreToCubicFoot(amount)
                        "Cubic inches" -> return litreToCubicInches(amount)
                    }
            }
            "US tablespoon" -> {
                val amount = usTablespoonToLitre(quantity)
                    when (to) {
                        "US liquid gallon" -> return litreToUSLiquidGallon(amount)
                        "US liquid quart" -> return litreToUSLiquidQuart(amount)
                        "US liquid pint" -> return litreToUSLiquidPint(amount)
                        "US legal cup" -> return litreToUSLegalCup(amount)
                        "US fluid ounce" -> return litreToUSFluidOunce(amount)
                        "US tablespoon" -> return litreToUSTablespoon(amount)
                        "US teaspoon" -> return litreToUSTeaspoon(amount)
                        "Cubic meter" -> return litreToCubicMeter(amount)
                        "Litre" -> return litreToLitre(amount)
                        "Millilitre" -> return litreToMillilitre(amount)
                        "Imperial gallon" -> return litreToImperialGallon(amount)
                        "Imperial quart" -> return litreToImperialQuart(amount)
                        "Imperial pint" -> return litreToImperialPint(amount)
                        "Imperial cup" -> return litreToImperialCup(amount)
                        "Imperial fluid ounce" -> return litreToImperialFluidOunce(amount)
                        "Imperial tablespoon" -> return litreToImperialTablespoon(amount)
                        "Imperial teaspoon" -> return litreToImperialTeaspoon(amount)
                        "Cubic foot" -> return litreToCubicFoot(amount)
                        "Cubic inches" -> return litreToCubicInches(amount)
                    }
            }
            "US teaspoon" -> {
                val amount = usTeaspoonToLitre(quantity)
                    when (to) {
                        "US liquid gallon" -> return litreToUSLiquidGallon(amount)
                        "US liquid quart" -> return litreToUSLiquidQuart(amount)
                        "US liquid pint" -> return litreToUSLiquidPint(amount)
                        "US legal cup" -> return litreToUSLegalCup(amount)
                        "US fluid ounce" -> return litreToUSFluidOunce(amount)
                        "US tablespoon" -> return litreToUSTablespoon(amount)
                        "US teaspoon" -> return litreToUSTeaspoon(amount)
                        "Cubic meter" -> return litreToCubicMeter(amount)
                        "Litre" -> return litreToLitre(amount)
                        "Millilitre" -> return litreToMillilitre(amount)
                        "Imperial gallon" -> return litreToImperialGallon(amount)
                        "Imperial quart" -> return litreToImperialQuart(amount)
                        "Imperial pint" -> return litreToImperialPint(amount)
                        "Imperial cup" -> return litreToImperialCup(amount)
                        "Imperial fluid ounce" -> return litreToImperialFluidOunce(amount)
                        "Imperial tablespoon" -> return litreToImperialTablespoon(amount)
                        "Imperial teaspoon" -> return litreToImperialTeaspoon(amount)
                        "Cubic foot" -> return litreToCubicFoot(amount)
                        "Cubic inches" -> return litreToCubicInches(amount)
                    }
            }
            "Cubic meter" -> {
                val amount = cubicMeterToLitre(quantity)
                    when (to) {
                        "US liquid gallon" -> return litreToUSLiquidGallon(amount)
                        "US liquid quart" -> return litreToUSLiquidQuart(amount)
                        "US liquid pint" -> return litreToUSLiquidPint(amount)
                        "US legal cup" -> return litreToUSLegalCup(amount)
                        "US fluid ounce" -> return litreToUSFluidOunce(amount)
                        "US tablespoon" -> return litreToUSTablespoon(amount)
                        "US teaspoon" -> return litreToUSTeaspoon(amount)
                        "Cubic meter" -> return litreToCubicMeter(amount)
                        "Litre" -> return litreToLitre(amount)
                        "Millilitre" -> return litreToMillilitre(amount)
                        "Imperial gallon" -> return litreToImperialGallon(amount)
                        "Imperial quart" -> return litreToImperialQuart(amount)
                        "Imperial pint" -> return litreToImperialPint(amount)
                        "Imperial cup" -> return litreToImperialCup(amount)
                        "Imperial fluid ounce" -> return litreToImperialFluidOunce(amount)
                        "Imperial tablespoon" -> return litreToImperialTablespoon(amount)
                        "Imperial teaspoon" -> return litreToImperialTeaspoon(amount)
                        "Cubic foot" -> return litreToCubicFoot(amount)
                        "Cubic inches" -> return litreToCubicInches(amount)
                    }
            }
            "Litre" -> {
                val amount = litreToLitre(quantity)
                    when (to) {
                        "US liquid gallon" -> return litreToUSLiquidGallon(amount)
                        "US liquid quart" -> return litreToUSLiquidQuart(amount)
                        "US liquid pint" -> return litreToUSLiquidPint(amount)
                        "US legal cup" -> return litreToUSLegalCup(amount)
                        "US fluid ounce" -> return litreToUSFluidOunce(amount)
                        "US tablespoon" -> return litreToUSTablespoon(amount)
                        "US teaspoon" -> return litreToUSTeaspoon(amount)
                        "Cubic meter" -> return litreToCubicMeter(amount)
                        "Litre" -> return litreToLitre(amount)
                        "Millilitre" -> return litreToMillilitre(amount)
                        "Imperial gallon" -> return litreToImperialGallon(amount)
                        "Imperial quart" -> return litreToImperialQuart(amount)
                        "Imperial pint" -> return litreToImperialPint(amount)
                        "Imperial cup" -> return litreToImperialCup(amount)
                        "Imperial fluid ounce" -> return litreToImperialFluidOunce(amount)
                        "Imperial tablespoon" -> return litreToImperialTablespoon(amount)
                        "Imperial teaspoon" -> return litreToImperialTeaspoon(amount)
                        "Cubic foot" -> return litreToCubicFoot(amount)
                        "Cubic inches" -> return litreToCubicInches(amount)
                    }
            }
            "Millilitre" -> {
                val amount = millilitreToLitre(quantity)
                    when (to) {
                        "US liquid gallon" -> return litreToUSLiquidGallon(amount)
                        "US liquid quart" -> return litreToUSLiquidQuart(amount)
                        "US liquid pint" -> return litreToUSLiquidPint(amount)
                        "US legal cup" -> return litreToUSLegalCup(amount)
                        "US fluid ounce" -> return litreToUSFluidOunce(amount)
                        "US tablespoon" -> return litreToUSTablespoon(amount)
                        "US teaspoon" -> return litreToUSTeaspoon(amount)
                        "Cubic meter" -> return litreToCubicMeter(amount)
                        "Litre" -> return litreToLitre(amount)
                        "Millilitre" -> return litreToMillilitre(amount)
                        "Imperial gallon" -> return litreToImperialGallon(amount)
                        "Imperial quart" -> return litreToImperialQuart(amount)
                        "Imperial pint" -> return litreToImperialPint(amount)
                        "Imperial cup" -> return litreToImperialCup(amount)
                        "Imperial fluid ounce" -> return litreToImperialFluidOunce(amount)
                        "Imperial tablespoon" -> return litreToImperialTablespoon(amount)
                        "Imperial teaspoon" -> return litreToImperialTeaspoon(amount)
                        "Cubic foot" -> return litreToCubicFoot(amount)
                        "Cubic inches" -> return litreToCubicInches(amount)
                    }
            }
            "Imperial gallon" -> {
                val amount = imperialGallonToLitre(quantity)
                    when (to) {
                        "US liquid gallon" -> return litreToUSLiquidGallon(amount)
                        "US liquid quart" -> return litreToUSLiquidQuart(amount)
                        "US liquid pint" -> return litreToUSLiquidPint(amount)
                        "US legal cup" -> return litreToUSLegalCup(amount)
                        "US fluid ounce" -> return litreToUSFluidOunce(amount)
                        "US tablespoon" -> return litreToUSTablespoon(amount)
                        "US teaspoon" -> return litreToUSTeaspoon(amount)
                        "Cubic meter" -> return litreToCubicMeter(amount)
                        "Litre" -> return litreToLitre(amount)
                        "Millilitre" -> return litreToMillilitre(amount)
                        "Imperial gallon" -> return litreToImperialGallon(amount)
                        "Imperial quart" -> return litreToImperialQuart(amount)
                        "Imperial pint" -> return litreToImperialPint(amount)
                        "Imperial cup" -> return litreToImperialCup(amount)
                        "Imperial fluid ounce" -> return litreToImperialFluidOunce(amount)
                        "Imperial tablespoon" -> return litreToImperialTablespoon(amount)
                        "Imperial teaspoon" -> return litreToImperialTeaspoon(amount)
                        "Cubic foot" -> return litreToCubicFoot(amount)
                        "Cubic inches" -> return litreToCubicInches(amount)
                    }
            }
            "Imperial quart" -> {
                val amount = imperialQuartToLitre(quantity)
                    when (to) {
                        "US liquid gallon" -> return litreToUSLiquidGallon(amount)
                        "US liquid quart" -> return litreToUSLiquidQuart(amount)
                        "US liquid pint" -> return litreToUSLiquidPint(amount)
                        "US legal cup" -> return litreToUSLegalCup(amount)
                        "US fluid ounce" -> return litreToUSFluidOunce(amount)
                        "US tablespoon" -> return litreToUSTablespoon(amount)
                        "US teaspoon" -> return litreToUSTeaspoon(amount)
                        "Cubic meter" -> return litreToCubicMeter(amount)
                        "Litre" -> return litreToLitre(amount)
                        "Millilitre" -> return litreToMillilitre(amount)
                        "Imperial gallon" -> return litreToImperialGallon(amount)
                        "Imperial quart" -> return litreToImperialQuart(amount)
                        "Imperial pint" -> return litreToImperialPint(amount)
                        "Imperial cup" -> return litreToImperialCup(amount)
                        "Imperial fluid ounce" -> return litreToImperialFluidOunce(amount)
                        "Imperial tablespoon" -> return litreToImperialTablespoon(amount)
                        "Imperial teaspoon" -> return litreToImperialTeaspoon(amount)
                        "Cubic foot" -> return litreToCubicFoot(amount)
                        "Cubic inches" -> return litreToCubicInches(amount)
                    }
            }
            "Imperial pint" -> {
                val amount = imperialPintToLitre(quantity)
                    when (to) {
                        "US liquid gallon" -> return litreToUSLiquidGallon(amount)
                        "US liquid quart" -> return litreToUSLiquidQuart(amount)
                        "US liquid pint" -> return litreToUSLiquidPint(amount)
                        "US legal cup" -> return litreToUSLegalCup(amount)
                        "US fluid ounce" -> return litreToUSFluidOunce(amount)
                        "US tablespoon" -> return litreToUSTablespoon(amount)
                        "US teaspoon" -> return litreToUSTeaspoon(amount)
                        "Cubic meter" -> return litreToCubicMeter(amount)
                        "Litre" -> return litreToLitre(amount)
                        "Millilitre" -> return litreToMillilitre(amount)
                        "Imperial gallon" -> return litreToImperialGallon(amount)
                        "Imperial quart" -> return litreToImperialQuart(amount)
                        "Imperial pint" -> return litreToImperialPint(amount)
                        "Imperial cup" -> return litreToImperialCup(amount)
                        "Imperial fluid ounce" -> return litreToImperialFluidOunce(amount)
                        "Imperial tablespoon" -> return litreToImperialTablespoon(amount)
                        "Imperial teaspoon" -> return litreToImperialTeaspoon(amount)
                        "Cubic foot" -> return litreToCubicFoot(amount)
                        "Cubic inches" -> return litreToCubicInches(amount)
                    }
            }
            "Imperial cup" -> {
                val amount = imperialCupToLitre(quantity)
                    when (to) {
                        "US liquid gallon" -> return litreToUSLiquidGallon(amount)
                        "US liquid quart" -> return litreToUSLiquidQuart(amount)
                        "US liquid pint" -> return litreToUSLiquidPint(amount)
                        "US legal cup" -> return litreToUSLegalCup(amount)
                        "US fluid ounce" -> return litreToUSFluidOunce(amount)
                        "US tablespoon" -> return litreToUSTablespoon(amount)
                        "US teaspoon" -> return litreToUSTeaspoon(amount)
                        "Cubic meter" -> return litreToCubicMeter(amount)
                        "Litre" -> return litreToLitre(amount)
                        "Millilitre" -> return litreToMillilitre(amount)
                        "Imperial gallon" -> return litreToImperialGallon(amount)
                        "Imperial quart" -> return litreToImperialQuart(amount)
                        "Imperial pint" -> return litreToImperialPint(amount)
                        "Imperial cup" -> return litreToImperialCup(amount)
                        "Imperial fluid ounce" -> return litreToImperialFluidOunce(amount)
                        "Imperial tablespoon" -> return litreToImperialTablespoon(amount)
                        "Imperial teaspoon" -> return litreToImperialTeaspoon(amount)
                        "Cubic foot" -> return litreToCubicFoot(amount)
                        "Cubic inches" -> return litreToCubicInches(amount)
                    }
            }
            "Imperial fluid ounce" -> {
                val amount = imperialFluidOunceToLitre(quantity)
                    when (to) {
                        "US liquid gallon" -> return litreToUSLiquidGallon(amount)
                        "US liquid quart" -> return litreToUSLiquidQuart(amount)
                        "US liquid pint" -> return litreToUSLiquidPint(amount)
                        "US legal cup" -> return litreToUSLegalCup(amount)
                        "US fluid ounce" -> return litreToUSFluidOunce(amount)
                        "US tablespoon" -> return litreToUSTablespoon(amount)
                        "US teaspoon" -> return litreToUSTeaspoon(amount)
                        "Cubic meter" -> return litreToCubicMeter(amount)
                        "Litre" -> return litreToLitre(amount)
                        "Millilitre" -> return litreToMillilitre(amount)
                        "Imperial gallon" -> return litreToImperialGallon(amount)
                        "Imperial quart" -> return litreToImperialQuart(amount)
                        "Imperial pint" -> return litreToImperialPint(amount)
                        "Imperial cup" -> return litreToImperialCup(amount)
                        "Imperial fluid ounce" -> return litreToImperialFluidOunce(amount)
                        "Imperial tablespoon" -> return litreToImperialTablespoon(amount)
                        "Imperial teaspoon" -> return litreToImperialTeaspoon(amount)
                        "Cubic foot" -> return litreToCubicFoot(amount)
                        "Cubic inches" -> return litreToCubicInches(amount)
                    }
            }
            "Imperial tablespoon" -> {
                val amount = imperialTablespoonToLitre(quantity)
                    when (to) {
                        "US liquid gallon" -> return litreToUSLiquidGallon(amount)
                        "US liquid quart" -> return litreToUSLiquidQuart(amount)
                        "US liquid pint" -> return litreToUSLiquidPint(amount)
                        "US legal cup" -> return litreToUSLegalCup(amount)
                        "US fluid ounce" -> return litreToUSFluidOunce(amount)
                        "US tablespoon" -> return litreToUSTablespoon(amount)
                        "US teaspoon" -> return litreToUSTeaspoon(amount)
                        "Cubic meter" -> return litreToCubicMeter(amount)
                        "Litre" -> return litreToLitre(amount)
                        "Millilitre" -> return litreToMillilitre(amount)
                        "Imperial gallon" -> return litreToImperialGallon(amount)
                        "Imperial quart" -> return litreToImperialQuart(amount)
                        "Imperial pint" -> return litreToImperialPint(amount)
                        "Imperial cup" -> return litreToImperialCup(amount)
                        "Imperial fluid ounce" -> return litreToImperialFluidOunce(amount)
                        "Imperial tablespoon" -> return litreToImperialTablespoon(amount)
                        "Imperial teaspoon" -> return litreToImperialTeaspoon(amount)
                        "Cubic foot" -> return litreToCubicFoot(amount)
                        "Cubic inches" -> return litreToCubicInches(amount)
                    }
            }
            "Imperial teaspoon" -> {
                val amount = imperialTeaspoonToLitre(quantity)
                    when (to) {
                        "US liquid gallon" -> return litreToUSLiquidGallon(amount)
                        "US liquid quart" -> return litreToUSLiquidQuart(amount)
                        "US liquid pint" -> return litreToUSLiquidPint(amount)
                        "US legal cup" -> return litreToUSLegalCup(amount)
                        "US fluid ounce" -> return litreToUSFluidOunce(amount)
                        "US tablespoon" -> return litreToUSTablespoon(amount)
                        "US teaspoon" -> return litreToUSTeaspoon(amount)
                        "Cubic meter" -> return litreToCubicMeter(amount)
                        "Litre" -> return litreToLitre(amount)
                        "Millilitre" -> return litreToMillilitre(amount)
                        "Imperial gallon" -> return litreToImperialGallon(amount)
                        "Imperial quart" -> return litreToImperialQuart(amount)
                        "Imperial pint" -> return litreToImperialPint(amount)
                        "Imperial cup" -> return litreToImperialCup(amount)
                        "Imperial fluid ounce" -> return litreToImperialFluidOunce(amount)
                        "Imperial tablespoon" -> return litreToImperialTablespoon(amount)
                        "Imperial teaspoon" -> return litreToImperialTeaspoon(amount)
                        "Cubic foot" -> return litreToCubicFoot(amount)
                        "Cubic inches" -> return litreToCubicInches(amount)
                    }
            }
            "Cubic foot" -> {
                val amount = cubicFootToLitre(quantity)
                    when (to) {
                        "US liquid gallon" -> return litreToUSLiquidGallon(amount)
                        "US liquid quart" -> return litreToUSLiquidQuart(amount)
                        "US liquid pint" -> return litreToUSLiquidPint(amount)
                        "US legal cup" -> return litreToUSLegalCup(amount)
                        "US fluid ounce" -> return litreToUSFluidOunce(amount)
                        "US tablespoon" -> return litreToUSTablespoon(amount)
                        "US teaspoon" -> return litreToUSTeaspoon(amount)
                        "Cubic meter" -> return litreToCubicMeter(amount)
                        "Litre" -> return litreToLitre(amount)
                        "Millilitre" -> return litreToMillilitre(amount)
                        "Imperial gallon" -> return litreToImperialGallon(amount)
                        "Imperial quart" -> return litreToImperialQuart(amount)
                        "Imperial pint" -> return litreToImperialPint(amount)
                        "Imperial cup" -> return litreToImperialCup(amount)
                        "Imperial fluid ounce" -> return litreToImperialFluidOunce(amount)
                        "Imperial tablespoon" -> return litreToImperialTablespoon(amount)
                        "Imperial teaspoon" -> return litreToImperialTeaspoon(amount)
                        "Cubic foot" -> return litreToCubicFoot(amount)
                        "Cubic inches" -> return litreToCubicInches(amount)
                    }
            }
            "Cubic inches" -> {
                val amount = cubicInchesToLitre(quantity)
                    when (to) {
                        "US liquid gallon" -> return litreToUSLiquidGallon(amount)
                        "US liquid quart" -> return litreToUSLiquidQuart(amount)
                        "US liquid pint" -> return litreToUSLiquidPint(amount)
                        "US legal cup" -> return litreToUSLegalCup(amount)
                        "US fluid ounce" -> return litreToUSFluidOunce(amount)
                        "US tablespoon" -> return litreToUSTablespoon(amount)
                        "US teaspoon" -> return litreToUSTeaspoon(amount)
                        "Cubic meter" -> return litreToCubicMeter(amount)
                        "Litre" -> return litreToLitre(amount)
                        "Millilitre" -> return litreToMillilitre(amount)
                        "Imperial gallon" -> return litreToImperialGallon(amount)
                        "Imperial quart" -> return litreToImperialQuart(amount)
                        "Imperial pint" -> return litreToImperialPint(amount)
                        "Imperial cup" -> return litreToImperialCup(amount)
                        "Imperial fluid ounce" -> return litreToImperialFluidOunce(amount)
                        "Imperial tablespoon" -> return litreToImperialTablespoon(amount)
                        "Imperial teaspoon" -> return litreToImperialTeaspoon(amount)
                        "Cubic foot" -> return litreToCubicFoot(amount)
                        "Cubic inches" -> return litreToCubicInches(amount)
                    }
            }
        }
        return quantity
    }
    
    private fun litreToUSLiquidGallon(quantity: Double): Double {
        return (quantity * 0.2641720524)
    }
    private fun litreToUSLiquidQuart(quantity: Double): Double {
        return (quantity * 4.2267528377)
    }
    private fun litreToUSLiquidPint(quantity: Double): Double {
        return (quantity * 2.1133764189)
    }
    private fun litreToUSLegalCup(quantity: Double): Double {
        return (quantity * 4.2267528377)
    }
    private fun litreToUSFluidOunce(quantity: Double): Double {
        return (quantity * 33.814022702)
    }
    private fun litreToUSTablespoon(quantity: Double): Double {
        return (quantity * 67.628045404)
    }
    private fun litreToUSTeaspoon(quantity: Double): Double {
        return (quantity * 202.88413621)
    }
    private fun litreToCubicMeter(quantity: Double): Double {
        return (quantity * 0.001)
    }
    private fun litreToLitre(quantity: Double): Double {
        return quantity
    }
    private fun litreToMillilitre(quantity: Double): Double {
        return (quantity * 1000.0)
    }
    private fun litreToImperialGallon(quantity: Double): Double {
        return (quantity * 0.2199692483)
    }
    private fun litreToImperialQuart(quantity: Double): Double {
        return (quantity * 0.8798769932)
    }
    private fun litreToImperialPint(quantity: Double): Double {
        return (quantity * 1.7597539864)
    }
    private fun litreToImperialCup(quantity: Double): Double {
        return (quantity * 3.5195079728)
    }
    private fun litreToImperialFluidOunce(quantity: Double): Double {
        return (quantity * 35.195079728)
    }
    private fun litreToImperialTablespoon(quantity: Double): Double {
        return (quantity * 56.312127565)
    }
    private fun litreToImperialTeaspoon(quantity: Double): Double {
        return (quantity * 168.93638269)
    }
    private fun litreToCubicFoot(quantity: Double): Double {
        return (quantity * 0.0353146667)
    }
    private fun litreToCubicInches(quantity: Double): Double {
        return (quantity * 61.023744095)
    }

    private fun usLiquidGallonToLitre(quantity: Double): Double {
        return (quantity / 0.2641720524)
    }
    private fun usLiquidQuartToLitre(quantity: Double): Double {
        return (quantity / 4.2267528377)
    }
    private fun usLiquidPintToLitre(quantity: Double): Double {
        return (quantity / 2.1133764189)
    }
    private fun usLegalCupToLitre(quantity: Double): Double {
        return (quantity / 4.2267528377)
    }
    private fun usFluidOunceToLitre(quantity: Double): Double {
        return (quantity / 33.814022702)
    }
    private fun usTablespoonToLitre(quantity: Double): Double {
        return (quantity / 67.628045404)
    }
    private fun usTeaspoonToLitre(quantity: Double): Double {
        return (quantity / 202.88413621)
    }
    private fun cubicMeterToLitre(quantity: Double): Double {
        return (quantity / 0.001)
    }
    private fun millilitreToLitre(quantity: Double): Double {
        return (quantity / 1000.0)
    }
    private fun imperialGallonToLitre(quantity: Double): Double {
        return (quantity * 0.2199692483)
    }
    private fun imperialQuartToLitre(quantity: Double): Double {
        return (quantity * 0.8798769932)
    }
    private fun imperialPintToLitre(quantity: Double): Double {
        return (quantity * 1.7597539864)
    }
    private fun imperialCupToLitre(quantity: Double): Double {
        return (quantity * 3.5195079728)
    }
    private fun imperialFluidOunceToLitre(quantity: Double): Double {
        return (quantity * 35.195079728)
    }
    private fun imperialTablespoonToLitre(quantity: Double): Double {
        return (quantity * 56.312127565)
    }
    private fun imperialTeaspoonToLitre(quantity: Double): Double {
        return (quantity * 168.93638269)
    }
    private fun cubicFootToLitre(quantity: Double): Double {
        return (quantity * 0.0353146667)
    }
    private fun cubicInchesToLitre(quantity: Double): Double {
        return (quantity * 61.023744095)
    }
}
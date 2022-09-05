package com.example.unitconverter

class Area(val from: String, val to: String, val quantity: Double) {

    fun convert(): Double {
        when (from) {
            "Square kilometre" -> {
                val amount = squareKilometreToSquareMeter(quantity)
                when (to) {
                    "Square kilometre" -> return squareMeterToSquareKilometre(amount)
                    "Square meter" -> return squareMeterToSquareMeter(amount)
                    "Square mile" -> return squareMeterToSquareMile(amount)
                    "Square yard" -> return squareMeterToSquareYard(amount)
                    "Square foot" -> return squareMeterToSquareFoot(amount)
                    "Hectare" -> return squareMeterToHectare(amount)
                    "Acre" -> return squareMeterToAcre(amount)
                }
            }
            "Square meter" -> {
                val amount = squareMeterToSquareMeter(quantity)
                when (to) {
                    "Square kilometre" -> return squareMeterToSquareKilometre(amount)
                    "Square meter" -> return squareMeterToSquareMeter(amount)
                    "Square mile" -> return squareMeterToSquareMile(amount)
                    "Square yard" -> return squareMeterToSquareYard(amount)
                    "Square foot" -> return squareMeterToSquareFoot(amount)
                    "Hectare" -> return squareMeterToHectare(amount)
                    "Acre" -> return squareMeterToAcre(amount)
                }
            }
            "Square mile" -> {
                val amount = squareMileToSquareMeter(quantity)
                when (to) {
                    "Square kilometre" -> return squareMeterToSquareKilometre(amount)
                    "Square meter" -> return squareMeterToSquareMeter(amount)
                    "Square mile" -> return squareMeterToSquareMile(amount)
                    "Square yard" -> return squareMeterToSquareYard(amount)
                    "Square foot" -> return squareMeterToSquareFoot(amount)
                    "Hectare" -> return squareMeterToHectare(amount)
                    "Acre" -> return squareMeterToAcre(amount)
                }
            }
            "Square yard" -> {
                val amount = squareYardToSquareMeter(quantity)
                when (to) {
                    "Square kilometre" -> return squareMeterToSquareKilometre(amount)
                    "Square meter" -> return squareMeterToSquareMeter(amount)
                    "Square mile" -> return squareMeterToSquareMile(amount)
                    "Square yard" -> return squareMeterToSquareYard(amount)
                    "Square foot" -> return squareMeterToSquareFoot(amount)
                    "Hectare" -> return squareMeterToHectare(amount)
                    "Acre" -> return squareMeterToAcre(amount)
                }
            }
            "Square foot" -> {
                val amount = squareFootToSquareMeter(quantity)
                when (to) {
                    "Square kilometre" -> return squareMeterToSquareKilometre(amount)
                    "Square meter" -> return squareMeterToSquareMeter(amount)
                    "Square mile" -> return squareMeterToSquareMile(amount)
                    "Square yard" -> return squareMeterToSquareYard(amount)
                    "Square foot" -> return squareMeterToSquareFoot(amount)
                    "Hectare" -> return squareMeterToHectare(amount)
                    "Acre" -> return squareMeterToAcre(amount)
                }
            }
            "Hectare" -> {
                val amount = hectareToSquareMeter(quantity)
                when (to) {
                    "Square kilometre" -> return squareMeterToSquareKilometre(amount)
                    "Square meter" -> return squareMeterToSquareMeter(amount)
                    "Square mile" -> return squareMeterToSquareMile(amount)
                    "Square yard" -> return squareMeterToSquareYard(amount)
                    "Square foot" -> return squareMeterToSquareFoot(amount)
                    "Hectare" -> return squareMeterToHectare(amount)
                    "Acre" -> return squareMeterToAcre(amount)
                }
            }
            "Acre" -> {
                val amount = acreToSquareMeter(quantity)
                when (to) {
                    "Square kilometre" -> return squareMeterToSquareKilometre(amount)
                    "Square meter" -> return squareMeterToSquareMeter(amount)
                    "Square mile" -> return squareMeterToSquareMile(amount)
                    "Square yard" -> return squareMeterToSquareYard(amount)
                    "Square foot" -> return squareMeterToSquareFoot(amount)
                    "Hectare" -> return squareMeterToHectare(amount)
                    "Acre" -> return squareMeterToAcre(amount)
                }
            }
        }
        return quantity
    }

    private fun squareMeterToSquareKilometre(quantity: Double): Double {
        return (quantity * 0.000001)
    }
    private fun squareMeterToSquareMeter(quantity: Double): Double {
        return quantity
    }
    private fun squareMeterToSquareMile(quantity: Double): Double {
        return (quantity * 0.0000003861021585)
    }
    private fun squareMeterToSquareYard(quantity: Double): Double {
        return (quantity * 1.1959900463)
    }
    private fun squareMeterToSquareFoot(quantity: Double): Double {
        return (quantity * 10.763910417)
    }
    private fun squareMeterToHectare(quantity: Double): Double {
        return (quantity * 0.0001)
    }
    private fun squareMeterToAcre(quantity: Double): Double {
        return (quantity * 0.0002471054)
    }

    private fun squareKilometreToSquareMeter(quantity: Double): Double {
        return (quantity / 0.000001)
    }
    private fun squareMileToSquareMeter(quantity: Double): Double {
        return (quantity / 0.0000003861021585)
    }
    private fun squareYardToSquareMeter(quantity: Double): Double {
        return (quantity / 1.1959900463)
    }
    private fun squareFootToSquareMeter(quantity: Double): Double {
        return (quantity / 10.763910417)
    }
    private fun hectareToSquareMeter(quantity: Double): Double {
        return (quantity / 0.0001)
    }
    private fun acreToSquareMeter(quantity: Double): Double {
        return (quantity / 0.0002471054)
    }
}
package com.example.unitconverter

class DataTransferRate(val from: String, val to: String, val quantity: Double) {

    fun convert(): Double {
        when (from) {
            "Bit per second" -> {
                val amount = bitPerSecondToBitPerSecond(quantity)
                when (to) {
                    "Bit per second" -> return bitPerSecondToBitPerSecond(amount)
                    "Kilobit per second" -> return bitPerSecondToKilobitPerSecond(amount)
                    "Kilobyte per second" -> return bitPerSecondToKilobytePerSecond(amount)
                    "Kibibit per second" -> return bitPerSecondToKibibitPerSecond(amount)
                    "Megabit per second" -> return bitPerSecondToMegabitPerSecond(amount)
                    "Megabyte per second" -> return bitPerSecondToMegabytePerSecond(amount)
                    "Mebibit per second" -> return bitPerSecondToMebibitPerSecond(amount)
                    "Gigabit per second" -> return bitPerSecondToGigabitPerSecond(amount)
                    "Gigabyte per second" -> return bitPerSecondToGigabytePerSecond(amount)
                    "Gibibit per second" -> return bitPerSecondToGibibitPerSecond(amount)
                    "Terabit per second" -> return bitPerSecondToTerabitPerSecond(amount)
                    "Terabyte per second" -> return bitPerSecondToTerabytePerSecond(amount)
                    "Tebibit per second" -> return bitPerSecondToTebibitPerSecond(amount)
                }
            }
            "Kilobit per second" -> {
                val amount = kilobitPerSecondToBitPerSecond(quantity)
                when (to) {
                    "Bit per second" -> return bitPerSecondToBitPerSecond(amount)
                    "Kilobit per second" -> return bitPerSecondToKilobitPerSecond(amount)
                    "Kilobyte per second" -> return bitPerSecondToKilobytePerSecond(amount)
                    "Kibibit per second" -> return bitPerSecondToKibibitPerSecond(amount)
                    "Megabit per second" -> return bitPerSecondToMegabitPerSecond(amount)
                    "Megabyte per second" -> return bitPerSecondToMegabytePerSecond(amount)
                    "Mebibit per second" -> return bitPerSecondToMebibitPerSecond(amount)
                    "Gigabit per second" -> return bitPerSecondToGigabitPerSecond(amount)
                    "Gigabyte per second" -> return bitPerSecondToGigabytePerSecond(amount)
                    "Gibibit per second" -> return bitPerSecondToGibibitPerSecond(amount)
                    "Terabit per second" -> return bitPerSecondToTerabitPerSecond(amount)
                    "Terabyte per second" -> return bitPerSecondToTerabytePerSecond(amount)
                    "Tebibit per second" -> return bitPerSecondToTebibitPerSecond(amount)
                }
            }
            "Kilobyte per second" -> {
                val amount = kilobytePerSecondToBitPerSecond(quantity)
                when (to) {
                    "Bit per second" -> return bitPerSecondToBitPerSecond(amount)
                    "Kilobit per second" -> return bitPerSecondToKilobitPerSecond(amount)
                    "Kilobyte per second" -> return bitPerSecondToKilobytePerSecond(amount)
                    "Kibibit per second" -> return bitPerSecondToKibibitPerSecond(amount)
                    "Megabit per second" -> return bitPerSecondToMegabitPerSecond(amount)
                    "Megabyte per second" -> return bitPerSecondToMegabytePerSecond(amount)
                    "Mebibit per second" -> return bitPerSecondToMebibitPerSecond(amount)
                    "Gigabit per second" -> return bitPerSecondToGigabitPerSecond(amount)
                    "Gigabyte per second" -> return bitPerSecondToGigabytePerSecond(amount)
                    "Gibibit per second" -> return bitPerSecondToGibibitPerSecond(amount)
                    "Terabit per second" -> return bitPerSecondToTerabitPerSecond(amount)
                    "Terabyte per second" -> return bitPerSecondToTerabytePerSecond(amount)
                    "Tebibit per second" -> return bitPerSecondToTebibitPerSecond(amount)
                }
            }
            "Kibibit per second" -> {
                val amount = kibibitPerSecondToBitPerSecond(quantity)
                when (to) {
                    "Bit per second" -> return bitPerSecondToBitPerSecond(amount)
                    "Kilobit per second" -> return bitPerSecondToKilobitPerSecond(amount)
                    "Kilobyte per second" -> return bitPerSecondToKilobytePerSecond(amount)
                    "Kibibit per second" -> return bitPerSecondToKibibitPerSecond(amount)
                    "Megabit per second" -> return bitPerSecondToMegabitPerSecond(amount)
                    "Megabyte per second" -> return bitPerSecondToMegabytePerSecond(amount)
                    "Mebibit per second" -> return bitPerSecondToMebibitPerSecond(amount)
                    "Gigabit per second" -> return bitPerSecondToGigabitPerSecond(amount)
                    "Gigabyte per second" -> return bitPerSecondToGigabytePerSecond(amount)
                    "Gibibit per second" -> return bitPerSecondToGibibitPerSecond(amount)
                    "Terabit per second" -> return bitPerSecondToTerabitPerSecond(amount)
                    "Terabyte per second" -> return bitPerSecondToTerabytePerSecond(amount)
                    "Tebibit per second" -> return bitPerSecondToTebibitPerSecond(amount)
                }
            }
            "Megabit per second" -> {
                val amount = megabitPerSecondToBitPerSecond(quantity)
                when (to) {
                    "Bit per second" -> return bitPerSecondToBitPerSecond(amount)
                    "Kilobit per second" -> return bitPerSecondToKilobitPerSecond(amount)
                    "Kilobyte per second" -> return bitPerSecondToKilobytePerSecond(amount)
                    "Kibibit per second" -> return bitPerSecondToKibibitPerSecond(amount)
                    "Megabit per second" -> return bitPerSecondToMegabitPerSecond(amount)
                    "Megabyte per second" -> return bitPerSecondToMegabytePerSecond(amount)
                    "Mebibit per second" -> return bitPerSecondToMebibitPerSecond(amount)
                    "Gigabit per second" -> return bitPerSecondToGigabitPerSecond(amount)
                    "Gigabyte per second" -> return bitPerSecondToGigabytePerSecond(amount)
                    "Gibibit per second" -> return bitPerSecondToGibibitPerSecond(amount)
                    "Terabit per second" -> return bitPerSecondToTerabitPerSecond(amount)
                    "Terabyte per second" -> return bitPerSecondToTerabytePerSecond(amount)
                    "Tebibit per second" -> return bitPerSecondToTebibitPerSecond(amount)
                }
            }
            "Megabyte per second" -> {
                val amount = megabytePerSecondToBitPerSecond(quantity)
                when (to) {
                    "Bit per second" -> return bitPerSecondToBitPerSecond(amount)
                    "Kilobit per second" -> return bitPerSecondToKilobitPerSecond(amount)
                    "Kilobyte per second" -> return bitPerSecondToKilobytePerSecond(amount)
                    "Kibibit per second" -> return bitPerSecondToKibibitPerSecond(amount)
                    "Megabit per second" -> return bitPerSecondToMegabitPerSecond(amount)
                    "Megabyte per second" -> return bitPerSecondToMegabytePerSecond(amount)
                    "Mebibit per second" -> return bitPerSecondToMebibitPerSecond(amount)
                    "Gigabit per second" -> return bitPerSecondToGigabitPerSecond(amount)
                    "Gigabyte per second" -> return bitPerSecondToGigabytePerSecond(amount)
                    "Gibibit per second" -> return bitPerSecondToGibibitPerSecond(amount)
                    "Terabit per second" -> return bitPerSecondToTerabitPerSecond(amount)
                    "Terabyte per second" -> return bitPerSecondToTerabytePerSecond(amount)
                    "Tebibit per second" -> return bitPerSecondToTebibitPerSecond(amount)
                }
            }
            "Mebibit per second" -> {
                val amount = mebibitPerSecondToBitPerSecond(quantity)
                when (to) {
                    "Bit per second" -> return bitPerSecondToBitPerSecond(amount)
                    "Kilobit per second" -> return bitPerSecondToKilobitPerSecond(amount)
                    "Kilobyte per second" -> return bitPerSecondToKilobytePerSecond(amount)
                    "Kibibit per second" -> return bitPerSecondToKibibitPerSecond(amount)
                    "Megabit per second" -> return bitPerSecondToMegabitPerSecond(amount)
                    "Megabyte per second" -> return bitPerSecondToMegabytePerSecond(amount)
                    "Mebibit per second" -> return bitPerSecondToMebibitPerSecond(amount)
                    "Gigabit per second" -> return bitPerSecondToGigabitPerSecond(amount)
                    "Gigabyte per second" -> return bitPerSecondToGigabytePerSecond(amount)
                    "Gibibit per second" -> return bitPerSecondToGibibitPerSecond(amount)
                    "Terabit per second" -> return bitPerSecondToTerabitPerSecond(amount)
                    "Terabyte per second" -> return bitPerSecondToTerabytePerSecond(amount)
                    "Tebibit per second" -> return bitPerSecondToTebibitPerSecond(amount)
                }
            }
            "Gigabit per second" -> {
                val amount = gigabitPerSecondToBitPerSecond(quantity)
                when (to) {
                    "Bit per second" -> return bitPerSecondToBitPerSecond(amount)
                    "Kilobit per second" -> return bitPerSecondToKilobitPerSecond(amount)
                    "Kilobyte per second" -> return bitPerSecondToKilobytePerSecond(amount)
                    "Kibibit per second" -> return bitPerSecondToKibibitPerSecond(amount)
                    "Megabit per second" -> return bitPerSecondToMegabitPerSecond(amount)
                    "Megabyte per second" -> return bitPerSecondToMegabytePerSecond(amount)
                    "Mebibit per second" -> return bitPerSecondToMebibitPerSecond(amount)
                    "Gigabit per second" -> return bitPerSecondToGigabitPerSecond(amount)
                    "Gigabyte per second" -> return bitPerSecondToGigabytePerSecond(amount)
                    "Gibibit per second" -> return bitPerSecondToGibibitPerSecond(amount)
                    "Terabit per second" -> return bitPerSecondToTerabitPerSecond(amount)
                    "Terabyte per second" -> return bitPerSecondToTerabytePerSecond(amount)
                    "Tebibit per second" -> return bitPerSecondToTebibitPerSecond(amount)
                }
            }
            "Gigabyte per second" -> {
                val amount = gigabytePerSecondToBitPerSecond(quantity)
                when (to) {
                    "Bit per second" -> return bitPerSecondToBitPerSecond(amount)
                    "Kilobit per second" -> return bitPerSecondToKilobitPerSecond(amount)
                    "Kilobyte per second" -> return bitPerSecondToKilobytePerSecond(amount)
                    "Kibibit per second" -> return bitPerSecondToKibibitPerSecond(amount)
                    "Megabit per second" -> return bitPerSecondToMegabitPerSecond(amount)
                    "Megabyte per second" -> return bitPerSecondToMegabytePerSecond(amount)
                    "Mebibit per second" -> return bitPerSecondToMebibitPerSecond(amount)
                    "Gigabit per second" -> return bitPerSecondToGigabitPerSecond(amount)
                    "Gigabyte per second" -> return bitPerSecondToGigabytePerSecond(amount)
                    "Gibibit per second" -> return bitPerSecondToGibibitPerSecond(amount)
                    "Terabit per second" -> return bitPerSecondToTerabitPerSecond(amount)
                    "Terabyte per second" -> return bitPerSecondToTerabytePerSecond(amount)
                    "Tebibit per second" -> return bitPerSecondToTebibitPerSecond(amount)
                }
            }
            "Gibibit per second" -> {
                val amount = gibibitPerSecondToBitPerSecond(quantity)
                when (to) {
                    "Bit per second" -> return bitPerSecondToBitPerSecond(amount)
                    "Kilobit per second" -> return bitPerSecondToKilobitPerSecond(amount)
                    "Kilobyte per second" -> return bitPerSecondToKilobytePerSecond(amount)
                    "Kibibit per second" -> return bitPerSecondToKibibitPerSecond(amount)
                    "Megabit per second" -> return bitPerSecondToMegabitPerSecond(amount)
                    "Megabyte per second" -> return bitPerSecondToMegabytePerSecond(amount)
                    "Mebibit per second" -> return bitPerSecondToMebibitPerSecond(amount)
                    "Gigabit per second" -> return bitPerSecondToGigabitPerSecond(amount)
                    "Gigabyte per second" -> return bitPerSecondToGigabytePerSecond(amount)
                    "Gibibit per second" -> return bitPerSecondToGibibitPerSecond(amount)
                    "Terabit per second" -> return bitPerSecondToTerabitPerSecond(amount)
                    "Terabyte per second" -> return bitPerSecondToTerabytePerSecond(amount)
                    "Tebibit per second" -> return bitPerSecondToTebibitPerSecond(amount)
                }
            }
            "Terabit per second" -> {
                val amount = terabitPerSecondToBitPerSecond(quantity)
                when (to) {
                    "Bit per second" -> return bitPerSecondToBitPerSecond(amount)
                    "Kilobit per second" -> return bitPerSecondToKilobitPerSecond(amount)
                    "Kilobyte per second" -> return bitPerSecondToKilobytePerSecond(amount)
                    "Kibibit per second" -> return bitPerSecondToKibibitPerSecond(amount)
                    "Megabit per second" -> return bitPerSecondToMegabitPerSecond(amount)
                    "Megabyte per second" -> return bitPerSecondToMegabytePerSecond(amount)
                    "Mebibit per second" -> return bitPerSecondToMebibitPerSecond(amount)
                    "Gigabit per second" -> return bitPerSecondToGigabitPerSecond(amount)
                    "Gigabyte per second" -> return bitPerSecondToGigabytePerSecond(amount)
                    "Gibibit per second" -> return bitPerSecondToGibibitPerSecond(amount)
                    "Terabit per second" -> return bitPerSecondToTerabitPerSecond(amount)
                    "Terabyte per second" -> return bitPerSecondToTerabytePerSecond(amount)
                    "Tebibit per second" -> return bitPerSecondToTebibitPerSecond(amount)
                }
            }
            "Terabyte per second" -> {
                val amount = terabytePerSecondToBitPerSecond(quantity)
                when (to) {
                    "Bit per second" -> return bitPerSecondToBitPerSecond(amount)
                    "Kilobit per second" -> return bitPerSecondToKilobitPerSecond(amount)
                    "Kilobyte per second" -> return bitPerSecondToKilobytePerSecond(amount)
                    "Kibibit per second" -> return bitPerSecondToKibibitPerSecond(amount)
                    "Megabit per second" -> return bitPerSecondToMegabitPerSecond(amount)
                    "Megabyte per second" -> return bitPerSecondToMegabytePerSecond(amount)
                    "Mebibit per second" -> return bitPerSecondToMebibitPerSecond(amount)
                    "Gigabit per second" -> return bitPerSecondToGigabitPerSecond(amount)
                    "Gigabyte per second" -> return bitPerSecondToGigabytePerSecond(amount)
                    "Gibibit per second" -> return bitPerSecondToGibibitPerSecond(amount)
                    "Terabit per second" -> return bitPerSecondToTerabitPerSecond(amount)
                    "Terabyte per second" -> return bitPerSecondToTerabytePerSecond(amount)
                    "Tebibit per second" -> return bitPerSecondToTebibitPerSecond(amount)
                }
            }
            "Tebibit per second" -> {
                val amount = tebibitPerSecondToBitPerSecond(quantity)
                when (to) {
                    "Bit per second" -> return bitPerSecondToBitPerSecond(amount)
                    "Kilobit per second" -> return bitPerSecondToKilobitPerSecond(amount)
                    "Kilobyte per second" -> return bitPerSecondToKilobytePerSecond(amount)
                    "Kibibit per second" -> return bitPerSecondToKibibitPerSecond(amount)
                    "Megabit per second" -> return bitPerSecondToMegabitPerSecond(amount)
                    "Megabyte per second" -> return bitPerSecondToMegabytePerSecond(amount)
                    "Mebibit per second" -> return bitPerSecondToMebibitPerSecond(amount)
                    "Gigabit per second" -> return bitPerSecondToGigabitPerSecond(amount)
                    "Gigabyte per second" -> return bitPerSecondToGigabytePerSecond(amount)
                    "Gibibit per second" -> return bitPerSecondToGibibitPerSecond(amount)
                    "Terabit per second" -> return bitPerSecondToTerabitPerSecond(amount)
                    "Terabyte per second" -> return bitPerSecondToTerabytePerSecond(amount)
                    "Tebibit per second" -> return bitPerSecondToTebibitPerSecond(amount)
                }
            }
        }
        return quantity
    }

    private fun bitPerSecondToBitPerSecond(quantity: Double): Double {
        return quantity
    }
    private fun bitPerSecondToKilobitPerSecond(quantity: Double): Double {
        return (quantity / 1000.0)
    }
    private fun bitPerSecondToKilobytePerSecond(quantity: Double): Double {
        return (quantity / (8.0 * 1000.0))
    }
    private fun bitPerSecondToKibibitPerSecond(quantity: Double): Double {
        return (quantity / 1024.0)
    }
    private fun bitPerSecondToMegabitPerSecond(quantity: Double): Double {
        return (quantity / 1000000.0)
    }
    private fun bitPerSecondToMegabytePerSecond(quantity: Double): Double {
        return (quantity / (8.0 * 1000000.0))
    }
    private fun bitPerSecondToMebibitPerSecond(quantity: Double): Double {
        return (quantity / (1024.0 * 1024.0))
    }
    private fun bitPerSecondToGigabitPerSecond(quantity: Double): Double {
        return (quantity / 1000000000.0)
    }
    private fun bitPerSecondToGigabytePerSecond(quantity: Double): Double {
        return (quantity / (8.0 * 1000000000.0))
    }
    private fun bitPerSecondToGibibitPerSecond(quantity: Double): Double {
        return (quantity / (1024.0 * 1024.0 * 1024.0))
    }
    private fun bitPerSecondToTerabitPerSecond(quantity: Double): Double {
        return (quantity / 1000000000000.0)
    }
    private fun bitPerSecondToTerabytePerSecond(quantity: Double): Double {
        return (quantity / (8.0 * 1000000000000.0))
    }
    private fun bitPerSecondToTebibitPerSecond(quantity: Double): Double {
        return (quantity / (1024.0 * 1024.0 * 1024.0 * 1024.0))
    }

    private fun kilobitPerSecondToBitPerSecond(quantity: Double): Double {
        return (quantity * 1000.0)
    }
    private fun kilobytePerSecondToBitPerSecond(quantity: Double): Double {
        return (quantity * (8.0 * 1000.0))
    }
    private fun kibibitPerSecondToBitPerSecond(quantity: Double): Double {
        return (quantity * 1024.0)
    }
    private fun megabitPerSecondToBitPerSecond(quantity: Double): Double {
        return (quantity * 1000000.0)
    }
    private fun megabytePerSecondToBitPerSecond(quantity: Double): Double {
        return (quantity * (8.0 * 1000000.0))
    }
    private fun mebibitPerSecondToBitPerSecond(quantity: Double): Double {
        return (quantity * (1024.0 * 1024.0))
    }
    private fun gigabitPerSecondToBitPerSecond(quantity: Double): Double {
        return (quantity * 1000000000.0)
    }
    private fun gigabytePerSecondToBitPerSecond(quantity: Double): Double {
        return (quantity * (8.0 * 1000000000.0))
    }
    private fun gibibitPerSecondToBitPerSecond(quantity: Double): Double {
        return (quantity * (1024.0 * 1024.0 * 1024.0))
    }
    private fun terabitPerSecondToBitPerSecond(quantity: Double): Double {
        return (quantity * 1000000000000.0)
    }
    private fun terabytePerSecondToBitPerSecond(quantity: Double): Double {
        return (quantity * (8.0 * 1000000000000.0))
    }
    private fun tebibitPerSecondToBitPerSecond(quantity: Double): Double {
        return (quantity * (1024.0 * 1024.0 * 1024.0 * 1024.0))
    }
}
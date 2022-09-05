package com.example.unitconverter

class DigitalStorage(val from: String, val to: String, val quantity: Double) {

    fun convert(): Double {
        when (from) {
            "Bit" -> {
                val amount = bitToByte(quantity)
                when (to) {
                    "Bit" -> return  byteToBit(amount)
                    "Kilobit" -> return  byteToKilobit(amount)
                    "Kibibit" -> return  byteToKibibit(amount)
                    "Megabit" -> return  byteToMegabit(amount)
                    "Mebibit" -> return  byteToMebibit(amount)
                    "Gigabit" -> return  byteToGigabit(amount)
                    "Gibibit" -> return  byteToGibibit(amount)
                    "Terabit" -> return  byteToTerabit(amount)
                    "Tebibit" -> return  byteToTebibit(amount)
                    "Petabit" -> return  byteToPetabit(amount)
                    "Pebibit" -> return  byteToPebibit(amount)
                    "Byte" -> return  byteToByte(amount)
                    "Kilobyte" -> return  byteToKilobyte(amount)
                    "Kibibyte" -> return  byteToKibibyte(amount)
                    "Megabyte" -> return  byteToMegabyte(amount)
                    "Mebibyte" -> return  byteToMebibyte(amount)
                    "Gigabyte" -> return  byteToGigabyte(amount)
                    "Gibibyte" -> return  byteToGibibyte(amount)
                    "Terabyte" -> return  byteToTerabyte(amount)
                    "Tebibyte" -> return  byteToTebibyte(amount)
                    "Petabyte" -> return  byteToPetabyte(amount)
                    "Pebibyte" -> return  byteToPebibyte(amount)
                }
            }
            "Kilobit" -> {
                val amount = kilobitToByte(quantity)
                when (to) {
                    "Bit" -> return  byteToBit(amount)
                    "Kilobit" -> return  byteToKilobit(amount)
                    "Kibibit" -> return  byteToKibibit(amount)
                    "Megabit" -> return  byteToMegabit(amount)
                    "Mebibit" -> return  byteToMebibit(amount)
                    "Gigabit" -> return  byteToGigabit(amount)
                    "Gibibit" -> return  byteToGibibit(amount)
                    "Terabit" -> return  byteToTerabit(amount)
                    "Tebibit" -> return  byteToTebibit(amount)
                    "Petabit" -> return  byteToPetabit(amount)
                    "Pebibit" -> return  byteToPebibit(amount)
                    "Byte" -> return  byteToByte(amount)
                    "Kilobyte" -> return  byteToKilobyte(amount)
                    "Kibibyte" -> return  byteToKibibyte(amount)
                    "Megabyte" -> return  byteToMegabyte(amount)
                    "Mebibyte" -> return  byteToMebibyte(amount)
                    "Gigabyte" -> return  byteToGigabyte(amount)
                    "Gibibyte" -> return  byteToGibibyte(amount)
                    "Terabyte" -> return  byteToTerabyte(amount)
                    "Tebibyte" -> return  byteToTebibyte(amount)
                    "Petabyte" -> return  byteToPetabyte(amount)
                    "Pebibyte" -> return  byteToPebibyte(amount)
                }
            }
            "Kibibit" -> {
                val amount = kibibitToByte(quantity)
                when (to) {
                    "Bit" -> return  byteToBit(amount)
                    "Kilobit" -> return  byteToKilobit(amount)
                    "Kibibit" -> return  byteToKibibit(amount)
                    "Megabit" -> return  byteToMegabit(amount)
                    "Mebibit" -> return  byteToMebibit(amount)
                    "Gigabit" -> return  byteToGigabit(amount)
                    "Gibibit" -> return  byteToGibibit(amount)
                    "Terabit" -> return  byteToTerabit(amount)
                    "Tebibit" -> return  byteToTebibit(amount)
                    "Petabit" -> return  byteToPetabit(amount)
                    "Pebibit" -> return  byteToPebibit(amount)
                    "Byte" -> return  byteToByte(amount)
                    "Kilobyte" -> return  byteToKilobyte(amount)
                    "Kibibyte" -> return  byteToKibibyte(amount)
                    "Megabyte" -> return  byteToMegabyte(amount)
                    "Mebibyte" -> return  byteToMebibyte(amount)
                    "Gigabyte" -> return  byteToGigabyte(amount)
                    "Gibibyte" -> return  byteToGibibyte(amount)
                    "Terabyte" -> return  byteToTerabyte(amount)
                    "Tebibyte" -> return  byteToTebibyte(amount)
                    "Petabyte" -> return  byteToPetabyte(amount)
                    "Pebibyte" -> return  byteToPebibyte(amount)
                }
            }
            "Megabit" -> {
                val amount = megabitToByte(quantity)
                when (to) {
                    "Bit" -> return  byteToBit(amount)
                    "Kilobit" -> return  byteToKilobit(amount)
                    "Kibibit" -> return  byteToKibibit(amount)
                    "Megabit" -> return  byteToMegabit(amount)
                    "Mebibit" -> return  byteToMebibit(amount)
                    "Gigabit" -> return  byteToGigabit(amount)
                    "Gibibit" -> return  byteToGibibit(amount)
                    "Terabit" -> return  byteToTerabit(amount)
                    "Tebibit" -> return  byteToTebibit(amount)
                    "Petabit" -> return  byteToPetabit(amount)
                    "Pebibit" -> return  byteToPebibit(amount)
                    "Byte" -> return  byteToByte(amount)
                    "Kilobyte" -> return  byteToKilobyte(amount)
                    "Kibibyte" -> return  byteToKibibyte(amount)
                    "Megabyte" -> return  byteToMegabyte(amount)
                    "Mebibyte" -> return  byteToMebibyte(amount)
                    "Gigabyte" -> return  byteToGigabyte(amount)
                    "Gibibyte" -> return  byteToGibibyte(amount)
                    "Terabyte" -> return  byteToTerabyte(amount)
                    "Tebibyte" -> return  byteToTebibyte(amount)
                    "Petabyte" -> return  byteToPetabyte(amount)
                    "Pebibyte" -> return  byteToPebibyte(amount)
                }
            }
            "Mebibit" -> {
                val amount = mebibitToByte(quantity)
                when (to) {
                    "Bit" -> return  byteToBit(amount)
                    "Kilobit" -> return  byteToKilobit(amount)
                    "Kibibit" -> return  byteToKibibit(amount)
                    "Megabit" -> return  byteToMegabit(amount)
                    "Mebibit" -> return  byteToMebibit(amount)
                    "Gigabit" -> return  byteToGigabit(amount)
                    "Gibibit" -> return  byteToGibibit(amount)
                    "Terabit" -> return  byteToTerabit(amount)
                    "Tebibit" -> return  byteToTebibit(amount)
                    "Petabit" -> return  byteToPetabit(amount)
                    "Pebibit" -> return  byteToPebibit(amount)
                    "Byte" -> return  byteToByte(amount)
                    "Kilobyte" -> return  byteToKilobyte(amount)
                    "Kibibyte" -> return  byteToKibibyte(amount)
                    "Megabyte" -> return  byteToMegabyte(amount)
                    "Mebibyte" -> return  byteToMebibyte(amount)
                    "Gigabyte" -> return  byteToGigabyte(amount)
                    "Gibibyte" -> return  byteToGibibyte(amount)
                    "Terabyte" -> return  byteToTerabyte(amount)
                    "Tebibyte" -> return  byteToTebibyte(amount)
                    "Petabyte" -> return  byteToPetabyte(amount)
                    "Pebibyte" -> return  byteToPebibyte(amount)
                }
            }
            "Gigabit" -> {
                val amount = gigabitToByte(quantity)
                when (to) {
                    "Bit" -> return  byteToBit(amount)
                    "Kilobit" -> return  byteToKilobit(amount)
                    "Kibibit" -> return  byteToKibibit(amount)
                    "Megabit" -> return  byteToMegabit(amount)
                    "Mebibit" -> return  byteToMebibit(amount)
                    "Gigabit" -> return  byteToGigabit(amount)
                    "Gibibit" -> return  byteToGibibit(amount)
                    "Terabit" -> return  byteToTerabit(amount)
                    "Tebibit" -> return  byteToTebibit(amount)
                    "Petabit" -> return  byteToPetabit(amount)
                    "Pebibit" -> return  byteToPebibit(amount)
                    "Byte" -> return  byteToByte(amount)
                    "Kilobyte" -> return  byteToKilobyte(amount)
                    "Kibibyte" -> return  byteToKibibyte(amount)
                    "Megabyte" -> return  byteToMegabyte(amount)
                    "Mebibyte" -> return  byteToMebibyte(amount)
                    "Gigabyte" -> return  byteToGigabyte(amount)
                    "Gibibyte" -> return  byteToGibibyte(amount)
                    "Terabyte" -> return  byteToTerabyte(amount)
                    "Tebibyte" -> return  byteToTebibyte(amount)
                    "Petabyte" -> return  byteToPetabyte(amount)
                    "Pebibyte" -> return  byteToPebibyte(amount)
                }
            }
            "Gibibit" -> {
                val amount = gibibitToByte(quantity)
                when (to) {
                    "Bit" -> return  byteToBit(amount)
                    "Kilobit" -> return  byteToKilobit(amount)
                    "Kibibit" -> return  byteToKibibit(amount)
                    "Megabit" -> return  byteToMegabit(amount)
                    "Mebibit" -> return  byteToMebibit(amount)
                    "Gigabit" -> return  byteToGigabit(amount)
                    "Gibibit" -> return  byteToGibibit(amount)
                    "Terabit" -> return  byteToTerabit(amount)
                    "Tebibit" -> return  byteToTebibit(amount)
                    "Petabit" -> return  byteToPetabit(amount)
                    "Pebibit" -> return  byteToPebibit(amount)
                    "Byte" -> return  byteToByte(amount)
                    "Kilobyte" -> return  byteToKilobyte(amount)
                    "Kibibyte" -> return  byteToKibibyte(amount)
                    "Megabyte" -> return  byteToMegabyte(amount)
                    "Mebibyte" -> return  byteToMebibyte(amount)
                    "Gigabyte" -> return  byteToGigabyte(amount)
                    "Gibibyte" -> return  byteToGibibyte(amount)
                    "Terabyte" -> return  byteToTerabyte(amount)
                    "Tebibyte" -> return  byteToTebibyte(amount)
                    "Petabyte" -> return  byteToPetabyte(amount)
                    "Pebibyte" -> return  byteToPebibyte(amount)
                }
            }
            "Terabit" -> {
                val amount = terabitToByte(quantity)
                when (to) {
                    "Bit" -> return  byteToBit(amount)
                    "Kilobit" -> return  byteToKilobit(amount)
                    "Kibibit" -> return  byteToKibibit(amount)
                    "Megabit" -> return  byteToMegabit(amount)
                    "Mebibit" -> return  byteToMebibit(amount)
                    "Gigabit" -> return  byteToGigabit(amount)
                    "Gibibit" -> return  byteToGibibit(amount)
                    "Terabit" -> return  byteToTerabit(amount)
                    "Tebibit" -> return  byteToTebibit(amount)
                    "Petabit" -> return  byteToPetabit(amount)
                    "Pebibit" -> return  byteToPebibit(amount)
                    "Byte" -> return  byteToByte(amount)
                    "Kilobyte" -> return  byteToKilobyte(amount)
                    "Kibibyte" -> return  byteToKibibyte(amount)
                    "Megabyte" -> return  byteToMegabyte(amount)
                    "Mebibyte" -> return  byteToMebibyte(amount)
                    "Gigabyte" -> return  byteToGigabyte(amount)
                    "Gibibyte" -> return  byteToGibibyte(amount)
                    "Terabyte" -> return  byteToTerabyte(amount)
                    "Tebibyte" -> return  byteToTebibyte(amount)
                    "Petabyte" -> return  byteToPetabyte(amount)
                    "Pebibyte" -> return  byteToPebibyte(amount)
                }
            }
            "Tebibit" -> {
                val amount = tebibitToByte(quantity)
                when (to) {
                    "Bit" -> return  byteToBit(amount)
                    "Kilobit" -> return  byteToKilobit(amount)
                    "Kibibit" -> return  byteToKibibit(amount)
                    "Megabit" -> return  byteToMegabit(amount)
                    "Mebibit" -> return  byteToMebibit(amount)
                    "Gigabit" -> return  byteToGigabit(amount)
                    "Gibibit" -> return  byteToGibibit(amount)
                    "Terabit" -> return  byteToTerabit(amount)
                    "Tebibit" -> return  byteToTebibit(amount)
                    "Petabit" -> return  byteToPetabit(amount)
                    "Pebibit" -> return  byteToPebibit(amount)
                    "Byte" -> return  byteToByte(amount)
                    "Kilobyte" -> return  byteToKilobyte(amount)
                    "Kibibyte" -> return  byteToKibibyte(amount)
                    "Megabyte" -> return  byteToMegabyte(amount)
                    "Mebibyte" -> return  byteToMebibyte(amount)
                    "Gigabyte" -> return  byteToGigabyte(amount)
                    "Gibibyte" -> return  byteToGibibyte(amount)
                    "Terabyte" -> return  byteToTerabyte(amount)
                    "Tebibyte" -> return  byteToTebibyte(amount)
                    "Petabyte" -> return  byteToPetabyte(amount)
                    "Pebibyte" -> return  byteToPebibyte(amount)
                }
            }
            "Petabit" -> {
                val amount = petabitToByte(quantity)
                when (to) {
                    "Bit" -> return  byteToBit(amount)
                    "Kilobit" -> return  byteToKilobit(amount)
                    "Kibibit" -> return  byteToKibibit(amount)
                    "Megabit" -> return  byteToMegabit(amount)
                    "Mebibit" -> return  byteToMebibit(amount)
                    "Gigabit" -> return  byteToGigabit(amount)
                    "Gibibit" -> return  byteToGibibit(amount)
                    "Terabit" -> return  byteToTerabit(amount)
                    "Tebibit" -> return  byteToTebibit(amount)
                    "Petabit" -> return  byteToPetabit(amount)
                    "Pebibit" -> return  byteToPebibit(amount)
                    "Byte" -> return  byteToByte(amount)
                    "Kilobyte" -> return  byteToKilobyte(amount)
                    "Kibibyte" -> return  byteToKibibyte(amount)
                    "Megabyte" -> return  byteToMegabyte(amount)
                    "Mebibyte" -> return  byteToMebibyte(amount)
                    "Gigabyte" -> return  byteToGigabyte(amount)
                    "Gibibyte" -> return  byteToGibibyte(amount)
                    "Terabyte" -> return  byteToTerabyte(amount)
                    "Tebibyte" -> return  byteToTebibyte(amount)
                    "Petabyte" -> return  byteToPetabyte(amount)
                    "Pebibyte" -> return  byteToPebibyte(amount)
                }
            }
            "Pebibit" -> {
                val amount = pebibitToByte(quantity)
                when (to) {
                    "Bit" -> return  byteToBit(amount)
                    "Kilobit" -> return  byteToKilobit(amount)
                    "Kibibit" -> return  byteToKibibit(amount)
                    "Megabit" -> return  byteToMegabit(amount)
                    "Mebibit" -> return  byteToMebibit(amount)
                    "Gigabit" -> return  byteToGigabit(amount)
                    "Gibibit" -> return  byteToGibibit(amount)
                    "Terabit" -> return  byteToTerabit(amount)
                    "Tebibit" -> return  byteToTebibit(amount)
                    "Petabit" -> return  byteToPetabit(amount)
                    "Pebibit" -> return  byteToPebibit(amount)
                    "Byte" -> return  byteToByte(amount)
                    "Kilobyte" -> return  byteToKilobyte(amount)
                    "Kibibyte" -> return  byteToKibibyte(amount)
                    "Megabyte" -> return  byteToMegabyte(amount)
                    "Mebibyte" -> return  byteToMebibyte(amount)
                    "Gigabyte" -> return  byteToGigabyte(amount)
                    "Gibibyte" -> return  byteToGibibyte(amount)
                    "Terabyte" -> return  byteToTerabyte(amount)
                    "Tebibyte" -> return  byteToTebibyte(amount)
                    "Petabyte" -> return  byteToPetabyte(amount)
                    "Pebibyte" -> return  byteToPebibyte(amount)
                }
            }
            "Byte" -> {
                val amount = byteToByte(quantity)
                when (to) {
                    "Bit" -> return  byteToBit(amount)
                    "Kilobit" -> return  byteToKilobit(amount)
                    "Kibibit" -> return  byteToKibibit(amount)
                    "Megabit" -> return  byteToMegabit(amount)
                    "Mebibit" -> return  byteToMebibit(amount)
                    "Gigabit" -> return  byteToGigabit(amount)
                    "Gibibit" -> return  byteToGibibit(amount)
                    "Terabit" -> return  byteToTerabit(amount)
                    "Tebibit" -> return  byteToTebibit(amount)
                    "Petabit" -> return  byteToPetabit(amount)
                    "Pebibit" -> return  byteToPebibit(amount)
                    "Byte" -> return  byteToByte(amount)
                    "Kilobyte" -> return  byteToKilobyte(amount)
                    "Kibibyte" -> return  byteToKibibyte(amount)
                    "Megabyte" -> return  byteToMegabyte(amount)
                    "Mebibyte" -> return  byteToMebibyte(amount)
                    "Gigabyte" -> return  byteToGigabyte(amount)
                    "Gibibyte" -> return  byteToGibibyte(amount)
                    "Terabyte" -> return  byteToTerabyte(amount)
                    "Tebibyte" -> return  byteToTebibyte(amount)
                    "Petabyte" -> return  byteToPetabyte(amount)
                    "Pebibyte" -> return  byteToPebibyte(amount)
                }
            }
            "Kilobyte" -> {
                val amount = kilobyteToByte(quantity)
                when (to) {
                    "Bit" -> return  byteToBit(amount)
                    "Kilobit" -> return  byteToKilobit(amount)
                    "Kibibit" -> return  byteToKibibit(amount)
                    "Megabit" -> return  byteToMegabit(amount)
                    "Mebibit" -> return  byteToMebibit(amount)
                    "Gigabit" -> return  byteToGigabit(amount)
                    "Gibibit" -> return  byteToGibibit(amount)
                    "Terabit" -> return  byteToTerabit(amount)
                    "Tebibit" -> return  byteToTebibit(amount)
                    "Petabit" -> return  byteToPetabit(amount)
                    "Pebibit" -> return  byteToPebibit(amount)
                    "Byte" -> return  byteToByte(amount)
                    "Kilobyte" -> return  byteToKilobyte(amount)
                    "Kibibyte" -> return  byteToKibibyte(amount)
                    "Megabyte" -> return  byteToMegabyte(amount)
                    "Mebibyte" -> return  byteToMebibyte(amount)
                    "Gigabyte" -> return  byteToGigabyte(amount)
                    "Gibibyte" -> return  byteToGibibyte(amount)
                    "Terabyte" -> return  byteToTerabyte(amount)
                    "Tebibyte" -> return  byteToTebibyte(amount)
                    "Petabyte" -> return  byteToPetabyte(amount)
                    "Pebibyte" -> return  byteToPebibyte(amount)
                }
            }
            "Kibibyte" -> {
                val amount = kibibyteToByte(quantity)
                when (to) {
                    "Bit" -> return  byteToBit(amount)
                    "Kilobit" -> return  byteToKilobit(amount)
                    "Kibibit" -> return  byteToKibibit(amount)
                    "Megabit" -> return  byteToMegabit(amount)
                    "Mebibit" -> return  byteToMebibit(amount)
                    "Gigabit" -> return  byteToGigabit(amount)
                    "Gibibit" -> return  byteToGibibit(amount)
                    "Terabit" -> return  byteToTerabit(amount)
                    "Tebibit" -> return  byteToTebibit(amount)
                    "Petabit" -> return  byteToPetabit(amount)
                    "Pebibit" -> return  byteToPebibit(amount)
                    "Byte" -> return  byteToByte(amount)
                    "Kilobyte" -> return  byteToKilobyte(amount)
                    "Kibibyte" -> return  byteToKibibyte(amount)
                    "Megabyte" -> return  byteToMegabyte(amount)
                    "Mebibyte" -> return  byteToMebibyte(amount)
                    "Gigabyte" -> return  byteToGigabyte(amount)
                    "Gibibyte" -> return  byteToGibibyte(amount)
                    "Terabyte" -> return  byteToTerabyte(amount)
                    "Tebibyte" -> return  byteToTebibyte(amount)
                    "Petabyte" -> return  byteToPetabyte(amount)
                    "Pebibyte" -> return  byteToPebibyte(amount)
                }
            }
            "Megabyte" -> {
                val amount = megabyteToByte(quantity)
                when (to) {
                    "Bit" -> return  byteToBit(amount)
                    "Kilobit" -> return  byteToKilobit(amount)
                    "Kibibit" -> return  byteToKibibit(amount)
                    "Megabit" -> return  byteToMegabit(amount)
                    "Mebibit" -> return  byteToMebibit(amount)
                    "Gigabit" -> return  byteToGigabit(amount)
                    "Gibibit" -> return  byteToGibibit(amount)
                    "Terabit" -> return  byteToTerabit(amount)
                    "Tebibit" -> return  byteToTebibit(amount)
                    "Petabit" -> return  byteToPetabit(amount)
                    "Pebibit" -> return  byteToPebibit(amount)
                    "Byte" -> return  byteToByte(amount)
                    "Kilobyte" -> return  byteToKilobyte(amount)
                    "Kibibyte" -> return  byteToKibibyte(amount)
                    "Megabyte" -> return  byteToMegabyte(amount)
                    "Mebibyte" -> return  byteToMebibyte(amount)
                    "Gigabyte" -> return  byteToGigabyte(amount)
                    "Gibibyte" -> return  byteToGibibyte(amount)
                    "Terabyte" -> return  byteToTerabyte(amount)
                    "Tebibyte" -> return  byteToTebibyte(amount)
                    "Petabyte" -> return  byteToPetabyte(amount)
                    "Pebibyte" -> return  byteToPebibyte(amount)
                }
            }
            "Mebibyte" -> {
                val amount = mebibyteToByte(quantity)
                when (to) {
                    "Bit" -> return  byteToBit(amount)
                    "Kilobit" -> return  byteToKilobit(amount)
                    "Kibibit" -> return  byteToKibibit(amount)
                    "Megabit" -> return  byteToMegabit(amount)
                    "Mebibit" -> return  byteToMebibit(amount)
                    "Gigabit" -> return  byteToGigabit(amount)
                    "Gibibit" -> return  byteToGibibit(amount)
                    "Terabit" -> return  byteToTerabit(amount)
                    "Tebibit" -> return  byteToTebibit(amount)
                    "Petabit" -> return  byteToPetabit(amount)
                    "Pebibit" -> return  byteToPebibit(amount)
                    "Byte" -> return  byteToByte(amount)
                    "Kilobyte" -> return  byteToKilobyte(amount)
                    "Kibibyte" -> return  byteToKibibyte(amount)
                    "Megabyte" -> return  byteToMegabyte(amount)
                    "Mebibyte" -> return  byteToMebibyte(amount)
                    "Gigabyte" -> return  byteToGigabyte(amount)
                    "Gibibyte" -> return  byteToGibibyte(amount)
                    "Terabyte" -> return  byteToTerabyte(amount)
                    "Tebibyte" -> return  byteToTebibyte(amount)
                    "Petabyte" -> return  byteToPetabyte(amount)
                    "Pebibyte" -> return  byteToPebibyte(amount)
                }
            }
            "Gigabyte" -> {
                val amount = gigabyteToByte(quantity)
                when (to) {
                    "Bit" -> return  byteToBit(amount)
                    "Kilobit" -> return  byteToKilobit(amount)
                    "Kibibit" -> return  byteToKibibit(amount)
                    "Megabit" -> return  byteToMegabit(amount)
                    "Mebibit" -> return  byteToMebibit(amount)
                    "Gigabit" -> return  byteToGigabit(amount)
                    "Gibibit" -> return  byteToGibibit(amount)
                    "Terabit" -> return  byteToTerabit(amount)
                    "Tebibit" -> return  byteToTebibit(amount)
                    "Petabit" -> return  byteToPetabit(amount)
                    "Pebibit" -> return  byteToPebibit(amount)
                    "Byte" -> return  byteToByte(amount)
                    "Kilobyte" -> return  byteToKilobyte(amount)
                    "Kibibyte" -> return  byteToKibibyte(amount)
                    "Megabyte" -> return  byteToMegabyte(amount)
                    "Mebibyte" -> return  byteToMebibyte(amount)
                    "Gigabyte" -> return  byteToGigabyte(amount)
                    "Gibibyte" -> return  byteToGibibyte(amount)
                    "Terabyte" -> return  byteToTerabyte(amount)
                    "Tebibyte" -> return  byteToTebibyte(amount)
                    "Petabyte" -> return  byteToPetabyte(amount)
                    "Pebibyte" -> return  byteToPebibyte(amount)
                }
            }
            "Gibibyte" -> {
                val amount = gibibyteToByte(quantity)
                when (to) {
                    "Bit" -> return  byteToBit(amount)
                    "Kilobit" -> return  byteToKilobit(amount)
                    "Kibibit" -> return  byteToKibibit(amount)
                    "Megabit" -> return  byteToMegabit(amount)
                    "Mebibit" -> return  byteToMebibit(amount)
                    "Gigabit" -> return  byteToGigabit(amount)
                    "Gibibit" -> return  byteToGibibit(amount)
                    "Terabit" -> return  byteToTerabit(amount)
                    "Tebibit" -> return  byteToTebibit(amount)
                    "Petabit" -> return  byteToPetabit(amount)
                    "Pebibit" -> return  byteToPebibit(amount)
                    "Byte" -> return  byteToByte(amount)
                    "Kilobyte" -> return  byteToKilobyte(amount)
                    "Kibibyte" -> return  byteToKibibyte(amount)
                    "Megabyte" -> return  byteToMegabyte(amount)
                    "Mebibyte" -> return  byteToMebibyte(amount)
                    "Gigabyte" -> return  byteToGigabyte(amount)
                    "Gibibyte" -> return  byteToGibibyte(amount)
                    "Terabyte" -> return  byteToTerabyte(amount)
                    "Tebibyte" -> return  byteToTebibyte(amount)
                    "Petabyte" -> return  byteToPetabyte(amount)
                    "Pebibyte" -> return  byteToPebibyte(amount)
                }
            }
            "Terabyte" -> {
                val amount = terabyteToByte(quantity)
                when (to) {
                    "Bit" -> return  byteToBit(amount)
                    "Kilobit" -> return  byteToKilobit(amount)
                    "Kibibit" -> return  byteToKibibit(amount)
                    "Megabit" -> return  byteToMegabit(amount)
                    "Mebibit" -> return  byteToMebibit(amount)
                    "Gigabit" -> return  byteToGigabit(amount)
                    "Gibibit" -> return  byteToGibibit(amount)
                    "Terabit" -> return  byteToTerabit(amount)
                    "Tebibit" -> return  byteToTebibit(amount)
                    "Petabit" -> return  byteToPetabit(amount)
                    "Pebibit" -> return  byteToPebibit(amount)
                    "Byte" -> return  byteToByte(amount)
                    "Kilobyte" -> return  byteToKilobyte(amount)
                    "Kibibyte" -> return  byteToKibibyte(amount)
                    "Megabyte" -> return  byteToMegabyte(amount)
                    "Mebibyte" -> return  byteToMebibyte(amount)
                    "Gigabyte" -> return  byteToGigabyte(amount)
                    "Gibibyte" -> return  byteToGibibyte(amount)
                    "Terabyte" -> return  byteToTerabyte(amount)
                    "Tebibyte" -> return  byteToTebibyte(amount)
                    "Petabyte" -> return  byteToPetabyte(amount)
                    "Pebibyte" -> return  byteToPebibyte(amount)
                }
            }
            "Tebibyte" -> {
                val amount = tebibyteToByte(quantity)
                when (to) {
                    "Bit" -> return  byteToBit(amount)
                    "Kilobit" -> return  byteToKilobit(amount)
                    "Kibibit" -> return  byteToKibibit(amount)
                    "Megabit" -> return  byteToMegabit(amount)
                    "Mebibit" -> return  byteToMebibit(amount)
                    "Gigabit" -> return  byteToGigabit(amount)
                    "Gibibit" -> return  byteToGibibit(amount)
                    "Terabit" -> return  byteToTerabit(amount)
                    "Tebibit" -> return  byteToTebibit(amount)
                    "Petabit" -> return  byteToPetabit(amount)
                    "Pebibit" -> return  byteToPebibit(amount)
                    "Byte" -> return  byteToByte(amount)
                    "Kilobyte" -> return  byteToKilobyte(amount)
                    "Kibibyte" -> return  byteToKibibyte(amount)
                    "Megabyte" -> return  byteToMegabyte(amount)
                    "Mebibyte" -> return  byteToMebibyte(amount)
                    "Gigabyte" -> return  byteToGigabyte(amount)
                    "Gibibyte" -> return  byteToGibibyte(amount)
                    "Terabyte" -> return  byteToTerabyte(amount)
                    "Tebibyte" -> return  byteToTebibyte(amount)
                    "Petabyte" -> return  byteToPetabyte(amount)
                    "Pebibyte" -> return  byteToPebibyte(amount)
                }
            }
            "Petabyte" -> {
                val amount = petabyteToByte(quantity)
                when (to) {
                    "Bit" -> return  byteToBit(amount)
                    "Kilobit" -> return  byteToKilobit(amount)
                    "Kibibit" -> return  byteToKibibit(amount)
                    "Megabit" -> return  byteToMegabit(amount)
                    "Mebibit" -> return  byteToMebibit(amount)
                    "Gigabit" -> return  byteToGigabit(amount)
                    "Gibibit" -> return  byteToGibibit(amount)
                    "Terabit" -> return  byteToTerabit(amount)
                    "Tebibit" -> return  byteToTebibit(amount)
                    "Petabit" -> return  byteToPetabit(amount)
                    "Pebibit" -> return  byteToPebibit(amount)
                    "Byte" -> return  byteToByte(amount)
                    "Kilobyte" -> return  byteToKilobyte(amount)
                    "Kibibyte" -> return  byteToKibibyte(amount)
                    "Megabyte" -> return  byteToMegabyte(amount)
                    "Mebibyte" -> return  byteToMebibyte(amount)
                    "Gigabyte" -> return  byteToGigabyte(amount)
                    "Gibibyte" -> return  byteToGibibyte(amount)
                    "Terabyte" -> return  byteToTerabyte(amount)
                    "Tebibyte" -> return  byteToTebibyte(amount)
                    "Petabyte" -> return  byteToPetabyte(amount)
                    "Pebibyte" -> return  byteToPebibyte(amount)
                }
            }
            "Pebibyte" -> {
                val amount = pebibyteToByte(quantity)
                when (to) {
                    "Bit" -> return  byteToBit(amount)
                    "Kilobit" -> return  byteToKilobit(amount)
                    "Kibibit" -> return  byteToKibibit(amount)
                    "Megabit" -> return  byteToMegabit(amount)
                    "Mebibit" -> return  byteToMebibit(amount)
                    "Gigabit" -> return  byteToGigabit(amount)
                    "Gibibit" -> return  byteToGibibit(amount)
                    "Terabit" -> return  byteToTerabit(amount)
                    "Tebibit" -> return  byteToTebibit(amount)
                    "Petabit" -> return  byteToPetabit(amount)
                    "Pebibit" -> return  byteToPebibit(amount)
                    "Byte" -> return  byteToByte(amount)
                    "Kilobyte" -> return  byteToKilobyte(amount)
                    "Kibibyte" -> return  byteToKibibyte(amount)
                    "Megabyte" -> return  byteToMegabyte(amount)
                    "Mebibyte" -> return  byteToMebibyte(amount)
                    "Gigabyte" -> return  byteToGigabyte(amount)
                    "Gibibyte" -> return  byteToGibibyte(amount)
                    "Terabyte" -> return  byteToTerabyte(amount)
                    "Tebibyte" -> return  byteToTebibyte(amount)
                    "Petabyte" -> return  byteToPetabyte(amount)
                    "Pebibyte" -> return  byteToPebibyte(amount)
                }
            }
        }
        return quantity
    }

    private fun byteToBit(quantity: Double): Double {
        return (quantity * 8.0)
    }
    private fun byteToKilobit(quantity: Double): Double {
        return (quantity * 8.0 * (1.0 / 1000.0))
    }
    private fun byteToKibibit(quantity: Double): Double {
        return (quantity * 8.0 * (1.0 / 1024.0))
    }
    private fun byteToMegabit(quantity: Double): Double {
        return (quantity * 8.0 * (1.0 / 1000000.0))
    }
    private fun byteToMebibit(quantity: Double): Double {
        return (quantity * 8.0 * (1.0 / 1048576.0))
    }
    private fun byteToGigabit(quantity: Double): Double {
        return (quantity * 8.0 * (1.0 / 1000000000.0))
    }
    private fun byteToGibibit(quantity: Double): Double {
        return (quantity * 8.0 * (1.0 / (1024.0 * 1024.0 * 1024.0)))
    }
    private fun byteToTerabit(quantity: Double): Double {
        return (quantity * 8.0 * (1.0 / 1000000000000.0))
    }
    private fun byteToTebibit(quantity: Double): Double {
        return (quantity * 8.0 * (1.0 / (1048576.0 * 1048576.0)))
    }
    private fun byteToPetabit(quantity: Double): Double {
        return (quantity * 8.0 * (1.0 / 1000000000000000.0))
    }
    private fun byteToPebibit(quantity: Double): Double {
        return (quantity * 8.0 * (1.0 / (1024.0 * 1024.0 * 1024.0 * 1024.0 * 1024.0)))
    }
    private fun byteToByte(quantity: Double): Double {
        return quantity
    }
    private fun byteToKilobyte(quantity: Double): Double {
        return (quantity * (1.0 / 1000.0))
    }
    private fun byteToKibibyte(quantity: Double): Double {
        return (quantity * (1.0 / 1024.0))
    }
    private fun byteToMegabyte(quantity: Double): Double {
        return (quantity * (1.0 / 1000000.0))
    }
    private fun byteToMebibyte(quantity: Double): Double {
        return (quantity * (1.0 / 1048576.0))
    }
    private fun byteToGigabyte(quantity: Double): Double {
        return (quantity * (1.0 / 1000000000.0))
    }
    private fun byteToGibibyte(quantity: Double): Double {
        return (quantity * (1.0 / (1024.0 * 1024.0 * 1024.0)))
    }
    private fun byteToTerabyte(quantity: Double): Double {
        return (quantity * (1.0 / 1000000000000.0))
    }
    private fun byteToTebibyte(quantity: Double): Double {
        return (quantity * (1.0 / (1048576.0 * 1048576.0)))
    }
    private fun byteToPetabyte(quantity: Double): Double {
        return (quantity * (1.0 / 1000000000000000.0))
    }
    private fun byteToPebibyte(quantity: Double): Double {
        return (quantity * (1.0 / (1024.0 * 1024.0 * 1024.0 * 1024.0 * 1024.0)))
    }

    private fun bitToByte(quantity: Double): Double {
        return (quantity / 8.0)
    }
    private fun kilobitToByte(quantity: Double): Double {
        return (quantity / (8.0 * (1.0 / 1000.0)))
    }
    private fun kibibitToByte(quantity: Double): Double {
        return (quantity / (8.0 * (1.0 / 1024.0)))
    }
    private fun megabitToByte(quantity: Double): Double {
        return (quantity / (8.0 * (1.0 / 1000000.0)))
    }
    private fun mebibitToByte(quantity: Double): Double {
        return (quantity / (8.0 * (1.0 / 1048576.0)))
    }
    private fun gigabitToByte(quantity: Double): Double {
        return (quantity / (8.0 * (1.0 / 1000000000.0)))
    }
    private fun gibibitToByte(quantity: Double): Double {
        return (quantity / (8.0 * (1.0 / (1024.0 * 1024.0 * 1024.0))))
    }
    private fun terabitToByte(quantity: Double): Double {
        return (quantity / (8.0 * (1.0 / 1000000000000.0)))
    }
    private fun tebibitToByte(quantity: Double): Double {
        return (quantity / (8.0 * (1.0 / (1048576.0 * 1048576.0))))
    }
    private fun petabitToByte(quantity: Double): Double {
        return (quantity / (8.0 * (1.0 / 1000000000000000.0)))
    }
    private fun pebibitToByte(quantity: Double): Double {
        return (quantity / (8.0 * (1.0 / (1024.0 * 1024.0 * 1024.0 * 1024.0 * 1024.0))))
    }
    private fun kilobyteToByte(quantity: Double): Double {
        return (quantity / (1.0 / 1000.0))
    }
    private fun kibibyteToByte(quantity: Double): Double {
        return (quantity / (1.0 / 1024.0))
    }
    private fun megabyteToByte(quantity: Double): Double {
        return (quantity / (1.0 / 1000000.0))
    }
    private fun mebibyteToByte(quantity: Double): Double {
        return (quantity / (1.0 / 1048576.0))
    }
    private fun gigabyteToByte(quantity: Double): Double {
        return (quantity / (1.0 / 1000000000.0))
    }
    private fun gibibyteToByte(quantity: Double): Double {
        return (quantity / (1.0 / (1024.0 * 1024.0 * 1024.0)))
    }
    private fun terabyteToByte(quantity: Double): Double {
        return (quantity / (1.0 / 1000000000000.0))
    }
    private fun tebibyteToByte(quantity: Double): Double {
        return (quantity / (1.0 / (1048576.0 * 1048576.0)))
    }
    private fun petabyteToByte(quantity: Double): Double {
        return (quantity / (1.0 / 1000000000000000.0))
    }
    private fun pebibyteToByte(quantity: Double): Double {
        return (quantity / (1.0 / (1024.0 * 1024.0 * 1024.0 * 1024.0 * 1024.0)))
    }
}
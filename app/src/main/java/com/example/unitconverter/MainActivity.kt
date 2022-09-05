package com.example.unitconverter

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.unitconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private lateinit var binding: ActivityMainBinding
    private lateinit var from: String
    private lateinit var to: String
    private lateinit var unitType: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.convertButton.setOnClickListener { convertAmount() }
        binding.amountEditText.setOnKeyListener { view, keyCode, _ -> handleKeyEvent(view, keyCode)}

        ArrayAdapter.createFromResource(
            this,
            R.array.unit_types_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.unitTypeSpinner.adapter = adapter
        }
        ArrayAdapter.createFromResource(
            this,
            getArrayResource(binding.unitTypeSpinner.selectedItem.toString()),
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.fromSpinner.adapter = adapter
        }
        ArrayAdapter.createFromResource(
            this,
            getArrayResource(binding.unitTypeSpinner.selectedItem.toString()),
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.toSpinner.adapter = adapter
        }

        binding.unitTypeSpinner.onItemSelectedListener = this
        binding.fromSpinner.onItemSelectedListener = this
        binding.toSpinner.onItemSelectedListener = this
    }

    private fun convertAmount() {
        val stringInTextField = binding.amountEditText.text.toString()
        val quantity = stringInTextField.toDoubleOrNull()
        if (quantity == null) {
            binding.result.text = 0.0.toString()
            return
        }
        getConvertedAmount(unitType)
    }

    private fun getConvertedAmount(selectedItem: String) {
        when (selectedItem) {
            "Temperature" -> {
                val temperature = Temperature(from, to, binding.amountEditText.text.toString().toDouble())
                val result = temperature.convert()
                binding.result.text = result.toString()
            }
            "Length" -> {
                val length = Length(from, to, binding.amountEditText.text.toString().toDouble())
                val result = length.convert()
                binding.result.text = result.toString()
            }
            "Mass" -> {
                val mass = Mass(from, to, binding.amountEditText.text.toString().toDouble())
                val result = mass.convert()
                binding.result.text = result.toString()
            }
            "Speed" -> {
                val speed = Speed(from, to, binding.amountEditText.text.toString().toDouble())
                val result = speed.convert()
                binding.result.text = result.toString()
            }
            "Volume" -> {
                val volume = Volume(from, to, binding.amountEditText.text.toString().toDouble())
                val result = volume.convert()
                binding.result.text = result.toString()
            }
            "Area" -> {
                val area = Area(from, to, binding.amountEditText.text.toString().toDouble())
                val result = area.convert()
                binding.result.text = result.toString()
            }
            "Fuel consumption" -> {
                val fuelEconomy = FuelEconomy(from, to, binding.amountEditText.text.toString().toDouble())
                val result = fuelEconomy.convert()
                binding.result.text = result.toString()
            }
            "Time" -> {
                val time = Time(from, to, binding.amountEditText.text.toString().toDouble())
                val result = time.convert()
                binding.result.text = result.toString()
            }
            "Digital storage" -> {
                val digitalStorage = DigitalStorage(from, to, binding.amountEditText.text.toString().toDouble())
                val result = digitalStorage.convert()
                binding.result.text = result.toString()
            }
            "Data transfer" -> {
                val dataTransferRate = DataTransferRate(from, to, binding.amountEditText.text.toString().toDouble())
                val result = dataTransferRate.convert()
                binding.result.text = result.toString()
            }
            "Energy" -> {
                val energy = Energy(from, to, binding.amountEditText.text.toString().toDouble())
                val result = energy.convert()
                binding.result.text = result.toString()
            }
            "Frequency" -> {
                val frequency = Frequency(from, to, binding.amountEditText.text.toString().toDouble())
                val result = frequency.convert()
                binding.result.text = result.toString()
            }
            "Plane angle" -> {
                val planeAngle = PlaneAngle(from, to, binding.amountEditText.text.toString().toDouble())
                val result = planeAngle.convert()
                binding.result.text = result.toString()
            }
            else -> {
                val pressure = Pressure(from, to, binding.amountEditText.text.toString().toDouble())
                val result = pressure.convert()
                binding.result.text = result.toString()
            }
        }
    }

    private fun getArrayResource(toString: String): Int {
        return when (toString) {
                "Temperature" -> R.array.temperature_array
                "Length" -> R.array.length_array
                "Mass" -> R.array.mass_array
                "Speed" -> R.array.speed_array
                "Volume" -> R.array.volume_array
                "Area" -> R.array.area_array
                "Fuel consumption" -> R.array.fuel_economy_array
                "Time" -> R.array.time_array
                "Digital storage" -> R.array.digital_storage_array
                "Data transfer" -> R.array.data_transfer_array
                "Energy" -> R.array.energy_array
                "Frequency" -> R.array.frequency_array
                "Plane angle" -> R.array.plane_angle_array
                else -> R.array.pressure_array
        }
    }

    override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
        if (parent.id == binding.unitTypeSpinner.id) {
            ArrayAdapter.createFromResource(
                this,
                getArrayResource(binding.unitTypeSpinner.selectedItem.toString()),
                android.R.layout.simple_spinner_item
            ).also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                binding.fromSpinner.adapter = adapter
            }
            ArrayAdapter.createFromResource(
                this,
                getArrayResource(binding.unitTypeSpinner.selectedItem.toString()),
                android.R.layout.simple_spinner_item
            ).also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                binding.toSpinner.adapter = adapter
            }
            unitType = parent.getItemAtPosition(pos).toString()
        }
        if (parent.id ==  binding.fromSpinner.id) {
            from = parent.getItemAtPosition(pos).toString()
        }
        if (parent.id ==  binding.toSpinner.id) {
            to = parent.getItemAtPosition(pos).toString()
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>) {
        // Another interface callback
    }

    private fun handleKeyEvent(view: View, keyCode: Int): Boolean {
        if (keyCode == KeyEvent.KEYCODE_ENTER) {
            // Hide the keyboard
            val inputMethodManager =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
            return true
        }
        return false
    }
}
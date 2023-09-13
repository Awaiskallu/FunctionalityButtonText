package com.example.functionalitybuttontext


import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButtonToggleGroup
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showButtonTypesButton: Button = findViewById(R.id.showButtonTypes)
        val showTextTypesButton: Button = findViewById(R.id.showTextTypes)
        val normalButton: Button = findViewById(R.id.normalButton)
        val textButton: Button = findViewById(R.id.textButton)
        val filledButton: Button = findViewById(R.id.filledButton)
        val elevatedButton: Button = findViewById(R.id.elevatedButton)
        val filledTonalButton: Button = findViewById(R.id.filledTonalButton)
        val outlinedButton: Button = findViewById(R.id.outlinedButton)
        val iconButton: ImageButton = findViewById(R.id.iconButton)
        val segmentedButtonGroup: MaterialButtonToggleGroup = findViewById(R.id.segmentedButtonGroup)
        val fab: FloatingActionButton = findViewById(R.id.fab)
        val extendedFab: ExtendedFloatingActionButton = findViewById(R.id.extendedFab)
        val textView1: TextView = findViewById(R.id.textView1)
        val textView2: TextView = findViewById(R.id.textView2)
        val textInputLayout1: TextInputLayout = findViewById(R.id.textInputLayout1)
        val textInputLayout2: TextInputLayout = findViewById(R.id.textInputLayout2)

        showButtonTypesButton.setOnClickListener {
            toggleVisibility(normalButton)
            toggleVisibility(textButton)
            toggleVisibility(filledButton)
            toggleVisibility(elevatedButton)
            toggleVisibility(filledTonalButton)
            toggleVisibility(outlinedButton)
            toggleVisibility(iconButton)
            toggleVisibility(segmentedButtonGroup)
            toggleVisibility(fab)
            toggleVisibility(extendedFab)
        }

        showTextTypesButton.setOnClickListener {
            toggleVisibility(textView1)
            toggleVisibility(textView2)
            toggleVisibility(textInputLayout1)
            toggleVisibility(textInputLayout2)
        }
    }

    private fun toggleVisibility(view: View) {
        if (view.visibility == View.VISIBLE) {
            view.visibility = View.GONE
        } else {
            view.visibility = View.VISIBLE
        }
    }
}
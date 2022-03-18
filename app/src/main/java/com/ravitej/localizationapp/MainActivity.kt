package com.ravitej.localizationapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ravitej.localizationapp.databinding.ActivityMainBinding
import com.ravitej.localizationapp.utils.LocaleHelper

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        binding.englishLocale.setOnClickListener {
            val context = LocaleHelper.updateLocale("en", this)
            updateText(context)
        }

        binding.spanishLocale.setOnClickListener {
            val context = LocaleHelper.updateLocale("es", this)
            updateText(context)
        }
    }

    private fun updateText(context: Context) {
        binding.helloWorld.text = context.getString(R.string.hello_world)
        binding.subText?.text = context.getString(R.string.hello_world_sub_text)
    }
}
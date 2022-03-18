package com.ravitej.localizationapp.utils

import android.content.Context
import java.util.*

object LocaleHelper {

    /**
     * This updates the locale and in the configuration and returns context which can be used to get the resource.
     */
    fun updateLocale(locale: String, context: Context): Context {
        val local = Locale(locale)
        Locale.setDefault(local)

        val configuration = context.resources.configuration
        configuration.setLocale(local)
        configuration.setLayoutDirection(local)

        return context.createConfigurationContext(configuration)
    }
}
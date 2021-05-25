package com.github.novotnyr.android.flagsredux

import androidx.annotation.DrawableRes
import java.io.Serializable

data class Flag(val country: String, @DrawableRes val flagResource: Int): Serializable
package com.example.buildagrid.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @DrawableRes val image: Int,
    val number: Int,
    @StringRes val title: Int
)

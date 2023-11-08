package com.example.buildagrid.data

import com.example.buildagrid.R
import com.example.buildagrid.model.Topic

class Datasource {

    fun loadArtSpace(): List<Topic> {
        return listOf(
            Topic(R.drawable.business, 78, R.string.business),
            Topic(R.drawable.fashion, 92, R.string.fashion),
            Topic(R.drawable.film, 165, R.string.film),
            Topic(R.drawable.gaming, 164, R.string.gaming),
            Topic(R.drawable.drawing, 326, R.string.drawing),
            Topic(R.drawable.lifestyle, 305, R.string.lifestyle),
            Topic(R.drawable.music, 212, R.string.music),
            Topic(R.drawable.painting, 172, R.string.painting),
            Topic(R.drawable.photographer, 321, R.string.photography),
            Topic(R.drawable.tech, 118, R.string.tech)
        )
    }
}
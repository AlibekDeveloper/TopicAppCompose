package com.example.buildagrid.data

import com.example.buildagrid.R
import com.example.buildagrid.model.Topic

class Datasource {

    fun loadArtSpace(): List<Topic> {
        return listOf(
            Topic(R.drawable.business, 78, R.string.business),
            Topic(R.drawable.fashion, 78, R.string.fashion),
            Topic(R.drawable.film, 78, R.string.film),
            Topic(R.drawable.gaming, 78, R.string.gaming),
            Topic(R.drawable.drawing, 78, R.string.drawing),
            Topic(R.drawable.lifestyle, 78, R.string.lifestyle),
            Topic(R.drawable.music, 78, R.string.music),
            Topic(R.drawable.painting, 78, R.string.painting),
            Topic(R.drawable.photographer, 78, R.string.photography),
            Topic(R.drawable.tech, 78, R.string.tech)
        )
    }
}
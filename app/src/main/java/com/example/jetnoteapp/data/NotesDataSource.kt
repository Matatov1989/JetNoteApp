package com.example.jetnoteapp.data

import com.example.jetnoteapp.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "A good day", description = "We went on a vacation by"),
            Note(title = "Android Compose", description = "Working on Android Compose"),
            Note(title = "Keep at it...", description = "Sometimes things just happen"),
            Note(title = "A movie day", description = "Watching a movie with family"),
            Note(title = "A movie day", description = "Watching a movie with family"),
        )
    }
}

package com.example.jetnoteapp.data

import androidx.room.*
import com.example.jetnoteapp.model.Note

@Dao
interface NoteDatabaseDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(note: Note)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun update(note: Note)

    @Query("SELECT * FROM notes_tbl")
    fun getNotes() : List<Note>

    @Query("SELECT FROM notes_tbl WHERE id =:id")
    fun getNoteById(id: String): Note

    @Query("DELETE FROM notes_tbl")
    fun deleteAll()

    @Delete
    fun deleteNote(note: Note)

}

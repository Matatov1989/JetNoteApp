package com.example.jetnoteapp.data

import androidx.compose.runtime.MutableState
import androidx.room.*
import com.example.jetnoteapp.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDatabaseDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(note: Note)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(note: Note)

    @Query("SELECT * FROM notes_tbl")
    fun getNotes(): Flow<List<Note>>

//    @Query("SELECT FROM notes_tbl WHERE id =:id")
//    suspend fun getNoteById(id: String): Note

    @Query("DELETE FROM notes_tbl")
    suspend fun deleteAll()

    @Delete
    suspend fun deleteNote(note: Note)

}

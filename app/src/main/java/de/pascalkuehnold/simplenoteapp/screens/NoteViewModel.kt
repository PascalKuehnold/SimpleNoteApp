package de.pascalkuehnold.simplenoteapp.screens

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import de.pascalkuehnold.simplenoteapp.data.NotesDataSource
import de.pascalkuehnold.simplenoteapp.model.Note


/**
 * Created by Pascal Kühnold on 7/15/2022.
 */
class NoteViewModel: ViewModel() {

    private var noteList = mutableStateListOf<Note>()

    init {
        noteList.addAll(NotesDataSource().loadNotes())
    }

    fun addNote(note: Note){
        noteList.add(note)
    }

    fun removeNote(note: Note){
        noteList.remove(note)
    }

    fun getAllNotes(): List<Note>{
        return noteList
    }
}
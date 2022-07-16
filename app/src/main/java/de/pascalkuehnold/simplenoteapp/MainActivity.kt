package de.pascalkuehnold.simplenoteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import dagger.hilt.android.AndroidEntryPoint
import de.pascalkuehnold.simplenoteapp.screens.NoteScreen
import de.pascalkuehnold.simplenoteapp.screens.NoteViewModel
import de.pascalkuehnold.simplenoteapp.ui.theme.SimpleNoteAppTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleNoteAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    //val noteViewModel = viewModel<NoteViewModel>()
                    val noteViewModel: NoteViewModel by viewModels()

                    NotesApp(noteViewModel)
                }
            }
        }
    }
}

@Composable
fun NotesApp(noteViewModel: NoteViewModel) {
    val notesList = noteViewModel.noteList.collectAsState().value

    NoteScreen(
        notes = notesList,
        onAddNote = {
            noteViewModel.addNote(it)
        },
        onRemoveNote = {
            noteViewModel.removeNote(it)
        }
    )
}


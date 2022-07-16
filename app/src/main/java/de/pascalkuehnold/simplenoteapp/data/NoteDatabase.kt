package de.pascalkuehnold.simplenoteapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import de.pascalkuehnold.simplenoteapp.model.Note
import de.pascalkuehnold.simplenoteapp.util.DateConverter
import de.pascalkuehnold.simplenoteapp.util.UUIDConverter


/**
 * Created by Pascal Kühnold on 7/16/2022.
 */
@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class, UUIDConverter::class)
abstract class NoteDatabase: RoomDatabase() {

    abstract fun noteDao(): NoteDatabaseDao

}
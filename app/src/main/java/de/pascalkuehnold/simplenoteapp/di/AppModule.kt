package de.pascalkuehnold.simplenoteapp.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import de.pascalkuehnold.simplenoteapp.data.NoteDatabase
import de.pascalkuehnold.simplenoteapp.data.NoteDatabaseDao
import javax.inject.Singleton


/**
 * Created by Pascal Kühnold on 7/16/2022.
 */

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Singleton
    @Provides
    fun provideNotesDao(noteDatabase: NoteDatabase): NoteDatabaseDao = noteDatabase.noteDao()

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): NoteDatabase = Room.databaseBuilder(
        context, NoteDatabase::class.java,
        "notes_db")
        .fallbackToDestructiveMigration()
        .build()

}
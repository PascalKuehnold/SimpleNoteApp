package de.pascalkuehnold.simplenoteapp.model

import java.time.LocalDateTime
import java.util.*


/**
 * Created by Pascal Kühnold on 7/15/2022.
 */
data class Note(
    val id: UUID = UUID.randomUUID(),
    val title: String,
    val description: String,
    val entryDate: LocalDateTime = LocalDateTime.now()
)

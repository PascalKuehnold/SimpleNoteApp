package de.pascalkuehnold.simplenoteapp.util

import androidx.room.TypeConverter
import java.util.*


/**
 * Created by Pascal Kühnold on 7/16/2022.
 */
class UUIDConverter {

    @TypeConverter
    fun fromUUID(uuid: UUID): String {
        return uuid.toString()
    }

    @TypeConverter
    fun uuidFromString(string: String?): UUID?{
        return UUID.fromString(string)
    }

}
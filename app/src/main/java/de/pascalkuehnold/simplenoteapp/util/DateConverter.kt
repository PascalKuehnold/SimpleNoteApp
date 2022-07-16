package de.pascalkuehnold.simplenoteapp.util

import androidx.room.TypeConverter
import java.util.*


/**
 * Created by Pascal Kühnold on 7/16/2022.
 */
class DateConverter {

    @TypeConverter
    fun timeStampFromDate(date: Date): Long{
        return date.time
    }

    @TypeConverter
    fun dateFromTimeStamp(timestamp: Long): Date? {
        return Date(timestamp)
    }

}
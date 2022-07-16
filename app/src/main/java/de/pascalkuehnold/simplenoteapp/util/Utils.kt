package de.pascalkuehnold.simplenoteapp.util

import java.text.SimpleDateFormat
import java.util.*


/**
 * Created by Pascal Kühnold on 7/16/2022.
 */

fun formatDate(time: Long): String {
    val date = Date(time)
    val format = SimpleDateFormat("EEE, d MMM hh:mm aaa", Locale.getDefault())

    return format.format(date)
}
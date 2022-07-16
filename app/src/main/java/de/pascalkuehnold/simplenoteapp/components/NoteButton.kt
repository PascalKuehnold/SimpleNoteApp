package de.pascalkuehnold.simplenoteapp.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp


/**
 * Created by Pascal Kühnold on 7/15/2022.
 */
@Composable
fun NoteButton(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    onClick: () -> Unit,
    enabled: Boolean = true
){
        Surface(
            modifier = modifier,
            shape = CircleShape,
            color = MaterialTheme.colors.primary,
            elevation = 6.dp
        ) {

            IconButton(
                onClick = onClick,
                enabled = enabled
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = "Button Icon",
                    modifier = Modifier.fillMaxSize(0.5f)
                )
            }
        }


}
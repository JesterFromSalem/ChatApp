package com.example.chatapp.auth


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.example.chatapp.R
import com.example.chatapp.ui.theme.Gray400
import com.example.chatapp.ui.theme.fontSize
import com.example.chatapp.ui.theme.sizes
import com.example.chatapp.ui.theme.spacing

@Composable
fun LoginScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    0.0f to Gray400,
                    0.5f to MaterialTheme.colorScheme.primary,
                    1.0f to Gray400
                )
            )
            .padding(horizontal = MaterialTheme.spacing.medium),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            color = MaterialTheme.colorScheme.secondary,
            text = stringResource(R.string.login_screen_title),
            fontSize = MaterialTheme.fontSize.headline,
            fontWeight = FontWeight.Bold
        )
        LoginCredentials()
    }
}

@Composable
private fun LoginCredentials() {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TextField(
            value = "",
            onValueChange = {},
            singleLine = true,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.secondary
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = MaterialTheme.spacing.extraLarge),
            placeholder = {
                Text(
                    text = stringResource(R.string.auth_email_placeholder)
                )
            },
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedIndicatorColor = MaterialTheme.colorScheme.secondary,
                focusedIndicatorColor = MaterialTheme.colorScheme.secondary,
                unfocusedPlaceholderColor = MaterialTheme.colorScheme.secondary,
            ),
            shape = TextFieldDefaults.shape,
        )

        Spacer(modifier = Modifier.height(MaterialTheme.spacing.large))

        TextField(
            value = "",
            onValueChange = {},
            singleLine = true,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    tint = MaterialTheme.colorScheme.secondary,
                    contentDescription = null
                )
            },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Filled.VisibilityOff,
                    tint = MaterialTheme.colorScheme.secondary,
                    contentDescription = null
                )
            },
            placeholder = {
                Text(
                    text = stringResource(R.string.auth_password_placeholder),
                )
            },
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedIndicatorColor = MaterialTheme.colorScheme.secondary,
                focusedIndicatorColor = MaterialTheme.colorScheme.secondary,
                unfocusedPlaceholderColor = MaterialTheme.colorScheme.secondary,
            ),
            modifier = Modifier
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(MaterialTheme.spacing.large))

        Button(
            modifier = Modifier
                .height(MaterialTheme.sizes.buttonHeight)
                .fillMaxWidth(0.7f),
            colors = ButtonColors(
                containerColor = MaterialTheme.colorScheme.secondary,
                contentColor = MaterialTheme.colorScheme.onSecondary,
                disabledContainerColor = MaterialTheme.colorScheme.secondary,
                disabledContentColor = MaterialTheme.colorScheme.onSecondary
            ),
            onClick = {}) {
            Text(
                fontSize = MaterialTheme.fontSize.buttonText,
                text = stringResource(R.string.login_screen_login_button_text)
            )
        }

        Spacer(modifier = Modifier.height(MaterialTheme.spacing.medium))

        Text(
            text = stringResource(R.string.login_screen_to_register_screen_nav),
            color = MaterialTheme.colorScheme.secondary,
            fontSize = MaterialTheme.fontSize.bodyText,
            modifier = Modifier.padding(bottom = MaterialTheme.spacing.extraLarge)
        )
    }
}

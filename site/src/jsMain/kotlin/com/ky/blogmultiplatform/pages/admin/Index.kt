package com.ky.blogmultiplatform.pages.admin

import androidx.compose.runtime.Composable
import com.ky.blogmultiplatform.util.isUserLoggedIn
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun HomeScreen() {
    isUserLoggedIn{
        HomePage()
    }
}

@Composable
fun HomePage(){
    println("Admin Home Page")
}
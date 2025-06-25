package es.sebastian.Ds6Proy2Android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import es.sebastian.Ds6Proy2Android.ui.theme.ProductsScreen
import es.sebastian.Ds6Proy2Android.ui.theme.DS6Proy2AndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DS6Proy2AndroidTheme {
                ProductsScreen()
            }
        }
    }
}
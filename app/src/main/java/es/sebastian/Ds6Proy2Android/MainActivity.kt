package es.sebastian.Ds6Proy2Android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import es.sebastian.Ds6Proy2Android.ui.theme.ProductsScreen
import es.sebastian.Ds6Proy2Android.ui.theme.Ds6p2mobileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ds6p2mobileTheme {
                ProductsScreen()
            }
        }
    }
}
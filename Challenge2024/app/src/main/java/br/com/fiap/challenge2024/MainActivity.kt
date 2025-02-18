package br.com.fiap.challenge2024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.challenge2024.Telas.CaixaTela
import br.com.fiap.challenge2024.Telas.CaixaTela
import br.com.fiap.challenge2024.Telas.EditarTela
import br.com.fiap.challenge2024.Telas.Login
import br.com.fiap.challenge2024.Telas.Menu
import br.com.fiap.challenge2024.ui.theme.Challenge2024Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Challenge2024Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "login"
                    ) {
                        composable(route = "login") { Login(navController) }
                        composable(route = "telacaixa") { CaixaTela(navController) }
                        composable(route = "telaferramentas" ) { Menu(navController)}
                        composable(route = "telaeditar") { EditarTela(navController)}
                    }
                }
            }
        }
    }
}


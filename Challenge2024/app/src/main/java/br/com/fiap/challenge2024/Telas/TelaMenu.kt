package br.com.fiap.challenge2024.Telas

import android.view.Surface
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.DateRange
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.ExitToApp
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.challenge2024.R

@Composable
fun Menu(navController: NavController) {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        color = MaterialTheme.colorScheme.background

    ){
        Image(
        painter = painterResource(id = R.drawable.bkmail2),
        contentDescription = "Wallpaper",
        contentScale = ContentScale.Crop

    )
        Column {
            Box(contentAlignment = Alignment.TopEnd) {
                LargeFloatingActionButton(
                    onClick = {
                        navController.navigate(route = "telacaixa"
                        )
                              },
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .offset(x = 30.dp, y = 60.dp)
                        .size(width = 150.dp, height = 150.dp)

                ) {
                    Icon(
                        Icons.Rounded.Email,contentDescription = "Email" ,
                        modifier = Modifier
                            .size(width = 60.dp, height = 60.dp)
                            .offset(y = -20.dp)
                    )
                    Text(modifier = Modifier
                        .offset(y = 40.dp),
                        text = "Caixa de Entrada")
                }

                LargeFloatingActionButton(

                    onClick = { navController.navigate("telaferramentas") },
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .offset(x = 215.dp, y = 60.dp)
                        .size(width = 150.dp, height = 150.dp)
                ) {
                    Icon(
                        Icons.Rounded.Edit,contentDescription = "Email" ,
                        modifier = Modifier
                            .size(width = 60.dp, height = 60.dp)
                            .offset(y = -20.dp)
                        )
                    Text(modifier = Modifier
                        .offset(y = 40.dp),
                        text = "Novo Email")
                }
                LargeFloatingActionButton(
                    onClick = { navController.navigate(route= "telaeditar") },
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .offset(x = 30.dp, y = 260.dp)
                        .size(width = 150.dp, height = 150.dp)

                ) {
                    Icon(
                        Icons.Rounded.AccountBox,contentDescription = "editar" ,
                        modifier = Modifier
                            .size(width = 60.dp, height = 60.dp)
                            .offset(y = -20.dp)
                    )
                    Text(modifier = Modifier
                        .offset(y = 40.dp),
                        text = "Perfil")
                }

                LargeFloatingActionButton(

                    onClick = { navController.navigate("login") },
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .offset(x = 215.dp, y = 260.dp)
                        .size(width = 150.dp, height = 150.dp)
                ) {
                    Icon(
                        Icons.Rounded.DateRange,contentDescription = "logout" ,
                        modifier = Modifier
                            .size(width = 60.dp, height = 60.dp)
                            .offset(y = -20.dp)
                    )
                    Text(modifier = Modifier
                        .offset(y = 40.dp),
                        text = "Calendario")
                }

                LargeFloatingActionButton(

                    onClick = {  },
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .offset(x = 30.dp, y = 460.dp)
                        .size(width = 150.dp, height = 150.dp)
                ) {
                    Icon(
                        Icons.Rounded.Delete,contentDescription = "lixo" ,
                        modifier = Modifier
                            .size(width = 60.dp, height = 60.dp)
                            .offset(y = -20.dp)
                    )
                    Text(modifier = Modifier
                        .offset(y = 40.dp),
                        text = "Lixeira")
                }

                LargeFloatingActionButton(

                    onClick = { navController.navigate("login") },
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .offset(x = 215.dp, y = 460.dp)
                        .size(width = 150.dp, height = 150.dp)
                ) {
                    Icon(
                        Icons.Rounded.ExitToApp,contentDescription = "logout" ,
                        modifier = Modifier
                            .size(width = 60.dp, height = 60.dp)
                            .offset(y = -20.dp)
                    )
                    Text(modifier = Modifier
                        .offset(y = 40.dp),
                        text = "LogOut")
                }


            }


        }

    }
}

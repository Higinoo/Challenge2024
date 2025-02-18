package br.com.fiap.challenge2024.Telas

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.MaterialTheme
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
fun CaixaTela(navController: NavController) {

    val scrollState = rememberScrollState()

    Surface(
        modifier = Modifier

            .fillMaxSize()
            .background(Color.White),
        color = MaterialTheme.colorScheme.background

    ) {
        Image(
            painter = painterResource(id = R.drawable.bkmail2),
            contentDescription = "Wallpaper",
            contentScale = ContentScale.Crop

        )
        Column {
            LargeFloatingActionButton(
                onClick = {
                    navController.navigate(route = "telaferramentas")
                },
                modifier = Modifier

                    .offset(y= 10.dp)
                    .fillMaxWidth()
                    .size(width = 0.dp ,height = 50.dp)


            ) {
                Icon(
                    Icons.Rounded.Menu,contentDescription = "Email" ,
                    modifier = Modifier
                        .size(width = 20.dp, height = 20.dp)
                        .offset(y = -10.dp)
                )
                Text(modifier = Modifier
                    .offset(y = 7.dp),
                    text = "Menu")
            }
        }

        Column(
            modifier = Modifier
                //.verticalScroll(scrollState)
                .padding(8.dp)
                .fillMaxWidth()


        )


        {
            Text(
                text = "",
                modifier = Modifier.fillMaxWidth(),
                fontSize = 32.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White,
                textAlign = TextAlign.Left
            )
            Column(
                modifier = Modifier
                    .verticalScroll(scrollState)
                    .fillMaxWidth()
                    .height(750.dp)
                    .padding(16.dp)
            )
            {
                //Denuncia
                Card(
                    modifier = Modifier
                        .verticalScroll(scrollState)
                        .fillMaxWidth()
                        .height(150.dp)
                        .padding(top = 8.dp),
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color(0x860C0C0C)
                        ),
                    border = BorderStroke(
                        width = 1.dp,
                        Color.White
                    )
                ) {
                    Row(
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Spacer(modifier = Modifier.width(8.dp))
                        Card(
                            modifier = Modifier
                                .size(
                                    width = 80.dp,
                                    height = 80.dp
                                ),
                            shape = CircleShape
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.contato1),
                                contentDescription = "Wallpaper",
                                contentScale = ContentScale.Crop
                            )
                        }
                        Column(
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(
                                    vertical = 16.dp,
                                    horizontal = 16.dp
                                )
                        ) {
                            Text(
                                text = "Fernando Fernandes",
                                fontSize = 26.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Text(
                                text = "Lorem ipsum dolor...!",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Text(
                                text = "fernando@fernandes.com",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )


                        }
                    }
                }
                Column {//Monitoramento


                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .padding(top = 8.dp),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = Color(0x860C0C0C)
                            ),
                        border = BorderStroke(
                            width = 1.dp,
                            Color.White
                        )
                    ) {
                        Row(
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Spacer(modifier = Modifier.width(8.dp))
                            Card(
                                modifier = Modifier
                                    .size(
                                        width = 80.dp,
                                        height = 80.dp
                                    ),
                                shape = CircleShape
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.contato2),
                                    contentDescription = "Wallpaper",
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Column(
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(
                                        vertical = 16.dp,
                                        horizontal = 16.dp
                                    )
                            ) {
                                Text(
                                    text = "Mario Marios",
                                    fontSize = 26.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Text(
                                    text = "Lorem ipsum dolor",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Text(
                                    text = "mario@marios.com",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                            }
                        }
                    }
                }

                Column {//Rotas


                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .padding(top = 8.dp),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = Color(0x860C0C0C)
                            ),
                        border = BorderStroke(
                            width = 1.dp,
                            Color.White
                        )
                    ) {
                        Row(
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Spacer(modifier = Modifier.width(8.dp))
                            Card(
                                modifier = Modifier
                                    .size(
                                        width = 80.dp,
                                        height = 80.dp
                                    ),
                                shape = CircleShape
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.contato3),
                                    contentDescription = "Wallpaper",
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Column(
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(
                                        vertical = 16.dp,
                                        horizontal = 16.dp
                                    )
                            ) {
                                Text(
                                    text = "Paulo Paulos",
                                    fontSize = 26.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Text(
                                    text = "Lorem ipsum dolor",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Text(
                                    text = "paulo@paulos.com.",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                            }
                        }
                    }
                }
                Column {//Monitoramento


                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .padding(top = 8.dp),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = Color(0x860C0C0C)
                            ),
                        border = BorderStroke(
                            width = 1.dp,
                            Color.White
                        )
                    ) {
                        Row(
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Spacer(modifier = Modifier.width(8.dp))
                            Card(
                                modifier = Modifier
                                    .size(
                                        width = 80.dp,
                                        height = 80.dp
                                    ),
                                shape = CircleShape
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.contato4),
                                    contentDescription = "Wallpaper",
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Column(
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(
                                        vertical = 16.dp,
                                        horizontal = 16.dp
                                    )
                            ) {
                                Text(
                                    text = "Julia Julias",
                                    fontSize = 26.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Text(
                                    text = "Lorem ipsum dolor",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Text(
                                    text = "julia@julias.com",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                            }
                        }
                    }
                }
                Column {//Monitoramento


                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .padding(top = 8.dp),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = Color(0x860C0C0C)
                            ),
                        border = BorderStroke(
                            width = 1.dp,
                            Color.White
                        )
                    ) {
                        Row(
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Spacer(modifier = Modifier.width(8.dp))
                            Card(
                                modifier = Modifier
                                    .size(
                                        width = 80.dp,
                                        height = 80.dp
                                    ),
                                shape = CircleShape
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.contato5),
                                    contentDescription = "Wallpaper",
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Column(
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(
                                        vertical = 16.dp,
                                        horizontal = 16.dp
                                    )
                            ) {
                                Text(
                                    text = "Daniela Fiap",
                                    fontSize = 26.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Text(
                                    text = "Boleto em Atraso",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Text(
                                    text = "daniela@fiap.com",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                            }
                        }
                    }
                }

            }
       }
    }
}





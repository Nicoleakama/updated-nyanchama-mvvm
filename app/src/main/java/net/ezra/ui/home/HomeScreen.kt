package net.ezra.ui.home

import android.icu.text.ListFormatter.Width
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP

import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_STUDENTS

@Composable
fun HomeScreen(navController: NavHostController) {

    LazyColumn {
        item {
            Column(
                modifier = Modifier
                    .background(Color(0xff301934))
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .fillMaxSize()

            ) {
                Row(
                    modifier = Modifier
                        .padding(start = 110.dp, top = 50.dp, end = 50.dp),
                    horizontalArrangement = Arrangement.Center,


                    ) {
                    Text(text = "Find Your",
                        color = Color.White,
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Default
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(start = 50.dp),
                    horizontalArrangement = Arrangement.Center,


                    ) {
                    Text(text = "Dream Job Here",
                        color = Color.White,
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Default
                    )
                }

                Row(
                    modifier = Modifier
                        .padding(start = 50.dp),
                    horizontalArrangement = Arrangement.Center,


                    ) {
                    Text(text = "Explore the best suitable job for you",
                        style = TextStyle(color = Color(0xffCF9FFF)),
                        fontFamily = FontFamily.Default
                    )
                }

                Image(
                    painter = painterResource(id = R.drawable.official),
                    contentDescription ="",
                    modifier = Modifier
                        .width(400.dp)
                        .height(400.dp),

                    contentScale = ContentScale.Crop)





                Row (
                    modifier = Modifier
                        .padding(start = 50.dp)
                ){
                    Text(text = "What Are You Looking For?",
                        color = Color.White)
                }
                Spacer(modifier = Modifier
                    .height(15.dp))




                Row(
                    modifier = Modifier
                        .padding(start = 50.dp)
                ) {
                    Button(onClick =
                    { navController.navigate(ROUTE_CONTACT) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    } },
                        colors = ButtonDefaults.buttonColors(Color(0xffCF9FFF)),
                        shape = RoundedCornerShape(15.dp)
                    )


                    {

                        Icon(painter = painterResource(id = R.drawable.briefcase),
                            contentDescription =null,
                            modifier = Modifier
                                .size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(10.dp))

                        Text(text = "Full Time Job",
                            color = Color.White
                        )

                    }


                    Spacer(modifier = Modifier
                        .width(15.dp))


                   Button(onClick =
                    { navController.navigate(ROUTE_ABOUT) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    } },
                       colors = ButtonDefaults.buttonColors(Color(0xffCF9FFF)),

                       shape = RoundedCornerShape(15.dp)

                    ) {

                        Icon(painter = painterResource(id = R.drawable.briefcase),
                            contentDescription =null,
                            modifier = Modifier
                                .size(20.dp))

                        Spacer(modifier = Modifier.width(6.dp))

                        Text(text = "Part Time Job",
                            color = Color.White)

                    }

                }


                Spacer(modifier = Modifier
                    .height(35.dp))








                Button(onClick =
                { navController.navigate(ROUTE_HOME) {
                    popUpTo(ROUTE_CONTACT) { inclusive = true }
                } },
                    colors = ButtonDefaults.buttonColors(Color(0xffCF9FFF)),
                    shape = RoundedCornerShape(15.dp),
                    modifier = Modifier
                        .padding(start = 125.dp)
                        .width(150.dp)


                ) {
                    Text(text = "Continue",
                        color = Color.White

                        )
                }

            }























        }
    }

}


@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}


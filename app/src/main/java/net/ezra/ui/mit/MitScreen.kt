package net.ezra.ui.mit

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.ui.theme.AppTheme
import net.ezra.R



@Composable
fun MitScreen(navController: NavHostController) {
LazyColumn(
    modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .fillMaxSize()
        .background(color = Color.White)
) {
    item {
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .fillMaxSize()
        ){
        Card (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .height(250.dp),
            colors = CardDefaults.cardColors(Color.Black),
            shape = RoundedCornerShape(bottomEndPercent = 16, bottomStartPercent = 16)
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.backarrow),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(start = 8.dp)
                        .size(45.dp)
                )


                Spacer(
                    modifier = Modifier
                        .width(30.dp)
                )

                Text(
                    text = "Details",
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(top = 15.dp, start = 70.dp)
                )


                Image(
                    painter = painterResource(id = R.drawable.save),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(start = 120.dp)
                        .size(45.dp)
                )
            }


            
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 1.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly

                ) {
                    Image(painter = painterResource(id = R.drawable.netflix),
                        contentDescription ="",
                        modifier = Modifier
                            .size(48.dp)
                            .padding(start = 2.dp)
                        ,
                    )


                }



            Spacer(modifier = Modifier.height(5.dp))


            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(text = "Product Designer",
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold,
                     textAlign = TextAlign.Center,
                    fontSize = 25.sp,
                    modifier = Modifier
                        .padding(start = 120.dp)


                )

            }

            Spacer(modifier = Modifier.height(5.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(text = "$50.00/hr",
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center,
                    fontSize = 25.sp,

                    modifier = Modifier
                        .padding(start = 120.dp)
                )

            }


            Spacer(modifier = Modifier.height(15.dp))

            Row(
                modifier = Modifier
                    .padding(start = 120.dp)

            ) {
                Card(
                    modifier = Modifier
                        .width(70.dp)
                        .height(25.dp)
                        .padding(start = 5.dp),
                    colors = CardDefaults.cardColors(Color(0XFF2A2C2D))
                ) {
                    Text(text = "UI Design",
                        color = Color.White,
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 5.dp,start = 5.dp)


                    )

                }

                Spacer(modifier = Modifier.width(8.dp))


                Card(
                    modifier = Modifier
                        .width(75.dp)
                        .height(25.dp)
                        .padding(end = 5.dp)
                    ,
                    colors = CardDefaults.cardColors(Color(0XFF2A2C2D))

                ) {
                  Text(text = "UX Design",
                      color = Color.White,
                      fontSize = 12.sp,
                      textAlign = TextAlign.Center,
                      modifier = Modifier.padding(top = 5.dp, start = 5.dp)

                  )
                }

            }








        }


            Spacer(modifier = Modifier.height(15.dp))


            Row (
           modifier = Modifier.fillMaxWidth()
       ){
           Text(text = "Job Descriptions",
               fontWeight = FontWeight.SemiBold,
               modifier = Modifier
               .padding(start = 10.dp)
           )

       }
            
            Spacer(modifier = Modifier.height(10.dp))


     Column(
         modifier = Modifier
             .fillMaxWidth()
             .fillMaxHeight()

     ) {
       Text(text = "We're a team of youthful,intelligent and dedicated creatives who have an unrivaled energy and passion for crafting beautiful and meaningful products."
               +
               "We strive to follow all UX processes of ideation,research and MVP for our product design to enable output that is both aesthetic and strategic.",
           modifier = Modifier
               .padding(start = 10.dp))

     }


            Spacer(modifier = Modifier.height(10.dp))


            Row (
                modifier = Modifier.fillMaxWidth()
            ){
                Text(text = "Requirements",
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(start = 10.dp)
                )

            }

            Spacer(modifier = Modifier.height(10.dp))


            Column(
                modifier = Modifier
                    .padding(start = 10.dp)

            ) {
             Row(
                 modifier = Modifier
                     .fillMaxWidth()
             ) {
                 Icon(imageVector = Icons.Default.CheckCircle, contentDescription ="",)

                Text(text ="Exceptional communication skills and team-working skills.")
                    }

                Spacer(modifier = Modifier.height(6.dp))
             Row (
                 modifier = Modifier
                     .fillMaxWidth()
             ){
                 Icon(imageVector = Icons.Default.CheckCircle, contentDescription ="" ,)

                 Text(text ="Know the principles of animation and you can create high fidelity prototypes.")
             }
                Spacer(modifier = Modifier.height(6.dp))

                Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {

                    Icon(imageVector = Icons.Default.CheckCircle, contentDescription ="")

                    Text(text ="Direct experience using Adobe Premiere,Adobe After Effect & other tools used to create videos ,animations etc." )

                }

                Spacer(modifier = Modifier.height(6.dp))



            }
        }

        Button(
            onClick =
            { navController.navigate(ROUTE_MIT) {
                    popUpTo(ROUTE_MIT) { inclusive = true } }
            },
            modifier = Modifier
                .width(200.dp)
                .padding(start = 80.dp),

            colors = ButtonDefaults.buttonColors(Color(0XFF0096FF)),
            shape = RoundedCornerShape(15.dp)
        )


        {

            Text(text = "Apply Now")
        }








    }
}




}



@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    MitScreen(rememberNavController())

}


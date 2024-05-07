package net.ezra.ui.evening

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.R
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.navigation.ROUTE_SIGNUP

@Composable
fun EveningScreen(navController: NavHostController) {

LazyColumn {
    item {
       Column (
           modifier = Modifier
               .fillMaxHeight()
               .fillMaxSize()
               .fillMaxWidth()
               .padding(start = 15.dp)
       ){
          Image(painter =
          painterResource(id = R.drawable.royalperfume),
              contentDescription = "",
              modifier = Modifier
                  .width(100.dp)
                  .height(100.dp)
          )



           
           
           OutlinedButton(onClick =
           { navController.navigate(ROUTE_SIGNUP) {
               popUpTo(ROUTE_EVENING) { inclusive = true }
           } },
               shape = RoundedCornerShape(15.dp)
           )


           {
               Text(text = "Sign up")
           }

           OutlinedButton(
               onClick =
               { navController.navigate(ROUTE_MIT) {
                       popUpTo(ROUTE_EVENING) { inclusive = true } }
               },
               modifier = Modifier
                   .width(200.dp),
               shape = RoundedCornerShape(15.dp)
           )

           {
               Text(text = "Details")
           }










       }




    }
}

}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    EveningScreen(rememberNavController())
}


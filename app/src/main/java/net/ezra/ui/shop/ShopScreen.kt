
package net.ezra.ui.shop

import android.content.res.Configuration
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_MIT


@Composable
fun ShopScreen(navController: NavHostController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(Color(0xFFFFB6C1
                ))

            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(16.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.netflix),
                        contentDescription = "Netflix Logo",
                        modifier = Modifier.size(50.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp))



                    Column {

                        Text(text = "App Designer",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 8.dp))


                        Text(text = "Netflix",
                            color = Color.Black,

                            modifier = Modifier
                                .padding(top = 8.dp)
                        )

                    }
                    Spacer(modifier = Modifier.weight(1f))



                    Text(
                        text = "$70/hr",
                        fontWeight = FontWeight.Bold,

                        modifier = Modifier
                            .padding(start = 120.dp, top = 5.dp)
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))

                Canvas(modifier = Modifier.fillMaxSize()) {
                    drawLine(
                        color = Color.Gray,
                        start = Offset(0f, size.height / 2),
                        end = Offset(size.width, size.height / 2),
                        strokeWidth = 1.dp.toPx()
                    )
                }


                Row(

                    modifier = Modifier.fillMaxWidth()

                ) {
                  Icon(imageVector = Icons.Default.Person,
                      contentDescription = "",
                      modifier = Modifier
                          .size(50.dp)
                      )


                    Button(
                        onClick = {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_MIT) { inclusive = true }
                            }
                        },
                        modifier = Modifier
                            .width(280.dp)
                            .height(47.dp)
                            .padding(start = 160.dp, top = 8.dp),

                        colors =ButtonDefaults.buttonColors(Color(0xFF000000)),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text(text = "View Job")
                    }
                }
            }
        }
    }
}
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreview() {
    ShopScreen(navController = rememberNavController())
}

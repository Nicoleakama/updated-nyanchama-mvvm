
package net.ezra.ui.contact


import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TextFieldDefaults.textFieldColors
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContactScreen(navController: NavHostController)
{


    LazyColumn(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        item {
            Column {
                Row {
                    
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Explore !",
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.Black,
                        fontSize = 25.sp,
                        modifier = Modifier
                            .padding(start = 20.dp)
                    )
                }
                Row {
                    Text(
                        text = "Find the best job for you",
                        fontSize = 10.sp,
                        color = Color.Gray,
                        modifier = Modifier
                            .padding(start = 20.dp)
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    var text by remember {
                        mutableStateOf("")
                    }
                    TextField(value = text,
                        onValueChange = {text = it} ,
                        placeholder = { Text(text = "Search Categories")},
                        leadingIcon = {
                            Icon(imageVector = Icons.Default.Search,
                                contentDescription ="search icon" ,
                                tint = Color.LightGray)},

                        modifier= Modifier
                            .clickable {}
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp)
                            .background(Color.LightGray)
                        ,
                        colors = textFieldColors(
                            focusedTextColor = Color.Black,
                            unfocusedPlaceholderColor = Color.Black,
                            cursorColor = Color.Black,
                           )
                    )

                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                )

                {
                    Text(
                        text = "Recommended",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 20.dp)
                    )

                    Spacer(modifier = Modifier.weight(1f))


                    Text(
                        text = "See all",
                        color = Color.Gray,
                        fontSize = 20.sp
                    )


                }

                LazyRow {
                    item {
                        Row {
                            Card(
                                modifier = Modifier
                                    .padding(start = 20.dp)
                                    .width(100.dp)
                                    .height(115.dp),
                                colors = CardDefaults.cardColors(Color(0XFF000000)),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                ) {
                                    Text(
                                        text = "Full Time",
                                        color = Color.White,
                                        fontSize = 10.sp,
                                        modifier = Modifier
                                            .padding(start = 50.dp, top = 8.dp)
                                    )
                                }
                                Column(
                                    modifier = Modifier
                                        .fillMaxHeight()
                                        .fillMaxWidth()
                                ) {
                                    Image(
                                        painter =
                                        painterResource(id = R.drawable.netflix),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .width(30.dp)
                                            .height(25.dp)
                                            .padding(start = 10.dp),
                                        Alignment.Center
                                    )

                                    Spacer(modifier = Modifier.height(10.dp))


                                    Text(
                                        text = "Netflix",
                                        color = Color.White,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier
                                            .padding(start = 10.dp)
                                    )

                                    Spacer(modifier = Modifier.height(8.dp))

                                    Text(
                                        text = "$50.00/hr",
                                        color = Color.White,
                                        modifier = Modifier
                                            .padding(start = 10.dp)
                                    )


                                    Spacer(modifier = Modifier.height(8.dp))



                                    Text(
                                        text = "Product Designer",
                                        color = Color.Gray,
                                        fontSize = 10.sp,
                                        modifier = Modifier
                                            .padding(start = 10.dp)
                                    )

                                }
                            }
                            Card(
                                modifier = Modifier
                                    .padding(start = 20.dp)
                                    .width(100.dp)
                                    .height(115.dp),
                                colors = CardDefaults.cardColors(Color(0XFF40E0D0)),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                ) {
                                    Text(
                                        text = "Full Time",
                                        color = Color.White,
                                        fontSize = 10.sp,
                                        modifier = Modifier
                                            .padding(start = 50.dp, top = 8.dp)
                                    )
                                }
                                Column(
                                    modifier = Modifier
                                        .fillMaxHeight()
                                        .fillMaxWidth()
                                ) {
                                    Image(
                                        painter =
                                        painterResource(id = R.drawable.slack),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .width(30.dp)
                                            .height(25.dp)
                                            .padding(start = 10.dp),
                                        Alignment.Center
                                    )

                                    Spacer(modifier = Modifier.height(10.dp))


                                    Text(
                                        text = "Slack",
                                        color = Color.White,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier
                                            .padding(start = 10.dp)
                                    )

                                    Spacer(modifier = Modifier.height(8.dp))

                                    Text(
                                        text = "$50.00/hr",
                                        color = Color.White,
                                        modifier = Modifier
                                            .padding(start = 10.dp)
                                    )


                                    Spacer(modifier = Modifier.height(8.dp))



                                    Text(
                                        text = "UX Designer",
                                        color = Color.Gray,
                                        fontSize = 10.sp,
                                        modifier = Modifier
                                            .padding(start = 10.dp)
                                    )

                                }
                            }
                            Card(
                                modifier = Modifier
                                    .padding(start = 20.dp)
                                    .width(100.dp)
                                    .height(115.dp),
                                colors = CardDefaults.cardColors(Color(0XFFB6D0E2)),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                ) {
                                    Text(
                                        text = "Full Time",
                                        color = Color.White,
                                        fontSize = 10.sp,
                                        modifier = Modifier
                                            .padding(start = 50.dp, top = 8.dp)
                                    )
                                }

                                Column(
                                    modifier = Modifier
                                        .fillMaxHeight()
                                        .fillMaxWidth()
                                ) {
                                    Image(
                                        painter =
                                        painterResource(id = R.drawable.netflix),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .width(30.dp)
                                            .height(25.dp)
                                            .padding(start = 10.dp),
                                        Alignment.Center
                                    )

                                    Spacer(modifier = Modifier.height(10.dp))


                                    Text(
                                        text = "Netflix",
                                        color = Color.White,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier
                                            .padding(start = 10.dp)
                                    )

                                    Spacer(modifier = Modifier.height(8.dp))

                                    Text(
                                        text = "$50.00/hr",
                                        color = Color.White,
                                        modifier = Modifier
                                            .padding(start = 10.dp)
                                    )


                                    Spacer(modifier = Modifier.height(8.dp))



                                    Text(
                                        text = "Product Designer",
                                        color = Color.Gray,
                                        fontSize = 10.sp,
                                        modifier = Modifier
                                            .padding(start = 10.dp)
                                    )

                                }
                            }

                            Card(
                                modifier = Modifier
                                    .padding(start = 20.dp)
                                    .width(100.dp)
                                    .height(115.dp),
                                colors = CardDefaults.cardColors(Color(0XFFFFB6C1)),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                ) {
                                    Text(
                                        text = "Full Time",
                                        color = Color.White,
                                        fontSize = 10.sp,
                                        modifier = Modifier
                                            .padding(start = 50.dp, top = 8.dp)
                                    )
                                }
                                Column(
                                    modifier = Modifier
                                        .fillMaxHeight()
                                        .fillMaxWidth()
                                ) {
                                    Image(
                                        painter =
                                        painterResource(id = R.drawable.netflix),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .width(30.dp)
                                            .height(25.dp)
                                            .padding(start = 10.dp),
                                        Alignment.Center
                                    )

                                    Spacer(modifier = Modifier.height(10.dp))


                                    Text(
                                        text = "Netflix",
                                        color = Color.White,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier
                                            .padding(start = 10.dp)
                                    )

                                    Spacer(modifier = Modifier.height(8.dp))

                                    Text(
                                        text = "$50.00/hr",
                                        color = Color.White,
                                        modifier = Modifier
                                            .padding(start = 10.dp)
                                    )


                                    Spacer(modifier = Modifier.height(8.dp))



                                    Text(
                                        text = "Product Designer",
                                        color = Color.Gray,
                                        fontSize = 10.sp,
                                        modifier = Modifier
                                            .padding(start = 10.dp)
                                    )

                                }
                            }
                        }

                    }
                }
            }



            Row(
                modifier = Modifier
                    .fillMaxWidth()
            )

            {
                Text(
                    text = "Popular Agency",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(start = 20.dp)
                )

                Spacer(modifier = Modifier.weight(1f))


                Text(
                    text = "See all",
                    color = Color.Gray,
                    fontSize = 20.sp
                )


            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()

            ) {
                Card(
                    modifier = Modifier
                        .width(900.dp)
                        .height(80.dp)
                        .padding(10.dp),
                    colors = CardDefaults.cardColors(Color(0xFF87CEEB))

                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()

                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Image(
                                painter =
                                painterResource(id = R.drawable.google),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(40.dp)
                                    .height(40.dp)
                                    .padding(start = 10.dp, top = 15.dp)
                            )

                            Spacer(modifier = Modifier.width(30.dp))


                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                            ) {
                                Text(
                                    text = "Product Designer",
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .padding(top = 15.dp)
                                )

                                Spacer(modifier = Modifier.height(8.dp))

                                Text(
                                    text = "RonasIT",
                                    color = Color.Gray,


                                    )
                            }

                            Spacer(modifier = Modifier.width(20.dp))


                            Text(
                                text = "$70/hr",
                                modifier = Modifier
                                    .padding(start = 100.dp, top = 15.dp)
                            )
                        }

                    }

                }


            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()

            ) {
                Card(
                    modifier = Modifier
                        .width(900.dp)
                        .height(80.dp)
                        .padding(10.dp),
                    colors = CardDefaults.cardColors(Color(0XFFFFB6C1))

                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()

                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Image(
                                painter =
                                painterResource(id = R.drawable.slack),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(40.dp)
                                    .height(40.dp)
                                    .padding(start = 10.dp, top = 15.dp)
                            )

                            Spacer(modifier = Modifier.width(30.dp))


                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                            ) {
                                Text(
                                    text = "Product Designer",
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .padding(top = 15.dp)
                                )

                                Spacer(modifier = Modifier.height(8.dp))

                                Text(
                                    text = "RonasIT",
                                    color = Color.Gray,


                                    )
                            }

                            Spacer(modifier = Modifier.width(20.dp))


                            Text(
                                text = "$70/hr",
                                modifier = Modifier
                                    .padding(start = 100.dp, top = 15.dp)
                            )
                        }

                    }

                }


            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()

            ) {
                Card(
                    modifier = Modifier
                        .width(900.dp)
                        .height(80.dp)
                        .padding(10.dp),
                    colors = CardDefaults.cardColors(Color(0xFFFFD580))

                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()

                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Image(
                                painter =
                                painterResource(id = R.drawable.netflix),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(40.dp)
                                    .height(40.dp)
                                    .padding(start = 10.dp, top = 15.dp)
                            )

                            Spacer(modifier = Modifier.width(30.dp))


                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                            ) {
                                Text(
                                    text = "Product Designer",
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .padding(top = 15.dp)
                                )

                                Spacer(modifier = Modifier.height(8.dp))

                                Text(
                                    text = "RonasIT",
                                    color = Color.Gray,


                                    )
                            }

                            Spacer(modifier = Modifier.width(20.dp))


                            Text(
                                text = "$70/hr",
                                modifier = Modifier
                                    .padding(start = 100.dp, top = 15.dp)
                            )
                        }

                    }

                }


            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()

            ) {
                Card(
                    modifier = Modifier
                        .width(900.dp)
                        .height(80.dp)
                        .padding(10.dp),
                    colors = CardDefaults.cardColors(Color(0xFF90EE90))

                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()

                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Image(
                                painter =
                                painterResource(id = R.drawable.instagram),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(40.dp)
                                    .height(40.dp)
                                    .padding(start = 10.dp, top = 15.dp)
                            )

                            Spacer(modifier = Modifier.width(30.dp))


                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                            ) {
                                Text(
                                    text = "Product Designer",
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .padding(top = 15.dp)
                                )

                                Spacer(modifier = Modifier.height(8.dp))

                                Text(
                                    text = "RonasIT",
                                    color = Color.Gray,


                                    )
                            }

                            Spacer(modifier = Modifier.width(20.dp))


                            Text(
                                text = "$70/hr",
                                modifier = Modifier
                                    .padding(start = 100.dp, top = 15.dp)
                            )
                        }

                    }

                }


            }




            @Composable
            fun BottomBar(navController: NavHostController) {
                val selectedIndex = remember { mutableStateOf(0) }
                BottomNavigation(elevation = 10.dp) {
                    BottomNavigationItem(icon = {
                        Icon(imageVector = Icons.Default.Home,"")
                    },
                        label = { androidx.compose.material.Text(text = "Home") }, selected = (selectedIndex.value == 0), onClick = {
                            selectedIndex.value = 0
                        })
                    BottomNavigationItem(icon = {
                        Icon(imageVector = Icons.Default.Favorite,"")
                    },
                        label = { androidx.compose.material.Text(text = "Favorite") }, selected = (selectedIndex.value == 1), onClick = {
                            selectedIndex.value = 1
                        })
                    BottomNavigationItem(icon = {
                        Icon(imageVector = Icons.Default.Person, "")
                    },
                        label = { androidx.compose.material.Text(text = "Profile") }, selected = (selectedIndex.value == 2), onClick = {
                            selectedIndex.value = 2
                        })
                }
            }

























        }

    }

}



    @Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight(){
    ContactScreen(rememberNavController())
        ClickableSearchBar{}
        BottomBar(navController = rememberNavController()){}
    }

@Composable
fun BottomBar(navController: NavHostController, content: @Composable () -> Unit) {
    TODO("Not yet implemented")
}


@Composable
fun ClickableSearchBar(onSearchClicked: ((String) -> Unit)){

}


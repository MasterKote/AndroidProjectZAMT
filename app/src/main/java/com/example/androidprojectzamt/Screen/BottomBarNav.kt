package com.example.androidprojectzamt.Screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.*
import com.example.androidprojectzamt.R
import com.example.androidprojectzamt.ui.theme.bottombarnotactive
import com.example.androidprojectzamt.ui.theme.bottomnavactive
import com.example.androidprojectzamt.ui.theme.whitecolor

enum class BottomDestinations(
    val label: String,
    val iconId: Int,
    val route: Any
) {
    Tests("Тесты", R.drawable.test, TestsScreen),
    Results("Результаты", R.drawable.results, ResultsScreen),
    Support("Поддержка", R.drawable.support, SupportScreen),
    Profile("Профиль", R.drawable.profile, ProfileScreen)
}

@Composable
fun BottomBarNav() {
    val navController = rememberNavController()

    val startDestination = BottomDestinations.Tests
    var selectedIndex by rememberSaveable { mutableIntStateOf(startDestination.ordinal) }

    val navColors = NavigationBarItemDefaults.colors(
        selectedIconColor = bottomnavactive,
        selectedTextColor = bottomnavactive,
        unselectedIconColor = bottombarnotactive,
        unselectedTextColor = bottombarnotactive,
        indicatorColor = Color.Transparent
    )

    Scaffold(
        modifier = Modifier,
        bottomBar = {
            NavigationBar(containerColor = whitecolor, windowInsets = NavigationBarDefaults.windowInsets) {
                BottomDestinations.entries.forEachIndexed { index, destination ->
                    NavigationBarItem(
                        selected = selectedIndex == index,
                        onClick = {
                            navController.navigate(route = destination.route)
                            selectedIndex = index
                        },
                        icon = {
                            Icon(
                                ImageVector.vectorResource(destination.iconId),
                                contentDescription = destination.label
                            )
                        },
                        label = { Text(destination.label) },
                        colors = navColors
                    )
                }
            }
        }
    ) { contentPadding ->
        NavHost(
            navController = navController,
            startDestination = TestsScreen,
            modifier = Modifier.padding(contentPadding)
        ) {
            composable<TestsScreen> { TestsBottomBar() }
            composable<ResultsScreen> { ResultsBottomBar() }
            composable<SupportScreen> { SupportBottomBar() }
            composable<ProfileScreen> { ProfileBottomBar() }
        }
    }
}

@Preview
@Composable
private fun BottomBarNavPrev() {
    BottomBarNav()
}
package com.example.androidprojectzamt.Screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.androidprojectzamt.R
import androidx.navigation.NavDestination.Companion.hasRoute
import com.example.androidprojectzamt.ui.theme.bottombarnotactive
import com.example.androidprojectzamt.ui.theme.bottomnavactive
import com.example.androidprojectzamt.ui.theme.whitecolor

@Composable
fun BottomBarNav() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    val navColors = NavigationBarItemDefaults.colors(
        selectedIconColor = bottomnavactive,
        selectedTextColor = bottomnavactive,
        unselectedIconColor = bottombarnotactive,
        unselectedTextColor = bottombarnotactive,
        indicatorColor = Color.Transparent
    )

    Scaffold(
        bottomBar = {
            NavigationBar(containerColor = whitecolor) {
                NavigationBarItem(
                    selected = currentDestination?.hasRoute<TestsScreen>() == true,
                    onClick = { navController.navigate(TestsScreen) { launchSingleTop = true } },
                    label = { Text("Тесты") },
                    icon = { Icon(ImageVector.vectorResource(R.drawable.test), null) },
                    colors = navColors
                )

                NavigationBarItem(
                    selected = currentDestination?.hasRoute<ResultsScreen>() == true,
                    onClick = { navController.navigate(ResultsScreen) { launchSingleTop = true } },
                    label = { Text("Итоги") },
                    icon = { Icon(ImageVector.vectorResource(R.drawable.results), null) },
                    colors = navColors
                )

                NavigationBarItem(
                    selected = currentDestination?.hasRoute<SupportScreen>() == true,
                    onClick = { navController.navigate(SupportScreen) { launchSingleTop = true } },
                    label = { Text("Помощь") },
                    icon = { Icon(ImageVector.vectorResource(R.drawable.support), null) },
                    colors = navColors
                )

                NavigationBarItem(
                    selected = currentDestination?.hasRoute<ProfileScreen>() == true,
                    onClick = { navController.navigate(ProfileScreen) { launchSingleTop = true } },
                    label = { Text("Профиль") },
                    icon = { Icon(ImageVector.vectorResource(R.drawable.profile), null) },
                    colors = navColors
                )
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = TestsScreen,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable<TestsScreen> { TestsBottomBar() }
            composable<ResultsScreen> { ResultsBottomBar() }
            composable<SupportScreen> { SupportBottomBar() }
            composable<ProfileScreen> { ProfileBottomBar() }
        }
    }
}

@Composable
fun Column(content: @Composable () -> Unit) {
    TODO("Not yet implemented")
}

@Preview
@Composable
private fun BottomBarNavPrev() {
    BottomBarNav()
}
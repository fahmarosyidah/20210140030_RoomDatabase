package com.example.roomsiswa.navigasi

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.roomsiswa.ui.theme.halaman.DestinasiEntry
import com.example.roomsiswa.ui.theme.halaman.DestinasiHome
import com.example.roomsiswa.ui.theme.halaman.EntrySiswaScreen
import com.example.roomsiswa.ui.theme.halaman.HomeScreen

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier
    ){
        composable(DestinasiHome.route){
            HomeScreen(
                navigateToItemEntry = { navController.navigate(DestinasiEntry.route) }
            )
        }
        composable(DestinasiHome.route){
            EntrySiswaScreen(navigateBack = { navController.popBackStack() })
        }
    }
}
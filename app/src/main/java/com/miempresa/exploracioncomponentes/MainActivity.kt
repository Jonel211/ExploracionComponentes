package com.miempresa.exploracioncomponentes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.miempresa.exploracioncomponentes.ui.theme.ExploracionComponentesTheme

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Switch
import androidx.compose.material3.Slider
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.ui.res.painterResource
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Divider
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Button
import androidx.compose.runtime.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.*
import androidx.compose.material3.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.runtime.*
import androidx.compose.material3.*

import androidx.compose.foundation.pager.*
import androidx.compose.foundation.pager.*
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.Alignment




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExploracionComponentesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExploracionComponentesTheme {
        Greeting("Aron")
    }
}

//Componentes

//LazyColumn
@Composable
fun EjemploLazyColumn() {
    LazyColumn {
        items(5) { index ->
            Text(
                text = "Item #$index",
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLazyColumn() {
    EjemploLazyColumn()
}

//Card
@Composable
fun EjemploCard() {
    Card(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = "Soy un Card",
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCard() {
    EjemploCard()
}

@Composable
fun EjemploCheckbox() {
    var checked = true

    Checkbox(
        checked = checked,
        onCheckedChange = { checked = it }
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewCheckbox() {
    EjemploCheckbox()
}

@Composable
fun EjemploSwitch() {
    var encendido = true

    Switch(
        checked = encendido,
        onCheckedChange = { encendido = it }
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewSwitch() {
    EjemploSwitch()
}

@Composable
fun EjemploSlider() {
    var valor = 0.5f

    Slider(
        value = valor,
        onValueChange = { valor = it }
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewSlider() {
    EjemploSlider()
}

//Image
@Composable
fun EjemploImage() {
    Image(
        painter = painterResource(id = R.drawable.program),
        contentDescription = "Imagen ejemplo",
        modifier = Modifier.size(120.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewImage() {
    EjemploImage()
}

//Icon
@Composable
fun EjemploIcon() {
    Icon(
        imageVector = Icons.Default.Favorite,
        contentDescription = "Icono",
        modifier = Modifier.size(50.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewIcon() {
    EjemploIcon()
}

//FLOATING ACTION BUTTON
@Composable
fun EjemploFAB() {
    FloatingActionButton(onClick = { }) {
        Icon(Icons.Default.Add, contentDescription = "Agregar")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewFAB() {
    EjemploFAB()
}

//PROGRESS BAR
@Composable
fun EjemploProgress() {
    CircularProgressIndicator()
}

@Preview(showBackground = true)
@Composable
fun PreviewProgress() {
    EjemploProgress()
}

//ALERT DIALOG
@Composable
fun EjemploDialog() {
    var mostrar by remember { mutableStateOf(true) }

    if (mostrar) {
        AlertDialog(
            onDismissRequest = { mostrar = false },
            confirmButton = {
                Button(onClick = { mostrar = false }) {
                    Text("OK")
                }
            },
            title = { Text("Alerta") },
            text = { Text("Este es un AlertDialog") }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDialog() {
    EjemploDialog()
}

//DIVIDER
@Composable
fun EjemploDivider() {
    Column {
        Text("Arriba")
        Divider()
        Text("Abajo")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDivider() {
    EjemploDivider()
}

    //TOP APP BAR
    @OptIn(ExperimentalMaterial3Api::class)
@Composable
    fun EjemploTopBar() {
        TopAppBar(
            title = { Text("Mi App") }
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun PreviewTopBar() {
        EjemploTopBar()
    }

//SNACKBAR
@Composable
fun EjemploSnackbar() {
    Snackbar {
        Text("Este es un mensaje Snackbar")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSnackbar() {
    EjemploSnackbar()
}

//Lazy Row
@Composable
fun EjemploLazyRow() {
    LazyRow {
        items(5) { index ->
            Text(
                text = "Item $index",
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

//Grid
@Composable
fun EjemploGrid() {
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(6) { index ->
            Text("Item $index", modifier = Modifier.padding(16.dp))
        }
    }
}

//RadioButton
@Preview(showBackground = true)
@Composable
fun PreviewRadioButton() {
    ExploracionComponentesTheme {
        EjemploRadioButton()
    }
}

@Composable
fun EjemploRadioButton() {
    var selected by remember { mutableStateOf(false) }

    RadioButton(
        selected = selected,
        onClick = { selected = !selected }
    )
}

//Spacer
@Preview(showBackground = true)
@Composable
fun PreviewSpacer() {
    ExploracionComponentesTheme {
        EjemploSpacer()
    }
}

@Composable
fun EjemploSpacer() {
    Column {
        Text("Arriba")
        Spacer(modifier = Modifier.height(16.dp))
        Text("Abajo")
    }
}

//OutlinedTextField
@Preview(showBackground = true)
@Composable
fun PreviewTextField() {
    ExploracionComponentesTheme {
        EjemploOutlinedTextField()
    }
}

@Composable
fun EjemploOutlinedTextField() {
    var texto by remember { mutableStateOf("") }

    OutlinedTextField(
        value = texto,
        onValueChange = { texto = it },
        label = { Text("Escribe aquí") }
    )
}

//DropdownMenu
@Preview(showBackground = true)
@Composable
fun PreviewDropdown() {
    ExploracionComponentesTheme {
        EjemploDropDownMenu()
    }
}

@Composable
fun EjemploDropDownMenu() {
    var expanded by remember { mutableStateOf(false) }

    Box {
        Button(onClick = { expanded = true }) {
            Text("Abrir menú")
        }

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            DropdownMenuItem(
                text = { Text("Opción 1") },
                onClick = { expanded = false }
            )
        }
    }
}

//FlowRow
@OptIn(ExperimentalLayoutApi::class)
@Preview(showBackground = true)
@Composable
fun PreviewFlowRow() {
    ExploracionComponentesTheme {
        FlowRow {
            repeat(5) {
                Text("Item $it", modifier = Modifier.padding(8.dp))
            }
        }
    }
}

//Pager
@OptIn(ExperimentalFoundationApi::class)
@Preview(showBackground = true)
@Composable
fun PreviewPager() {
    ExploracionComponentesTheme {

        val pagerState = rememberPagerState(pageCount = { 3 })

        HorizontalPager(state = pagerState) { page ->
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text("Página $page")
            }
        }
    }
}

//NavigationRail
@Preview(showBackground = true)
@Composable
fun PreviewNavigationRail() {
    ExploracionComponentesTheme {

        var selected by remember { mutableStateOf(0) }

        NavigationRail {
            NavigationRailItem(
                selected = selected == 0,
                onClick = { selected = 0 },
                icon = { Icon(Icons.Default.Home, null) }
            )
            NavigationRailItem(
                selected = selected == 1,
                onClick = { selected = 1 },
                icon = { Icon(Icons.Default.Favorite, null) }
            )
        }
    }
}

// BottomNavigation
@Preview(showBackground = true)
@Composable
fun PreviewBottomNavigation() {
    ExploracionComponentesTheme {

        var selected by remember { mutableStateOf(0) }

        NavigationBar {
            NavigationBarItem(
                selected = selected == 0,
                onClick = { selected = 0 },
                icon = { Icon(Icons.Default.Home, null) }
            )
            NavigationBarItem(
                selected = selected == 1,
                onClick = { selected = 1 },
                icon = { Icon(Icons.Default.Favorite, null) }
            )
        }
    }
}

//TabRow
@Preview(showBackground = true)
@Composable
fun PreviewTabRow() {
    ExploracionComponentesTheme {

        var selectedTab by remember { mutableStateOf(0) }

        TabRow(selectedTabIndex = selectedTab) {
            Tab(
                selected = selectedTab == 0,
                onClick = { selectedTab = 0 },
                text = { Text("Tab 1") }
            )
            Tab(
                selected = selectedTab == 1,
                onClick = { selectedTab = 1 },
                text = { Text("Tab 2") }
            )
        }
    }
}

//Tooltip
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun PreviewTooltip() {
    ExploracionComponentesTheme {

        TooltipBox(
            positionProvider = TooltipDefaults.rememberPlainTooltipPositionProvider(),
            tooltip = { Text("Soy un Tooltip") },
            state = rememberTooltipState()
        ) {
            Button(onClick = {}) {
                Text("Hover aquí")
            }
        }
    }
}

//LazyVerticalGrid
@Preview(showBackground = true)
@Composable
fun PreviewLazyVerticalGrid() {
    ExploracionComponentesTheme {
        LazyVerticalGrid(columns = GridCells.Fixed(2)) {
            items(6) {
                Text("Item $it", modifier = Modifier.padding(8.dp))
            }
        }
    }
}

// Chip
@Preview(showBackground = true)
@Composable
fun PreviewChip() {
    ExploracionComponentesTheme {
        AssistChip(
            onClick = {},
            label = { Text("Chip") }
        )
    }
}

//Surface
@Preview(showBackground = true)
@Composable
fun PreviewSurface() {
    ExploracionComponentesTheme {
        Surface {
            Text("Soy Surface", modifier = Modifier.padding(16.dp))
        }
    }
}

//Scaffold
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun PreviewScaffold() {
    ExploracionComponentesTheme {
        Scaffold(
            topBar = {
                TopAppBar(title = { Text("Scaffold") })
            }
        ) { padding ->
            Text("Contenido", modifier = Modifier.padding(padding))
        }
    }
}

//LazyRow
@Preview(showBackground = true)
@Composable
fun PreviewLazyRow2() {
    ExploracionComponentesTheme {
        LazyRow {
            items(5) {
                Text("Item $it", modifier = Modifier.padding(8.dp))
            }
        }
    }
}

//Grid
@Preview(showBackground = true)
@Composable
fun PreviewGridSimple() {
    ExploracionComponentesTheme {
        LazyVerticalGrid(columns = GridCells.Fixed(3)) {
            items(6) {
                Text("G $it", modifier = Modifier.padding(8.dp))
            }
        }
    }
}

//FlowRow
@OptIn(ExperimentalLayoutApi::class)
@Preview(showBackground = true)
@Composable
fun PreviewFlowRow2() {
    ExploracionComponentesTheme {
        FlowRow {
            repeat(5) {
                Text("Item $it", modifier = Modifier.padding(8.dp))
            }
        }
    }
}

//FlowColumn
@OptIn(ExperimentalLayoutApi::class)
@Preview(showBackground = true)
@Composable
fun PreviewFlowColumn() {
    ExploracionComponentesTheme {
        EjemploFlowColumn()
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun EjemploFlowColumn() {
    FlowColumn(
        modifier = Modifier.padding(8.dp)
    ) {
        repeat(6) {
            Text("Item $it", modifier = Modifier.padding(8.dp))
        }
    }
}
package com.example.epayasscompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.twotone.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.epayasscompose.ui.theme.BlueFive
import com.example.epayasscompose.ui.theme.BlueFour
import com.example.epayasscompose.ui.theme.BlueSix
import com.example.epayasscompose.ui.theme.BlueThree
import com.example.epayasscompose.ui.theme.BlueTwo

@Composable
fun FindServiceScreen(modifier: Modifier = Modifier) {
	
	Column(
		modifier = modifier
			.background(BlueSix)
			.fillMaxSize()
			.systemBarsPadding()
		
	) {
		//App bar
		AppBar()
		//Search bar
		SearchBar()
		//Categories row
		Categories()
		HorizontalDivider(color = BlueTwo)
		//Services Grid
		Services()
	}
}

@Composable
fun AppBar(modifier: Modifier = Modifier) {
	Row(
		modifier = modifier
			.fillMaxWidth()
			.padding(Dimensions.semiMedium),
		verticalAlignment = Alignment.CenterVertically
	) {
		Icon(
			imageVector = Icons.Default.Close,
			contentDescription = null,
			tint = Color.White
		)
		Spacer(modifier = Modifier.weight(1f))
		Text(text = "Find a Service", color = Color.White, fontSize = 22.sp)
		Spacer(modifier = Modifier.weight(1f))
		Image(
			painter = painterResource(id = R.drawable.gh_flag),
			contentDescription = null,
			modifier = modifier
				.size(Dimensions.large)
				.clip(CircleShape),
			contentScale = ContentScale.Crop
		)
		Icon(
			imageVector = Icons.Default.KeyboardArrowDown,
			contentDescription = null,
			tint = Color.White
		)
	}
}

@Composable
fun SearchBar(modifier: Modifier = Modifier) {
	
	TextField(
		modifier = modifier
			.fillMaxWidth()
			.padding(horizontal = Dimensions.semiMedium),
		value = "",
		onValueChange = { },
		leadingIcon = {
			Icon(
				imageVector = Icons.TwoTone.Search,
				contentDescription = null,
				tint = Color.White.copy(0.5f)
			)
		},
		label = { Text(text = "Search Accounts", color = Color.White.copy(0.5f)) },
		shape = RoundedCornerShape(Dimensions.small),
		colors = TextFieldDefaults.colors(
			unfocusedContainerColor = BlueThree,
			unfocusedPlaceholderColor = Color.White,
			unfocusedIndicatorColor = Color.Transparent
		)
	)
}

@Composable
fun Categories(modifier: Modifier = Modifier) {
	LazyRow(
		horizontalArrangement = Arrangement.spacedBy(Dimensions.semiMedium),
		contentPadding = PaddingValues(Dimensions.semiMedium)
	) {
		items(categories) {
			CategoryItem(categories = it, modifier = modifier)
		}
	}
}

@Composable
fun CategoryItem(
	modifier: Modifier = Modifier,
	categories: Categories
) {
	Row(
		modifier = modifier
			.fillMaxWidth()
			.clip(RoundedCornerShape(50.dp))
			.background(BlueThree)
			.padding(Dimensions.medium)
			.padding(horizontal = Dimensions.small)
	) {
		if (categories.icon != null) {
			Image(painter = painterResource(id = categories.icon), contentDescription = null)
			Spacer(modifier = Modifier.width(Dimensions.small))
		}
		Text(text = categories.title.uppercase(), color = Color.White, fontSize = 16.sp)
	}
}

@Composable
fun Services(
	modifier: Modifier = Modifier
) {
	LazyVerticalGrid(
		columns = GridCells.Fixed(3),
		contentPadding = PaddingValues(Dimensions.semiMedium),
		horizontalArrangement = Arrangement.spacedBy(Dimensions.semiMedium),
		verticalArrangement = Arrangement.spacedBy(Dimensions.semiMedium),
		modifier = modifier.background(BlueFour)
	) {
		items(services){
			GridItems(services = it, modifier = modifier)
		}
	}
}

@Composable
fun GridItems(
	modifier: Modifier = Modifier,
	services: Services
) {
	Column(
		modifier = modifier
			.fillMaxWidth()
			.clip(RoundedCornerShape(Dimensions.small))
			.background(BlueFive)
			.padding(Dimensions.medium),
		horizontalAlignment = Alignment.CenterHorizontally
	) {
		Image(
			painter = painterResource(id = services.icon),
			contentDescription = null,
			modifier = modifier
				.clip(CircleShape)
				.size(Dimensions.extraLarge)
		)
		Spacer(modifier = Modifier.height(12.dp))
		Text(text = services.title, color = Color.White)
	}
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun Preview() {
	FindServiceScreen()
}
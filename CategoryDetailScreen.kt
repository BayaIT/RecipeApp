package com.example.recipeapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter

@Composable
fun CategoryDetailScreen(category: Category) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Заголовок категории
        Text(
            text = category.strCategory,
            textAlign = TextAlign.Center,
            style = androidx.compose.ui.text.TextStyle(fontSize = androidx.compose.ui.unit.TextUnit.Unspecified)
        )

        // Изображение категории
        Image(
            painter = rememberAsyncImagePainter(category.strCategoryThumb),
            contentDescription = "${category.strCategory} Thumbnail",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .wrapContentSize()
                .aspectRatio(1f)
        )

        // Описание категории
        Text(
            text = category.strCategoryDescription,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(top = 16.dp)
                .verticalScroll(rememberScrollState())
        )
    }
}
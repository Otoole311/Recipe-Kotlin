package com.example.recipeapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter


@Composable
fun CategoryScreenDetail(category: Category){

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text(text = category.strCategory, textAlign = TextAlign.Center)

        Image(
            painter = rememberAsyncImagePainter(category.strCategoryThumb),
            contentDescription = "${category.strCategory} Thumbnail",
            modifier = Modifier
                .wrapContentSize()
                .aspectRatio(1f)
        )

        Text(text = category.strCategoryDescription,
            textAlign = TextAlign.Justify,
            modifier = Modifier.verticalScroll(rememberScrollState())
        )
    }

}

@Preview(showBackground = true)
@Composable
fun CategoryDetailScreenPreview(){

    val previewCat: Category = Category("1",
        "Rice",
        "https://cdn.loveandlemons.com/wp-content/uploads/2020/03/rice.jpg",
        "Rice is a staple cereal grain widely consumed globally, especially in Asia. Derived from the grass species *Oryza sativa* and *Oryza glaberrima*, it comes in various types like long-grain, medium-grain, and short-grain, each suited to different culinary uses. Cultivated mainly in flooded fields called paddies, rice thrives in warm, water-rich environments. It is a key source of carbohydrates, providing energy and essential nutrients, with brown rice being more nutritious than white. Versatile in cooking, rice features prominently in numerous traditional dishes worldwide and holds significant cultural and economic importance." +
                "Rice is a staple cereal grain widely consumed globally, especially in Asia. Derived from the grass species *Oryza sativa* and *Oryza glaberrima*, it comes in various types like long-grain, medium-grain, and short-grain, each suited to different culinary uses. Cultivated mainly in flooded fields called paddies, rice thrives in warm, water-rich environments. It is a key source of carbohydrates, providing energy and essential nutrients, with brown rice being more nutritious than white. Versatile in cooking, rice features prominently in numerous traditional dishes worldwide and holds significant cultural and economic importance." +
                "Rice is a staple cereal grain widely consumed globally, especially in Asia. Derived from the grass species *Oryza sativa* and *Oryza glaberrima*, it comes in various types like long-grain, medium-grain, and short-grain, each suited to different culinary uses. Cultivated mainly in flooded fields called paddies, rice thrives in warm, water-rich environments. It is a key source of carbohydrates, providing energy and essential nutrients, with brown rice being more nutritious than white. Versatile in cooking, rice features prominently in numerous traditional dishes worldwide and holds significant cultural and economic importance.")

    CategoryScreenDetail(category = previewCat)

}
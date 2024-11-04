package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0L,
    @ColumnInfo(name="wish-title")
    val title : String="",
    @ColumnInfo(name="wish-desc")
    val description : String=""
)

object dummyWish{
    val wishList= listOf(
        Wish(title = "Google Watch 2", description = "An android watch"),
        Wish(title="A sci-fi book", description = "A science fiction book from any best seller"),
        Wish(title="Bean Bag", description = "A comfy bean bag to sit")

    )
}

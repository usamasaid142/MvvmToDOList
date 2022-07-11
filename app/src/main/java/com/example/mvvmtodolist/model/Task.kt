package com.example.mvvmtodolist.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.text.DateFormat

@Entity(tableName = "task")
@Parcelize
data class Task(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val important: Boolean = false,
    val completed: Boolean = false,
    val created: Long = System.currentTimeMillis()
) : Parcelable {

    val createddateformat:String
    get() = DateFormat.getDateTimeInstance().format(created)


}
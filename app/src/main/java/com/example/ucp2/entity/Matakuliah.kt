package com.example.ucp2.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "matakuliah")
class Matakuliah (
    @PrimaryKey
    val kode : String,
    val nama : String,
    val sks : String,
    val semester : String,
    val jenis : String,
    val dosenpengampu : String,

)
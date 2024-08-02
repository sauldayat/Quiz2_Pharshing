package com.example.football.model

import android.media.Image

data class ChildArea(
    val id: Int,
    val name: String,
    val countryCode: String,
    val flag: String?,
    val parentAreaId: Int,
    val parentArea: String,
    val Africa : Africa,
    val childArea: ChildArea,
)

data class Football    (
    val childAreas: List<ChildArea>
)

data class Africa(
    val id: Int,
    val name : String,
    val countryCode: String,
    val flag : Image,
    val parentAreaId : Int,
    val parentArea : String,
)

//data class Arameans(
//    val id: Int,
//    val name : String,
//    val countryCode: String,
//    val flag : Image,
//    val parentAreaId : Int,
//    val parentArea : String,
//)
//
//data class Asia(
//    val id: Int,
//    val name : String,
//    val countryCode: String,
//    val flag : Image,
//    val parentAreaId : Int,
//    val parentArea : String,
//)
//
//data class Darfur(
//    val id: Int,
//    val name : String,
//    val countryCode: String,
//    val flag : Image,
//    val parentAreaId : Int,
//    val parentArea : String,
//)
//
//data class Europe(
//    val id: Int,
//    val name : String,
//    val countryCode: String,
//    val flag : Image,
//    val parentAreaId : Int,
//    val parentArea : String,
//)
//
//data class America(
//    val id: Int,
//    val name : String,
//    val countryCode: String,
//    val flag : Image,
//    val parentAreaId : Int,
//    val parentArea : String,
//)
//
//data class Board(
//    val id: Int,
//    val name : String,
//    val countryCode: String,
//    val flag : Image,
//    val parentAreaId : Int,
//    val parentArea : String,
//)
//data class Occitania(
//    val id: Int,
//    val name : String,
//    val countryCode: String,
//    val flag : Image,
//    val parentAreaId : Int,
//    val parentArea : String,
//)
//
//data class Oceania(
//    val id: Int,
//    val name : String,
//    val countryCode: String,
//    val flag : Image,
//    val parentAreaId : Int,
//    val parentArea : String,
//)
//
//data class Padania(
//    val id: Int,
//    val name : String,
//    val countryCode: String,
//    val flag : Image,
//    val parentAreaId : Int,
//    val parentArea : String,
//)
//
//data class Provence(
//    val id: Int,
//    val name : String,
//    val countryCode: String,
//    val flag : Image,
//    val parentAreaId : Int,
//    val parentArea : String,
//)
//
//data class Raetia(
//    val id: Int,
//    val name : String,
//    val countryCode: String,
//    val flag : Image,
//    val parentAreaId : Int,
//    val parentArea : String,
//)
//
//data class Sapmi(
//    val id: Int,
//    val name : String,
//    val countryCode: String,
//    val flag : Image,
//    val parentAreaId : Int,
//    val parentArea : String,
//)
//
//data class SouthAme(
//    val id: Int,
//    val name : String,
//    val countryCode: String,
//    val flag : Image,
//    val parentAreaId : Int,
//    val parentArea : String,
//)
//data class SouthernCameroon(
//    val id: Int,
//    val name : String,
//    val countryCode: String,
//    val flag : Image,
//    val parentAreaId : Int,
//    val parentArea : String,
//)
//
//data class Tamil(
//    val id: Int,
//    val name : String,
//    val countryCode: String,
//    val flag : Image,
//    val parentAreaId : Int,
//    val parentArea : String,
//)
//
//data class TwoS(
//    val id: Int,
//    val name : String,
//    val countryCode: String,
//    val flag : Image,
//    val parentAreaId : Int,
//    val parentArea : String,
//)
//
//data class West(
//    val id: Int,
//    val name : String,
//    val countryCode: String,
//    val flag : Image,
//    val parentAreaId : Int,
//    val parentArea : String,
//)

data class Image(
    val url: String
)



package cc.shinichi.openyoureyesmvp.model.bean.home

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(
        @SerializedName("header") val header: Header? = Header(),
        @SerializedName("content") val content: Content? = Content(),
        @SerializedName("itemList") val itemList: List<Item?>? = listOf(),
        @SerializedName("dataType") val dataType: String? = "",
        @SerializedName("dynamicType") val dynamicType: String? = "",
        @SerializedName("user") val user: User? = User(),
        @SerializedName("mergeNickName") val mergeNickName: String? = "",
        @SerializedName("mergeSubTitle") val mergeSubTitle: String? = "",
        @SerializedName("merge") val merge: Boolean? = false,
        @SerializedName("createDate") val createDate: Long? = 0,
        @SerializedName("simpleVideo") val simpleVideo: SimpleVideo? = SimpleVideo(),
        @SerializedName("reply") val reply: Reply? = Reply(),
        @SerializedName("id") val id: Int? = 0,
        @SerializedName("text") val text: String? = "",
        @SerializedName("subTitle") val subTitle: String? = "",
        @SerializedName("image") val image: String? = "",
        @SerializedName("icon") val icon: String? = "",
        @SerializedName("iconType") val iconType: String? = "",
        @SerializedName("actionUrl") val actionUrl: String? = "",
        @SerializedName("title") val title: String? = "",
        @SerializedName("description") val description: String? = "",
        @SerializedName("library") val library: String? = "",
        @SerializedName("tags") val tags: List<Tag?>? = listOf(),
        @SerializedName("consumption") val consumption: Consumption? = Consumption(),
        @SerializedName("resourceType") val resourceType: String? = "",
        @SerializedName("slogan") val slogan: String? = "",
        @SerializedName("provider") val provider: Provider? = Provider(),
        @SerializedName("category") val category: String? = "",
        @SerializedName("author") val author: Author? = Author(),
        @SerializedName("cover") val cover: Cover? = Cover(),
        @SerializedName("playUrl") val playUrl: String? = "",
        @SerializedName("thumbPlayUrl") val thumbPlayUrl: String? = "",
        @SerializedName("duration") val duration: Int? = 0,
        @SerializedName("webUrl") val webUrl: WebUrl? = WebUrl(),
        @SerializedName("releaseTime") val releaseTime: Long? = 0,
        @SerializedName("playInfo") val playInfo: List<PlayInfo?>? = listOf(),
        @SerializedName("type") val type: String? = "",
        @SerializedName("titlePgc") val titlePgc: String? = "",
        @SerializedName("descriptionPgc") val descriptionPgc: String? = "",
        @SerializedName("remark") val remark: String? = "",
        @SerializedName("ifLimitVideo") val ifLimitVideo: Boolean? = false,
        @SerializedName("searchWeight") val searchWeight: Int? = 0,
        @SerializedName("idx") val idx: Int? = 0,
        @SerializedName("shareAdTrack") val shareAdTrack: String? = "",
        @SerializedName("favoriteAdTrack") val favoriteAdTrack: String? = "",
        @SerializedName("webAdTrack") val webAdTrack: String? = "",
        @SerializedName("date") val date: Long? = 0,
        @SerializedName("descriptionEditor") val descriptionEditor: String? = "",
        @SerializedName("collected") val collected: Boolean? = false,
        @SerializedName("played") val played: Boolean? = false,
        @SerializedName("briefCard") val briefCard: BriefCard? = BriefCard(),
        @SerializedName("lastViewTime") val lastViewTime: String? = ""
) : Parcelable
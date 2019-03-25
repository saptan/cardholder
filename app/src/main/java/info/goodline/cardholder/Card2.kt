package info.goodline.cardholder

import android.os.Parcel
import android.os.Parcelable
//import kotlinx.android.parcel.Parceler
//import kotlinx.android.parcel.Parcelize

//@Parcelize
class Card2 (val title: String?, val id: Int, val photo: String?) : Parcelable {

    constructor (`in`: Parcel): this (`in`.readString(),`in`.readInt(),`in`.readString() )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeInt(id)
        parcel.writeString(photo)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Card2> {
        override fun createFromParcel(parcel: Parcel): Card2 {
            return Card2(parcel)
        }

        override fun newArray(size: Int): Array<Card2?> {
            return arrayOfNulls(size)
        }
    }
}


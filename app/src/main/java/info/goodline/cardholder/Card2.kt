package info.goodline.cardholder

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parceler
import kotlinx.android.parcel.Parcelize

@Parcelize
class Card2 (val title: String?, val id: Int, val photo: String?) : Parcelable {

    constructor (`in`: Parcel): this (`in`.readString(),`in`.readInt(),`in`.readString() )

    companion object : Parceler<Card2> {

        override fun Card2.write(parcel: Parcel, flags: Int) {
            parcel.writeString(title)
            parcel.writeString(photo)
            parcel.writeInt(id)
        }

        override fun create(parcel: Parcel): Card2 {
            return Card2(parcel)
        }
    }

}
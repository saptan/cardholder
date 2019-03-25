package info.goodline.cardholder

import android.os.Parcel
import android.os.Parcelable


class Card2 (val title: String, val id: Int, val photo: String) : Parcelable {

    constructor (`in`: Parcel): this (`in`.readString(),id = `in`.readInt(),photo = `in`.readString() )

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(title)
        dest?.writeString(photo)
        dest?.writeInt(id)
    }

    override fun describeContents(): Int { return 0; }

    companion object CREATOR : Parcelable.Creator<Card2> {
        override fun createFromParcel(parcel: Parcel): Card2 {
            return Card2(parcel)
        }

        override fun newArray(size: Int): Array<Card2?> {
            return arrayOfNulls(size)
        }
    }

}
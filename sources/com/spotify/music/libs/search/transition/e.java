package com.spotify.music.libs.search.transition;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;

final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new a();

    static class a implements Parcelable.Creator<e> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public e createFromParcel(Parcel parcel) {
            return new e((Rect) parcel.readParcelable(l.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public e[] newArray(int i) {
            return new e[i];
        }
    }

    e(Rect rect, String str, String str2) {
        super(rect, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(c(), i);
        parcel.writeString(b());
        parcel.writeString(a());
    }
}

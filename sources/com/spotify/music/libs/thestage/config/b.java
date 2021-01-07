package com.spotify.music.libs.thestage.config;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new a();

    static class a implements Parcelable.Creator<b> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b((TheStageUri) Enum.valueOf(TheStageUri.class, parcel.readString()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    b(TheStageUri theStageUri) {
        super(theStageUri);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(b().name());
    }
}

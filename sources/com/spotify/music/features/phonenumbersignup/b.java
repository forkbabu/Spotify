package com.spotify.music.features.phonenumbersignup;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.libs.callingcode.json.CallingCode;

/* access modifiers changed from: package-private */
public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new a();

    static class a implements Parcelable.Creator<b> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b((CallingCode) parcel.readParcelable(c.class.getClassLoader()), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    b(CallingCode callingCode, String str) {
        super(callingCode, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(a(), i);
        parcel.writeString(c());
    }
}

package com.spotify.music.builtinauth.authenticator;

import android.os.Parcel;
import android.os.Parcelable;

public class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new a();
    public final boolean a;
    public final String b;
    public final String c;

    static class a implements Parcelable.Creator<e0> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public e0 createFromParcel(Parcel parcel) {
            return new e0(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public e0[] newArray(int i) {
            return new e0[i];
        }
    }

    protected e0(Parcel parcel) {
        this.a = parcel.readInt() != 0;
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public e0(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }
}

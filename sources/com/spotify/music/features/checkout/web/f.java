package com.spotify.music.features.checkout.web;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.music.libs.viewuri.ViewUris;

final class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new a();

    static class a implements Parcelable.Creator<f> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public f createFromParcel(Parcel parcel) {
            ViewUris.SubView subView = (ViewUris.SubView) Enum.valueOf(ViewUris.SubView.class, parcel.readString());
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            Uri uri = (Uri) parcel.readParcelable(i.class.getClassLoader());
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new f(subView, readString, uri, z, parcel.readString(), Integer.valueOf(parcel.readInt()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public f[] newArray(int i) {
            return new f[i];
        }
    }

    f(ViewUris.SubView subView, String str, Uri uri, boolean z, String str2, Integer num) {
        super(subView, str, uri, z, str2, num);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(f().name());
        if (g() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(g());
        }
        parcel.writeParcelable(h(), i);
        parcel.writeInt(e() ? 1 : 0);
        parcel.writeString(a());
        parcel.writeInt(b().intValue());
    }
}

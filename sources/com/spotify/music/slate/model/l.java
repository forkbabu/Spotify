package com.spotify.music.slate.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class l extends f {
    public static final Parcelable.Creator<l> CREATOR = new a();

    static class a implements Parcelable.Creator<l> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public l createFromParcel(Parcel parcel) {
            return new l((Uri) parcel.readParcelable(v.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public l[] newArray(int i) {
            return new l[i];
        }
    }

    l(Uri uri) {
        super(uri);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(a(), i);
    }
}

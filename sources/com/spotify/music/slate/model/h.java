package com.spotify.music.slate.model;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class h extends b {
    public static final Parcelable.Creator<h> CREATOR = new a();

    static class a implements Parcelable.Creator<h> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public h createFromParcel(Parcel parcel) {
            return new h((o) parcel.readParcelable(q.class.getClassLoader()), (n) parcel.readParcelable(q.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public h[] newArray(int i) {
            return new h[i];
        }
    }

    h(o oVar, n nVar) {
        super(oVar, nVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(f(), i);
        parcel.writeParcelable(b(), i);
    }
}

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.d;

public final class f extends d<f, b> {
    public static final Parcelable.Creator<f> CREATOR = new a();
    @Deprecated
    private final String p;
    @Deprecated
    private final String q;
    @Deprecated
    private final Uri r;
    private final String s;

    static class a implements Parcelable.Creator<f> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public f[] newArray(int i) {
            return new f[i];
        }
    }

    public static final class b extends d.a<f, b> {
        public f j() {
            return new f(this, null);
        }
    }

    f(b bVar, a aVar) {
        super(bVar);
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
    }

    @Override // com.facebook.share.model.d
    public int describeContents() {
        return 0;
    }

    @Deprecated
    public String h() {
        return this.p;
    }

    @Deprecated
    public String i() {
        return this.q;
    }

    @Deprecated
    public Uri j() {
        return this.r;
    }

    public String k() {
        return this.s;
    }

    @Override // com.facebook.share.model.d
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeParcelable(this.r, 0);
        parcel.writeString(this.s);
    }

    f(Parcel parcel) {
        super(parcel);
        this.p = parcel.readString();
        this.q = parcel.readString();
        this.r = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.s = parcel.readString();
    }
}

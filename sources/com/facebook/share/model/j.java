package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.d;

@Deprecated
public final class j extends d<j, b> {
    public static final Parcelable.Creator<j> CREATOR = new a();
    private final Uri p;
    private final h q;

    /* access modifiers changed from: package-private */
    public static class a implements Parcelable.Creator<j> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public j[] newArray(int i) {
            return new j[i];
        }
    }

    public static class b extends d.a<j, b> {
        private Uri g;
        private h h;

        public j l() {
            return new j(this, null);
        }

        public b m(h hVar) {
            this.h = hVar;
            return this;
        }

        public b n(Uri uri) {
            this.g = uri;
            return this;
        }
    }

    j(b bVar, a aVar) {
        super(bVar);
        this.p = bVar.g;
        this.q = bVar.h;
    }

    @Override // com.facebook.share.model.d
    public int describeContents() {
        return 0;
    }

    public h h() {
        return this.q;
    }

    public Uri i() {
        return this.p;
    }

    @Override // com.facebook.share.model.d
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.p, i);
        parcel.writeParcelable(this.q, i);
    }

    j(Parcel parcel) {
        super(parcel);
        this.p = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.q = (h) parcel.readParcelable(h.class.getClassLoader());
    }
}

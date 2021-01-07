package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.k;

public final class l extends d<l, Object> {
    public static final Parcelable.Creator<l> CREATOR = new a();
    private final k p;
    private final String q;

    static class a implements Parcelable.Creator<l> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public l[] newArray(int i) {
            return new l[i];
        }
    }

    l(Parcel parcel) {
        super(parcel);
        k.b bVar = new k.b();
        k kVar = (k) parcel.readParcelable(k.class.getClassLoader());
        if (kVar != null) {
            bVar.c(kVar);
            bVar.b("og:type", kVar.f());
        }
        this.p = new k(bVar, null);
        this.q = parcel.readString();
    }

    @Override // com.facebook.share.model.d
    public int describeContents() {
        return 0;
    }

    public k h() {
        return this.p;
    }

    public String i() {
        return this.q;
    }

    @Override // com.facebook.share.model.d
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.p, 0);
        parcel.writeString(this.q);
    }
}

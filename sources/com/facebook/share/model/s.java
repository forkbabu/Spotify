package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.o;
import com.facebook.share.model.r;

public final class s extends d<s, Object> implements Object {
    public static final Parcelable.Creator<s> CREATOR = new a();
    private final String p;
    private final String q;
    private final o r;
    private final r s;

    static class a implements Parcelable.Creator<s> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public s createFromParcel(Parcel parcel) {
            return new s(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public s[] newArray(int i) {
            return new s[i];
        }
    }

    s(Parcel parcel) {
        super(parcel);
        this.p = parcel.readString();
        this.q = parcel.readString();
        o.b j = new o.b().j((o) parcel.readParcelable(o.class.getClassLoader()));
        if (j.i() == null && j.h() == null) {
            this.r = null;
        } else {
            this.r = j.g();
        }
        this.s = new r(new r.b().d(parcel), null);
    }

    @Override // com.facebook.share.model.d
    public int describeContents() {
        return 0;
    }

    public String h() {
        return this.p;
    }

    public String i() {
        return this.q;
    }

    public o j() {
        return this.r;
    }

    public r k() {
        return this.s;
    }

    @Override // com.facebook.share.model.d
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeParcelable(this.r, 0);
        parcel.writeParcelable(this.s, 0);
    }
}

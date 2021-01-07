package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.a;
import com.facebook.share.model.b;

public class c extends d<c, Object> {
    public static final Parcelable.Creator<c> CREATOR = new a();
    private String p;
    private a q;
    private b r;

    static class a implements Parcelable.Creator<c> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public c[] newArray(int i) {
            return new c[i];
        }
    }

    c(Parcel parcel) {
        super(parcel);
        this.p = parcel.readString();
        a.b bVar = new a.b();
        bVar.b(parcel);
        this.q = new a(bVar, null);
        b.C0078b bVar2 = new b.C0078b();
        bVar2.b(parcel);
        this.r = new b(bVar2, null);
    }

    public a h() {
        return this.q;
    }

    public String i() {
        return this.p;
    }

    public b j() {
        return this.r;
    }

    @Override // com.facebook.share.model.d
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.p);
        parcel.writeParcelable(this.q, 0);
        parcel.writeParcelable(this.r, 0);
    }
}

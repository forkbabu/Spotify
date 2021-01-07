package com.spotify.mobile.android.service.media.browser.loaders.browse.model;

import android.os.Parcel;
import android.os.Parcelable;

public class a implements b, Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0185a();
    private final String a;
    private final String b;
    private final String c;
    private final xj1 f;

    /* renamed from: com.spotify.mobile.android.service.media.browser.loaders.browse.model.a$a  reason: collision with other inner class name */
    static class C0185a implements Parcelable.Creator<a> {
        C0185a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel.readString(), parcel.readString(), parcel.readString(), (xj1) gf0.n(parcel, xj1.CREATOR), null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    public a(String str, String str2, xj1 xj1) {
        this.a = str;
        this.b = str2;
        this.c = null;
        this.f = xj1;
    }

    public xj1 a() {
        return this.f;
    }

    public String b() {
        String str = this.b;
        return str != null ? str : "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.spotify.mobile.android.service.media.browser.loaders.browse.model.b
    public String getKey() {
        return this.a;
    }

    @Override // java.lang.Object
    public String toString() {
        String str = this.b;
        return str != null ? str : "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        gf0.v(parcel, this.f, i);
    }

    a(String str, String str2, String str3, xj1 xj1, C0185a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = xj1;
    }
}

package com.spotify.mobile.android.service.media.browser.loaders.browse.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class c implements b, Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();
    private final String a;
    private final String b;
    private final List<xj1> c;

    static class a implements Parcelable.Creator<c> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public c createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList arrayList = new ArrayList();
            parcel.readTypedList(arrayList, xj1.CREATOR);
            return new c(readString, readString2, arrayList);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public c[] newArray(int i) {
            return new c[i];
        }
    }

    public c(String str, String str2, List<xj1> list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public List<xj1> a() {
        return this.c;
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
        parcel.writeTypedList(this.c);
    }
}

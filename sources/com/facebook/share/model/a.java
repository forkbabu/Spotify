package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;

public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0077a();
    private final Bundle a;

    /* renamed from: com.facebook.share.model.a$a  reason: collision with other inner class name */
    static class C0077a implements Parcelable.Creator<a> {
        C0077a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    public static class b {
        private Bundle a = new Bundle();

        public b b(Parcel parcel) {
            a aVar = (a) parcel.readParcelable(a.class.getClassLoader());
            if (aVar != null) {
                this.a.putAll(aVar.a);
            }
            return this;
        }
    }

    a(b bVar, C0077a aVar) {
        this.a = bVar.a;
    }

    public Object b(String str) {
        return this.a.get(str);
    }

    public Set<String> c() {
        return this.a.keySet();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    a(Parcel parcel) {
        this.a = parcel.readBundle(a.class.getClassLoader());
    }
}

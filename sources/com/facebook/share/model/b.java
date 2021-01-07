package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;

public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    private final Bundle a;

    static class a implements Parcelable.Creator<b> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    /* renamed from: com.facebook.share.model.b$b  reason: collision with other inner class name */
    public static class C0078b {
        private Bundle a = new Bundle();

        public C0078b b(Parcel parcel) {
            b bVar = (b) parcel.readParcelable(b.class.getClassLoader());
            if (bVar != null) {
                this.a.putAll(bVar.a);
            }
            return this;
        }
    }

    b(C0078b bVar, a aVar) {
        this.a = bVar.a;
    }

    public Bitmap b(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof Bitmap) {
            return (Bitmap) obj;
        }
        return null;
    }

    public Uri c(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof Uri) {
            return (Uri) obj;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Set<String> e() {
        return this.a.keySet();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    b(Parcel parcel) {
        this.a = parcel.readBundle(b.class.getClassLoader());
    }
}

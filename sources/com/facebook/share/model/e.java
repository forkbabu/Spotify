package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();
    private final String a;

    /* access modifiers changed from: package-private */
    public static class a implements Parcelable.Creator<e> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public e[] newArray(int i) {
            return new e[i];
        }
    }

    public static class b {
        private String a;

        /* access modifiers changed from: package-private */
        public b b(Parcel parcel) {
            e eVar = (e) parcel.readParcelable(e.class.getClassLoader());
            if (eVar != null) {
                this.a = eVar.a();
            }
            return this;
        }
    }

    e(b bVar, a aVar) {
        this.a = bVar.a;
    }

    public String a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    e(Parcel parcel) {
        this.a = parcel.readString();
    }
}

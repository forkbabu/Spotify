package com.google.android.exoplayer2.offline;

import android.os.Parcel;
import android.os.Parcelable;

public final class x implements Comparable<x>, Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new a();
    public final int a;
    public final int b;
    public final int c;

    static class a implements Parcelable.Creator<x> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public x createFromParcel(Parcel parcel) {
            return new x(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public x[] newArray(int i) {
            return new x[i];
        }
    }

    public x(int i, int i2) {
        this.a = 0;
        this.b = i;
        this.c = i2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(x xVar) {
        x xVar2 = xVar;
        int i = this.a - xVar2.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - xVar2.b;
        return i2 == 0 ? this.c - xVar2.c : i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        if (this.a == xVar.a && this.b == xVar.b && this.c == xVar.c) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    @Override // java.lang.Object
    public String toString() {
        return this.a + "." + this.b + "." + this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public x(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    x(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }
}

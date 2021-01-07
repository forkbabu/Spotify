package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.g;
import java.util.Arrays;

public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new a();
    public final int a;
    private final d0[] b;
    private int c;

    static class a implements Parcelable.Creator<e0> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public e0 createFromParcel(Parcel parcel) {
            return new e0(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public e0[] newArray(int i) {
            return new e0[i];
        }
    }

    public e0(d0... d0VarArr) {
        g.m(d0VarArr.length > 0);
        this.b = d0VarArr;
        this.a = d0VarArr.length;
    }

    public d0 a(int i) {
        return this.b[i];
    }

    public int b(d0 d0Var) {
        int i = 0;
        while (true) {
            d0[] d0VarArr = this.b;
            if (i >= d0VarArr.length) {
                return -1;
            }
            if (d0Var == d0VarArr[i]) {
                return i;
            }
            i++;
        }
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
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.a != e0Var.a || !Arrays.equals(this.b, e0Var.b)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        if (this.c == 0) {
            this.c = 527 + Arrays.hashCode(this.b);
        }
        return this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        for (int i2 = 0; i2 < this.a; i2++) {
            parcel.writeParcelable(this.b[i2], 0);
        }
    }

    e0(Parcel parcel) {
        int readInt = parcel.readInt();
        this.a = readInt;
        this.b = new d0[readInt];
        for (int i = 0; i < this.a; i++) {
            this.b[i] = (d0) parcel.readParcelable(d0.class.getClassLoader());
        }
    }
}

package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new a();
    public static final f0 f = new f0(new e0[0]);
    public final int a;
    private final e0[] b;
    private int c;

    static class a implements Parcelable.Creator<f0> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public f0 createFromParcel(Parcel parcel) {
            return new f0(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public f0[] newArray(int i) {
            return new f0[i];
        }
    }

    public f0(e0... e0VarArr) {
        this.b = e0VarArr;
        this.a = e0VarArr.length;
    }

    public e0 a(int i) {
        return this.b[i];
    }

    public int b(e0 e0Var) {
        for (int i = 0; i < this.a; i++) {
            if (this.b[i] == e0Var) {
                return i;
            }
        }
        return -1;
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
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.a != f0Var.a || !Arrays.equals(this.b, f0Var.b)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        if (this.c == 0) {
            this.c = Arrays.hashCode(this.b);
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

    f0(Parcel parcel) {
        int readInt = parcel.readInt();
        this.a = readInt;
        this.b = new e0[readInt];
        for (int i = 0; i < this.a; i++) {
            this.b[i] = (e0) parcel.readParcelable(e0.class.getClassLoader());
        }
    }
}

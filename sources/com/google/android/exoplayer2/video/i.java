package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.f0;
import java.util.Arrays;

public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();
    public final int a;
    public final int b;
    public final int c;
    public final byte[] f;
    private int n;

    static class a implements Parcelable.Creator<i> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public i[] newArray(int i) {
            return new i[i];
        }
    }

    public i(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.f = bArr;
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
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.a == iVar.a && this.b == iVar.b && this.c == iVar.c && Arrays.equals(this.f, iVar.f)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        if (this.n == 0) {
            this.n = Arrays.hashCode(this.f) + ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31);
        }
        return this.n;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ColorInfo(");
        V0.append(this.a);
        V0.append(", ");
        V0.append(this.b);
        V0.append(", ");
        V0.append(this.c);
        V0.append(", ");
        return je.P0(V0, this.f != null, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        int i2 = this.f != null ? 1 : 0;
        int i3 = f0.a;
        parcel.writeInt(i2);
        byte[] bArr = this.f;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    i(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        int i = f0.a;
        this.f = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}

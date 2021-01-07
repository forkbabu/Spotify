package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: in  reason: default package */
public final class in extends on {
    public static final Parcelable.Creator<in> CREATOR = new a();
    public final byte[] b;

    /* renamed from: in$a */
    static class a implements Parcelable.Creator<in> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public in createFromParcel(Parcel parcel) {
            return new in(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public in[] newArray(int i) {
            return new in[i];
        }
    }

    public in(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || in.class != obj.getClass()) {
            return false;
        }
        in inVar = (in) obj;
        if (!this.a.equals(inVar.a) || !Arrays.equals(this.b, inVar.b)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(this.b) + je.Y0(this.a, 527, 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    in(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.exoplayer2.util.f0.a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in.<init>(android.os.Parcel):void");
    }
}

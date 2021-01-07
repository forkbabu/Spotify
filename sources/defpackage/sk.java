package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.f0;
import defpackage.um;
import java.util.Arrays;

/* renamed from: sk  reason: default package */
public final class sk implements um.b {
    public static final Parcelable.Creator<sk> CREATOR = new a();
    public final String a;
    public final byte[] b;
    public final int c;
    public final int f;

    /* renamed from: sk$a */
    static class a implements Parcelable.Creator<sk> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public sk createFromParcel(Parcel parcel) {
            return new sk(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public sk[] newArray(int i) {
            return new sk[i];
        }
    }

    public sk(String str, byte[] bArr, int i, int i2) {
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.f = i2;
    }

    @Override // defpackage.um.b
    public /* synthetic */ d0 O() {
        return vm.b(this);
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
        if (obj == null || sk.class != obj.getClass()) {
            return false;
        }
        sk skVar = (sk) obj;
        if (!this.a.equals(skVar.a) || !Arrays.equals(this.b, skVar.b) || this.c != skVar.c || this.f != skVar.f) {
            return false;
        }
        return true;
    }

    @Override // defpackage.um.b
    public /* synthetic */ byte[] f2() {
        return vm.a(this);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((Arrays.hashCode(this.b) + je.Y0(this.a, 527, 31)) * 31) + this.c) * 31) + this.f;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("mdta: key=");
        V0.append(this.a);
        return V0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b.length);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.f);
    }

    sk(Parcel parcel, a aVar) {
        String readString = parcel.readString();
        int i = f0.a;
        this.a = readString;
        byte[] bArr = new byte[parcel.readInt()];
        this.b = bArr;
        parcel.readByteArray(bArr);
        this.c = parcel.readInt();
        this.f = parcel.readInt();
    }
}

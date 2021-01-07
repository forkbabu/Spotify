package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.util.f0;
import defpackage.um;
import java.util.Arrays;

/* renamed from: bn  reason: default package */
public final class bn implements um.b {
    public static final Parcelable.Creator<bn> CREATOR = new a();
    private static final d0 p = d0.r(null, "application/id3", Long.MAX_VALUE);
    private static final d0 q = d0.r(null, "application/x-scte35", Long.MAX_VALUE);
    public final String a;
    public final String b;
    public final long c;
    public final long f;
    public final byte[] n;
    private int o;

    /* renamed from: bn$a */
    static class a implements Parcelable.Creator<bn> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public bn createFromParcel(Parcel parcel) {
            return new bn(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public bn[] newArray(int i) {
            return new bn[i];
        }
    }

    public bn(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.f = j2;
        this.n = bArr;
    }

    @Override // defpackage.um.b
    public d0 O() {
        String str = this.a;
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c2 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return q;
            case 1:
            case 2:
                return p;
            default:
                return null;
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
        if (obj == null || bn.class != obj.getClass()) {
            return false;
        }
        bn bnVar = (bn) obj;
        if (this.c != bnVar.c || this.f != bnVar.f || !f0.a(this.a, bnVar.a) || !f0.a(this.b, bnVar.b) || !Arrays.equals(this.n, bnVar.n)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.um.b
    public byte[] f2() {
        if (O() != null) {
            return this.n;
        }
        return null;
    }

    @Override // java.lang.Object
    public int hashCode() {
        if (this.o == 0) {
            String str = this.a;
            int i = 0;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            long j = this.c;
            long j2 = this.f;
            this.o = Arrays.hashCode(this.n) + ((((((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.o;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("EMSG: scheme=");
        V0.append(this.a);
        V0.append(", id=");
        V0.append(this.f);
        V0.append(", durationMs=");
        V0.append(this.c);
        V0.append(", value=");
        V0.append(this.b);
        return V0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.f);
        parcel.writeByteArray(this.n);
    }

    bn(Parcel parcel) {
        String readString = parcel.readString();
        int i = f0.a;
        this.a = readString;
        this.b = parcel.readString();
        this.c = parcel.readLong();
        this.f = parcel.readLong();
        this.n = parcel.createByteArray();
    }
}

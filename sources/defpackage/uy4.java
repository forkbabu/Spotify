package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;

/* renamed from: uy4  reason: default package */
public final class uy4 extends ty4 {
    public static final Parcelable.Creator CREATOR = new a();
    private final String a;
    private final String b;
    private final String c;
    private final String f;
    private final String n;
    private final boolean o;

    /* renamed from: uy4$a */
    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new uy4(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new uy4[i];
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uy4(String str, String str2, String str3, String str4, String str5, boolean z, int i) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? false : z);
    }

    public static uy4 a(uy4 uy4, String str, String str2, String str3, String str4, String str5, boolean z, int i) {
        String str6 = null;
        String str7 = (i & 1) != 0 ? uy4.a : null;
        String str8 = (i & 2) != 0 ? uy4.b : null;
        String str9 = (i & 4) != 0 ? uy4.c : null;
        String str10 = (i & 8) != 0 ? uy4.f : null;
        if ((i & 16) != 0) {
            str6 = uy4.n;
        }
        if ((i & 32) != 0) {
            z = uy4.o;
        }
        h.e(str7, "trackTitle");
        h.e(str8, "artist");
        h.e(str9, "imageUri");
        h.e(str10, "previewId");
        h.e(str6, "entityUri");
        return new uy4(str7, str8, str9, str10, str6, z);
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.n;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy4)) {
            return false;
        }
        uy4 uy4 = (uy4) obj;
        return h.a(this.a, uy4.a) && h.a(this.b, uy4.b) && h.a(this.c, uy4.c) && h.a(this.f, uy4.f) && h.a(this.n, uy4.n) && this.o == uy4.o;
    }

    public final boolean f() {
        return this.o;
    }

    public final String getImageUri() {
        return this.c;
    }

    public final String getPreviewId() {
        return this.f;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.n;
        if (str5 != null) {
            i = str5.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z = this.o;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Track(trackTitle=");
        V0.append(this.a);
        V0.append(", artist=");
        V0.append(this.b);
        V0.append(", imageUri=");
        V0.append(this.c);
        V0.append(", previewId=");
        V0.append(this.f);
        V0.append(", entityUri=");
        V0.append(this.n);
        V0.append(", isPlaying=");
        return je.P0(V0, this.o, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.f);
        parcel.writeString(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uy4(String str, String str2, String str3, String str4, String str5, boolean z) {
        super(null);
        h.e(str, "trackTitle");
        h.e(str2, "artist");
        h.e(str3, "imageUri");
        h.e(str4, "previewId");
        h.e(str5, "entityUri");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = str4;
        this.n = str5;
        this.o = z;
    }
}

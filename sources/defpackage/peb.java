package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;

/* renamed from: peb  reason: default package */
public final class peb implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final int a;
    private final int b;
    private final int c;
    private final int f;

    /* renamed from: peb$a */
    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new peb(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new peb[i];
        }
    }

    public peb(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.f = i4;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.c;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof peb)) {
            return false;
        }
        peb peb = (peb) obj;
        return this.a == peb.a && this.b == peb.b && this.c == peb.c && this.f == peb.f;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.f;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ColorPalette(backgroundColor=");
        V0.append(this.a);
        V0.append(", cardBackgroundColor=");
        V0.append(this.b);
        V0.append(", textColor=");
        V0.append(this.c);
        V0.append(", socialIconTextColor=");
        return je.B0(V0, this.f, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.f);
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;

/* renamed from: ane  reason: default package */
public final class ane implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final String a;
    private final boolean b;
    private final ane c;

    /* renamed from: ane$a */
    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new ane(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? (ane) ane.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ane[i];
        }
    }

    public ane(String str, boolean z, ane ane) {
        h.e(str, "key");
        this.a = str;
        this.b = z;
        this.c = ane;
    }

    public static ane b(ane ane, String str, boolean z, ane ane2, int i) {
        String str2 = (i & 1) != 0 ? ane.a : null;
        if ((i & 2) != 0) {
            z = ane.b;
        }
        if ((i & 4) != 0) {
            ane2 = ane.c;
        }
        ane.getClass();
        h.e(str2, "key");
        return new ane(str2, z, ane2);
    }

    public final ane a(boolean z) {
        ane ane = this.c;
        return b(this, null, z, ane != null ? ane.a(z) : null, 1);
    }

    public final String c() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ane)) {
            return false;
        }
        ane ane = (ane) obj;
        return h.a(this.a, ane.a) && this.b == ane.b && h.a(this.c, ane.c);
    }

    public final ane f() {
        return this.c;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        ane ane = this.c;
        if (ane != null) {
            i = ane.hashCode();
        }
        return i5 + i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("SortOrder(key=");
        V0.append(this.a);
        V0.append(", reversed=");
        V0.append(this.b);
        V0.append(", secondary=");
        V0.append(this.c);
        V0.append(")");
        return V0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        ane ane = this.c;
        if (ane != null) {
            parcel.writeInt(1);
            ane.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ane(String str, boolean z, ane ane, int i) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : ane);
    }
}

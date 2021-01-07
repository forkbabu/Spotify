package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.h;

/* renamed from: qxd  reason: default package */
public final class qxd implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    private final int a;
    private final int b;

    /* renamed from: qxd$a */
    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new qxd(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new qxd[i];
        }
    }

    public qxd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
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
        if (!(obj instanceof qxd)) {
            return false;
        }
        qxd qxd = (qxd) obj;
        return this.a == qxd.a && this.b == qxd.b;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Range(start=");
        V0.append(this.a);
        V0.append(", length=");
        return je.B0(V0, this.b, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "parcel");
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}

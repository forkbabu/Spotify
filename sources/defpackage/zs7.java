package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: zs7  reason: default package */
final class zs7 extends ts7 {
    public static final Parcelable.Creator<zs7> CREATOR = new a();

    /* renamed from: zs7$a */
    static class a implements Parcelable.Creator<zs7> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public zs7 createFromParcel(Parcel parcel) {
            boolean z = false;
            boolean z2 = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            return new zs7(z2, z, parcel.readInt(), parcel.readInt());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public zs7[] newArray(int i) {
            return new zs7[i];
        }
    }

    zs7(boolean z, boolean z2, int i, int i2) {
        super(z, z2, i, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(e() ? 1 : 0);
        parcel.writeInt(b() ? 1 : 0);
        parcel.writeInt(c());
        parcel.writeInt(f());
    }
}

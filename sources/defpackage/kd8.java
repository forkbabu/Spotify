package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: kd8  reason: default package */
public final class kd8 extends ed8 {
    public static final Parcelable.Creator<kd8> CREATOR = new a();

    /* renamed from: kd8$a */
    static class a implements Parcelable.Creator<kd8> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public kd8 createFromParcel(Parcel parcel) {
            boolean z = false;
            boolean z2 = parcel.readInt() == 1;
            boolean z3 = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            return new kd8(z2, z3, z);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public kd8[] newArray(int i) {
            return new kd8[i];
        }
    }

    kd8(boolean z, boolean z2, boolean z3) {
        super(z, z2, z3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(c() ? 1 : 0);
        parcel.writeInt(a() ? 1 : 0);
        parcel.writeInt(b() ? 1 : 0);
    }
}

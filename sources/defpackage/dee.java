package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: dee  reason: default package */
public final class dee extends lbe {
    public static final Parcelable.Creator<dee> CREATOR = new a();

    /* renamed from: dee$a */
    static class a implements Parcelable.Creator<dee> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public dee createFromParcel(Parcel parcel) {
            return new dee(parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public dee[] newArray(int i) {
            return new dee[i];
        }
    }

    dee(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str) {
        super(z, z2, z3, z4, z5, z6, z7, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(b() ? 1 : 0);
        parcel.writeInt(e() ? 1 : 0);
        parcel.writeInt(c() ? 1 : 0);
        parcel.writeInt(i() ? 1 : 0);
        parcel.writeInt(j() ? 1 : 0);
        parcel.writeInt(l() ? 1 : 0);
        parcel.writeInt(k() ? 1 : 0);
        parcel.writeString(f());
    }
}

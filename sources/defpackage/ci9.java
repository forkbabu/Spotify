package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.di9;

/* renamed from: ci9  reason: default package */
final class ci9 extends uh9 {
    public static final Parcelable.Creator<ci9> CREATOR = new a();

    /* renamed from: ci9$a */
    static class a implements Parcelable.Creator<ci9> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ci9 createFromParcel(Parcel parcel) {
            ane ane = (ane) parcel.readParcelable(di9.d.class.getClassLoader());
            int readInt = parcel.readInt();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new ci9(ane, readInt, z);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ci9[] newArray(int i) {
            return new ci9[i];
        }
    }

    ci9(ane ane, int i, boolean z) {
        super(ane, i, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(c(), i);
        parcel.writeInt(e());
        parcel.writeInt(b() ? 1 : 0);
    }
}

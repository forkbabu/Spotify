package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o62  reason: default package */
final class o62 extends m62 {
    public static final Parcelable.Creator<o62> CREATOR = new a();

    /* renamed from: o62$a */
    static class a implements Parcelable.Creator<o62> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public o62 createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new o62(readString, readString2, z, parcel.readInt());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public o62[] newArray(int i) {
            return new o62[i];
        }
    }

    o62(String str, String str2, boolean z, int i) {
        super(str, str2, z, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(c());
        parcel.writeString(b());
        parcel.writeInt(e() ? 1 : 0);
        parcel.writeInt(f());
    }
}

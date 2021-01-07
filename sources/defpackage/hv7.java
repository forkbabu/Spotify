package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: hv7  reason: default package */
public final class hv7 extends bv7 {
    public static final Parcelable.Creator<hv7> CREATOR = new a();

    /* renamed from: hv7$a */
    static class a implements Parcelable.Creator<hv7> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public hv7 createFromParcel(Parcel parcel) {
            return new hv7(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 1);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public hv7[] newArray(int i) {
            return new hv7[i];
        }
    }

    hv7(int i, String str, String str2, String str3, boolean z) {
        super(i, str, str2, str3, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(f());
        parcel.writeString(e());
        parcel.writeString(a());
        parcel.writeString(g());
        parcel.writeInt(c() ? 1 : 0);
    }
}

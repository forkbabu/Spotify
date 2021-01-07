package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: eb9  reason: default package */
public final class eb9 extends ya9 {
    public static final Parcelable.Creator<eb9> CREATOR = new a();

    /* renamed from: eb9$a */
    static class a implements Parcelable.Creator<eb9> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public eb9 createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new eb9(readString, readString2, z);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public eb9[] newArray(int i) {
            return new eb9[i];
        }
    }

    eb9(String str, String str2, boolean z) {
        super(str, str2, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(b());
        parcel.writeString(a());
        parcel.writeInt(c() ? 1 : 0);
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: fv7  reason: default package */
public final class fv7 extends zu7 {
    public static final Parcelable.Creator<fv7> CREATOR = new a();

    /* renamed from: fv7$a */
    static class a implements Parcelable.Creator<fv7> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public fv7 createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String str = null;
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                str = parcel.readString();
            }
            return new fv7(readInt, readString, str);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public fv7[] newArray(int i) {
            return new fv7[i];
        }
    }

    fv7(int i, String str, String str2) {
        super(i, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(c());
        if (b() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(b());
        }
        if (a() == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeString(a());
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: kv7  reason: default package */
public final class kv7 extends ev7 {
    public static final Parcelable.Creator<kv7> CREATOR = new a();

    /* renamed from: kv7$a */
    static class a implements Parcelable.Creator<kv7> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public kv7 createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String str = null;
            String readString = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                str = parcel.readString();
            }
            return new kv7(readInt, readString, str);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public kv7[] newArray(int i) {
            return new kv7[i];
        }
    }

    kv7(int i, String str, String str2) {
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

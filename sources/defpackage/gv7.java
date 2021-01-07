package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: gv7  reason: default package */
public final class gv7 extends av7 {
    public static final Parcelable.Creator<gv7> CREATOR = new a();

    /* renamed from: gv7$a */
    static class a implements Parcelable.Creator<gv7> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public gv7 createFromParcel(Parcel parcel) {
            return new gv7(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public gv7[] newArray(int i) {
            return new gv7[i];
        }
    }

    gv7(int i, String str, String str2) {
        super(i, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(e());
        parcel.writeString(c());
        parcel.writeString(a());
    }
}

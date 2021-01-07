package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: jv7  reason: default package */
public final class jv7 extends dv7 {
    public static final Parcelable.Creator<jv7> CREATOR = new a();

    /* renamed from: jv7$a */
    static class a implements Parcelable.Creator<jv7> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public jv7 createFromParcel(Parcel parcel) {
            return new jv7(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public jv7[] newArray(int i) {
            return new jv7[i];
        }
    }

    jv7(int i, String str, String str2, String str3) {
        super(i, str, str2, str3);
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
        parcel.writeString(b());
    }
}

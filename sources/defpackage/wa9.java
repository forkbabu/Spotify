package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: wa9  reason: default package */
final class wa9 extends ta9 {
    public static final Parcelable.Creator<wa9> CREATOR = new a();

    /* renamed from: wa9$a */
    static class a implements Parcelable.Creator<wa9> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public wa9 createFromParcel(Parcel parcel) {
            return new wa9(parcel.readString(), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public wa9[] newArray(int i) {
            return new wa9[i];
        }
    }

    wa9(String str, String str2) {
        super(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(b());
        parcel.writeString(c());
    }
}

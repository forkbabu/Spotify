package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: ns5  reason: default package */
public final class ns5 extends ls5 {
    public static final Parcelable.Creator<ns5> CREATOR = new a();

    /* renamed from: ns5$a */
    static class a implements Parcelable.Creator<ns5> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ns5 createFromParcel(Parcel parcel) {
            return new ns5(parcel.readString(), parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ns5[] newArray(int i) {
            return new ns5[i];
        }
    }

    ns5(String str, String str2) {
        super(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(c());
        parcel.writeString(b());
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ag0  reason: default package */
final class ag0 implements Parcelable.Creator<String> {
    ag0() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public String createFromParcel(Parcel parcel) {
        return parcel.readString();
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public String[] newArray(int i) {
        return new String[i];
    }
}

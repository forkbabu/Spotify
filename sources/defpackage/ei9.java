package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.di9;

/* renamed from: ei9  reason: default package */
final class ei9 implements Parcelable.Creator<di9.b> {
    ei9() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public di9.b createFromParcel(Parcel parcel) {
        return bi9.CREATOR.createFromParcel(parcel);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public di9.b[] newArray(int i) {
        return new bi9[i];
    }
}

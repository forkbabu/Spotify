package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: yf0  reason: default package */
final class yf0 implements xf0<Parcelable> {
    yf0() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, android.os.Parcel, int] */
    @Override // defpackage.xf0
    public void a(Parcelable parcelable, Parcel parcel, int i) {
        parcelable.writeToParcel(parcel, 0);
    }
}

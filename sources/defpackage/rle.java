package defpackage;

import android.os.Parcel;
import defpackage.qhe;

/* renamed from: rle  reason: default package */
public final /* synthetic */ class rle implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ rle(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        Parcel parcel = this.a;
        String canonicalName = qhe.f.class.getCanonicalName();
        String h = ((qhe.f) obj).h();
        parcel.writeString(canonicalName);
        parcel.writeString(h);
        parcel.writeInt(0);
    }
}

package defpackage;

import android.os.Parcel;
import defpackage.qhe;

/* renamed from: tle  reason: default package */
public final /* synthetic */ class tle implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ tle(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        Parcel parcel = this.a;
        String canonicalName = qhe.c.class.getCanonicalName();
        String h = ((qhe.c) obj).h();
        parcel.writeString(canonicalName);
        parcel.writeString(h);
        parcel.writeInt(0);
    }
}

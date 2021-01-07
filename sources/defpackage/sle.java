package defpackage;

import android.os.Parcel;
import defpackage.qhe;

/* renamed from: sle  reason: default package */
public final /* synthetic */ class sle implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ sle(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        Parcel parcel = this.a;
        qhe.b bVar = (qhe.b) obj;
        String canonicalName = qhe.b.class.getCanonicalName();
        String h = bVar.h();
        int i = bVar.i();
        parcel.writeString(canonicalName);
        parcel.writeString(h);
        parcel.writeInt(i);
    }
}

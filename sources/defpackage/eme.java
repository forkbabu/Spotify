package defpackage;

import android.os.Parcel;
import defpackage.qke;

/* renamed from: eme  reason: default package */
public final /* synthetic */ class eme implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ eme(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        Parcel parcel = this.a;
        qke.c cVar = (qke.c) obj;
        String canonicalName = qke.c.class.getCanonicalName();
        String m = cVar.m();
        String l = cVar.l();
        parcel.writeString(canonicalName);
        parcel.writeString(m);
        parcel.writeString(l);
    }
}

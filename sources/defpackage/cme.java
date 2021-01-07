package defpackage;

import android.os.Parcel;
import defpackage.qke;

/* renamed from: cme  reason: default package */
public final /* synthetic */ class cme implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ cme(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        Parcel parcel = this.a;
        String canonicalName = qke.i.class.getCanonicalName();
        String l = ((qke.i) obj).l();
        parcel.writeString(canonicalName);
        parcel.writeString(l);
    }
}

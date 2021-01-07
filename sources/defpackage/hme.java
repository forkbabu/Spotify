package defpackage;

import android.os.Parcel;
import defpackage.qke;

/* renamed from: hme  reason: default package */
public final /* synthetic */ class hme implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ hme(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        Parcel parcel = this.a;
        String canonicalName = qke.h.class.getCanonicalName();
        String l = ((qke.h) obj).l();
        parcel.writeString(canonicalName);
        parcel.writeString(l);
    }
}

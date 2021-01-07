package defpackage;

import android.os.Parcel;
import defpackage.qke;

/* renamed from: jme  reason: default package */
public final /* synthetic */ class jme implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ jme(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        Parcel parcel = this.a;
        String canonicalName = qke.a.class.getCanonicalName();
        String l = ((qke.a) obj).l();
        parcel.writeString(canonicalName);
        parcel.writeString(l);
    }
}

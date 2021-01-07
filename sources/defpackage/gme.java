package defpackage;

import android.os.Parcel;
import defpackage.qke;

/* renamed from: gme  reason: default package */
public final /* synthetic */ class gme implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ gme(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        Parcel parcel = this.a;
        String canonicalName = qke.d.class.getCanonicalName();
        String l = ((qke.d) obj).l();
        parcel.writeString(canonicalName);
        parcel.writeString(l);
    }
}

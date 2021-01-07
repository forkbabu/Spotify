package defpackage;

import android.os.Parcel;
import defpackage.qke;

/* renamed from: fme  reason: default package */
public final /* synthetic */ class fme implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ fme(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        Parcel parcel = this.a;
        String canonicalName = qke.g.class.getCanonicalName();
        String l = ((qke.g) obj).l();
        parcel.writeString(canonicalName);
        parcel.writeString(l);
    }
}

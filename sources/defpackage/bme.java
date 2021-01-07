package defpackage;

import android.os.Parcel;
import defpackage.qke;

/* renamed from: bme  reason: default package */
public final /* synthetic */ class bme implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ bme(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        Parcel parcel = this.a;
        String canonicalName = qke.f.class.getCanonicalName();
        String l = ((qke.f) obj).l();
        parcel.writeString(canonicalName);
        parcel.writeString(l);
    }
}

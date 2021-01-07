package defpackage;

import android.os.Parcel;
import defpackage.qke;

/* renamed from: ime  reason: default package */
public final /* synthetic */ class ime implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ ime(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        Parcel parcel = this.a;
        String canonicalName = qke.e.class.getCanonicalName();
        String l = ((qke.e) obj).l();
        parcel.writeString(canonicalName);
        parcel.writeString(l);
    }
}

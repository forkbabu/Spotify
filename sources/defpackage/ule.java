package defpackage;

import android.os.Parcel;
import defpackage.qhe;

/* renamed from: ule  reason: default package */
public final /* synthetic */ class ule implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ ule(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        Parcel parcel = this.a;
        String canonicalName = qhe.d.class.getCanonicalName();
        String h = ((qhe.e) obj).h();
        parcel.writeString(canonicalName);
        parcel.writeString(h);
        parcel.writeInt(0);
    }
}

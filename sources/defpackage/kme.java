package defpackage;

import android.os.Parcel;
import defpackage.gee;

/* renamed from: kme  reason: default package */
public final /* synthetic */ class kme implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ kme(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        Parcel parcel = this.a;
        String canonicalName = gee.a.class.getCanonicalName();
        fee d = ((gee.a) obj).d();
        parcel.writeString(canonicalName);
        d.writeToParcel(parcel, 0);
    }
}

package defpackage;

import android.os.Parcel;
import defpackage.gee;

/* renamed from: lme  reason: default package */
public final /* synthetic */ class lme implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ lme(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        Parcel parcel = this.a;
        String canonicalName = gee.b.class.getCanonicalName();
        fee d = ((gee.b) obj).d();
        parcel.writeString(canonicalName);
        d.writeToParcel(parcel, 0);
    }
}

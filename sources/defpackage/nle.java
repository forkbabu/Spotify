package defpackage;

import android.os.Parcel;
import defpackage.uae;

/* renamed from: nle  reason: default package */
public final /* synthetic */ class nle implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ nle(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        Parcel parcel = this.a;
        uae.c cVar = (uae.c) obj;
        parcel.writeString(uae.c.class.getCanonicalName());
        parcel.writeString("");
    }
}

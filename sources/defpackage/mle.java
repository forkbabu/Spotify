package defpackage;

import android.os.Parcel;
import defpackage.uae;

/* renamed from: mle  reason: default package */
public final /* synthetic */ class mle implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ mle(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        Parcel parcel = this.a;
        uae.b bVar = (uae.b) obj;
        parcel.writeString(uae.b.class.getCanonicalName());
        parcel.writeString("");
    }
}

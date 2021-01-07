package defpackage;

import android.os.Parcel;
import defpackage.uae;

/* renamed from: ole  reason: default package */
public final /* synthetic */ class ole implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ ole(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        Parcel parcel = this.a;
        uae.d dVar = (uae.d) obj;
        parcel.writeString(uae.d.class.getCanonicalName());
        parcel.writeString("");
    }
}

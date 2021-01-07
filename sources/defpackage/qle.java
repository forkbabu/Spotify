package defpackage;

import android.os.Parcel;
import defpackage.qhe;

/* renamed from: qle  reason: default package */
public final /* synthetic */ class qle implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ qle(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        Parcel parcel = this.a;
        qhe.a aVar = (qhe.a) obj;
        parcel.writeString(qhe.a.class.getCanonicalName());
        parcel.writeString("");
        parcel.writeInt(0);
    }
}

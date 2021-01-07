package defpackage;

import android.os.Parcel;
import defpackage.qke;

/* renamed from: dme  reason: default package */
public final /* synthetic */ class dme implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ dme(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        Parcel parcel = this.a;
        qke.b bVar = (qke.b) obj;
        parcel.writeString(qke.b.class.getCanonicalName());
        parcel.writeString("");
    }
}

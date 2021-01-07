package defpackage;

import android.os.Parcel;
import defpackage.wie;

/* renamed from: vle  reason: default package */
public final /* synthetic */ class vle implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ vle(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        wie.a aVar = (wie.a) obj;
        this.a.writeString(wie.a.class.getCanonicalName());
    }
}

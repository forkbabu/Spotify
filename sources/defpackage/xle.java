package defpackage;

import android.os.Parcel;
import defpackage.wie;

/* renamed from: xle  reason: default package */
public final /* synthetic */ class xle implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ xle(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        wie.b bVar = (wie.b) obj;
        this.a.writeString(wie.b.class.getCanonicalName());
    }
}

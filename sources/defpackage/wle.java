package defpackage;

import android.os.Parcel;
import defpackage.wie;

/* renamed from: wle  reason: default package */
public final /* synthetic */ class wle implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ wle(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        wie.d dVar = (wie.d) obj;
        this.a.writeString(wie.d.class.getCanonicalName());
    }
}

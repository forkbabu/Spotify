package defpackage;

import android.os.Parcel;
import defpackage.wie;

/* renamed from: yle  reason: default package */
public final /* synthetic */ class yle implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ yle(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        wie.c cVar = (wie.c) obj;
        this.a.writeString(wie.c.class.getCanonicalName());
    }
}

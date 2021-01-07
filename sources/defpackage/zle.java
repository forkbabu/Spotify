package defpackage;

import android.os.Parcel;
import defpackage.tje;

/* renamed from: zle  reason: default package */
public final /* synthetic */ class zle implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ zle(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        Parcel parcel = this.a;
        tje.a aVar = (tje.a) obj;
        parcel.writeString(tje.a.class.getCanonicalName());
        parcel.writeString("");
    }
}

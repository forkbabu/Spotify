package defpackage;

import android.os.Parcel;
import defpackage.tje;

/* renamed from: ame  reason: default package */
public final /* synthetic */ class ame implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ ame(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        Parcel parcel = this.a;
        String canonicalName = tje.b.class.getCanonicalName();
        String e = ((tje.b) obj).e();
        parcel.writeString(canonicalName);
        parcel.writeString(e);
    }
}

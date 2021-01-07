package defpackage;

import android.os.Parcel;
import defpackage.uae;

/* renamed from: lle  reason: default package */
public final /* synthetic */ class lle implements si0 {
    public final /* synthetic */ Parcel a;

    public /* synthetic */ lle(Parcel parcel) {
        this.a = parcel;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        Parcel parcel = this.a;
        String canonicalName = uae.a.class.getCanonicalName();
        String canonicalName2 = ((uae.a) obj).f().getClass().getCanonicalName();
        parcel.writeString(canonicalName);
        parcel.writeString(canonicalName2);
    }
}

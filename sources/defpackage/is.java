package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.b;
import com.google.android.gms.common.api.Status;

/* renamed from: is  reason: default package */
public abstract class is extends qs implements js {
    public is() {
        super("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.qs
    public final boolean C3(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        ((ns) this).D3((Status) ss.a(parcel, Status.CREATOR), (b) ss.a(parcel, b.CREATOR));
        return true;
    }
}

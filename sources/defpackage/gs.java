package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;

/* renamed from: gs  reason: default package */
public final class gs extends rs implements hs {
    gs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    @Override // defpackage.hs
    public final void k3(js jsVar, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        Parcel T = T();
        ss.b(T, jsVar);
        ss.c(T, saveAccountLinkingTokenRequest);
        a0(1, T);
    }
}

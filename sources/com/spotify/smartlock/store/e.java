package com.spotify.smartlock.store;

import android.content.DialogInterface;
import com.google.android.gms.common.api.ResolvableApiException;

public final /* synthetic */ class e implements DialogInterface.OnClickListener {
    public final /* synthetic */ f a;
    public final /* synthetic */ ResolvableApiException b;
    public final /* synthetic */ SmartlockProviderCallback c;

    public /* synthetic */ e(f fVar, ResolvableApiException resolvableApiException, SmartlockProviderCallback smartlockProviderCallback) {
        this.a = fVar;
        this.b = resolvableApiException;
        this.c = smartlockProviderCallback;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.f(this.b, this.c, dialogInterface, i);
    }
}

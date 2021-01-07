package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class l0 extends b0 implements m0 {
    l0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    @Override // com.google.android.play.core.internal.m0
    public final void j(Bundle bundle) {
        Parcel T = T();
        d0.b(T, bundle);
        a0(3, T);
    }

    @Override // com.google.android.play.core.internal.m0
    public final void t(Bundle bundle, Bundle bundle2) {
        Parcel T = T();
        d0.b(T, bundle);
        d0.b(T, bundle2);
        a0(2, T);
    }

    @Override // com.google.android.play.core.internal.m0
    public final void u(Bundle bundle) {
        Parcel T = T();
        d0.b(T, bundle);
        a0(4, T);
    }
}

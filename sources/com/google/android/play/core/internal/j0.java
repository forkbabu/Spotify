package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class j0 extends c0 implements k0 {
    public j0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.c0
    public final boolean C3(int i, Parcel parcel) {
        m0 m0Var = null;
        if (i == 2) {
            Bundle bundle = (Bundle) d0.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                m0Var = queryLocalInterface instanceof m0 ? (m0) queryLocalInterface : new l0(readStrongBinder);
            }
            N1(bundle, m0Var);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            Bundle bundle2 = (Bundle) d0.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                m0Var = queryLocalInterface2 instanceof m0 ? (m0) queryLocalInterface2 : new l0(readStrongBinder2);
            }
            r2(m0Var);
            return true;
        }
    }
}

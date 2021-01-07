package com.google.android.gms.cast.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.x;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.f;

public final class k0 extends f<g> {
    private static final b P = new b("CastClientImplCxless");
    private final CastDevice L;
    private final long M;
    private final Bundle N;
    private final String O;

    public k0(Context context, Looper looper, c cVar, CastDevice castDevice, long j, Bundle bundle, String str, c.a aVar, c.b bVar) {
        super(context, looper, 10, cVar, aVar, bVar);
        this.L = castDevice;
        this.M = j;
        this.N = bundle;
        this.O = str;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final String A() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final String B() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final void d() {
        try {
            ((g) z()).d();
        } catch (RemoteException | IllegalStateException e) {
            P.b(e, "Error while disconnecting the controller interface: %s", e.getMessage());
        } finally {
            super.d();
        }
    }

    @Override // com.google.android.gms.common.internal.b, com.google.android.gms.common.api.a.f
    public final int l() {
        return 19390000;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof g) {
            return (g) queryLocalInterface;
        }
        return new f(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    public final com.google.android.gms.common.c[] t() {
        return x.h;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.b
    public final Bundle w() {
        Bundle bundle = new Bundle();
        P.a("getRemoteService()", new Object[0]);
        CastDevice castDevice = this.L;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.M);
        bundle.putString("connectionless_client_record_id", this.O);
        Bundle bundle2 = this.N;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }
}

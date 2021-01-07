package com.spotify.mobile.android.waze.sdkprotocol;

import android.content.Context;
import com.waze.sdk.c;
import com.waze.sdk.d;
import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class WazeAudioSdkProtocolImpl implements a {
    private c a;

    @Override // com.spotify.mobile.android.waze.sdkprotocol.a
    public void a() {
        c cVar = this.a;
        if (cVar != null) {
            cVar.p();
        }
    }

    @Override // com.spotify.mobile.android.waze.sdkprotocol.a
    public z<Boolean> b(Context context) {
        h.e(context, "context");
        z<Boolean> g = z.g(new WazeAudioSdkProtocolImpl$isAudioSdkAvailable$1(context));
        h.d(g, "Single.create { emitter …ter::onSuccess)\n        }");
        return g;
    }

    @Override // com.spotify.mobile.android.waze.sdkprotocol.a
    public void c(Context context, d dVar, com.waze.sdk.h hVar) {
        c cVar;
        h.e(context, "context");
        h.e(dVar, "settings");
        h.e(hVar, "callback");
        try {
            cVar = c.t(context, dVar, hVar);
        } catch (IllegalStateException unused) {
            cVar = null;
        }
        this.a = cVar;
    }

    @Override // com.spotify.mobile.android.waze.sdkprotocol.a
    public void d() {
        c cVar = this.a;
        if (cVar != null) {
            cVar.s();
        }
    }

    @Override // com.spotify.mobile.android.waze.sdkprotocol.a
    public void e(c.b bVar) {
        h.e(bVar, "listener");
        c cVar = this.a;
        if (cVar != null) {
            cVar.v(bVar);
        }
    }

    @Override // com.spotify.mobile.android.waze.sdkprotocol.a
    public void f() {
        c cVar = this.a;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // com.spotify.mobile.android.waze.sdkprotocol.a
    public boolean h() {
        c cVar = this.a;
        return cVar != null && cVar.g();
    }
}

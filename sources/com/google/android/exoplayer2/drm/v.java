package com.google.android.exoplayer2.drm;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.drm.q;
import com.google.android.exoplayer2.drm.r;
import com.google.android.exoplayer2.util.g;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

public final class v<T extends q> {
    private final ConditionVariable a = new ConditionVariable();
    private final DefaultDrmSessionManager<T> b;
    private final HandlerThread c;

    class a implements k {
        a() {
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void a() {
            v.this.a.open();
        }

        @Override // com.google.android.exoplayer2.drm.k
        public /* synthetic */ void e() {
            j.c(this);
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void g() {
            v.this.a.open();
        }

        @Override // com.google.android.exoplayer2.drm.k
        public /* synthetic */ void i() {
            j.e(this);
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void o(Exception exc) {
            v.this.a.open();
        }
    }

    static {
        new l(new l.b[0]);
    }

    public v(UUID uuid, r.c<T> cVar, u uVar, Map<String, String> map) {
        HandlerThread handlerThread = new HandlerThread("OfflineLicenseHelper");
        this.c = handlerThread;
        handlerThread.start();
        a aVar = new a();
        Map<String, String> emptyMap = Collections.emptyMap();
        DefaultDrmSessionManager.b bVar = new DefaultDrmSessionManager.b();
        bVar.c(uuid, cVar);
        bVar.b(emptyMap);
        DefaultDrmSessionManager<T> defaultDrmSessionManager = (DefaultDrmSessionManager<T>) bVar.a(uVar);
        this.b = defaultDrmSessionManager;
        defaultDrmSessionManager.h(new Handler(handlerThread.getLooper()), aVar);
    }

    private byte[] b(int i, byte[] bArr, l lVar) {
        this.b.k();
        this.b.m(i, null);
        this.a.close();
        DrmSession<T> e = this.b.e(this.c.getLooper(), lVar);
        this.a.block();
        DrmSession.DrmSessionException f = e.f();
        byte[] e2 = e.e();
        e.d();
        this.b.d();
        if (f == null) {
            e2.getClass();
            return e2;
        }
        throw f;
    }

    public synchronized byte[] c(l lVar) {
        g.a(lVar != null);
        return b(2, null, lVar);
    }

    public void d() {
        this.c.quit();
    }
}

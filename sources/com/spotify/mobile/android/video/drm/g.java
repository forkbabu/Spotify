package com.spotify.mobile.android.video.drm;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.drm.q;
import com.google.android.exoplayer2.u;
import com.google.common.base.Optional;
import com.spotify.mobile.android.video.offline.h0;
import okhttp3.y;

public class g {
    private final y a;
    private final String b;

    public g(y yVar, String str) {
        this.a = yVar;
        this.b = str;
    }

    public Optional<n<q>> a(c cVar, h0 h0Var) {
        if (Build.VERSION.SDK_INT < 18) {
            return Optional.absent();
        }
        j jVar = new j(cVar, this.a, this.b);
        DefaultDrmSessionManager.b bVar = new DefaultDrmSessionManager.b();
        bVar.c(u.d, a.a);
        DefaultDrmSessionManager<q> a2 = bVar.a(jVar);
        a2.h(new Handler(Looper.getMainLooper()), cVar);
        if (h0Var != null) {
            a2.m(0, h0Var.b());
        }
        return Optional.of(a2);
    }
}

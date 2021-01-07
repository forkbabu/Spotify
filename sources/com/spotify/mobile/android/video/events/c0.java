package com.spotify.mobile.android.video.events;

import android.os.Handler;
import com.google.android.exoplayer2.y;
import com.google.common.base.Optional;
import com.spotify.mobile.android.video.StreamingType;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.a0;
import com.spotify.mobile.android.video.d0;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.exception.BetamaxException;
import com.spotify.mobile.android.video.exo.f;
import com.spotify.mobile.android.video.g0;
import com.spotify.mobile.android.video.i0;
import com.spotify.mobile.android.video.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class c0 {
    protected final HashMap<d0, List<e0>> a = new HashMap<>();
    private final List<f0> b;
    private final Handler c;
    private final cqe d;

    public c0(List<f0> list, Handler handler, cqe cqe) {
        this.b = list;
        this.c = handler;
        this.d = cqe;
    }

    private void a(Optional<d0> optional) {
        if (optional.isPresent()) {
            this.a.containsKey(optional.get());
        }
    }

    private List<e0> b(Optional<d0> optional) {
        List<e0> list;
        if (!optional.isPresent() || (list = this.a.get(optional.get())) == null) {
            return Collections.emptyList();
        }
        return list;
    }

    public void A(Optional<d0> optional, com.google.android.exoplayer2.d0 d0Var, long j) {
        a(optional);
        long d2 = this.d.d();
        for (e0 e0Var : b(optional)) {
            this.c.post(new e(e0Var, new b0(d0Var.n, d0Var.w, d0Var.x, d0Var.y, d0Var.o), j, d2));
        }
    }

    public void c(d0 d0Var, a0 a0Var, y yVar, String str, g0 g0Var) {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(yVar);
        for (f0 f0Var : this.b) {
            Optional<e0> g = f0Var.g(d0Var, a0Var, fVar, str, g0Var);
            if (g.isPresent()) {
                arrayList.add(g.get());
            }
        }
        this.a.put(d0Var, arrayList);
    }

    public void d(Optional<d0> optional, com.google.android.exoplayer2.d0 d0Var, long j) {
        a(optional);
        long d2 = this.d.d();
        for (e0 e0Var : b(optional)) {
            this.c.post(new t(e0Var, new z(d0Var.n, d0Var.o), j, d2));
        }
    }

    public void e(Optional<d0> optional, boolean z, long j) {
        a(optional);
        long d2 = this.d.d();
        for (e0 e0Var : b(optional)) {
            this.c.post(new u(e0Var, z, j, d2));
        }
    }

    public void f(Optional<d0> optional, long j) {
        a(optional);
        long d2 = this.d.d();
        for (e0 e0Var : b(optional)) {
            this.c.post(new b(e0Var, j, d2));
        }
    }

    public void g(Optional<d0> optional, long j, long j2, long j3) {
        a(optional);
        long d2 = this.d.d();
        for (e0 e0Var : b(optional)) {
            this.c.post(new v(e0Var, j, j2, j3, d2));
        }
    }

    public void h(Optional<d0> optional, EncryptionType encryptionType) {
        a(optional);
        long d2 = this.d.d();
        for (e0 e0Var : b(optional)) {
            this.c.post(new c(e0Var, encryptionType, d2));
        }
    }

    public void i(Optional<d0> optional) {
        a(optional);
        long d2 = this.d.d();
        for (e0 e0Var : b(optional)) {
            this.c.post(new x(e0Var, d2));
        }
    }

    public void j(Optional<d0> optional, int i) {
        a(optional);
        long d2 = this.d.d();
        for (e0 e0Var : b(optional)) {
            this.c.post(new h(e0Var, i, d2));
        }
    }

    public void k(Optional<d0> optional, long j) {
        a(optional);
        long d2 = this.d.d();
        for (e0 e0Var : b(optional)) {
            this.c.post(new d(e0Var, j, d2));
        }
    }

    public void l(Optional<d0> optional, d0 d0Var) {
        a(optional);
        long d2 = this.d.d();
        for (e0 e0Var : b(optional)) {
            this.c.post(new w(e0Var, d0Var, d2));
        }
    }

    public void m(Optional<d0> optional, BetamaxException betamaxException, long j) {
        a(optional);
        long d2 = this.d.d();
        for (e0 e0Var : b(optional)) {
            this.c.post(new q(e0Var, betamaxException, j, d2));
        }
    }

    public void n(Optional<d0> optional, List<i0> list) {
        a(optional);
        long d2 = this.d.d();
        for (e0 e0Var : b(optional)) {
            this.c.post(new i(e0Var, list, d2));
        }
    }

    public void o(Optional<d0> optional) {
        a(optional);
        long d2 = this.d.d();
        for (e0 e0Var : b(optional)) {
            this.c.post(new j(e0Var, d2));
        }
    }

    public void p(Optional<d0> optional, long j) {
        a(optional);
        long d2 = this.d.d();
        for (e0 e0Var : b(optional)) {
            this.c.post(new k(e0Var, j, d2));
        }
    }

    public void q(d0 d0Var, boolean z) {
        a(Optional.of(d0Var));
        long d2 = this.d.d();
        for (e0 e0Var : b(Optional.of(d0Var))) {
            this.c.post(new o(e0Var, z, d2));
        }
    }

    public void r(Optional<d0> optional, ReasonEnd reasonEnd, v vVar, long j) {
        List<e0> remove;
        a(optional);
        long d2 = this.d.d();
        if (optional.isPresent() && (remove = this.a.remove(optional.get())) != null) {
            for (e0 e0Var : remove) {
                this.c.post(new g(e0Var, vVar, reasonEnd, j, d2, vVar.d()));
            }
        }
    }

    public void s(Optional<d0> optional, long j, float f) {
        a(optional);
        long d2 = this.d.d();
        for (e0 e0Var : b(optional)) {
            this.c.post(new p(e0Var, f, j, d2));
        }
    }

    public void t(Optional<d0> optional, StreamingType streamingType, long j) {
        a(optional);
        long d2 = this.d.d();
        for (e0 e0Var : b(optional)) {
            this.c.post(new m(e0Var, streamingType, j, d2));
        }
    }

    public void u(Optional<d0> optional, BetamaxException betamaxException, long j) {
        a(optional);
        long d2 = this.d.d();
        for (e0 e0Var : b(optional)) {
            this.c.post(new s(e0Var, betamaxException, j, d2));
        }
    }

    public void v(Optional<d0> optional) {
        a(optional);
        long d2 = this.d.d();
        for (e0 e0Var : b(optional)) {
            this.c.post(new a(e0Var, d2));
        }
    }

    public void w(Optional<d0> optional, i0 i0Var) {
        long d2 = this.d.d();
        for (e0 e0Var : b(optional)) {
            this.c.post(new r(e0Var, i0Var, d2));
        }
    }

    public void x(Optional<d0> optional, long j, long j2) {
        a(optional);
        long d2 = this.d.d();
        for (e0 e0Var : b(optional)) {
            this.c.post(new l(e0Var, j, j2, d2));
        }
    }

    public void y(Optional<d0> optional, long j, Optional<i0> optional2) {
        a(optional);
        long d2 = this.d.d();
        for (e0 e0Var : b(optional)) {
            this.c.post(new f(e0Var, optional2, j, d2));
        }
    }

    public void z(Optional<d0> optional, Optional<VideoSurfaceView> optional2, long j) {
        a(optional);
        long d2 = this.d.d();
        for (e0 e0Var : b(optional)) {
            this.c.post(new n(e0Var, optional2, j, d2));
        }
    }
}

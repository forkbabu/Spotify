package com.spotify.mobile.android.service.media;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.connect.u;
import com.spotify.player.model.PlayerState;
import defpackage.n4a;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;

public class u2 implements t2 {
    private final yda a;
    private final hv3 b;
    private final pc1 c;
    private final String d;
    private final o4a e;
    private final g<PlayerState> f;
    private boolean g;
    private t1 h;

    protected u2(g<PlayerState> gVar, yda yda, hv3 hv3, w2 w2Var, pc1 pc1, o4a o4a) {
        this.f = gVar;
        yda.getClass();
        this.a = yda;
        hv3.getClass();
        this.b = hv3;
        this.c = pc1;
        this.d = w2Var.a();
        this.e = o4a;
    }

    public void a() {
        if ((!"".equals(this.a.d())) && this.g) {
            this.g = false;
            this.h.a();
            this.h.e();
            this.a.c();
            this.c.c(this.d, u.a(this.a.d()), this.a);
            o4a o4a = this.e;
            n4a.a a2 = n4a.a();
            a2.b(this.d);
            a2.a(this.a.a());
            a2.d(this.a.d());
            a2.c(false);
            o4a.a(a2.build());
            try {
                this.b.b(this.a);
            } catch (JsonProcessingException e2) {
                Logger.e(e2, "Could not disconnect accessory", new Object[0]);
                Assertion.i("Could not disconnect accessory", e2);
            }
        }
    }

    public yda b() {
        return this.a;
    }

    public boolean c() {
        return this.g;
    }

    public void d() {
        if ((!"".equals(this.a.d())) && !this.g) {
            this.g = true;
            this.a.c();
            this.c.e(this.d, u.a(this.a.d()), this.a);
            if (this.h == null) {
                this.h = new t1(this.c, this.d, this.a);
            }
            t1 t1Var = this.h;
            g<PlayerState> gVar = this.f;
            gVar.getClass();
            t1Var.d(new v(gVar));
            o4a o4a = this.e;
            n4a.a a2 = n4a.a();
            a2.b(this.d);
            a2.a(this.a.a());
            a2.d(this.a.d());
            a2.c(true);
            o4a.a(a2.build());
            try {
                Logger.b("Connecting external accessory", new Object[0]);
                this.b.a(this.a);
            } catch (JsonProcessingException e2) {
                Logger.e(e2, "Failed to serialize object", new Object[0]);
            }
        }
    }
}

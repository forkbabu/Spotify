package com.spotify.eventsender;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.room.h;
import com.google.common.collect.ImmutableList;
import com.spotify.eventsender.gabo.g;
import com.spotify.eventsender.s0;
import defpackage.gk0;
import okhttp3.e;

public class j0 {
    private final Context a;
    private final m0 b;
    private final i0 c;
    private r0 d;
    private il0 e;
    private final pk0 f;
    private volatile boolean g;

    private j0(Context context, e.a aVar, r0 r0Var, e0 e0Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.d = r0Var;
        f0 f0Var = new f0(e0Var, c());
        s0 s0Var = new s0(new s0.a(context));
        h0 a2 = g.a(aVar, r0Var.b(), c());
        boolean h = r0Var.h();
        RoomDatabase.a a3 = h.a(context, EventSenderDatabase.class, "event-sender.db");
        a3.b(new cl0(), new dl0(), new el0(), new fl0());
        a3.e();
        if (h) {
            a3.c();
        }
        EventSenderDatabase eventSenderDatabase = (EventSenderDatabase) a3.d();
        ik0 ik0 = new ik0(s0Var);
        t tVar = new t(applicationContext);
        pk0 pk0 = new pk0(tVar, new ik0(s0Var), new tk0(eventSenderDatabase.t(), s0Var));
        this.f = pk0;
        gk0.b bVar = new gk0.b(applicationContext, s0Var, c(), tVar, ik0);
        bVar.a(this.d.d());
        gk0 b2 = bVar.b();
        this.e = r0Var.e();
        g0 g0Var = new g0(pk0, eventSenderDatabase.t(), b2, eventSenderDatabase.v(), tVar, c());
        d0 d0Var = new d0(c());
        this.c = new i0(ImmutableList.of((v) new t0(eventSenderDatabase.u(), pk0, eventSenderDatabase.t(), b2, r0Var.c(), new a(a2), f0Var, g0Var, r0Var.g()), (v) new p0(eventSenderDatabase.v(), d0Var, new q(a2), c()), new v(eventSenderDatabase.v(), d0Var, new a(a2), c(), f0Var)), new b0(eventSenderDatabase.v(), eventSenderDatabase.t(), tVar, c()), c());
        this.b = new m0(g0Var, c(), f0Var);
    }

    public static j0 a(Context context, e.a aVar, r0 r0Var, e0 e0Var) {
        return new j0(context, aVar, r0Var, e0Var);
    }

    public hl0 b() {
        return this.b;
    }

    public kl0 c() {
        return this.d.f();
    }

    public synchronized void d() {
        ((sl0) this.e).d();
        ((sl0) this.e).c(this.c);
    }

    public synchronized void e() {
        if (this.g) {
            c().d("Already started, Ignoring!");
        } else {
            this.g = true;
            ((sl0) this.e).c(this.c);
        }
    }

    public synchronized void f() {
        if (this.g) {
            ((sl0) this.e).d();
            this.g = false;
        } else {
            c().d("Already stopped, Ignoring!");
        }
    }
}

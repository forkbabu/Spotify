package defpackage;

import com.spotify.base.java.logging.Logger;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: hb1  reason: default package */
public final class hb1 {
    private final List<ob1> a;
    private final ArrayDeque<ob1> b = new ArrayDeque<>(4);
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;

    public hb1(kb1 kb1, ib1 ib1, jb1 jb1, lb1 lb1) {
        h.e(kb1, "serviceActions");
        h.e(ib1, "coreActions");
        h.e(jb1, "corePluginActions");
        h.e(lb1, "sessionPluginActions");
        this.a = d.u(new pb1(kb1), new mb1(ib1), new nb1(jb1), new qb1(lb1));
    }

    private final void f() {
        if (!(!this.d)) {
            throw new IllegalStateException("Driver is destroyed".toString());
        } else if (!this.c) {
            this.c = true;
            this.c = false;
            Logger.b("Target Level: %s, Current Level: %s", Integer.valueOf(this.f), Integer.valueOf(this.b.size()));
            if (!this.d && b() != this.f) {
                while (this.f > b()) {
                    ob1 ob1 = this.a.get(b());
                    ob1.a();
                    this.b.push(ob1);
                }
                while (this.f < b()) {
                    this.b.pop().b();
                }
            }
        }
    }

    public final void a() {
        z42.a("All calls to the driver should happen only on the main thread");
        Logger.b("destroy", new Object[0]);
        while (!this.b.isEmpty()) {
            this.b.pop().b();
        }
        this.d = true;
    }

    public final int b() {
        return this.b.size();
    }

    public final boolean c() {
        return this.d;
    }

    public final void d() {
        z42.a("All calls to the driver should happen only on the main thread");
        Logger.b("onLoggedIn", new Object[0]);
        this.e = true;
        if (this.f > 1) {
            this.f = 4;
            f();
        }
    }

    public final void e() {
        z42.a("All calls to the driver should happen only on the main thread");
        Logger.b("onLoggedOut", new Object[0]);
        this.e = false;
        int i = this.f;
        if (i > 1) {
            if (i > 3) {
                i = 3;
            }
            this.f = i;
            f();
        }
    }

    public final void g() {
        z42.a("All calls to the driver should happen only on the main thread");
        Logger.b("shutdown", new Object[0]);
        int i = this.f;
        if (i > 1) {
            i = 1;
        }
        this.f = i;
        f();
    }

    public final void h() {
        z42.a("All calls to the driver should happen only on the main thread");
        Logger.b("wakeUp", new Object[0]);
        this.f = this.e ? 4 : 3;
        f();
    }
}

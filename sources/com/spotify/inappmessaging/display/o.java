package com.spotify.inappmessaging.display;

import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.inappmessaging.ActionType;
import com.spotify.inappmessaging.InAppMessagingLogger;
import com.spotify.inappmessaging.j;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import okhttp3.e0;
import retrofit2.b;
import retrofit2.v;

/* access modifiers changed from: package-private */
public class o {
    boolean a;
    private final gp0 b;
    private final fp0 c;
    private final a d;
    private final Map<ActionType, j> e;
    private final InAppMessagingLogger f;
    private final cqe g;
    private final long h;

    public interface a {
        @zqf
        b<e0> a(@srf String str);
    }

    o(fp0 fp0, gp0 gp0, Map<ActionType, j> map, a aVar, InAppMessagingLogger inAppMessagingLogger, cqe cqe) {
        this.d = aVar;
        this.e = map;
        this.f = inAppMessagingLogger;
        this.g = cqe;
        this.h = cqe.d();
        this.b = gp0;
        this.c = fp0;
    }

    public void a(String str) {
        ep0 ep0 = this.c.b().get(str);
        if (ep0 != null) {
            String nullToEmpty = MoreObjects.nullToEmpty(ep0.c());
            try {
                v<e0> h2 = this.d.a(nullToEmpty).h();
                String nullToEmpty2 = h2.d() != null ? MoreObjects.nullToEmpty(h2.d().m()) : "";
                if (h2.b() != 200) {
                    this.f.b(nullToEmpty, h2.b(), nullToEmpty2);
                }
            } catch (IOException unused) {
                Logger.b("InAppMessaging logging exception", new Object[0]);
            }
            this.f.f(MoreObjects.nullToEmpty(this.c.h()), ep0.b());
            ActionType b2 = ep0.b();
            String e2 = ep0.e();
            j jVar = this.e.get(b2);
            if (jVar != null) {
                jVar.a(this.c.f(), e2);
            }
        }
    }

    public void b(Set<String> set) {
        this.f.c(set, MoreObjects.nullToEmpty(this.c.f()), MoreObjects.nullToEmpty(this.c.h()), this.c.c(), this.b.c(), this.b.e());
    }

    public void c(InAppMessagingLogger.DismissType dismissType) {
        this.f.d(MoreObjects.nullToEmpty(this.c.f()), MoreObjects.nullToEmpty(this.c.h()), dismissType, this.g.d());
    }

    public void d() {
        if (!this.a) {
            String nullToEmpty = MoreObjects.nullToEmpty(this.c.g());
            try {
                v<e0> h2 = this.d.a(nullToEmpty).h();
                String nullToEmpty2 = h2.d() != null ? MoreObjects.nullToEmpty(h2.d().m()) : "";
                if (h2.b() != 200) {
                    this.f.a(nullToEmpty, h2.b(), nullToEmpty2);
                }
            } catch (IOException unused) {
                Logger.b("InAppMessaging logging exception", new Object[0]);
            }
            this.f.e(MoreObjects.nullToEmpty(this.c.h()), this.c.c());
            this.f.g(MoreObjects.nullToEmpty(this.c.f()), this.g.d() - this.h, this.c.c());
            this.a = true;
        }
    }

    public boolean e(String str) {
        ep0 ep0 = this.c.b().get(str);
        if (ep0 != null) {
            return ep0.f();
        }
        return true;
    }
}

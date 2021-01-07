package defpackage;

import android.content.Context;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.b;
import com.google.android.datatransport.cct.a;
import com.google.android.datatransport.f;
import com.google.android.datatransport.g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.p;
import defpackage.jg;
import defpackage.mg;
import defpackage.tg;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/* renamed from: yg  reason: default package */
public class yg implements xg {
    private static volatile zg e;
    private final ti a;
    private final ti b;
    private final ih c;
    private final l d;

    yg(ti tiVar, ti tiVar2, ih ihVar, l lVar, p pVar) {
        this.a = tiVar;
        this.b = tiVar2;
        this.c = ihVar;
        this.d = lVar;
        pVar.a();
    }

    public static yg a() {
        zg zgVar = e;
        if (zgVar != null) {
            return zgVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void c(Context context) {
        if (e == null) {
            synchronized (yg.class) {
                if (e == null) {
                    mg.b bVar = new mg.b(null);
                    bVar.b(context);
                    e = bVar.a();
                }
            }
        }
    }

    public l b() {
        return this.d;
    }

    public f d(ng ngVar) {
        Set set;
        if (ngVar instanceof ng) {
            set = Collections.unmodifiableSet(((a) ngVar).e());
        } else {
            set = Collections.singleton(b.b("proto"));
        }
        tg.a a2 = tg.a();
        ngVar.getClass();
        a2.b("cct");
        a2.c(((a) ngVar).d());
        return new ug(set, a2.a(), this);
    }

    public void e(sg sgVar, g gVar) {
        ih ihVar = this.c;
        tg d2 = sgVar.d();
        Priority c2 = sgVar.b().c();
        d2.getClass();
        tg.a a2 = tg.a();
        a2.b(d2.b());
        a2.d(c2);
        a2.c(d2.c());
        tg a3 = a2.a();
        jg.b bVar = new jg.b();
        bVar.k(new HashMap());
        bVar.h(this.a.a());
        bVar.j(this.b.a());
        bVar.i(sgVar.e());
        bVar.g(new og(sgVar.a(), sgVar.c().apply(sgVar.b().b())));
        bVar.f(sgVar.b().a());
        ihVar.a(a3, bVar.d(), gVar);
    }
}

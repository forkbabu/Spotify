package defpackage;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.i;
import com.google.android.datatransport.runtime.backends.k;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.p;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.q;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.r;
import defpackage.zg;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: mg  reason: default package */
public final class mg extends zg {
    private wlf<Executor> a = ejf.b(qg.a());
    private wlf<Context> b;
    private wlf c;
    private wlf f;
    private wlf n;
    private wlf<li> o;
    private wlf<SchedulerConfig> p;
    private wlf<r> q;
    private wlf<gh> r;
    private wlf<l> s;
    private wlf<p> t;
    private wlf<yg> u;

    /* access modifiers changed from: private */
    /* renamed from: mg$b */
    public static final class b implements zg.a {
        private Context a;

        private b() {
        }

        public zg a() {
            Context context = this.a;
            if (context != null) {
                return new mg(context, null);
            }
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }

        public zg.a b(Context context) {
            context.getClass();
            this.a = context;
            return this;
        }

        b(a aVar) {
        }
    }

    mg(Context context, a aVar) {
        fjf a2 = gjf.a(context);
        this.b = a2;
        i iVar = new i(a2, ui.a(), vi.a());
        this.c = iVar;
        this.f = ejf.b(new k(this.b, iVar));
        this.n = new si(this.b, ph.a(), qh.a());
        this.o = ejf.b(new mi(ui.a(), vi.a(), rh.a(), this.n));
        jh jhVar = new jh(ui.a());
        this.p = jhVar;
        kh khVar = new kh(this.b, this.o, jhVar, vi.a());
        this.q = khVar;
        wlf<Executor> wlf = this.a;
        wlf wlf2 = this.f;
        wlf<li> wlf3 = this.o;
        this.r = new hh(wlf, wlf2, khVar, wlf3, wlf3);
        this.s = new m(this.b, wlf2, wlf3, khVar, wlf, wlf3, ui.a());
        wlf<Executor> wlf4 = this.a;
        wlf<li> wlf5 = this.o;
        this.t = new q(wlf4, wlf5, this.q, wlf5);
        this.u = ejf.b(new ah(ui.a(), vi.a(), this.r, this.s, this.t));
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.zg
    public nh a() {
        return this.o.get();
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.zg
    public yg b() {
        return this.u.get();
    }
}

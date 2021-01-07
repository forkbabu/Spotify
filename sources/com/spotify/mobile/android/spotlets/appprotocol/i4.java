package com.spotify.mobile.android.spotlets.appprotocol;

import android.text.TextUtils;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.spotlets.appprotocol.u3;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.appprotocol.api.NotAuthorizedException;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import com.spotify.music.appprotocol.api.session.HelloDetailsAppProtocol$HelloDetails;
import io.reactivex.y;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

public class i4 implements t3, u3.a {
    private final j4 a;
    private final u3 b;
    private final ExecutorService c;
    private final y d;
    private c4 e;
    private x3 f;
    private final Map<String, x3> g = new HashMap(1);
    private final io.reactivex.disposables.a h = new io.reactivex.disposables.a();
    private final g i = new a();
    private final g j = new b();
    private final g k = new c();
    private final g l = new d();
    private final g m = new e();
    private final g n = new f();

    class a implements g {
        a() {
        }

        @Override // com.spotify.mobile.android.spotlets.appprotocol.i4.g
        public void a(ef2 ef2) {
            if (i4.this.e != null) {
                ((d4) i4.this.e).g(ef2.e(1), (HelloDetailsAppProtocol$HelloDetails) ef2.b(2, HelloDetailsAppProtocol$HelloDetails.class));
            }
        }
    }

    class b implements g {
        b() {
        }

        @Override // com.spotify.mobile.android.spotlets.appprotocol.i4.g
        public void a(ef2 ef2) {
            if (i4.this.e != null) {
                ((d4) i4.this.e).d(ef2.e(1));
            }
        }
    }

    class c implements g {
        c() {
        }

        @Override // com.spotify.mobile.android.spotlets.appprotocol.i4.g
        public void a(ef2 ef2) {
            if (i4.this.e != null) {
                df2 f = df2.f(ef2);
                Logger.l("WAMP subscribe with id: %d, topic: %s.", Integer.valueOf(f.g()), f.h());
                try {
                    ((d4) i4.this.e).h(f);
                } catch (NotAuthorizedException unused) {
                    i4.this.b(32, f.g(), AppProtocolBase.a, "wamp.error.not_authorized");
                }
            }
        }
    }

    class d implements g {
        d() {
        }

        @Override // com.spotify.mobile.android.spotlets.appprotocol.i4.g
        public void a(ef2 ef2) {
            if (i4.this.e != null) {
                int c = ef2.c(1);
                int c2 = ef2.c(2);
                Logger.l("WAMP unsubscribe with id: %d, subscriptionId: %d.", Integer.valueOf(c), Integer.valueOf(c2));
                try {
                    ((d4) i4.this.e).i(c, c2);
                } catch (NotAuthorizedException unused) {
                    i4.this.b(34, c, AppProtocolBase.a, "wamp.error.not_authorized");
                }
            }
        }
    }

    class e implements g {
        e() {
        }

        @Override // com.spotify.mobile.android.spotlets.appprotocol.i4.g
        public void a(ef2 ef2) {
            oq1 f = oq1.f(ef2);
            i4.this.h.b(i4.this.q(f.h()).a(f).I0(i4.this.d).o0(i4.this.d).N0(1).R0(30, TimeUnit.SECONDS).subscribe(new e3(this, f), new d3(this, f)));
        }
    }

    class f implements g {
        f() {
        }

        @Override // com.spotify.mobile.android.spotlets.appprotocol.i4.g
        public void a(ef2 ef2) {
            ((d4) i4.this.e).f(ef2.size() >= 3 && !TextUtils.isEmpty(ef2.e(2)) ? ef2.e(2) : "wamp.error.system_shutdown");
        }
    }

    private interface g {
        void a(ef2 ef2);
    }

    public i4(j4 j4Var, u3 u3Var, ExecutorService executorService, y yVar) {
        this.a = j4Var;
        u3Var.getClass();
        this.b = u3Var;
        executorService.getClass();
        this.c = executorService;
        u3Var.a(this);
        this.d = yVar;
    }

    private static void m(Exception exc) {
        Logger.c(exc, exc.getMessage(), new Object[0]);
        Assertion.i(exc.getMessage(), exc);
    }

    private void s(Object[] objArr) {
        try {
            this.c.execute(new h3(this, objArr));
        } catch (RejectedExecutionException e2) {
            StringBuilder V0 = je.V0("Failed to execute :");
            V0.append(this.c.isShutdown());
            V0.append(", ");
            V0.append(this.c.isTerminated());
            V0.append(", ");
            V0.append(e2.getMessage());
            Assertion.i(V0.toString(), e2);
        }
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.t3
    public void a(String str, AppProtocol.ChallengeDetails challengeDetails) {
        s(new Object[]{4, str, challengeDetails});
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.t3
    public void b(int i2, int i3, Object obj, String str) {
        s(new Object[]{8, Integer.valueOf(i2), Integer.valueOf(i3), obj, str});
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.t3
    public void c(int i2, int i3) {
        s(new Object[]{33, Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.t3
    public void d(int i2) {
        s(new Object[]{35, Integer.valueOf(i2)});
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.t3
    public void e(AppProtocol.Message message, String str) {
        s(new Object[]{6, message, str});
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.t3
    public void f(int i2, AppProtocol.WelcomeDetails welcomeDetails) {
        s(new Object[]{2, Integer.valueOf(i2), welcomeDetails});
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.t3
    public void g(int i2, int i3, Object obj) {
        s(new Object[]{36, Integer.valueOf(i2), Integer.valueOf(i3), AppProtocolBase.a, AppProtocolBase.b, obj});
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.t3
    public void h(AppProtocol.Message message, String str) {
        s(new Object[]{3, message, str});
    }

    public void l(String str, x3 x3Var) {
        Object[] objArr = {str};
        if (this.g.containsKey(str)) {
            Assertion.p(Logger.f("Handler for namespace %s already registered", objArr));
        }
        this.g.put(str, x3Var);
    }

    public void n(byte[] bArr) {
        g gVar;
        try {
            ef2 b2 = this.a.b(bArr);
            try {
                int d2 = b2.d();
                if (d2 == 1) {
                    gVar = this.i;
                } else if (d2 == 32) {
                    gVar = this.k;
                } else if (d2 == 34) {
                    gVar = this.l;
                } else if (d2 == 48) {
                    gVar = this.m;
                } else if (d2 == 5) {
                    gVar = this.j;
                } else if (d2 != 6) {
                    Logger.n("No router for WAMP action %d.", Integer.valueOf(d2));
                    gVar = null;
                } else {
                    gVar = this.n;
                }
                if (gVar != null) {
                    gVar.a(b2);
                }
            } catch (Exception e2) {
                m(e2);
            }
        } catch (Exception e3) {
            m(e3);
        }
    }

    public /* synthetic */ void o(Object[] objArr) {
        try {
            Logger.l("WAMP sending: %s", Arrays.toString(objArr));
            byte[] a2 = this.a.a(Arrays.asList(objArr));
            this.b.b(a2.length, a2);
        } catch (Exception e2) {
            m(e2);
        }
    }

    public void p(int i2, byte[] bArr) {
        this.c.execute(new i3(this, bArr));
    }

    /* access modifiers changed from: package-private */
    public x3 q(String str) {
        Collection filter = Collections2.filter((Collection) this.g.entrySet(), (Predicate) new g3(str));
        if (filter.size() == 1) {
            return (x3) ((Map.Entry) filter.iterator().next()).getValue();
        }
        if (filter.size() <= 1) {
            return this.f;
        }
        throw new IllegalStateException(String.format("More than one matching handler registered matching call %s : %s", str, Arrays.toString(((AbstractCollection) Collections2.transform(filter, (Function) f3.a)).toArray(new String[filter.size()]))));
    }

    public void r(int i2, Object obj) {
        s(new Object[]{50, Integer.valueOf(i2), AppProtocolBase.a, obj});
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.t3
    public void stop() {
        this.h.f();
        this.b.a(null);
        this.c.shutdown();
        try {
            if (!this.c.awaitTermination(500, TimeUnit.MILLISECONDS)) {
                this.c.shutdownNow();
            }
        } catch (InterruptedException unused) {
            this.c.shutdownNow();
        }
        this.b.close();
    }

    public void t(x3 x3Var) {
        this.f = x3Var;
    }

    public void u(c4 c4Var) {
        this.e = c4Var;
    }
}

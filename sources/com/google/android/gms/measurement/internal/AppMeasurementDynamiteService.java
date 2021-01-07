package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.c;
import com.google.android.gms.internal.measurement.d;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.internal.measurement.ib;
import com.google.android.gms.internal.measurement.kb;
import com.google.android.gms.internal.measurement.q7;
import java.util.Map;

@DynamiteApi
public class AppMeasurementDynamiteService extends ib {
    f5 a = null;
    private Map<Integer, g6> b = new m1();

    class a implements g6 {
        private c a;

        a(c cVar) {
            this.a = cVar;
        }

        @Override // com.google.android.gms.measurement.internal.g6
        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.a.V2(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.a.l().H().b("Event listener threw exception", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements h6 {
        private c a;

        b(c cVar) {
            this.a = cVar;
        }

        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.a.V2(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.a.l().H().b("Event interceptor threw exception", e);
            }
        }
    }

    private final void D3() {
        if (this.a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void beginAdUnitExposure(String str, long j) {
        D3();
        this.a.R().z(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        D3();
        this.a.E().w0(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void clearMeasurementEnabled(long j) {
        D3();
        this.a.E().Q(null);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void endAdUnitExposure(String str, long j) {
        D3();
        this.a.R().D(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void generateEventId(kb kbVar) {
        D3();
        this.a.F().O(kbVar, this.a.F().y0());
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void getAppInstanceId(kb kbVar) {
        D3();
        this.a.k().y(new d6(this, kbVar));
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void getCachedAppInstanceId(kb kbVar) {
        D3();
        this.a.F().Q(kbVar, this.a.E().i0());
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void getConditionalUserProperties(String str, String str2, kb kbVar) {
        D3();
        this.a.k().y(new ca(this, kbVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void getCurrentScreenClass(kb kbVar) {
        D3();
        p7 Q = this.a.E().a.N().Q();
        this.a.F().Q(kbVar, Q != null ? Q.b : null);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void getCurrentScreenName(kb kbVar) {
        D3();
        p7 Q = this.a.E().a.N().Q();
        this.a.F().Q(kbVar, Q != null ? Q.a : null);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void getGmpAppId(kb kbVar) {
        D3();
        this.a.F().Q(kbVar, this.a.E().m0());
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void getMaxUserProperties(String str, kb kbVar) {
        D3();
        this.a.E();
        g.i(str);
        this.a.F().N(kbVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void getTestFlag(kb kbVar, int i) {
        D3();
        if (i == 0) {
            this.a.F().Q(kbVar, this.a.E().e0());
        } else if (i == 1) {
            this.a.F().O(kbVar, this.a.E().f0().longValue());
        } else if (i == 2) {
            z9 F = this.a.F();
            double doubleValue = this.a.E().h0().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                kbVar.m(bundle);
            } catch (RemoteException e) {
                F.a.l().H().b("Error returning double value to wrapper", e);
            }
        } else if (i == 3) {
            this.a.F().N(kbVar, this.a.E().g0().intValue());
        } else if (i == 4) {
            this.a.F().S(kbVar, this.a.E().d0().booleanValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void getUserProperties(String str, String str2, boolean z, kb kbVar) {
        D3();
        this.a.k().y(new d7(this, kbVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void initForTests(Map map) {
        D3();
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void initialize(com.google.android.gms.dynamic.a aVar, f fVar, long j) {
        Context context = (Context) com.google.android.gms.dynamic.b.E3(aVar);
        f5 f5Var = this.a;
        if (f5Var == null) {
            this.a = f5.a(context, fVar, Long.valueOf(j));
        } else {
            f5Var.l().H().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void isDataCollectionEnabled(kb kbVar) {
        D3();
        this.a.k().y(new c9(this, kbVar));
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        D3();
        this.a.E().X(str, str2, bundle, z, z2, j);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void logEventAndBundle(String str, String str2, Bundle bundle, kb kbVar, long j) {
        Bundle bundle2;
        D3();
        g.i(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.a.k().y(new b8(this, kbVar, new r(str2, new m(bundle), "app", j), str));
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void logHealthData(int i, String str, com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2, com.google.android.gms.dynamic.a aVar3) {
        Object obj;
        Object obj2;
        D3();
        Object obj3 = null;
        if (aVar == null) {
            obj = null;
        } else {
            obj = com.google.android.gms.dynamic.b.E3(aVar);
        }
        if (aVar2 == null) {
            obj2 = null;
        } else {
            obj2 = com.google.android.gms.dynamic.b.E3(aVar2);
        }
        if (aVar3 != null) {
            obj3 = com.google.android.gms.dynamic.b.E3(aVar3);
        }
        this.a.l().A(i, true, false, str, obj, obj2, obj3);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void onActivityCreated(com.google.android.gms.dynamic.a aVar, Bundle bundle, long j) {
        D3();
        g7 g7Var = this.a.E().c;
        if (g7Var != null) {
            this.a.E().c0();
            g7Var.onActivityCreated((Activity) com.google.android.gms.dynamic.b.E3(aVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void onActivityDestroyed(com.google.android.gms.dynamic.a aVar, long j) {
        D3();
        g7 g7Var = this.a.E().c;
        if (g7Var != null) {
            this.a.E().c0();
            g7Var.onActivityDestroyed((Activity) com.google.android.gms.dynamic.b.E3(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void onActivityPaused(com.google.android.gms.dynamic.a aVar, long j) {
        D3();
        g7 g7Var = this.a.E().c;
        if (g7Var != null) {
            this.a.E().c0();
            g7Var.onActivityPaused((Activity) com.google.android.gms.dynamic.b.E3(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void onActivityResumed(com.google.android.gms.dynamic.a aVar, long j) {
        D3();
        g7 g7Var = this.a.E().c;
        if (g7Var != null) {
            this.a.E().c0();
            g7Var.onActivityResumed((Activity) com.google.android.gms.dynamic.b.E3(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void onActivitySaveInstanceState(com.google.android.gms.dynamic.a aVar, kb kbVar, long j) {
        D3();
        g7 g7Var = this.a.E().c;
        Bundle bundle = new Bundle();
        if (g7Var != null) {
            this.a.E().c0();
            g7Var.onActivitySaveInstanceState((Activity) com.google.android.gms.dynamic.b.E3(aVar), bundle);
        }
        try {
            kbVar.m(bundle);
        } catch (RemoteException e) {
            this.a.l().H().b("Error returning bundle value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void onActivityStarted(com.google.android.gms.dynamic.a aVar, long j) {
        D3();
        if (this.a.E().c != null) {
            this.a.E().c0();
            Activity activity = (Activity) com.google.android.gms.dynamic.b.E3(aVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void onActivityStopped(com.google.android.gms.dynamic.a aVar, long j) {
        D3();
        if (this.a.E().c != null) {
            this.a.E().c0();
            Activity activity = (Activity) com.google.android.gms.dynamic.b.E3(aVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void performAction(Bundle bundle, kb kbVar, long j) {
        D3();
        kbVar.m(null);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void registerOnMeasurementEventListener(c cVar) {
        D3();
        g6 g6Var = this.b.get(Integer.valueOf(cVar.a()));
        if (g6Var == null) {
            g6Var = new a(cVar);
            this.b.put(Integer.valueOf(cVar.a()), g6Var);
        }
        this.a.E().K(g6Var);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void resetAnalyticsData(long j) {
        D3();
        i6 E = this.a.E();
        E.S(null);
        E.k().y(new s6(E, j));
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void setConditionalUserProperty(Bundle bundle, long j) {
        D3();
        if (bundle == null) {
            this.a.l().E().a("Conditional user property must not be null");
        } else {
            this.a.E().H(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void setConsent(Bundle bundle, long j) {
        D3();
        i6 E = this.a.E();
        if (q7.b() && E.j().x(null, t.P0)) {
            E.w();
            String e = e.e(bundle);
            if (e != null) {
                E.l().J().b("Ignoring invalid consent setting", e);
                E.l().J().a("Valid consent values are 'granted', 'denied'");
            }
            E.J(e.h(bundle), 10, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void setCurrentScreen(com.google.android.gms.dynamic.a aVar, String str, String str2, long j) {
        D3();
        this.a.N().H((Activity) com.google.android.gms.dynamic.b.E3(aVar), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void setDataCollectionEnabled(boolean z) {
        D3();
        i6 E = this.a.E();
        E.w();
        E.k().y(new h7(E, z));
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        D3();
        i6 E = this.a.E();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        E.k().y(new l6(E, bundle2));
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void setEventInterceptor(c cVar) {
        D3();
        i6 E = this.a.E();
        b bVar = new b(cVar);
        E.w();
        E.k().y(new u6(E, bVar));
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void setInstanceIdProvider(d dVar) {
        D3();
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void setMeasurementEnabled(boolean z, long j) {
        D3();
        this.a.E().Q(Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void setMinimumSessionDuration(long j) {
        D3();
        i6 E = this.a.E();
        E.k().y(new p6(E, j));
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void setSessionTimeoutDuration(long j) {
        D3();
        i6 E = this.a.E();
        E.k().y(new o6(E, j));
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void setUserId(String str, long j) {
        D3();
        this.a.E().a0(null, "_id", str, true, j);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void setUserProperty(String str, String str2, com.google.android.gms.dynamic.a aVar, boolean z, long j) {
        D3();
        this.a.E().a0(str, str2, com.google.android.gms.dynamic.b.E3(aVar), z, j);
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public void unregisterOnMeasurementEventListener(c cVar) {
        D3();
        g6 remove = this.b.remove(Integer.valueOf(cVar.a()));
        if (remove == null) {
            remove = new a(cVar);
        }
        this.a.E().s0(remove);
    }
}

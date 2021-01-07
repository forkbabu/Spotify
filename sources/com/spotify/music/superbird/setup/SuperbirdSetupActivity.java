package com.spotify.music.superbird.setup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.v;
import com.spotify.mobius.android.g;
import com.spotify.music.C0707R;
import com.spotify.music.superbird.setup.domain.SetupStep;
import com.spotify.music.superbird.setup.domain.d;
import com.spotify.music.superbird.setup.domain.f;
import com.spotify.music.superbird.setup.domain.p;
import com.spotify.music.superbird.setup.domain.q;
import kotlin.jvm.internal.h;

public final class SuperbirdSetupActivity extends ss2 {
    public static final /* synthetic */ int M = 0;
    public SetupNavigator G;
    public j H;
    private final cj9 I = new cj9(this);
    private final b J = new b(this);
    private final a K = new a(this);
    private g<p, f, d, q> L;

    public static final class a extends BroadcastReceiver {
        final /* synthetic */ SuperbirdSetupActivity a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(SuperbirdSetupActivity superbirdSetupActivity) {
            this.a = superbirdSetupActivity;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SuperbirdSetupActivity.U0(this.a).h(f.u.a);
        }
    }

    public static final class b extends BroadcastReceiver {
        final /* synthetic */ SuperbirdSetupActivity a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(SuperbirdSetupActivity superbirdSetupActivity) {
            this.a = superbirdSetupActivity;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras;
            Integer valueOf = (intent == null || (extras = intent.getExtras()) == null) ? null : Integer.valueOf(extras.getInt("android.bluetooth.adapter.extra.STATE", -1));
            if (valueOf != null && valueOf.intValue() == 10) {
                SuperbirdSetupActivity.U0(this.a).h(f.c.a);
            } else if (valueOf != null && valueOf.intValue() == 12) {
                SuperbirdSetupActivity.U0(this.a).h(f.d.a);
            }
        }
    }

    static final class c<T> implements v<p> {
        final /* synthetic */ SuperbirdSetupActivity a;

        c(SuperbirdSetupActivity superbirdSetupActivity) {
            this.a = superbirdSetupActivity;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.v
        public void a(p pVar) {
            p pVar2 = pVar;
            SuperbirdSetupActivity superbirdSetupActivity = this.a;
            int i = SuperbirdSetupActivity.M;
            superbirdSetupActivity.getClass();
            SetupStep f = pVar2 != null ? pVar2.f() : null;
            if (f != null) {
                switch (f.ordinal()) {
                    case 0:
                        superbirdSetupActivity.finish();
                        return;
                    case 1:
                        SetupNavigator setupNavigator = superbirdSetupActivity.G;
                        if (setupNavigator != null) {
                            setupNavigator.q();
                            return;
                        } else {
                            h.k("navigator");
                            throw null;
                        }
                    case 2:
                        SetupNavigator setupNavigator2 = superbirdSetupActivity.G;
                        if (setupNavigator2 != null) {
                            setupNavigator2.o();
                            return;
                        } else {
                            h.k("navigator");
                            throw null;
                        }
                    case 3:
                        SetupNavigator setupNavigator3 = superbirdSetupActivity.G;
                        if (setupNavigator3 != null) {
                            setupNavigator3.f();
                            return;
                        } else {
                            h.k("navigator");
                            throw null;
                        }
                    case 4:
                        SetupNavigator setupNavigator4 = superbirdSetupActivity.G;
                        if (setupNavigator4 != null) {
                            setupNavigator4.d();
                            return;
                        } else {
                            h.k("navigator");
                            throw null;
                        }
                    case 5:
                        SetupNavigator setupNavigator5 = superbirdSetupActivity.G;
                        if (setupNavigator5 != null) {
                            setupNavigator5.p();
                            return;
                        } else {
                            h.k("navigator");
                            throw null;
                        }
                    case 6:
                        SetupNavigator setupNavigator6 = superbirdSetupActivity.G;
                        if (setupNavigator6 != null) {
                            setupNavigator6.c();
                            return;
                        } else {
                            h.k("navigator");
                            throw null;
                        }
                    case 7:
                        SetupNavigator setupNavigator7 = superbirdSetupActivity.G;
                        if (setupNavigator7 != null) {
                            setupNavigator7.e();
                            return;
                        } else {
                            h.k("navigator");
                            throw null;
                        }
                    case 8:
                        SetupNavigator setupNavigator8 = superbirdSetupActivity.G;
                        if (setupNavigator8 != null) {
                            setupNavigator8.l();
                            return;
                        } else {
                            h.k("navigator");
                            throw null;
                        }
                    case 9:
                        SetupNavigator setupNavigator9 = superbirdSetupActivity.G;
                        if (setupNavigator9 != null) {
                            setupNavigator9.m();
                            return;
                        } else {
                            h.k("navigator");
                            throw null;
                        }
                    case 10:
                        SetupNavigator setupNavigator10 = superbirdSetupActivity.G;
                        if (setupNavigator10 != null) {
                            setupNavigator10.h();
                            return;
                        } else {
                            h.k("navigator");
                            throw null;
                        }
                    case 11:
                        SetupNavigator setupNavigator11 = superbirdSetupActivity.G;
                        if (setupNavigator11 != null) {
                            setupNavigator11.g();
                            return;
                        } else {
                            h.k("navigator");
                            throw null;
                        }
                    case 12:
                        SetupNavigator setupNavigator12 = superbirdSetupActivity.G;
                        if (setupNavigator12 != null) {
                            setupNavigator12.i();
                            return;
                        } else {
                            h.k("navigator");
                            throw null;
                        }
                    case 13:
                        SetupNavigator setupNavigator13 = superbirdSetupActivity.G;
                        if (setupNavigator13 != null) {
                            setupNavigator13.n();
                            return;
                        } else {
                            h.k("navigator");
                            throw null;
                        }
                    case 14:
                        SetupNavigator setupNavigator14 = superbirdSetupActivity.G;
                        if (setupNavigator14 != null) {
                            setupNavigator14.k();
                            return;
                        } else {
                            h.k("navigator");
                            throw null;
                        }
                    case 15:
                        SetupNavigator setupNavigator15 = superbirdSetupActivity.G;
                        if (setupNavigator15 != null) {
                            setupNavigator15.j();
                            return;
                        } else {
                            h.k("navigator");
                            throw null;
                        }
                    default:
                        return;
                }
            }
        }
    }

    public static final /* synthetic */ g U0(SuperbirdSetupActivity superbirdSetupActivity) {
        g<p, f, d, q> gVar = superbirdSetupActivity.L;
        if (gVar != null) {
            return gVar;
        }
        h.k("mobiusLoopViewModel");
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        g<p, f, d, q> gVar = this.L;
        if (gVar != null) {
            gVar.h(f.a.a);
        } else {
            h.k("mobiusLoopViewModel");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j jVar = this.H;
        if (jVar != null) {
            e0 a2 = new g0(this, jVar).a(g.class);
            h.d(a2, "ViewModelProvider(owner,…ctory).get(T::class.java)");
            g<p, f, d, q> gVar = (g) a2;
            this.L = gVar;
            if (gVar != null) {
                gVar.i().h(this, new c(this));
                registerReceiver(this.J, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                registerReceiver(this.K, new IntentFilter("android.bluetooth.adapter.action.DISCOVERY_FINISHED"));
                SetupNavigator setupNavigator = this.G;
                if (setupNavigator != null) {
                    setupNavigator.b(new SuperbirdSetupActivity$onCreate$2(this.I));
                    setContentView(C0707R.layout.activity_superbird_setup);
                    return;
                }
                h.k("navigator");
                throw null;
            }
            h.k("mobiusLoopViewModel");
            throw null;
        }
        h.k("viewModelFactory");
        throw null;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        SetupNavigator setupNavigator = this.G;
        if (setupNavigator != null) {
            setupNavigator.b(SuperbirdSetupActivity$onDestroy$1.a);
            unregisterReceiver(this.J);
            unregisterReceiver(this.K);
            return;
        }
        h.k("navigator");
        throw null;
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        ij9 c2 = ij9.c(this.I);
        h.d(c2, "PageViewObservable.creat…fragmentPageViewDelegate)");
        return c2;
    }
}

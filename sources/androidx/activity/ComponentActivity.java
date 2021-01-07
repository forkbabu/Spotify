package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.app.e;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.i;
import androidx.lifecycle.i0;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.z;
import androidx.savedstate.SavedStateRegistry;

public class ComponentActivity extends e implements n, i0, i, androidx.savedstate.b, c {
    private final o b;
    private final androidx.savedstate.a c = androidx.savedstate.a.a(this);
    private h0 f;
    private g0.b n;
    private final OnBackPressedDispatcher o = new OnBackPressedDispatcher(new a());

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {
        h0 a;

        b() {
        }
    }

    public ComponentActivity() {
        o oVar = new o(this);
        this.b = oVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            oVar.a(new l() {
                /* class androidx.activity.ComponentActivity.AnonymousClass2 */

                @Override // androidx.lifecycle.l
                public void p(n nVar, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
        oVar.a(new l() {
            /* class androidx.activity.ComponentActivity.AnonymousClass3 */

            @Override // androidx.lifecycle.l
            public void p(n nVar, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                    ComponentActivity.this.Z().a();
                }
            }
        });
        if (19 <= i && i <= 23) {
            oVar.a(new ImmLeaksCleaner(this));
        }
    }

    @Override // androidx.lifecycle.n
    public Lifecycle A() {
        return this.b;
    }

    @Override // androidx.activity.c
    public final OnBackPressedDispatcher S0() {
        return this.o;
    }

    @Override // androidx.lifecycle.i0
    public h0 Z() {
        if (getApplication() != null) {
            if (this.f == null) {
                b bVar = (b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.f = bVar.a;
                }
                if (this.f == null) {
                    this.f = new h0();
                }
            }
            return this.f;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry g0() {
        return this.c.b();
    }

    @Override // androidx.lifecycle.i
    public g0.b l1() {
        if (getApplication() != null) {
            if (this.n == null) {
                this.n = new b0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            }
            return this.n;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.o.d();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c.c(bundle);
        z.c(this);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        h0 h0Var = this.f;
        if (h0Var == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            h0Var = bVar.a;
        }
        if (h0Var == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.a = h0Var;
        return bVar2;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        o oVar = this.b;
        if (oVar instanceof o) {
            oVar.k(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.c.d(bundle);
    }
}

package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.k;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.a;
import dagger.android.b;
import dagger.android.h;
import defpackage.ij9;
import defpackage.zi9;
import io.reactivex.s;

/* renamed from: ss2  reason: default package */
public abstract class ss2 extends jd0 implements aj9, ij9.b, h {
    it2 C;
    DispatchingAndroidInjector<Object> D;
    vt2 E;
    private final zi9.a F = new zi9.a();

    @Override // dagger.android.h
    public b<Object> C() {
        return this.D;
    }

    @Override // defpackage.dj9
    public void E(String str, String str2) {
        this.F.E(str, str2);
    }

    @Override // defpackage.dj9
    public void K() {
        this.F.K();
    }

    /* access modifiers changed from: protected */
    public k O0() {
        return null;
    }

    public final boolean P0() {
        return v0().o0();
    }

    /* access modifiers changed from: protected */
    public boolean R0() {
        return true;
    }

    public void T0() {
        ((ht2) this.C).b();
    }

    @Override // defpackage.aj9
    public final boolean k0() {
        return !P0();
    }

    @Override // defpackage.zi9
    public s<ej9> o() {
        return this.F.o();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        a.a(this);
        k O0 = O0();
        if (O0 != null) {
            v0().K0(O0);
        }
        super.onCreate(bundle);
        if (bundle != null) {
            bundle.setClassLoader(getClassLoader());
        }
        setVolumeControlStream(3);
    }

    @Override // androidx.appcompat.app.g, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        for (ts2 ts2 : this.E.a()) {
            if (ts2.onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            intent.setExtrasClassLoader(getClassLoader());
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (R0()) {
            ((ht2) this.C).b();
        }
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.d(getClass().getSimpleName());
    }
}

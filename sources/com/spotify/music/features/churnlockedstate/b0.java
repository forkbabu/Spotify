package com.spotify.music.features.churnlockedstate;

import android.content.Intent;
import android.os.Build;
import androidx.core.app.a;
import com.spotify.base.java.logging.Logger;
import com.spotify.rxjava2.q;
import io.reactivex.y;

/* access modifiers changed from: package-private */
public class b0 implements s {
    private final w a;
    private final u b;
    private final y c;
    private final z d;
    private final q e = new q();
    private t f;

    public b0(w wVar, u uVar, y yVar, z zVar) {
        this.a = wVar;
        this.b = uVar;
        this.c = yVar;
        this.d = zVar;
    }

    @Override // com.spotify.music.features.churnlockedstate.s
    public void a() {
        this.a.a("downgrade-click");
        ((ChurnLockedStateActivity) this.f).U0();
        ((ChurnLockedStateActivity) this.f).W0("https://www.spotify.com/redirect/generic/?redirect_key=android_churn_locked_state_cancel_subscription&utm_source=spotify&utm_medium=lockedstate&utm_campaign=android_cls");
    }

    @Override // com.spotify.music.features.churnlockedstate.s
    public void b(t tVar) {
        this.f = tVar;
    }

    @Override // com.spotify.music.features.churnlockedstate.s
    public void c() {
        this.a.a("update-payment-click");
        ((ChurnLockedStateActivity) this.f).U0();
        ((ChurnLockedStateActivity) this.f).X0("https://www.spotify.com/redirect/generic/?redirect_key=android_churn_locked_state_update_payment&utm_source=spotify&utm_medium=lockedstate&utm_campaign=android_cls");
    }

    @Override // com.spotify.music.features.churnlockedstate.s
    public void d(int i, Intent intent) {
        if (i != -1) {
            ((ChurnLockedStateActivity) this.f).V0();
            return;
        }
        if ("cls_unlocked".equals(intent != null ? intent.getStringExtra("reason") : null)) {
            this.b.f();
            ((ChurnLockedStateActivity) this.f).a1();
            return;
        }
        ((ChurnLockedStateActivity) this.f).V0();
    }

    @Override // com.spotify.music.features.churnlockedstate.s
    public void e() {
        this.e.c();
    }

    @Override // com.spotify.music.features.churnlockedstate.s
    public void f() {
        this.a.a("back-click");
        ChurnLockedStateActivity churnLockedStateActivity = (ChurnLockedStateActivity) this.f;
        churnLockedStateActivity.getClass();
        int i = a.c;
        int i2 = Build.VERSION.SDK_INT;
        churnLockedStateActivity.finishAffinity();
    }

    @Override // com.spotify.music.features.churnlockedstate.s
    public void g() {
        this.a.a("impression");
        ((ChurnLockedStateActivity) this.f).U0();
        this.e.a(this.b.c().o0(this.c).subscribe(new m(this), new n(this)));
    }

    @Override // com.spotify.music.features.churnlockedstate.s
    public void h(boolean z) {
        if (z) {
            this.d.a();
        }
    }

    public /* synthetic */ void i(Boolean bool) {
        if (!bool.booleanValue()) {
            ((ChurnLockedStateActivity) this.f).a1();
        } else {
            ((ChurnLockedStateActivity) this.f).V0();
        }
    }

    public /* synthetic */ void j(Throwable th) {
        Logger.e(th, "Cannot detect churn locked state!", new Object[0]);
        ((ChurnLockedStateActivity) this.f).V0();
    }
}

package com.spotify.magiclink;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.g;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.m;
import com.spotify.login.AuthenticationMetadata;
import com.spotify.login.r0;
import com.spotify.mobile.android.util.ui.Lifecycle$Listeners;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.l;
import com.spotify.music.C0707R;
import dagger.android.a;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;

public class MagicLinkActivity extends g implements k {
    private final Lifecycle$Listeners A = new Lifecycle$Listeners();
    r0 B;
    y C;
    s D;
    o11 E;
    r F;
    private Optional<o> G = Optional.absent();
    private b H = EmptyDisposable.INSTANCE;

    static void P0(MagicLinkActivity magicLinkActivity, int i) {
        magicLinkActivity.E.a(i11.d(p11.c(), m11.b()));
        o11 o11 = magicLinkActivity.E;
        p11 c = p11.c();
        l11 b = l11.b();
        n11 b2 = n11.b();
        o11.a(i11.c(c, b, b2, "authErrorCode: " + i));
        if (i == 17) {
            magicLinkActivity.E.a(i11.b(p11.c(), k11.a()));
            f c2 = m.c(magicLinkActivity, magicLinkActivity.getString(C0707R.string.magiclink_error_dialog_region_mismatch_title), magicLinkActivity.getString(C0707R.string.magiclink_error_dialog_region_mismatch_body));
            c2.f(magicLinkActivity.getString(C0707R.string.magiclink_error_dialog_region_mismatch_cta), new f(magicLinkActivity));
            c2.h(new e(magicLinkActivity));
            c2.b().a();
            return;
        }
        magicLinkActivity.U0();
    }

    static void R0(MagicLinkActivity magicLinkActivity) {
        magicLinkActivity.E.a(i11.d(p11.c(), m11.c()));
        if (!magicLinkActivity.G.isPresent()) {
            Logger.d("Invalid email data, can not set password token", new Object[0]);
        } else {
            magicLinkActivity.D.c(magicLinkActivity.G.get().a());
        }
        magicLinkActivity.F.a(magicLinkActivity);
    }

    private void U0() {
        this.E.a(i11.b(p11.c(), k11.b()));
        f b = m.b(this, getString(C0707R.string.magiclink_error_dialog_text_link_expired));
        b.f(getString(C0707R.string.magiclink_error_dialog_button_send_new_link), new h(this));
        b.e(getString(C0707R.string.magiclink_error_dialog_close), new g(this));
        b.h(new b(this));
        b.b().a();
    }

    public void T0(DialogInterface dialogInterface, int i) {
        this.E.a(i11.a(p11.c(), j11.h(), k11.b()));
        if (this.G.isPresent()) {
            this.F.b(this, this.G.get().c(), true);
        }
    }

    @Override // com.spotify.mobile.android.util.ui.k
    public boolean e1(l lVar) {
        return this.A.e1(lVar);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(C0707R.style.res_2132083522_theme_login);
        a.a(this);
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_magiclink);
        if (bundle == null) {
            this.E.a(i11.g(p11.c()));
        }
        Optional<o> a = p.a(getIntent().getDataString());
        this.G = a;
        if (!a.isPresent()) {
            this.E.a(i11.d(p11.c(), m11.l()));
            U0();
            return;
        }
        this.E.a(i11.d(p11.c(), m11.m()));
        this.A.c(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A.e();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.A.f();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.A.h();
        if (!this.G.isPresent()) {
            Logger.d("Invalid email data, can not login", new Object[0]);
        } else {
            this.B.d(this.G.get().b(), false, AuthenticationMetadata.AuthSource.MAGICLINK).B(this.C).subscribe(new q(this));
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        this.A.j();
    }

    @Override // androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        this.H.dispose();
        this.A.k();
        super.onStop();
    }

    @Override // com.spotify.mobile.android.util.ui.k
    public boolean y0(l lVar) {
        Lifecycle$Listeners lifecycle$Listeners = this.A;
        lVar.getClass();
        return lifecycle$Listeners.y0(lVar);
    }
}

package com.spotify.music.features.imagerecs.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.encore.foundation.R;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.music.C0707R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.imagerecs.presenter.k;
import com.spotify.music.features.imagerecs.presenter.l;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import defpackage.ifd;

public class ImageRecsActivity extends ss2 implements c.a, mfd, ifd.b {
    LoadingView G;
    LinearLayout H;
    TextView I;
    TextView J;
    k K;
    boolean L;

    public void U0() {
        this.I.setText(getText(C0707R.string.permission_denied_camera));
        this.J.setVisibility(8);
    }

    public void V0() {
        this.I.setText(getText(C0707R.string.onboarding_content));
        this.J.setVisibility(0);
        this.H.removeView(this.G);
        LoadingView loadingView = this.G;
        if (loadingView != null) {
            loadingView.setVisibility(8);
            this.G = null;
        }
    }

    public void W0(int i) {
        this.H.removeView(this.G);
        LoadingView loadingView = this.G;
        if (loadingView != null) {
            loadingView.setVisibility(8);
            this.G = null;
        }
        this.I.setText(getText(i));
        this.J.setVisibility(8);
    }

    public void X0() {
        this.G = LoadingView.l(getLayoutInflater());
        this.H.addView(this.G, 0, new LinearLayout.LayoutParams(-1, -1));
        this.G.setDelayBeforeShowing(0);
        this.G.r();
    }

    public void a1() {
        this.I.setText(getText(C0707R.string.permission_denied_storage));
        this.J.setVisibility(8);
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.IMAGERECS;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.E2;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 4660) {
            ((l) this.K).h(intent);
        } else {
            ((l) this.K).g(i, i2, intent);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.L) {
            finish();
        }
        setContentView(C0707R.layout.activity_image_search);
        this.H = (LinearLayout) findViewById(C0707R.id.contnet);
        this.I = (TextView) findViewById(C0707R.id.textView);
        this.J = (TextView) findViewById(C0707R.id.textView2);
        androidx.core.widget.c.n(this.I, R.style.TextAppearance_Encore_BalladBold);
        me.grantland.widget.a d = me.grantland.widget.a.d(this.I);
        d.o(2, 14.0f);
        d.n(22.0f);
        d.m(3);
        ((Button) findViewById(C0707R.id.btn_cancel)).setOnClickListener(new b(this));
        ((Button) findViewById(C0707R.id.take_picture)).setOnClickListener(new c(this));
        ((Button) findViewById(C0707R.id.pick_picture)).setOnClickListener(new a(this));
        ((l) this.K).k(this);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((l) this.K).l();
        this.H.removeAllViews();
        this.G = null;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        ((l) this.K).i();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        super.onStop();
        ((l) this.K).j();
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.IMAGERECS, ViewUris.E2.toString());
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.v0;
    }
}

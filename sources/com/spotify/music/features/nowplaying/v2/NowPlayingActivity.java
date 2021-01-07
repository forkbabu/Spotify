package com.spotify.music.features.nowplaying.v2;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import com.spotify.android.flags.c;
import com.spotify.android.goldenpath.a;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import io.reactivex.processors.BehaviorProcessor;
import io.reactivex.y;

public class NowPlayingActivity extends ss2 implements gsb, vs2 {
    public static final /* synthetic */ int S = 0;
    g<wlf<Fragment>> G;
    g<c> H;
    o I;
    y J;
    y K;
    pz1 L;
    jy7 M;
    qla N;
    hy7 O;
    private ws2 P;
    private final BehaviorProcessor<Boolean> Q = BehaviorProcessor.r0();
    private final q R = new q();

    @Override // defpackage.vs2
    public final void I1(ws2 ws2) {
        this.P = ws2;
    }

    @Override // defpackage.gsb
    public g<Boolean> f() {
        return this.Q.s();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, C0707R.anim.nowplaying_activity_exit);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ws2 ws2 = this.P;
        if (ws2 == null || !ws2.b()) {
            Fragment T = this.I.T(C0707R.id.container);
            if (T instanceof hsb) {
                ((hsb) T).a();
            }
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        overridePendingTransition(C0707R.anim.nowplaying_activity_enter, 0);
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_now_playing);
        setTitle(C0707R.string.now_playing_view_title);
        a.b(this);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        this.O.a();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        this.R.a(this.G.O(d.a).e0(this.J).Q(this.K).subscribe(new c(this), a.a));
        this.R.a(this.H.subscribe(new b(this)));
        jy7 jy7 = this.M;
        com.spotify.music.libs.viewuri.c cVar = ViewUris.d0;
        jy7.a(cVar.toString());
        this.N.a(cVar.toString());
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        super.onStop();
        this.R.c();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.Q.onNext(Boolean.valueOf(z));
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.NOWPLAYING, ViewUris.h0.toString());
    }

    public void finish(View view) {
        finish();
    }
}

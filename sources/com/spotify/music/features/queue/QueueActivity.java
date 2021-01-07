package com.spotify.music.features.queue;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.o;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.music.C0707R;
import com.spotify.music.libs.adaptiveui.di.OrientationMode;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.remoteconfig.u6;
import com.spotify.rxjava2.q;
import defpackage.ifd;
import io.reactivex.g;
import io.reactivex.y;

public class QueueActivity extends ss2 implements c.a, ifd.b, mfd {
    public static final /* synthetic */ int M = 0;
    o G;
    g<com.spotify.android.flags.c> H;
    y I;
    OrientationMode J;
    u6 K;
    private final q L = new q();

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, C0707R.anim.queue_activity_exit);
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.NOWPLAYING_QUEUE;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.i0;
    }

    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        overridePendingTransition(C0707R.anim.queue_activity_enter, 0);
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_queue);
        setRequestedOrientation(this.J.d());
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        this.L.a(this.H.E().A(new c(this)).B(this.I).subscribe(new e(this), d.a));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        super.onStop();
        this.L.c();
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.NOWPLAYING_QUEUE, ViewUris.i0.toString());
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.R0;
    }

    public void finish(View view) {
        finish();
    }
}

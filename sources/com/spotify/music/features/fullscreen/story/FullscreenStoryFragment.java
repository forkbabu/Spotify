package com.spotify.music.features.fullscreen.story;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.C0707R;
import com.spotify.music.features.fullscreen.story.logger.FullscreenStoryLogger;
import com.spotify.music.libs.fullscreen.story.domain.i;
import com.spotify.music.libs.fullscreen.story.domain.k;
import com.spotify.music.libs.fullscreen.story.domain.m;
import com.spotify.music.libs.fullscreen.story.domain.n;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import defpackage.gd5;
import kotlin.jvm.internal.h;

public class FullscreenStoryFragment extends Fragment implements ws2, s, gd5.b, mfd, c.a {
    l g0;
    com.jakewharton.rxrelay2.c<Boolean> h0;
    com.jakewharton.rxrelay2.c<Boolean> i0;
    gd5 j0;
    String k0;
    cqe l0;
    FullscreenStoryLogger m0;
    private long n0;
    private MobiusLoop.g<m, i> o0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return "Fullscreen story";
    }

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        FullscreenStoryLogger fullscreenStoryLogger = this.m0;
        cqe cqe = this.l0;
        long j = this.n0;
        if (j > 0) {
            fullscreenStoryLogger.a(new k.g(cqe.d() - j));
        }
        this.n0 = 0;
        this.i0.accept(Boolean.FALSE);
        this.o0.stop();
        super.H3();
    }

    @Override // androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.n0 = this.l0.d();
        this.o0.start();
        this.i0.accept(Boolean.TRUE);
    }

    @Override // androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        m b = this.o0.b();
        h.e(bundle, "bundle");
        h.e(b, "model");
        bundle.putParcelable("fullscreen_story_model", b);
    }

    @Override // defpackage.ws2
    public boolean b() {
        this.h0.accept(Boolean.TRUE);
        return true;
    }

    @Override // defpackage.gd5.b
    public void close() {
        j4().finish();
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.FULLSCREEN_STORY;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.f;
    }

    @Override // defpackage.gd5.b
    public View i() {
        return m4();
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return kfd.m0.getName();
    }

    @Override // androidx.fragment.app.Fragment
    public void m3(Bundle bundle) {
        super.m3(bundle);
        this.o0.c(this.j0);
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.FULLSCREEN_STORY, ViewUris.f.toString());
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_fullscreen_story, viewGroup, false);
        this.o0 = this.g0.a(n.b(bundle, this.k0));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        this.o0.d();
        super.y3();
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.m0;
    }
}

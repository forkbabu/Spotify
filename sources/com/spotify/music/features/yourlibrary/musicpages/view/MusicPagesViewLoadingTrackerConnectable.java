package com.spotify.music.features.yourlibrary.musicpages.view;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.libs.performance.tracking.h0;
import com.spotify.music.libs.viewuri.c;

public class MusicPagesViewLoadingTrackerConnectable implements g<MusicPagesModel, s0>, m {
    private final c.a a;
    private final ij9 b;
    private final h0 c;
    private ViewLoadingTracker f;

    class a implements h<MusicPagesModel> {
        a() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            MusicPagesModel musicPagesModel = (MusicPagesModel) obj;
            if (MusicPagesViewLoadingTrackerConnectable.this.f.k()) {
                return;
            }
            if (!MusicPagesViewLoadingTrackerConnectable.this.f.m() && musicPagesModel.g()) {
                MusicPagesViewLoadingTrackerConnectable.this.f.w();
            } else if (MusicPagesViewLoadingTrackerConnectable.this.f.m()) {
                MusicPagesModel.LoadingState l = musicPagesModel.l();
                if (l == MusicPagesModel.LoadingState.LOADED || l == MusicPagesModel.LoadingState.LOADED_EMPTY || l == MusicPagesModel.LoadingState.LOADED_EMPTY_WITH_FILTER || l == MusicPagesModel.LoadingState.LOADED_EMPTY_WITH_TEXT_FILTER || l == MusicPagesModel.LoadingState.LOADED_PARTIALLY) {
                    MusicPagesViewLoadingTrackerConnectable.this.f.g();
                }
            }
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            MusicPagesViewLoadingTrackerConnectable.b(MusicPagesViewLoadingTrackerConnectable.this);
        }
    }

    public MusicPagesViewLoadingTrackerConnectable(c.a aVar, ij9 ij9, n nVar, h0 h0Var) {
        this.a = aVar;
        this.b = ij9;
        this.c = h0Var;
        ((Fragment) nVar).A().a(this);
    }

    static void b(MusicPagesViewLoadingTrackerConnectable musicPagesViewLoadingTrackerConnectable) {
        ViewLoadingTracker viewLoadingTracker = musicPagesViewLoadingTrackerConnectable.f;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.f();
        }
    }

    public void c(View view, Bundle bundle) {
        this.f = this.c.a(view, this.a.getViewUri().toString(), bundle, this.b);
    }

    public void d(Bundle bundle) {
        ViewLoadingTracker viewLoadingTracker = this.f;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.t(bundle);
        }
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_STOP)
    public void onStop() {
        ViewLoadingTracker viewLoadingTracker = this.f;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.f();
        }
    }

    @Override // com.spotify.mobius.g
    public h<MusicPagesModel> t(da2<s0> da2) {
        if (this.f == null) {
            Assertion.g("initTracker must be called before connecting!");
        }
        return new a();
    }
}

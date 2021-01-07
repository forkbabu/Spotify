package com.spotify.voice.results.impl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.n;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import com.spotify.voice.results.model.e;
import dagger.android.support.DaggerFragment;
import kotlin.jvm.internal.h;

public final class VoiceResultsFragment extends DaggerFragment implements ToolbarConfig.a, c.a {
    public t0<e> h0;
    public PageLoaderView.a<e> i0;

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        t0<e> t0Var = this.h0;
        if (t0Var != null) {
            t0Var.start();
        } else {
            h.k("pageLoader");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        t0<e> t0Var = this.h0;
        if (t0Var != null) {
            t0Var.stop();
        } else {
            h.k("pageLoader");
            throw null;
        }
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        c cVar = ViewUris.h2;
        h.d(cVar, "ViewUris.VOICE_RESULTS");
        return cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        PageLoaderView.a<e> aVar = this.i0;
        if (aVar != null) {
            PageLoaderView<e> a = aVar.a(l4());
            n b3 = b3();
            t0<e> t0Var = this.h0;
            if (t0Var != null) {
                a.j0(b3, t0Var);
                h.d(a, "pageLoaderViewBuilder.cr…er, pageLoader)\n        }");
                return a;
            }
            h.k("pageLoader");
            throw null;
        }
        h.k("pageLoaderViewBuilder");
        throw null;
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.a
    public ToolbarConfig.Visibility z0() {
        return ToolbarConfig.Visibility.HIDE;
    }
}

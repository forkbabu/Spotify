package com.spotify.music.features.podcast.episode.transcript.ui.page;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import com.spotify.playlist.models.e;
import dagger.android.support.a;
import kotlin.jvm.internal.h;

public final class TranscriptFragment extends Fragment implements s, c.a {
    public t0<ab7> g0;
    public PageLoaderView.a<ab7> h0;
    private PageLoaderView<ab7> i0;

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        h.e(context, "context");
        String string = context.getString(C0707R.string.episode_transcript_page_title);
        h.d(string, "context.getString(R.stri…de_transcript_page_title)");
        return string;
    }

    public final e.b K4() {
        Bundle k4 = k4();
        h.d(k4, "requireArguments()");
        h.e(k4, "bundle");
        String string = k4.getString("TRANSCRIPT_URI", "");
        h.d(string, "bundle.getString(KEY_TRANSCRIPT_URI, \"\")");
        String string2 = k4.getString("LANGUAGE", "");
        h.d(string2, "bundle.getString(KEY_LANGUAGE, \"\")");
        boolean z = k4.getBoolean("CURATED");
        String string3 = k4.getString("CDN_URL", "");
        h.d(string3, "bundle.getString(KEY_CDN_URL, \"\")");
        return new e.b(string, string2, z, string3);
    }

    @Override // androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        PageLoaderView<ab7> pageLoaderView = this.i0;
        if (pageLoaderView != null) {
            t0<ab7> t0Var = this.g0;
            if (t0Var != null) {
                pageLoaderView.j0(this, t0Var);
                t0<ab7> t0Var2 = this.g0;
                if (t0Var2 != null) {
                    t0Var2.start();
                } else {
                    h.k("pageLoader");
                    throw null;
                }
            } else {
                h.k("pageLoader");
                throw null;
            }
        } else {
            h.k("pageLoaderView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        t0<ab7> t0Var = this.g0;
        if (t0Var != null) {
            t0Var.stop();
        } else {
            h.k("pageLoader");
            throw null;
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        c a = c.a(K4().d());
        h.d(a, "ViewUri.create(getEpisod…riptItem().transcriptUri)");
        return a;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return "android-feature-podcast-episodetranscript";
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        h.e(context, "context");
        a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.PODCAST_EPISODE_TRANSCRIPT, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        PageLoaderView.a<ab7> aVar = this.h0;
        if (aVar != null) {
            PageLoaderView<ab7> a = aVar.a(l4());
            h.d(a, "pageLoaderViewBuilder.createView(requireContext())");
            this.i0 = a;
            if (a != null) {
                return a;
            }
            h.k("pageLoaderView");
            throw null;
        }
        h.k("pageLoaderViewBuilder");
        throw null;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.W;
    }
}

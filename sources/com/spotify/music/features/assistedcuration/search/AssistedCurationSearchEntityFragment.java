package com.spotify.music.features.assistedcuration.search;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import dagger.android.support.a;

public class AssistedCurationSearchEntityFragment extends LifecycleListenableFragment implements s, c.a {
    String h0;
    String i0;
    t0<io.reactivex.s<b91>> j0;
    PageLoaderView.a<io.reactivex.s<b91>> k0;

    public static AssistedCurationSearchEntityFragment K4(String str, String str2) {
        AssistedCurationSearchEntityFragment assistedCurationSearchEntityFragment = new AssistedCurationSearchEntityFragment();
        Bundle D2 = assistedCurationSearchEntityFragment.D2();
        if (D2 == null) {
            D2 = new Bundle();
            assistedCurationSearchEntityFragment.r4(D2);
        }
        D2.putString("key_ac_search_uri", str);
        D2.putString("key_ac_search_title", str2);
        return assistedCurationSearchEntityFragment;
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return this.i0;
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.j0.start();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.j0.stop();
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        Bundle D2 = D2();
        if (D2 != null) {
            String string = D2.getString("key_ac_search_uri");
            int ordinal = l0.z(string).q().ordinal();
            if (ordinal == 6) {
                return ViewUris.H;
            }
            if (ordinal == 14) {
                return ViewUris.I;
            }
            if (e.c(string)) {
                return ViewUris.I;
            }
            throw new RuntimeException(je.x0("Bad uri: ", string));
        }
        throw new RuntimeException("No uri");
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        StringBuilder V0 = je.V0("assisted-curation-search-entity:");
        V0.append(this.h0);
        return V0.toString();
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        Bundle D2 = D2();
        if (D2 != null) {
            String string = D2.getString("key_ac_search_uri");
            int ordinal = l0.z(string).q().ordinal();
            if (ordinal == 6) {
                return ij9.b(PageIdentifiers.ASSISTED_CURATION_SEARCH_ALBUM_ENTITY, null);
            }
            if (ordinal == 14) {
                return ij9.b(PageIdentifiers.ASSISTED_CURATION_SEARCH_ARTIST_ENTITY, null);
            }
            if (e.c(string)) {
                return ij9.b(PageIdentifiers.ASSISTED_CURATION_SEARCH_ARTIST_ENTITY, null);
            }
            throw new RuntimeException(je.x0("Bad uri: ", string));
        }
        throw new RuntimeException("No uri");
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PageLoaderView<io.reactivex.s<b91>> a = this.k0.a(l4());
        a.j0(this, this.j0);
        a.setLayoutParams(new CoordinatorLayout.e(-1, -1));
        return a;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.j;
    }
}

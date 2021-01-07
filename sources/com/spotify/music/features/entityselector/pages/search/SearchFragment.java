package com.spotify.music.features.entityselector.pages.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.C0707R;
import com.spotify.music.features.entityselector.pages.search.view.SearchViews;
import com.spotify.music.preview.q;
import com.squareup.picasso.Picasso;
import dagger.android.support.DaggerAppCompatDialogFragment;
import java.util.ArrayList;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class SearchFragment extends DaggerAppCompatDialogFragment {
    public q v0;
    public cmf<f> w0;
    public Picasso x0;
    public SearchInjector y0;
    private MobiusLoop.g<wz4, uz4> z0;

    public SearchFragment() {
        V4(2, C0707R.style.res_2132083508_theme_glue_noactionbar_entityselectordialog);
    }

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        MobiusLoop.g<wz4, uz4> gVar = this.z0;
        if (gVar != null) {
            gVar.stop();
        } else {
            h.k("controller");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        MobiusLoop.g<wz4, uz4> gVar = this.z0;
        if (gVar != null) {
            gVar.start();
        } else {
            h.k("controller");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.e(layoutInflater, "inflater");
        Picasso picasso = this.x0;
        if (picasso != null) {
            q qVar = this.v0;
            if (qVar != null) {
                cmf<f> cmf = this.w0;
                if (cmf != null) {
                    SearchViews searchViews = new SearchViews(layoutInflater, viewGroup, picasso, qVar, cmf);
                    ArrayList<String> stringArrayList = k4().getStringArrayList("playlist_items");
                    if (stringArrayList == null) {
                        stringArrayList = new ArrayList<>();
                    }
                    wz4 wz4 = new wz4(null, null, null, stringArrayList, k4().getString("list_name"), null, 39);
                    SearchInjector searchInjector = this.y0;
                    if (searchInjector != null) {
                        MobiusLoop.g<wz4, uz4> a = searchInjector.a(wz4);
                        this.z0 = a;
                        if (a != null) {
                            a.c(searchViews);
                            return searchViews.f();
                        }
                        h.k("controller");
                        throw null;
                    }
                    h.k("injector");
                    throw null;
                }
                h.k("stopPreviewAction");
                throw null;
            }
            h.k("previewOverlay");
            throw null;
        }
        h.k("picasso");
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        MobiusLoop.g<wz4, uz4> gVar = this.z0;
        if (gVar != null) {
            gVar.d();
        } else {
            h.k("controller");
            throw null;
        }
    }
}

package com.spotify.music.features.entityselector.pages.tracks;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.features.entityselector.pages.tracks.view.TracksViews;
import com.spotify.music.preview.q;
import com.squareup.picasso.Picasso;
import dagger.android.support.DaggerFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.h;

public final class TracksFragment extends DaggerFragment {
    public q h0;
    public Picasso i0;
    public TracksInjector j0;
    private MobiusLoop.g<f05, d05> k0;

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        MobiusLoop.g<f05, d05> gVar = this.k0;
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
        MobiusLoop.g<f05, d05> gVar = this.k0;
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
        Picasso picasso = this.i0;
        if (picasso != null) {
            q qVar = this.h0;
            if (qVar != null) {
                TracksViews tracksViews = new TracksViews(layoutInflater, viewGroup, picasso, qVar);
                ArrayList<String> stringArrayList = k4().getStringArrayList("playlist_items");
                if (stringArrayList == null) {
                    stringArrayList = new ArrayList<>();
                }
                f05 f05 = new f05(null, null, stringArrayList, k4().getString("list_name"), null, 19);
                TracksInjector tracksInjector = this.j0;
                if (tracksInjector != null) {
                    MobiusLoop.g<f05, d05> a = tracksInjector.a(f05);
                    this.k0 = a;
                    if (a != null) {
                        a.c(tracksViews);
                        return tracksViews.d();
                    }
                    h.k("controller");
                    throw null;
                }
                h.k("injector");
                throw null;
            }
            h.k("previewOverlay");
            throw null;
        }
        h.k("picasso");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        MobiusLoop.g<f05, d05> gVar = this.k0;
        if (gVar != null) {
            gVar.d();
        } else {
            h.k("controller");
            throw null;
        }
    }
}

package com.spotify.music.features.entityselector.pages.podcasts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.features.entityselector.pages.podcasts.view.PodcastsViews;
import com.squareup.picasso.Picasso;
import dagger.android.support.DaggerFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.h;

public final class PodcastsFragment extends DaggerFragment {
    public Picasso h0;
    public PodcastsInjector i0;
    private MobiusLoop.g<kz4, iz4> j0;

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        MobiusLoop.g<kz4, iz4> gVar = this.j0;
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
        MobiusLoop.g<kz4, iz4> gVar = this.j0;
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
        Picasso picasso = this.h0;
        if (picasso != null) {
            PodcastsViews podcastsViews = new PodcastsViews(layoutInflater, viewGroup, picasso);
            ArrayList<String> stringArrayList = k4().getStringArrayList("playlist_items");
            if (stringArrayList == null) {
                stringArrayList = new ArrayList<>();
            }
            kz4 kz4 = new kz4(null, stringArrayList, 1);
            PodcastsInjector podcastsInjector = this.i0;
            if (podcastsInjector != null) {
                MobiusLoop.g<kz4, iz4> a = podcastsInjector.a(kz4);
                this.j0 = a;
                if (a != null) {
                    a.c(podcastsViews);
                    return podcastsViews.d();
                }
                h.k("controller");
                throw null;
            }
            h.k("injector");
            throw null;
        }
        h.k("picasso");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        MobiusLoop.g<kz4, iz4> gVar = this.j0;
        if (gVar != null) {
            gVar.d();
        } else {
            h.k("controller");
            throw null;
        }
    }
}

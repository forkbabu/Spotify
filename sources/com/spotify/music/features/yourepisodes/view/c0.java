package com.spotify.music.features.yourepisodes.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.h;

public final class c0 implements b0 {
    @Override // com.spotify.music.features.yourepisodes.view.b0
    public a0 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.e(layoutInflater, "inflater");
        h.e(viewGroup, "parent");
        return new YourEpisodesViewsImpl(layoutInflater, viewGroup);
    }
}

package com.spotify.music.features.podcast.episode.transcript.ui.page.holders;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.h;

public abstract class a extends RecyclerView.b0 implements b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup) {
        super(layoutInflater.inflate(i, viewGroup, false));
        h.e(layoutInflater, "inflater");
        h.e(viewGroup, "parentView");
    }
}

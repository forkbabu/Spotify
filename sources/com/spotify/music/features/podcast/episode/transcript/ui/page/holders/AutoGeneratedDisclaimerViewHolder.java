package com.spotify.music.features.podcast.episode.transcript.ui.page.holders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import com.spotify.music.features.podcast.episode.transcript.ui.page.c;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class AutoGeneratedDisclaimerViewHolder extends a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoGeneratedDisclaimerViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, C0707R.layout.transcript_auto_generated_message_item_layout, viewGroup);
        h.e(layoutInflater, "inflater");
        h.e(viewGroup, "parentView");
    }

    @Override // com.spotify.music.features.podcast.episode.transcript.ui.page.holders.b
    public rmf<c, View, f> c() {
        return AutoGeneratedDisclaimerViewHolder$binder$1.a;
    }
}

package com.spotify.music.features.yourepisodes.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.Lambda;

final class YourEpisodesViewsImpl$root$2 extends Lambda implements cmf<View> {
    final /* synthetic */ LayoutInflater $inflater;
    final /* synthetic */ ViewGroup $parent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    YourEpisodesViewsImpl$root$2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(0);
        this.$inflater = layoutInflater;
        this.$parent = viewGroup;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public View invoke() {
        return this.$inflater.inflate(C0707R.layout.fragment_your_episodes, this.$parent, false);
    }
}

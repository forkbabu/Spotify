package com.spotify.music.features.yourepisodes.view;

import android.view.View;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class YourEpisodesViewsImpl$recyclerScroll$2 extends Lambda implements cmf<RecyclerViewFastScroller> {
    final /* synthetic */ YourEpisodesViewsImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    YourEpisodesViewsImpl$recyclerScroll$2(YourEpisodesViewsImpl yourEpisodesViewsImpl) {
        super(0);
        this.this$0 = yourEpisodesViewsImpl;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public RecyclerViewFastScroller invoke() {
        View findViewById = this.this$0.i().findViewById(C0707R.id.recycler_scroll);
        h.d(findViewById, "root.findViewById(R.id.recycler_scroll)");
        return (RecyclerViewFastScroller) findViewById;
    }
}

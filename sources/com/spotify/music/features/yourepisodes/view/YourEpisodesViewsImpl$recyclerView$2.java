package com.spotify.music.features.yourepisodes.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class YourEpisodesViewsImpl$recyclerView$2 extends Lambda implements cmf<RecyclerView> {
    final /* synthetic */ YourEpisodesViewsImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    YourEpisodesViewsImpl$recyclerView$2(YourEpisodesViewsImpl yourEpisodesViewsImpl) {
        super(0);
        this.this$0 = yourEpisodesViewsImpl;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public RecyclerView invoke() {
        View findViewById = this.this$0.i().findViewById(C0707R.id.recycler_view);
        h.d(findViewById, "root.findViewById(R.id.recycler_view)");
        return (RecyclerView) findViewById;
    }
}

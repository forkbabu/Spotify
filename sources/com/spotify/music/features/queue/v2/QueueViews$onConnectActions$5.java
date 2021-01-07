package com.spotify.music.features.queue.v2;

import android.view.View;
import com.spotify.music.C0707R;
import com.spotify.nowplaying.ui.components.shuffle.d;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class QueueViews$onConnectActions$5 extends Lambda implements nmf<View, f> {
    final /* synthetic */ d $shuffleButtonPresenter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    QueueViews$onConnectActions$5(d dVar) {
        super(1);
        this.$shuffleButtonPresenter = dVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(View view) {
        View view2 = view;
        h.e(view2, "view");
        this.$shuffleButtonPresenter.c((com.spotify.nowplaying.ui.components.shuffle.f) view2.findViewById(C0707R.id.shuffle_button));
        return f.a;
    }
}

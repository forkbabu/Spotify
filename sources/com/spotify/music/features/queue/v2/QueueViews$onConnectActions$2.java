package com.spotify.music.features.queue.v2;

import android.view.View;
import com.spotify.music.C0707R;
import com.spotify.nowplaying.ui.components.controls.playpause.e;
import com.spotify.nowplaying.ui.components.controls.playpause.g;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class QueueViews$onConnectActions$2 extends Lambda implements nmf<View, f> {
    final /* synthetic */ e $playPauseButtonPresenter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    QueueViews$onConnectActions$2(e eVar) {
        super(1);
        this.$playPauseButtonPresenter = eVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(View view) {
        View view2 = view;
        h.e(view2, "view");
        this.$playPauseButtonPresenter.d((g) view2.findViewById(C0707R.id.play_pause_button));
        return f.a;
    }
}

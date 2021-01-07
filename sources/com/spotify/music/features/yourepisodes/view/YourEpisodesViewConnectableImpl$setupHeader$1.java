package com.spotify.music.features.yourepisodes.view;

import com.spotify.music.features.yourepisodes.domain.HeaderAction;
import com.spotify.music.features.yourepisodes.domain.j;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class YourEpisodesViewConnectableImpl$setupHeader$1 extends Lambda implements nmf<PlayButtonLogAction, f> {
    final /* synthetic */ x this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    YourEpisodesViewConnectableImpl$setupHeader$1(x xVar) {
        super(1);
        this.this$0 = xVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(PlayButtonLogAction playButtonLogAction) {
        PlayButtonLogAction playButtonLogAction2 = playButtonLogAction;
        h.e(playButtonLogAction2, "logAction");
        if (playButtonLogAction2 == PlayButtonLogAction.PLAY) {
            this.this$0.n.i();
        } else if (playButtonLogAction2 == PlayButtonLogAction.PAUSE) {
            this.this$0.n.h();
        }
        x.b(this.this$0).accept(new j.b(HeaderAction.PLAY));
        return f.a;
    }
}

package com.spotify.encore.consumer.components.yourepisodes.impl.yourepisodesheader;

import com.spotify.encore.consumer.components.yourepisodes.api.yourepisodesheader.YourEpisodesHeader;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class DefaultYourEpisodesHeader$onEvent$2 extends Lambda implements nmf<f, f> {
    final /* synthetic */ nmf $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultYourEpisodesHeader$onEvent$2(nmf nmf) {
        super(1);
        this.$event = nmf;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public /* bridge */ /* synthetic */ f invoke(f fVar) {
        invoke(fVar);
        return f.a;
    }

    public final void invoke(f fVar) {
        h.e(fVar, "it");
        this.$event.invoke(YourEpisodesHeader.Events.PlayButtonClicked);
    }
}

package com.spotify.music.features.yourepisodes.view;

import com.spotify.music.features.yourepisodes.domain.HeaderAction;
import com.spotify.music.features.yourepisodes.domain.j;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class YourEpisodesViewConnectableImpl$setupHeader$3 extends Lambda implements cmf<f> {
    final /* synthetic */ x this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    YourEpisodesViewConnectableImpl$setupHeader$3(x xVar) {
        super(0);
        this.this$0 = xVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        x.b(this.this$0).accept(new j.b(HeaderAction.BACK_BUTTON_PRESSED));
        return f.a;
    }
}

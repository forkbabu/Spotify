package com.spotify.music.features.nowplayingbar.eventsources;

import com.spotify.music.features.nowplayingbar.domain.d;
import com.spotify.music.features.nowplayingbar.domain.h;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* access modifiers changed from: package-private */
public final /* synthetic */ class NowPlayingBarEventSourceKt$playerInfoEventSource$2 extends FunctionReferenceImpl implements nmf<h, d.i> {
    public static final NowPlayingBarEventSourceKt$playerInfoEventSource$2 a = new NowPlayingBarEventSourceKt$playerInfoEventSource$2();

    NowPlayingBarEventSourceKt$playerInfoEventSource$2() {
        super(1, d.i.class, "<init>", "<init>(Lcom/spotify/music/features/nowplayingbar/domain/PlayerInfo;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public d.i invoke(h hVar) {
        h hVar2 = hVar;
        kotlin.jvm.internal.h.e(hVar2, "p1");
        return new d.i(hVar2);
    }
}

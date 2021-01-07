package com.spotify.music.features.nowplayingbar.eventsources;

import com.spotify.music.features.nowplayingbar.domain.d;
import com.spotify.music.sociallistening.models.b;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class NowPlayingBarEventSourceKt$socialListeningEventSource$1 extends FunctionReferenceImpl implements nmf<b, d.k> {
    public static final NowPlayingBarEventSourceKt$socialListeningEventSource$1 a = new NowPlayingBarEventSourceKt$socialListeningEventSource$1();

    NowPlayingBarEventSourceKt$socialListeningEventSource$1() {
        super(1, d.k.class, "<init>", "<init>(Lcom/spotify/music/sociallistening/models/SocialListeningState;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public d.k invoke(b bVar) {
        b bVar2 = bVar;
        h.e(bVar2, "p1");
        return new d.k(bVar2);
    }
}

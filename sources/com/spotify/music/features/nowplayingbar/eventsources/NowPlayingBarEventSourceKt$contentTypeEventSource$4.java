package com.spotify.music.features.nowplayingbar.eventsources;

import com.spotify.music.features.nowplayingbar.domain.ContentType;
import com.spotify.music.features.nowplayingbar.domain.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class NowPlayingBarEventSourceKt$contentTypeEventSource$4 extends FunctionReferenceImpl implements nmf<ContentType, d.C0237d> {
    public static final NowPlayingBarEventSourceKt$contentTypeEventSource$4 a = new NowPlayingBarEventSourceKt$contentTypeEventSource$4();

    NowPlayingBarEventSourceKt$contentTypeEventSource$4() {
        super(1, d.C0237d.class, "<init>", "<init>(Lcom/spotify/music/features/nowplayingbar/domain/ContentType;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public d.C0237d invoke(ContentType contentType) {
        ContentType contentType2 = contentType;
        h.e(contentType2, "p1");
        return new d.C0237d(contentType2);
    }
}

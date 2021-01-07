package com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.playpause;

import com.spotify.paste.graphics.drawable.c;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class DurationPlayPauseButton$updateDrawables$1 extends Lambda implements nmf<c, c> {
    final /* synthetic */ DurationPlayPauseButton this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DurationPlayPauseButton$updateDrawables$1(DurationPlayPauseButton durationPlayPauseButton) {
        super(1);
        this.this$0 = durationPlayPauseButton;
    }

    public final c a(c cVar) {
        h.e(cVar, "$this$applyStyle");
        cVar.c(this.this$0.u);
        cVar.d(0);
        cVar.setState(new int[]{16842910});
        cVar.setBounds(this.this$0.n);
        return cVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public /* bridge */ /* synthetic */ c invoke(c cVar) {
        c cVar2 = cVar;
        a(cVar2);
        return cVar2;
    }
}

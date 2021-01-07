package com.spotify.music.features.podcast.episode.transcript.ui.page.holders;

import android.view.View;
import com.spotify.music.features.podcast.episode.transcript.ui.page.c;
import com.spotify.music.features.podcast.episode.transcript.ui.views.TranscriptTextSectionView;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class TextSectionViewHolder$binder$1 extends Lambda implements rmf<c, View, f> {
    public static final TextSectionViewHolder$binder$1 a = new TextSectionViewHolder$binder$1();

    TextSectionViewHolder$binder$1() {
        super(2);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public f invoke(c cVar, View view) {
        c cVar2 = cVar;
        View view2 = view;
        h.e(cVar2, "model");
        h.e(view2, "view");
        c.b bVar = (c.b) cVar2;
        TranscriptTextSectionView transcriptTextSectionView = (TranscriptTextSectionView) view2;
        transcriptTextSectionView.setHeading(bVar.c());
        transcriptTextSectionView.setParagraphs(bVar.b());
        return f.a;
    }
}

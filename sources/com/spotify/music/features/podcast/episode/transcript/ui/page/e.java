package com.spotify.music.features.podcast.episode.transcript.ui.page;

import com.adjust.sdk.Constants;
import com.spotify.corex.transcripts.proto.PlaintextContent;
import com.spotify.corex.transcripts.proto.Section;
import com.spotify.music.features.podcast.episode.transcript.ui.page.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

public final class e implements d {
    private final g a;

    public e(g gVar) {
        h.e(gVar, "viewBinderImpl");
        this.a = gVar;
    }

    @Override // com.spotify.music.features.podcast.episode.transcript.ui.page.d
    public void a(ab7 ab7) {
        h.e(ab7, "transcriptModel");
        g gVar = this.a;
        h.e(ab7, "model");
        String n = ab7.b().n();
        h.d(n, "model.transcript.version");
        String h = ab7.b().h();
        h.d(h, "model.transcript.episodeUri");
        String i = ab7.b().i();
        h.d(i, "model.transcript.language");
        String l = ab7.b().l();
        h.d(l, "model.transcript.publishedAt");
        h.e(ab7, "model");
        List<Section> m = ab7.b().m();
        ArrayList arrayList = new ArrayList();
        if (!m.isEmpty()) {
            if (!ab7.a().b()) {
                arrayList.add(c.a.b);
            }
            for (Section section : m) {
                h.d(section, "section");
                int i2 = section.i();
                TranscriptItemModelKt$asTime$1 transcriptItemModelKt$asTime$1 = TranscriptItemModelKt$asTime$1.a;
                int i3 = i2 / Constants.ONE_SECOND;
                int i4 = i3 % 60;
                int i5 = (i3 / 60) % 60;
                int i6 = (i3 / 3600) % 24;
                String str = i6 != 0 ? i6 + ':' + transcriptItemModelKt$asTime$1.a(i5) + ':' + transcriptItemModelKt$asTime$1.a(i4) : transcriptItemModelKt$asTime$1.a(i5) + ':' + transcriptItemModelKt$asTime$1.a(i4);
                PlaintextContent h2 = section.h();
                h.d(h2, "section.plaintextContent");
                List<String> i7 = h2.i();
                h.d(i7, "section.plaintextContent.plaintextList");
                arrayList.add(new c.b(str, i7));
            }
        }
        gVar.a(new k(n, h, i, l, arrayList));
    }
}

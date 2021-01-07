package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import com.spotify.music.features.podcast.episode.transcript.ui.page.d;
import com.spotify.music.features.podcast.episode.transcript.ui.page.g;
import com.spotify.pageloader.s0;
import kotlin.jvm.internal.h;

/* renamed from: cb7  reason: default package */
public final class cb7 implements s0 {
    private final ab7 a;
    private final d b;
    private final g c;

    public cb7(ab7 ab7, d dVar, g gVar) {
        h.e(ab7, "transcriptModel");
        h.e(dVar, "transcriptPresenter");
        h.e(gVar, "transcriptViewBinder");
        this.a = ab7;
        this.b = dVar;
        this.c = gVar;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.c.c();
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        h.e(context, "context");
        h.e(viewGroup, "parent");
        h.e(layoutInflater, "inflater");
        g gVar = this.c;
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_transcript_layout, viewGroup, false);
        h.d(inflate, "inflater.inflate(\n      …      false\n            )");
        gVar.b(inflate);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        this.b.a(this.a);
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
    }
}

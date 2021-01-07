package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.quotesharing.i;
import com.spotify.music.features.podcast.entity.presentation.FilteringPresenter;
import com.spotify.music.features.podcast.entity.presentation.d;
import com.spotify.music.features.podcast.entity.presentation.l;
import com.spotify.music.features.podcast.entity.presentation.s;
import com.spotify.music.features.podcast.entity.presentation.u;
import com.spotify.music.features.podcast.entity.presentation.y;
import com.spotify.music.features.podcast.entity.trailer.PodcastTrailerPresenter;
import defpackage.f57;
import kotlin.jvm.internal.h;

/* renamed from: i57  reason: default package */
public final class i57 implements h57 {
    private final l a;
    private final u b;
    private final d77 c;
    private final PodcastTrailerPresenter d;
    private final FilteringPresenter e;
    private final s f;
    private final d g;
    private final y h;
    private final i i;

    public i57(l lVar, u uVar, d77 d77, PodcastTrailerPresenter podcastTrailerPresenter, FilteringPresenter filteringPresenter, s sVar, d dVar, y yVar, i iVar) {
        h.e(lVar, "episodeCardsSegmentPresenter");
        h.e(uVar, "metadataPresenter");
        h.e(d77, "topicsPresenter");
        h.e(podcastTrailerPresenter, "trailerPresenter");
        h.e(filteringPresenter, "filteringPresenter");
        h.e(sVar, "paginationLoadingPresenter");
        h.e(dVar, "autoPlayPresenter");
        h.e(yVar, "toolbarPresenter");
        h.e(iVar, "quoteShareInstanceState");
        this.a = lVar;
        this.b = uVar;
        this.c = d77;
        this.d = podcastTrailerPresenter;
        this.e = filteringPresenter;
        this.f = sVar;
        this.g = dVar;
        this.h = yVar;
        this.i = iVar;
    }

    @Override // defpackage.h57
    public void a(f57 f57) {
        h.e(f57, "state");
        if (f57 instanceof f57.e) {
            f57.e eVar = (f57.e) f57;
            qyd b2 = eVar.b();
            esc a2 = eVar.a();
            this.h.b(b2.d());
            this.a.a(b2, a2, eVar.c());
            this.b.d(b2, a2);
            this.c.a(b2, a2);
            this.d.e(b2, a2);
            this.e.f(b2, a2);
            this.f.a(a2);
            this.g.a(b2);
        } else if (f57 instanceof f57.c) {
            this.f.b(true);
        } else if (f57 instanceof f57.g) {
            Bundle a3 = ((f57.g) f57).a();
            this.e.e(a3);
            this.g.b(a3);
            this.i.c(a3);
        } else if (f57 instanceof f57.f) {
            Bundle a4 = ((f57.f) f57).a();
            this.e.g(a4);
            this.g.c(a4);
            this.i.d(a4);
        } else if (f57 instanceof f57.a) {
            this.h.c(((f57.a) f57).a().b());
        } else if (f57 instanceof f57.b) {
            this.h.a(((f57.b) f57).a());
        }
    }
}

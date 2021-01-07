package com.spotify.music.podcast.entity.adapter.episoderow;

import com.spotify.encore.consumer.components.podcast.api.episoderow.EpisodeRow;
import com.spotify.music.podcast.entity.adapter.episoderow.c;
import com.spotify.music.podcastentityrow.playback.b;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class EncoreEpisodeRowViewBinder$bind$1 extends Lambda implements nmf<EpisodeRow.Events, f> {
    final /* synthetic */ j $viewModel;
    final /* synthetic */ EncoreEpisodeRowViewBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EncoreEpisodeRowViewBinder$bind$1(EncoreEpisodeRowViewBinder encoreEpisodeRowViewBinder, j jVar) {
        super(1);
        this.this$0 = encoreEpisodeRowViewBinder;
        this.$viewModel = jVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(EpisodeRow.Events events) {
        EpisodeRow.Events events2 = events;
        h.e(events2, "event");
        jhc jhc = this.this$0.c;
        if (events2 instanceof EpisodeRow.Events.QuickActionClicked) {
            EncoreEpisodeRowViewBinder.d(this.this$0, ((EpisodeRow.Events.QuickActionClicked) events2).getQuickAction(), this.$viewModel);
        } else {
            boolean z = true;
            if (h.a(events2, EpisodeRow.Events.PlayClicked.INSTANCE)) {
                j jVar = this.$viewModel;
                h.e(jVar, "model");
                String e = jVar.e();
                List<b.C0333b> p = jVar.p();
                if (jVar.l() != Restriction.EXPLICIT) {
                    z = false;
                }
                jhc.c(new lhc(e, p, z, jVar.f()));
            } else if (h.a(events2, EpisodeRow.Events.RowClicked.INSTANCE)) {
                j jVar2 = this.$viewModel;
                h.e(jVar2, "model");
                jhc.f(new mhc(jVar2.e(), jVar2.f()));
            } else if (h.a(events2, EpisodeRow.Events.RowLongClicked.INSTANCE)) {
                j jVar3 = this.$viewModel;
                h.e(jVar3, "model");
                jhc.b(new nhc(jVar3.o(), jVar3.e(), !h.a(jVar3.d(), c.e.a), jVar3.f(), jVar3.t()));
            }
        }
        return f.a;
    }
}

package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.corex.transcripts.metadata.proto.EpisodeTranscriptMetadata;
import com.spotify.corex.transcripts.metadata.proto.EpisodeTranscriptsMetadata;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata$ProtoEpisodeMetadata;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeMetadata$ProtoEpisodeShowMetadata;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodeCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodeOfflineState;
import com.spotify.mobile.android.spotlets.show.proto.EpisodeState$ProtoEpisodePlayState;
import com.spotify.mobile.android.spotlets.show.proto.ImageGroup$ProtoImageGroup;
import com.spotify.mobile.android.spotlets.show.proto.ShowDecorateRequest$ProtoDecorateEpisodeItem;
import com.spotify.mobile.android.spotlets.show.proto.ShowDecorateRequest$ProtoDecorateResponse;
import com.spotify.mobile.android.spotlets.show.proto.ShowDecorateRequest$ProtoDecorateShowItem;
import com.spotify.mobile.android.spotlets.show.proto.ShowMetadata$ProtoShowMetadata;
import com.spotify.mobile.android.spotlets.show.proto.ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesRequestItem;
import com.spotify.mobile.android.spotlets.show.proto.ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest$AuxiliarySections;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest$ProtoOnlineData;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest$ProtoShowRequestHeader;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest$ProtoShowRequestItem;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowRequest$ProtoShowResponse;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowsRequest$ProtoShowsRequestItem;
import com.spotify.mobile.android.spotlets.show.proto.ShowShowsRequest$ProtoShowsResponse;
import com.spotify.mobile.android.spotlets.show.proto.ShowState$ProtoShowCollectionState;
import com.spotify.mobile.android.spotlets.show.proto.ShowState$ProtoShowPlayState;
import com.spotify.mobile.android.spotlets.show.proto.ShowUnfinishedEpisodesRequest$Episode;
import com.spotify.mobile.android.spotlets.show.proto.ShowUnfinishedEpisodesRequest$Response;
import com.spotify.mobile.android.spotlets.show.proto.ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem;
import com.spotify.mobile.android.spotlets.show.proto.ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.PlayabilityRestriction;
import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.e;
import com.spotify.playlist.models.i;
import com.spotify.playlist.models.m;
import com.spotify.playlist.models.n;
import com.spotify.playlist.models.q;
import com.spotify.podcastextensions.proto.Podcastextensions$PodcastHtmlDescription;
import com.spotify.podcastextensions.proto.Podcastextensions$PodcastTopic;
import com.spotify.podcastquotes.proto.v1.proto.PodcastQuotes;
import com.spotify.podcastsegments.proto.PodcastSegments;
import defpackage.lyd;
import defpackage.myd;
import defpackage.nyd;
import defpackage.oyd;
import defpackage.pyd;
import defpackage.qyd;
import defpackage.ryd;
import defpackage.syd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: tyd  reason: default package */
public final class tyd {

    /* renamed from: tyd$a */
    static class a implements i<Episode> {
        final /* synthetic */ List a;
        final /* synthetic */ ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse b;

        a(List list, ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse showOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse) {
            this.a = list;
            this.b = showOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse;
        }

        /* Return type fixed from 'java.util.List' to match base method */
        @Override // com.spotify.playlist.models.i
        public List<Episode> getItems() {
            return ImmutableList.copyOf((Collection) this.a);
        }

        @Override // com.spotify.playlist.models.i
        public int getUnfilteredLength() {
            return this.b.m();
        }

        @Override // com.spotify.playlist.models.i
        public int getUnrangedLength() {
            return this.b.n();
        }

        @Override // com.spotify.playlist.models.i
        public boolean isLoading() {
            return this.b.l();
        }
    }

    /* renamed from: tyd$b */
    static class b implements i<Episode> {
        final /* synthetic */ List a;
        final /* synthetic */ ShowUnfinishedEpisodesRequest$Response b;

        b(List list, ShowUnfinishedEpisodesRequest$Response showUnfinishedEpisodesRequest$Response) {
            this.a = list;
            this.b = showUnfinishedEpisodesRequest$Response;
        }

        /* Return type fixed from 'java.util.List' to match base method */
        @Override // com.spotify.playlist.models.i
        public List<Episode> getItems() {
            return ImmutableList.copyOf((Collection) this.a);
        }

        @Override // com.spotify.playlist.models.i
        public int getUnfilteredLength() {
            return this.b.h();
        }

        @Override // com.spotify.playlist.models.i
        public int getUnrangedLength() {
            return this.b.h();
        }

        @Override // com.spotify.playlist.models.i
        public boolean isLoading() {
            return false;
        }
    }

    /* renamed from: tyd$c */
    static class c implements i<Episode> {
        final /* synthetic */ List a;
        final /* synthetic */ ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse b;

        c(List list, ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse showUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse) {
            this.a = list;
            this.b = showUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse;
        }

        /* Return type fixed from 'java.util.List' to match base method */
        @Override // com.spotify.playlist.models.i
        public List<Episode> getItems() {
            return ImmutableList.copyOf((Collection) this.a);
        }

        @Override // com.spotify.playlist.models.i
        public int getUnfilteredLength() {
            return this.b.m();
        }

        @Override // com.spotify.playlist.models.i
        public int getUnrangedLength() {
            return this.b.n();
        }

        @Override // com.spotify.playlist.models.i
        public boolean isLoading() {
            return this.b.l();
        }
    }

    private static Covers a(ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup) {
        if (imageGroup$ProtoImageGroup == null) {
            return Covers.a().a();
        }
        Covers.a a2 = Covers.a();
        a2.d((String) m(imageGroup$ProtoImageGroup.m(), ""));
        a2.c((String) m(imageGroup$ProtoImageGroup.l(), ""));
        a2.b((String) m(imageGroup$ProtoImageGroup.i(), ""));
        a2.e((String) m(imageGroup$ProtoImageGroup.n(), ""));
        return a2.a();
    }

    public static Episode b(EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata$ProtoEpisodeMetadata, EpisodeState$ProtoEpisodeOfflineState episodeState$ProtoEpisodeOfflineState, EpisodeState$ProtoEpisodePlayState episodeState$ProtoEpisodePlayState, EpisodeState$ProtoEpisodeCollectionState episodeState$ProtoEpisodeCollectionState, PodcastQuotes podcastQuotes, String str) {
        return c(episodeMetadata$ProtoEpisodeMetadata, episodeState$ProtoEpisodeOfflineState, episodeState$ProtoEpisodePlayState, episodeState$ProtoEpisodeCollectionState, str, null, podcastQuotes, null);
    }

    public static Episode c(EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata$ProtoEpisodeMetadata, EpisodeState$ProtoEpisodeOfflineState episodeState$ProtoEpisodeOfflineState, EpisodeState$ProtoEpisodePlayState episodeState$ProtoEpisodePlayState, EpisodeState$ProtoEpisodeCollectionState episodeState$ProtoEpisodeCollectionState, String str, Podcastextensions$PodcastHtmlDescription podcastextensions$PodcastHtmlDescription, PodcastQuotes podcastQuotes, EpisodeTranscriptsMetadata episodeTranscriptsMetadata) {
        Show b2;
        ImmutableList<m> immutableList;
        n nVar;
        if (!MoreObjects.isNullOrEmpty(str)) {
            Episode.a a2 = Episode.a();
            a2.i(str);
            return a2.build();
        }
        e eVar = null;
        if (episodeMetadata$ProtoEpisodeMetadata == null) {
            return null;
        }
        Covers a3 = a(episodeMetadata$ProtoEpisodeMetadata.z() ? episodeMetadata$ProtoEpisodeMetadata.h() : null);
        Covers a4 = a(episodeMetadata$ProtoEpisodeMetadata.B() ? episodeMetadata$ProtoEpisodeMetadata.n() : null);
        EpisodeMetadata$ProtoEpisodeShowMetadata x = episodeMetadata$ProtoEpisodeMetadata.D() ? episodeMetadata$ProtoEpisodeMetadata.x() : null;
        if (x == null) {
            b2 = Show.a().b();
        } else {
            Covers a5 = a(x.o() ? x.h() : null);
            Show.a a6 = Show.a();
            a6.d(a5);
            a6.n(x.l());
            a6.k(x.m());
            a6.l((String) m(x.n(), ""));
            b2 = a6.b();
        }
        Episode.MediaType h = episodeMetadata$ProtoEpisodeMetadata.C() ? q.h(episodeMetadata$ProtoEpisodeMetadata.r()) : Episode.MediaType.UNKNOWN;
        ImmutableMap.Builder<String, String> i = q.i(a3, a4, episodeMetadata$ProtoEpisodeMetadata.s(), episodeMetadata$ProtoEpisodeMetadata.q(), b2, h);
        if (episodeMetadata$ProtoEpisodeMetadata.y()) {
            i.mo51put("is_backgroundable", String.valueOf(episodeMetadata$ProtoEpisodeMetadata.getBackgroundable()));
        }
        Episode.Type m = q.m(episodeMetadata$ProtoEpisodeMetadata.A() ? episodeMetadata$ProtoEpisodeMetadata.m() : EpisodeMetadata$ProtoEpisodeMetadata.EpisodeType.UNKNOWN);
        PodcastSegments t = episodeMetadata$ProtoEpisodeMetadata.hasPodcastSegments() ? episodeMetadata$ProtoEpisodeMetadata.t() : null;
        Episode.a a7 = Episode.a();
        a7.r(b2);
        a7.s(a3);
        a7.u(m);
        a7.f(episodeMetadata$ProtoEpisodeMetadata.p());
        a7.d(episodeMetadata$ProtoEpisodeMetadata.s());
        a7.F(h);
        a7.t(i.build());
        a7.D(a4);
        a7.l(episodeMetadata$ProtoEpisodeMetadata.o());
        a7.o(episodeMetadata$ProtoEpisodeMetadata.u());
        a7.a(episodeMetadata$ProtoEpisodeMetadata.getIsExplicit());
        a7.A((int) episodeMetadata$ProtoEpisodeMetadata.w());
        a7.x(episodeMetadata$ProtoEpisodeMetadata.getBackgroundable());
        a7.m(episodeMetadata$ProtoEpisodeMetadata.getAvailable());
        a7.w((String) m(episodeMetadata$ProtoEpisodeMetadata.q(), ""));
        a7.c((String) m(episodeMetadata$ProtoEpisodeMetadata.l(), ""));
        a7.k(podcastextensions$PodcastHtmlDescription != null ? podcastextensions$PodcastHtmlDescription.i() : null);
        int i2 = 0;
        a7.C(episodeState$ProtoEpisodePlayState != null && episodeState$ProtoEpisodePlayState.getIsPlayed());
        a7.H(episodeState$ProtoEpisodeCollectionState != null && episodeState$ProtoEpisodeCollectionState.getIsInListenLater());
        a7.y((String) m(episodeMetadata$ProtoEpisodeMetadata.v(), ""));
        a7.v(episodeState$ProtoEpisodeCollectionState != null && episodeState$ProtoEpisodeCollectionState.getIsNew());
        a7.n(episodeState$ProtoEpisodeCollectionState != null && episodeState$ProtoEpisodeCollectionState.i());
        a7.q(episodeMetadata$ProtoEpisodeMetadata.getIsMusicAndTalk());
        a7.b(episodeState$ProtoEpisodePlayState != null && episodeState$ProtoEpisodePlayState.i());
        a7.j(episodeState$ProtoEpisodePlayState != null ? q.k(episodeState$ProtoEpisodePlayState.m()) : PlayabilityRestriction.UNKNOWN);
        a7.z(episodeState$ProtoEpisodePlayState != null ? Long.valueOf(episodeState$ProtoEpisodePlayState.l()) : null);
        a7.G((episodeState$ProtoEpisodePlayState == null || !episodeState$ProtoEpisodePlayState.o() || episodeState$ProtoEpisodePlayState.n() < 0) ? null : Integer.valueOf(episodeState$ProtoEpisodePlayState.n()));
        String i3 = episodeState$ProtoEpisodeOfflineState == null ? null : episodeState$ProtoEpisodeOfflineState.i();
        if (episodeState$ProtoEpisodeOfflineState != null) {
            i2 = episodeState$ProtoEpisodeOfflineState.l();
        }
        a7.e(com.spotify.playlist.models.offline.b.a(i3, i2));
        int i4 = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        if (podcastQuotes == null) {
            immutableList = builder.build();
        } else {
            for (PodcastQuotes.Quote quote : podcastQuotes.i()) {
                PodcastQuotes.Quote.Image i5 = quote.i();
                PodcastQuotes.Quote.ShareInfo l = quote.l();
                m.a aVar = new m.a(null, null, null, null, null, 31);
                aVar.e(quote.m());
                aVar.a(quote.h());
                aVar.f((long) quote.n());
                m.b.a aVar2 = new m.b.a(null, null, 3);
                aVar2.c(i5.l());
                aVar2.b(i5.i());
                aVar.c(aVar2.a());
                m.c.a aVar3 = new m.c.a(null, null, null, null, 15);
                aVar3.b(l.i());
                aVar3.c(l.l());
                aVar3.d(l.m());
                aVar3.e(l.n());
                aVar.d(aVar3.a());
                builder.mo53add((ImmutableList.Builder) aVar.b());
            }
            immutableList = builder.build();
        }
        a7.B(immutableList);
        if (t == null) {
            nVar = null;
        } else {
            n.a aVar4 = new n.a(null, 1);
            aVar4.b(ImmutableList.copyOf((Collection) t.h()));
            nVar = aVar4.a();
        }
        a7.E(nVar);
        if (episodeTranscriptsMetadata != null) {
            e.a aVar5 = new e.a(null, null, 3);
            aVar5.b(episodeTranscriptsMetadata.i());
            ArrayList arrayList = new ArrayList(episodeTranscriptsMetadata.l());
            for (EpisodeTranscriptMetadata episodeTranscriptMetadata : episodeTranscriptsMetadata.m()) {
                e.b.a aVar6 = new e.b.a(null, null, false, null, 15);
                aVar6.d(episodeTranscriptMetadata.l());
                aVar6.e(episodeTranscriptMetadata.m());
                aVar6.c(episodeTranscriptMetadata.i());
                aVar6.b(episodeTranscriptMetadata.h());
                arrayList.add(aVar6.a());
            }
            aVar5.c(ImmutableList.copyOf((Collection) arrayList));
            eVar = aVar5.a();
        }
        a7.p(eVar);
        return a7.build();
    }

    private static Episode d(ShowShowRequest$ProtoShowRequestItem showShowRequest$ProtoShowRequestItem) {
        String str = null;
        EpisodeMetadata$ProtoEpisodeMetadata k = showShowRequest$ProtoShowRequestItem.d() ? showShowRequest$ProtoShowRequestItem.k() : null;
        EpisodeState$ProtoEpisodeOfflineState b2 = showShowRequest$ProtoShowRequestItem.e() ? showShowRequest$ProtoShowRequestItem.b() : null;
        EpisodeState$ProtoEpisodePlayState i = showShowRequest$ProtoShowRequestItem.m() ? showShowRequest$ProtoShowRequestItem.i() : null;
        EpisodeState$ProtoEpisodeCollectionState f = showShowRequest$ProtoShowRequestItem.j() ? showShowRequest$ProtoShowRequestItem.f() : null;
        PodcastQuotes l = showShowRequest$ProtoShowRequestItem.n() ? showShowRequest$ProtoShowRequestItem.l() : null;
        if (showShowRequest$ProtoShowRequestItem.o()) {
            str = showShowRequest$ProtoShowRequestItem.getHeader();
        }
        return b(k, b2, i, f, l, str);
    }

    public static i<Episode> e(ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse showOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse) {
        ArrayList arrayList = new ArrayList(showOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse.h());
        for (ShowOfflinedEpisodesRequest$ProtoOfflinedEpisodesRequestItem showOfflinedEpisodesRequest$ProtoOfflinedEpisodesRequestItem : showOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse.i()) {
            String str = null;
            EpisodeMetadata$ProtoEpisodeMetadata k = showOfflinedEpisodesRequest$ProtoOfflinedEpisodesRequestItem.d() ? showOfflinedEpisodesRequest$ProtoOfflinedEpisodesRequestItem.k() : null;
            EpisodeState$ProtoEpisodeOfflineState b2 = showOfflinedEpisodesRequest$ProtoOfflinedEpisodesRequestItem.e() ? showOfflinedEpisodesRequest$ProtoOfflinedEpisodesRequestItem.b() : null;
            EpisodeState$ProtoEpisodePlayState h = showOfflinedEpisodesRequest$ProtoOfflinedEpisodesRequestItem.i() ? showOfflinedEpisodesRequest$ProtoOfflinedEpisodesRequestItem.h() : null;
            EpisodeState$ProtoEpisodeCollectionState f = showOfflinedEpisodesRequest$ProtoOfflinedEpisodesRequestItem.j() ? showOfflinedEpisodesRequest$ProtoOfflinedEpisodesRequestItem.f() : null;
            if (showOfflinedEpisodesRequest$ProtoOfflinedEpisodesRequestItem.l()) {
                str = showOfflinedEpisodesRequest$ProtoOfflinedEpisodesRequestItem.getHeader();
            }
            arrayList.add(b(k, b2, h, f, null, str));
        }
        return new a(arrayList, showOfflinedEpisodesRequest$ProtoOfflinedEpisodesResponse);
    }

    public static i<Episode> f(ShowUnfinishedEpisodesRequest$Response showUnfinishedEpisodesRequest$Response) {
        ArrayList arrayList = new ArrayList(showUnfinishedEpisodesRequest$Response.h());
        for (ShowUnfinishedEpisodesRequest$Episode showUnfinishedEpisodesRequest$Episode : showUnfinishedEpisodesRequest$Response.i()) {
            EpisodeState$ProtoEpisodeCollectionState episodeState$ProtoEpisodeCollectionState = null;
            EpisodeMetadata$ProtoEpisodeMetadata k = showUnfinishedEpisodesRequest$Episode.d() ? showUnfinishedEpisodesRequest$Episode.k() : null;
            EpisodeState$ProtoEpisodeOfflineState b2 = showUnfinishedEpisodesRequest$Episode.e() ? showUnfinishedEpisodesRequest$Episode.b() : null;
            EpisodeState$ProtoEpisodePlayState h = showUnfinishedEpisodesRequest$Episode.i() ? showUnfinishedEpisodesRequest$Episode.h() : null;
            if (showUnfinishedEpisodesRequest$Episode.j()) {
                episodeState$ProtoEpisodeCollectionState = showUnfinishedEpisodesRequest$Episode.f();
            }
            arrayList.add(b(k, b2, h, episodeState$ProtoEpisodeCollectionState, null, null));
        }
        return new b(arrayList, showUnfinishedEpisodesRequest$Response);
    }

    public static i<Episode> g(ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse showUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse) {
        ArrayList arrayList = new ArrayList(showUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse.h());
        for (ShowUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem showUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem : showUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse.i()) {
            String str = null;
            EpisodeMetadata$ProtoEpisodeMetadata k = showUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem.d() ? showUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem.k() : null;
            EpisodeState$ProtoEpisodeOfflineState b2 = showUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem.e() ? showUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem.b() : null;
            EpisodeState$ProtoEpisodePlayState h = showUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem.i() ? showUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem.h() : null;
            EpisodeState$ProtoEpisodeCollectionState f = showUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem.j() ? showUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem.f() : null;
            if (showUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem.l()) {
                str = showUnplayedEpisodesRequest$ProtoUnplayedEpisodesRequestItem.getHeader();
            }
            arrayList.add(b(k, b2, h, f, null, str));
        }
        return new c(arrayList, showUnplayedEpisodesRequest$ProtoUnplayedEpisodesResponse);
    }

    private static Show h(ShowMetadata$ProtoShowMetadata showMetadata$ProtoShowMetadata, ShowState$ProtoShowCollectionState showState$ProtoShowCollectionState, ShowState$ProtoShowPlayState showState$ProtoShowPlayState, int i, boolean z, long j) {
        String str;
        if (showMetadata$ProtoShowMetadata == null) {
            return Show.a().b();
        }
        Covers a2 = a(showMetadata$ProtoShowMetadata.s() ? showMetadata$ProtoShowMetadata.i() : null);
        Show.ConsumptionOrder b2 = q.b(showMetadata$ProtoShowMetadata.h());
        Show.MediaType g = q.g(showMetadata$ProtoShowMetadata.t() ? showMetadata$ProtoShowMetadata.o() : -1);
        Show.a a3 = Show.a();
        a3.d(a2);
        a3.a(i);
        a3.n(showMetadata$ProtoShowMetadata.n());
        a3.k(showMetadata$ProtoShowMetadata.p());
        a3.j(g);
        a3.g(z);
        a3.c(b2);
        a3.e(showMetadata$ProtoShowMetadata.m());
        a3.m(showMetadata$ProtoShowMetadata.r());
        a3.h(j);
        a3.f(showState$ProtoShowCollectionState != null && showState$ProtoShowCollectionState.i());
        if (showState$ProtoShowPlayState == null) {
            str = "";
        } else {
            str = showState$ProtoShowPlayState.i();
        }
        a3.i(str);
        a3.l((String) m(showMetadata$ProtoShowMetadata.q(), ""));
        return a3.b();
    }

    public static qyd i(ShowShowRequest$ProtoShowResponse showShowRequest$ProtoShowResponse) {
        nyd nyd;
        lyd lyd;
        syd syd;
        pyd pyd;
        myd myd = null;
        if (!showShowRequest$ProtoShowResponse.s()) {
            return null;
        }
        ShowShowRequest$ProtoShowRequestHeader i = showShowRequest$ProtoShowResponse.i();
        Show h = h(i.o() ? i.l() : null, i.n() ? i.i() : null, i.p() ? i.m() : null, 0, false, -1);
        ShowShowRequest$ProtoOnlineData o = showShowRequest$ProtoShowResponse.t() ? showShowRequest$ProtoShowResponse.o() : null;
        if (o == null) {
            nyd = null;
        } else {
            nyd.a a2 = nyd.a();
            a2.a(o.i());
            nyd = a2.build();
        }
        ArrayList arrayList = new ArrayList(showShowRequest$ProtoShowResponse.l());
        for (ShowShowRequest$ProtoShowRequestItem showShowRequest$ProtoShowRequestItem : showShowRequest$ProtoShowResponse.m()) {
            arrayList.add(d(showShowRequest$ProtoShowRequestItem));
        }
        qyd.a b2 = qyd.b();
        b2.h(h);
        b2.j(nyd);
        b2.a(ImmutableList.copyOf((Collection) arrayList));
        b2.c(showShowRequest$ProtoShowResponse.n());
        b2.d(showShowRequest$ProtoShowResponse.p());
        b2.b(showShowRequest$ProtoShowResponse.q());
        ShowShowRequest$AuxiliarySections h2 = showShowRequest$ProtoShowResponse.h();
        if (!showShowRequest$ProtoShowResponse.r() || !h2.o() || !h2.h().l()) {
            lyd = null;
        } else {
            ShowShowRequest$ProtoShowRequestItem i2 = h2.h().i();
            lyd.a a3 = lyd.a();
            a3.a(d(i2));
            lyd = a3.build();
        }
        b2.f(lyd);
        ShowShowRequest$AuxiliarySections h3 = showShowRequest$ProtoShowResponse.h();
        if (!showShowRequest$ProtoShowResponse.r() || !h3.r() || !h3.n().l()) {
            syd = null;
        } else {
            ShowShowRequest$ProtoShowRequestItem i3 = h3.n().i();
            syd.a a4 = syd.a();
            a4.a(d(i3));
            syd = a4.build();
        }
        b2.g(syd);
        ShowShowRequest$AuxiliarySections h4 = showShowRequest$ProtoShowResponse.h();
        if (!showShowRequest$ProtoShowResponse.r() || !h4.q() || h4.m().i() == 0) {
            pyd = null;
        } else {
            ArrayList arrayList2 = new ArrayList(h4.m().i());
            for (Podcastextensions$PodcastTopic podcastextensions$PodcastTopic : h4.m().l()) {
                oyd.a a5 = oyd.a();
                a5.d(podcastextensions$PodcastTopic.h());
                a5.f(podcastextensions$PodcastTopic.i());
                arrayList2.add(a5.build());
            }
            pyd.a a6 = pyd.a();
            a6.a(arrayList2);
            pyd = a6.build();
        }
        b2.e(pyd);
        ShowShowRequest$AuxiliarySections h5 = showShowRequest$ProtoShowResponse.h();
        if (showShowRequest$ProtoShowResponse.r() && h5.p()) {
            myd.a a7 = myd.a();
            a7.k(h5.l().i());
            myd = a7.build();
        }
        b2.i(myd);
        return b2.build();
    }

    public static ryd j(ShowShowsRequest$ProtoShowsResponse showShowsRequest$ProtoShowsResponse) {
        ArrayList arrayList = new ArrayList(showShowsRequest$ProtoShowsResponse.h());
        for (ShowShowsRequest$ProtoShowsRequestItem showShowsRequest$ProtoShowsRequestItem : showShowsRequest$ProtoShowsResponse.i()) {
            ShowState$ProtoShowPlayState showState$ProtoShowPlayState = null;
            ShowMetadata$ProtoShowMetadata n = showShowsRequest$ProtoShowsRequestItem.q() ? showShowsRequest$ProtoShowsRequestItem.n() : null;
            ShowState$ProtoShowCollectionState m = showShowsRequest$ProtoShowsRequestItem.p() ? showShowsRequest$ProtoShowsRequestItem.m() : null;
            if (showShowsRequest$ProtoShowsRequestItem.r()) {
                showState$ProtoShowPlayState = showShowsRequest$ProtoShowsRequestItem.o();
            }
            arrayList.add(h(n, m, showState$ProtoShowPlayState, showShowsRequest$ProtoShowsRequestItem.h(), showShowsRequest$ProtoShowsRequestItem.i(), showShowsRequest$ProtoShowsRequestItem.l()));
        }
        ryd.a a2 = ryd.a();
        a2.e(showShowsRequest$ProtoShowsResponse.m());
        a2.a(ImmutableList.copyOf((Collection) arrayList));
        a2.c(showShowsRequest$ProtoShowsResponse.l());
        a2.d(showShowsRequest$ProtoShowsResponse.n());
        a2.b(showShowsRequest$ProtoShowsResponse.o());
        return a2.build();
    }

    public static Map<String, Episode> k(ShowDecorateRequest$ProtoDecorateResponse showDecorateRequest$ProtoDecorateResponse) {
        if (showDecorateRequest$ProtoDecorateResponse == null) {
            return null;
        }
        HashMap hashMap = new HashMap(showDecorateRequest$ProtoDecorateResponse.h());
        for (ShowDecorateRequest$ProtoDecorateEpisodeItem showDecorateRequest$ProtoDecorateEpisodeItem : showDecorateRequest$ProtoDecorateResponse.i()) {
            hashMap.put(showDecorateRequest$ProtoDecorateEpisodeItem.n(), c(showDecorateRequest$ProtoDecorateEpisodeItem.d() ? showDecorateRequest$ProtoDecorateEpisodeItem.k() : null, showDecorateRequest$ProtoDecorateEpisodeItem.e() ? showDecorateRequest$ProtoDecorateEpisodeItem.b() : null, showDecorateRequest$ProtoDecorateEpisodeItem.o() ? showDecorateRequest$ProtoDecorateEpisodeItem.h() : null, showDecorateRequest$ProtoDecorateEpisodeItem.j() ? showDecorateRequest$ProtoDecorateEpisodeItem.f() : null, null, showDecorateRequest$ProtoDecorateEpisodeItem.m(), showDecorateRequest$ProtoDecorateEpisodeItem.i(), showDecorateRequest$ProtoDecorateEpisodeItem.l()));
        }
        return hashMap;
    }

    public static Map<String, Show> l(ShowDecorateRequest$ProtoDecorateResponse showDecorateRequest$ProtoDecorateResponse) {
        if (showDecorateRequest$ProtoDecorateResponse == null) {
            return null;
        }
        HashMap hashMap = new HashMap(showDecorateRequest$ProtoDecorateResponse.l());
        for (ShowDecorateRequest$ProtoDecorateShowItem showDecorateRequest$ProtoDecorateShowItem : showDecorateRequest$ProtoDecorateResponse.m()) {
            hashMap.put(showDecorateRequest$ProtoDecorateShowItem.h(), h(showDecorateRequest$ProtoDecorateShowItem.o() ? showDecorateRequest$ProtoDecorateShowItem.l() : null, showDecorateRequest$ProtoDecorateShowItem.n() ? showDecorateRequest$ProtoDecorateShowItem.i() : null, showDecorateRequest$ProtoDecorateShowItem.p() ? showDecorateRequest$ProtoDecorateShowItem.m() : null, 0, false, -1));
        }
        return hashMap;
    }

    private static <T> T m(T t, T t2) {
        return t != null ? t : t2;
    }
}

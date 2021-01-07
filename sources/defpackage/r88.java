package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.playback.i;
import com.spotify.mobile.android.hubframework.defaults.v;
import com.spotify.music.C0707R;
import com.spotify.music.libs.search.trending.e;
import com.spotify.music.libs.search.trending.j;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.utterancesuggestions.h;
import defpackage.w51;
import java.util.Map;

/* renamed from: r88  reason: default package */
public final class r88 implements fjf<w51> {
    private final wlf<Context> a;
    private final wlf<c.a> b;
    private final wlf<Map<String, a71>> c;
    private final wlf<v> d;
    private final wlf<i> e;
    private final wlf<e> f;
    private final wlf<j> g;
    private final wlf<xqa> h;
    private final wlf<cra> i;
    private final wlf<zqa> j;
    private final wlf<era> k;
    private final wlf<gra> l;
    private final wlf<s68> m;
    private final wlf<vqa> n;
    private final wlf<tqa> o;
    private final wlf<ira> p;
    private final wlf<o68> q;
    private final wlf<h> r;

    public r88(wlf<Context> wlf, wlf<c.a> wlf2, wlf<Map<String, a71>> wlf3, wlf<v> wlf4, wlf<i> wlf5, wlf<e> wlf6, wlf<j> wlf7, wlf<xqa> wlf8, wlf<cra> wlf9, wlf<zqa> wlf10, wlf<era> wlf11, wlf<gra> wlf12, wlf<s68> wlf13, wlf<vqa> wlf14, wlf<tqa> wlf15, wlf<ira> wlf16, wlf<o68> wlf17, wlf<h> wlf18) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
        this.k = wlf11;
        this.l = wlf12;
        this.m = wlf13;
        this.n = wlf14;
        this.o = wlf15;
        this.p = wlf16;
        this.q = wlf17;
        this.r = wlf18;
    }

    public static r88 a(wlf<Context> wlf, wlf<c.a> wlf2, wlf<Map<String, a71>> wlf3, wlf<v> wlf4, wlf<i> wlf5, wlf<e> wlf6, wlf<j> wlf7, wlf<xqa> wlf8, wlf<cra> wlf9, wlf<zqa> wlf10, wlf<era> wlf11, wlf<gra> wlf12, wlf<s68> wlf13, wlf<vqa> wlf14, wlf<tqa> wlf15, wlf<ira> wlf16, wlf<o68> wlf17, wlf<h> wlf18) {
        return new r88(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10, wlf11, wlf12, wlf13, wlf14, wlf15, wlf16, wlf17, wlf18);
    }

    @Override // defpackage.wlf
    public Object get() {
        v vVar = this.d.get();
        tqa tqa = this.o.get();
        ira ira = this.p.get();
        o68 o68 = this.q.get();
        v.b a2 = vVar.a(this.a.get(), this.b.get());
        int i2 = p71.a;
        w51.b a3 = a2.c(i71.b).a(this.c.get()).a(this.e.get());
        a3.j(C0707R.id.hub_clear_search_history_component, "search:clearSearchHistory", new n68());
        a3.j(C0707R.id.hub_trending_search_scrolling_component, "trendingSearch:scrollingComponent", this.g.get());
        a3.j(C0707R.id.hub_trending_search_pill_component, "trendingSearch:pillComponent", this.f.get());
        a3.j(C0707R.id.search_music_and_talk_episode_row, "search:musicAndTalkEpisodeRow", this.h.get());
        a3.j(C0707R.id.search_podcast_episode_row, "search:podcastEpisodeRow", this.i.get());
        a3.j(C0707R.id.recent_search_podcast_episode_row, "recentSearch:podcastEpisodeRow", this.j.get());
        a3.j(C0707R.id.search_podcast_show_row, "search:podcastShowRow", this.k.get());
        a3.j(C0707R.id.search_topic_row, "search:topicRow", this.l.get());
        a3.j(C0707R.id.section_header, "glue:sectionHeader", this.m.get());
        a3.j(C0707R.id.search_empty_state, "search:EmptyState", this.n.get());
        a3.j(C0707R.id.search_card, tqa.c, tqa);
        a3.j(C0707R.id.search_track_with_lyrics_row, "search:trackWithLyrics", ira);
        a3.j(C0707R.id.hub_utterance_suggestion_component, "utteranceSuggestion:utteranceSuggestionComponent", this.r.get());
        a3.m(o68);
        return a3.a();
    }
}

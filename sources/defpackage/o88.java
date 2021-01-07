package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.playback.i;
import com.spotify.mobile.android.hubframework.defaults.v;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import defpackage.w51;
import java.util.Map;

/* renamed from: o88  reason: default package */
public final class o88 implements fjf<w51> {
    private final wlf<Context> a;
    private final wlf<c.a> b;
    private final wlf<Map<String, a71>> c;
    private final wlf<v> d;
    private final wlf<i> e;
    private final wlf<cra> f;
    private final wlf<xqa> g;
    private final wlf<era> h;
    private final wlf<vqa> i;
    private final wlf<gra> j;
    private final wlf<ira> k;

    public o88(wlf<Context> wlf, wlf<c.a> wlf2, wlf<Map<String, a71>> wlf3, wlf<v> wlf4, wlf<i> wlf5, wlf<cra> wlf6, wlf<xqa> wlf7, wlf<era> wlf8, wlf<vqa> wlf9, wlf<gra> wlf10, wlf<ira> wlf11) {
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
    }

    public static o88 a(wlf<Context> wlf, wlf<c.a> wlf2, wlf<Map<String, a71>> wlf3, wlf<v> wlf4, wlf<i> wlf5, wlf<cra> wlf6, wlf<xqa> wlf7, wlf<era> wlf8, wlf<vqa> wlf9, wlf<gra> wlf10, wlf<ira> wlf11) {
        return new o88(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10, wlf11);
    }

    @Override // defpackage.wlf
    public Object get() {
        v.b a2 = this.d.get().a(this.a.get(), this.b.get());
        int i2 = p71.a;
        w51.b a3 = a2.c(i71.b).a(this.c.get()).a(this.e.get());
        a3.j(C0707R.id.search_music_and_talk_episode_row, "search:musicAndTalkEpisodeRow", this.g.get());
        a3.j(C0707R.id.search_podcast_episode_row, "search:podcastEpisodeRow", this.f.get());
        a3.j(C0707R.id.search_podcast_show_row, "search:podcastShowRow", this.h.get());
        a3.j(C0707R.id.search_topic_row, "search:topicRow", this.j.get());
        a3.j(C0707R.id.search_empty_state, "search:EmptyState", this.i.get());
        a3.j(C0707R.id.search_track_with_lyrics_row, "search:trackWithLyrics", this.k.get());
        return a3.a();
    }
}

package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.spotify.music.newplaying.scroll.widgets.podcastpolls.view.PodcastPollsWidgetView;

/* renamed from: knb  reason: default package */
public class knb implements NowPlayingWidget {
    private final nnb a;
    private final awc b;
    private PodcastPollsWidgetView c;

    public knb(nnb nnb, awc awc) {
        this.a = nnb;
        this.b = awc;
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        PodcastPollsWidgetView podcastPollsWidgetView = (PodcastPollsWidgetView) layoutInflater.inflate(C0707R.layout.podcast_polls_layout, viewGroup, false);
        this.c = podcastPollsWidgetView;
        podcastPollsWidgetView.a(this.b);
        return this.c;
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public void b() {
        this.a.c();
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public void onStart() {
        this.a.d(this.c);
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public void onStop() {
        this.a.e();
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public NowPlayingWidget.Type type() {
        return NowPlayingWidget.Type.PODCAST_POLLS;
    }
}

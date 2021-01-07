package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.spotify.music.newplaying.scroll.widgets.podcastqna.view.PodcastQnAWidgetView;
import kotlin.jvm.internal.h;

/* renamed from: snb  reason: default package */
public final class snb implements NowPlayingWidget {
    private PodcastQnAWidgetView a;
    private final vnb b;
    private final ttc c;

    public snb(vnb vnb, ttc ttc) {
        h.e(vnb, "presenter");
        h.e(ttc, "podcastQnA");
        this.b = vnb;
        this.c = ttc;
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.e(layoutInflater, "inflater");
        h.e(viewGroup, "root");
        View inflate = layoutInflater.inflate(C0707R.layout.podcast_qna_widget_layout, viewGroup, false);
        if (inflate != null) {
            PodcastQnAWidgetView podcastQnAWidgetView = (PodcastQnAWidgetView) inflate;
            this.a = podcastQnAWidgetView;
            podcastQnAWidgetView.b(this.c);
            return podcastQnAWidgetView;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.spotify.music.newplaying.scroll.widgets.podcastqna.view.PodcastQnAWidgetView");
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public void b() {
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public void onStart() {
        vnb vnb = this.b;
        PodcastQnAWidgetView podcastQnAWidgetView = this.a;
        if (podcastQnAWidgetView != null) {
            vnb.b(podcastQnAWidgetView);
        } else {
            h.k("podcastQnAWidgetView");
            throw null;
        }
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public void onStop() {
        this.b.a();
        this.c.stop();
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public NowPlayingWidget.Type type() {
        return NowPlayingWidget.Type.PODCAST_QNA;
    }
}

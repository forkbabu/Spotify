package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import com.spotify.music.lyrics.core.experience.contract.a;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import com.spotify.music.newplaying.scroll.widgets.lyrics.view.LyricsWidgetView;

/* renamed from: bnb  reason: default package */
public class bnb implements NowPlayingWidget {
    private final enb a;
    private final a b;
    private LyricsWidgetView c;

    public bnb(enb enb, a aVar) {
        this.a = enb;
        this.b = aVar;
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LyricsWidgetView lyricsWidgetView = (LyricsWidgetView) layoutInflater.inflate(C0707R.layout.lyrics_widget_view, viewGroup, false);
        this.c = lyricsWidgetView;
        lyricsWidgetView.setContainerPresenter(this.b);
        return this.c;
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public void b() {
        this.b.h();
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public void onStart() {
        this.a.f(this.c);
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public void onStop() {
        this.a.g();
    }

    @Override // com.spotify.music.newplaying.scroll.NowPlayingWidget
    public NowPlayingWidget.Type type() {
        return NowPlayingWidget.Type.LYRICS;
    }
}

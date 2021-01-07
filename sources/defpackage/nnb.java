package defpackage;

import com.spotify.music.newplaying.scroll.widgets.podcastpolls.view.PodcastPollsWidgetView;
import com.spotify.music.podcastinteractivity.di.a;
import com.spotify.player.model.ContextTrack;
import io.reactivex.g;

/* renamed from: nnb  reason: default package */
public class nnb implements a {
    private final io.reactivex.disposables.a a = new io.reactivex.disposables.a();
    private final g<ContextTrack> b;
    private com.spotify.music.newplaying.scroll.widgets.podcastpolls.view.a c;
    private String d;

    public nnb(g<ContextTrack> gVar) {
        this.b = gVar;
    }

    @Override // com.spotify.music.podcastinteractivity.di.a
    public String a() {
        return this.d;
    }

    public /* synthetic */ void b(String str) {
        this.d = str;
        ((PodcastPollsWidgetView) this.c).c(str);
    }

    public void c() {
        ((PodcastPollsWidgetView) this.c).b();
    }

    public void d(com.spotify.music.newplaying.scroll.widgets.podcastpolls.view.a aVar) {
        this.c = aVar;
        this.a.b(this.b.C(inb.a).O(hnb.a).s().subscribe(new jnb(this)));
    }

    public void e() {
        this.a.f();
        ((PodcastPollsWidgetView) this.c).d();
    }
}

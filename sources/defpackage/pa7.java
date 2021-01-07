package defpackage;

import com.spotify.player.model.ContextTrack;

/* renamed from: pa7  reason: default package */
public class pa7 implements oa7 {
    private final String a;
    private final ja7 b;

    public pa7(String str, ja7 ja7) {
        this.a = str;
        this.b = ja7;
    }

    @Override // defpackage.oa7
    public void a(String str) {
        this.b.b(this.a, "play-button", ContextTrack.TrackAction.PAUSE);
    }

    @Override // defpackage.oa7
    public String b(String str) {
        this.b.b(this.a, "play-button", "play");
        return null;
    }

    @Override // defpackage.oa7
    public void c(String str) {
        this.b.b(this.a, "description-web-link", "navigate-forward");
    }

    @Override // defpackage.oa7
    public void d(String str) {
        this.b.b(this.a, "toolbar", "mark-as-played");
    }

    @Override // defpackage.oa7
    public void e(String str) {
        this.b.b("spotify:app:share-flow", "share-button", "navigate-forward");
    }

    @Override // defpackage.oa7
    public void f(String str) {
        this.b.b(str, "cover-art", "navigate-forward");
    }

    @Override // defpackage.oa7
    public void g(String str) {
        this.b.b(str, "see-all-episodes", "navigate-forward");
    }

    @Override // defpackage.oa7
    public void h(String str) {
        this.b.b(this.a, "toolbar", "mark-as-unplayed");
    }

    @Override // defpackage.oa7
    public void i(String str) {
        this.b.b(this.a, "description-email", "navigate-forward");
    }

    @Override // defpackage.oa7
    public void j(boolean z, String str) {
        this.b.a(z);
    }

    @Override // defpackage.oa7
    public void k(String str, boolean z) {
    }

    @Override // defpackage.oa7
    public nqe l(String str) {
        this.b.b(this.a, "toolbar", "add-to-queue");
        return null;
    }

    @Override // defpackage.oa7
    public void m() {
        this.b.b(this.a, "toolbar", "add-to-playlist");
    }

    @Override // defpackage.oa7
    public String n(int i) {
        this.b.b(this.a, "description-timestamp", "seek");
        return null;
    }

    @Override // defpackage.oa7
    public void o(String str) {
        this.b.b(this.a, "episode-description", "expand-description");
    }

    @Override // defpackage.oa7
    public void p(String str) {
        this.b.b(str, "show-name", "navigate-forward");
    }

    @Override // defpackage.oa7
    public void q(String str) {
        this.b.b(str, "description-spotify-link", "navigate-forward");
    }

    @Override // defpackage.oa7
    public void r(String str) {
        this.b.b(str, "toolbar", "navigate-forward");
    }
}

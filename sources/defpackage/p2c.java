package defpackage;

import com.spotify.music.nowplaying.common.view.logging.c;
import com.spotify.nowplaying.ui.components.controls.playpause.d;
import com.spotify.nowplaying.ui.components.controls.seekbackward.g;
import com.spotify.nowplaying.ui.components.controls.seekbar.h;
import com.spotify.nowplaying.ui.components.controls.seekforward.f;
import com.spotify.player.options.RepeatMode;

/* renamed from: p2c  reason: default package */
public final class p2c implements jqd, kqd, lqd, mqd, nqd, d, h, g, f, drd, com.spotify.music.nowplaying.podcast.sleeptimer.d, com.spotify.music.nowplaying.podcast.speedcontrol.d, erd, iqd, frd {
    private final c a;

    public p2c(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.iqd
    public void a(String str, String str2) {
        this.a.e(str2);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void b(String str) {
        this.a.o(str);
    }

    @Override // defpackage.frd
    public void d(String str) {
        this.a.C(str);
    }

    @Override // defpackage.kqd
    public void e() {
        this.a.g();
    }

    @Override // com.spotify.music.nowplaying.podcast.sleeptimer.d
    public void f(String str) {
        this.a.z(str);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekforward.f
    public void h(String str, int i) {
        this.a.v(str);
    }

    @Override // defpackage.mqd
    public void i(RepeatMode repeatMode) {
        this.a.i(repeatMode);
    }

    @Override // defpackage.drd
    public void j() {
        this.a.x();
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbackward.g
    public void k(String str, int i) {
        this.a.u(str);
    }

    @Override // defpackage.frd
    public void l(String str) {
        this.a.D(str);
    }

    @Override // defpackage.jqd
    public void m() {
        this.a.f();
    }

    @Override // com.spotify.music.nowplaying.podcast.speedcontrol.d
    public void p(String str) {
        this.a.A(str);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.h
    public void q(String str, int i) {
        this.a.w(str);
    }

    @Override // defpackage.lqd
    public void r() {
        this.a.h();
    }

    @Override // defpackage.erd
    public void s(String str) {
        this.a.B(str);
    }

    @Override // defpackage.iqd
    public void t(String str, String str2) {
        this.a.d(str2);
    }

    @Override // defpackage.nqd
    public void u(boolean z) {
        this.a.j(z);
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void v(String str) {
        this.a.p(str);
    }
}

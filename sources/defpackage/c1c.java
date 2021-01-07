package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.nowplaying.podcast.speedcontrol.d;
import com.spotify.player.options.RepeatMode;
import com.spotify.ubi.specification.factories.d2;
import kotlin.jvm.internal.h;

/* renamed from: c1c  reason: default package */
public final class c1c implements jqd, kqd, crd, lqd, nqd, mqd, erd, d, com.spotify.music.nowplaying.podcast.sleeptimer.d, e1c, a1c, y0c, b1c, f1c {
    private final d2 a;
    private final ere b;

    public c1c(ere ere, a aVar, c cVar) {
        h.e(ere, "userBehaviourEventLogger");
        h.e(aVar, "pageIdentifier");
        h.e(cVar, "viewUri");
        this.b = ere;
        this.a = new d2(aVar.path(), cVar.toString());
    }

    private final void x(String str) {
        Logger.b(je.x0("PodcastMMELogger: ", str), new Object[0]);
    }

    @Override // defpackage.f1c
    public void a() {
        x("logTrackListImpression");
        this.b.a(this.a.e().b());
    }

    @Override // defpackage.a1c
    public void b(String str) {
        h.e(str, "item");
        x("logPauseButtonHit uri: " + str);
        this.b.a(this.a.c().b().a(str));
    }

    @Override // defpackage.a1c
    public void c(String str) {
        h.e(str, "item");
        x("logResumeButtonHit uri: " + str);
        this.b.a(this.a.c().b().b(str));
    }

    @Override // defpackage.f1c
    public void d(int i, String str) {
        h.e(str, "uri");
        x("logTrackListHeartButtonHit  position: " + i + "   uri: " + str);
        this.b.a(this.a.e().c(Integer.valueOf(i), str).c().a());
    }

    @Override // defpackage.kqd
    public void e() {
        x("logConnectButtonHit");
        this.b.a(this.a.b().b().a());
    }

    @Override // com.spotify.music.nowplaying.podcast.sleeptimer.d
    public void f(String str) {
        h.e(str, "trackUri");
        x("logSleepTimerButtonHit");
        this.b.a(this.a.c().h().a());
    }

    @Override // defpackage.a1c
    public void g(int i) {
        x(je.p0("logSeekBackwardHit offsetTime: ", i));
        this.b.a(this.a.c().d().a(Integer.valueOf(i)));
    }

    @Override // defpackage.f1c
    public void h(int i, String str, String str2) {
        h.e(str, "uri");
        h.e(str2, "itemToBePlayed");
        x("logTrackListPlayHit  position: " + i + "   uri: " + str + "  itemToBePLayed: " + str2);
        this.b.a(this.a.e().c(Integer.valueOf(i), str).d(str2));
    }

    @Override // defpackage.mqd
    public void i(RepeatMode repeatMode) {
        h.e(repeatMode, "newRepeatMode");
    }

    @Override // defpackage.f1c
    public void j(int i, String str) {
        h.e(str, "uri");
        x("logTrackListContextMenuHit  position: " + i + "   uri: " + str);
        this.b.a(this.a.e().c(Integer.valueOf(i), str).b().a());
    }

    @Override // defpackage.a1c
    public void k(int i) {
        x(je.p0("logSeekForwardHit offsetTime: ", i));
        this.b.a(this.a.c().e().a(Integer.valueOf(i)));
    }

    @Override // defpackage.b1c
    public void l(int i) {
        x(je.p0("logDragSeekToTime  toSeekTo: ", i));
        this.b.a(this.a.d().a(Integer.valueOf(i)));
    }

    @Override // defpackage.jqd
    public void m() {
        x("logCloseButtonHit");
        this.b.a(this.a.f().b().a());
    }

    @Override // defpackage.a1c
    public void n(String str) {
        h.e(str, "item");
        x("logSkipNextHit hitSkipToNext: " + str);
        this.b.a(this.a.c().f().a(str));
    }

    @Override // defpackage.y0c
    public void o() {
        x("logCardHeartButtonHit");
        this.b.a(this.a.g().b().a());
    }

    @Override // com.spotify.music.nowplaying.podcast.speedcontrol.d
    public void p(String str) {
        h.e(str, "trackUri");
        x("logSpeedControlButtonHit");
        this.b.a(this.a.c().c().a());
    }

    @Override // defpackage.e1c
    public void q() {
        x("logShareControlButtonHit");
        this.b.a(this.a.b().c().a());
    }

    @Override // defpackage.lqd
    public void r() {
        x("logContextMenuButtonHit");
        this.b.a(this.a.f().c().a());
    }

    @Override // defpackage.erd
    public void s(String str) {
        h.e(str, "contextUri");
        x("logTitleHeaderHit: contextUri = " + str);
        this.b.a(this.a.f().d().a(str));
    }

    @Override // defpackage.y0c
    public void t() {
        x("logCardDisplayed");
        this.b.a(this.a.g().c());
    }

    @Override // defpackage.nqd
    public void u(boolean z) {
    }

    @Override // defpackage.a1c
    public void v(String str) {
        h.e(str, "item");
        x("logSkipPreviousHit hitSkipToPrevious: " + str);
        this.b.a(this.a.c().g().a(str));
    }

    @Override // defpackage.crd
    public void w() {
    }
}

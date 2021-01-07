package defpackage;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.lyrics.core.experience.model.LyricsWrapper;
import com.spotify.music.lyrics.core.experience.model.a;
import com.spotify.music.lyrics.core.experience.model.b;
import com.spotify.music.lyrics.core.experience.rx.LyricsEventPublisher;
import com.spotify.rxjava2.q;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: enb  reason: default package */
public class enb {
    private final edb a;
    private final s<b> b;
    private final zmb c;
    private final udb d;
    private final g<Integer> e;
    private final s<uqd> f;
    private final y g;
    private final q h = new q();
    private final com.spotify.music.lyrics.share.common.sharebutton.b i;
    private com.spotify.music.newplaying.scroll.widgets.lyrics.view.b j;
    private LyricsWrapper k;

    enb(g<Long> gVar, s<uqd> sVar, y yVar, s<b> sVar2, zmb zmb, udb udb, edb edb, com.spotify.music.lyrics.share.common.sharebutton.b bVar) {
        this.e = gVar.O(rmb.a);
        this.f = sVar;
        this.g = yVar;
        this.b = sVar2;
        this.c = zmb;
        this.d = udb;
        this.a = edb;
        this.i = bVar;
    }

    public static void a(enb enb, b bVar) {
        com.spotify.music.newplaying.scroll.widgets.lyrics.view.b bVar2 = enb.j;
        bVar2.getClass();
        if (bVar instanceof b.c) {
            enb.k = null;
            bVar2.d();
            bVar2.setFullscreenClickedListener(null);
        } else if (bVar instanceof b.C0304b) {
            LyricsWrapper a2 = ((b.C0304b) bVar).a();
            enb.k = a2;
            a colors = a2.getColors();
            bVar2.b(enb.k);
            bVar2.a(colors.a(), colors.c());
            enb.c.b(colors.b(), new ymb(bVar2));
            bVar2.setFullscreenClickedListener(new xmb(enb));
            bVar2.setVocalRemovalPossible(enb.k.getHasVocalRemoval());
            enb.i.c(bVar2.getShareButtonViewBinder(), bVar2.getLyricsViewBinder(), enb.k);
        } else if (bVar instanceof b.a) {
            enb.k = null;
            bVar2.e();
            enb.c.b(-14079703, new ymb(bVar2));
            bVar2.setFullscreenClickedListener(null);
        }
    }

    public void b(LyricsEventPublisher.a aVar) {
        if (!this.d.a()) {
            this.a.b();
            Logger.b("onMinimumCharacterCountDisplayed event triggered", new Object[0]);
        }
    }

    public /* synthetic */ void c(com.spotify.music.newplaying.scroll.widgets.lyrics.view.b bVar, Integer num) {
        bVar.c(num.intValue(), this.k != null);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        com.spotify.music.newplaying.scroll.widgets.lyrics.view.b bVar = this.j;
        if (bVar != null) {
            bVar.setFullscreenClickedListener(null);
        }
        this.a.a();
        com.spotify.music.newplaying.scroll.widgets.lyrics.view.b bVar2 = this.j;
        bVar2.getClass();
        Bundle viewStateBundle = bVar2.getViewStateBundle();
        if (viewStateBundle != null) {
            this.d.b(viewStateBundle);
        } else {
            Assertion.g("Trying to navigate to fullscreen mode with null lyrics or colors");
        }
    }

    /* access modifiers changed from: package-private */
    public void e(boolean z) {
        com.spotify.music.newplaying.scroll.widgets.lyrics.view.b bVar = this.j;
        if (bVar != null && z && this.k != null) {
            bVar.setFullscreenClickedListener(new xmb(this));
        } else if (bVar != null && !z) {
            bVar.setFullscreenClickedListener(null);
        }
    }

    public void f(com.spotify.music.newplaying.scroll.widgets.lyrics.view.b bVar) {
        bVar.getClass();
        this.j = bVar;
        bVar.setFocusChangeListener(new qmb(this));
        LyricsEventPublisher lyricsEventPublisher = LyricsEventPublisher.c;
        LyricsEventPublisher.c(LyricsEventPublisher.Subject.MINIMUM_CHARACTER_COUNT, this, new tmb(this));
        this.h.b(this.b.o0(this.g).r0(wmb.a).subscribe(new smb(this)), this.f.o0(this.g).Y0(BackpressureStrategy.BUFFER).l(new tqd(this.e)).T(umb.a).subscribe(new vmb(this, bVar)));
    }

    public void g() {
        this.h.c();
        this.i.d();
        LyricsEventPublisher lyricsEventPublisher = LyricsEventPublisher.c;
        LyricsEventPublisher.d(this);
    }
}

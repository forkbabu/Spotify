package com.spotify.music.nowplaying.scroll.widgets.upnext;

import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import com.spotify.music.nowplaying.scroll.widgets.upnext.k;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.rxjava2.q;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class i implements k.a {
    private final q a = new q();
    private k b;
    private boolean c;
    private boolean d;
    private final y e;
    private final y f;
    private final bxd g;
    private final ExplicitContentFacade h;
    private final AgeRestrictedContentFacade i;
    private final b4c j;
    private final d k;
    private final nsb l;

    public i(y yVar, y yVar2, bxd bxd, ExplicitContentFacade explicitContentFacade, AgeRestrictedContentFacade ageRestrictedContentFacade, b4c b4c, d dVar, nsb nsb) {
        h.e(yVar, "mainScheduler");
        h.e(yVar2, "ioScheduler");
        h.e(bxd, "playerApi");
        h.e(explicitContentFacade, "explicitContentFacade");
        h.e(ageRestrictedContentFacade, "ageRestrictedContentFacade");
        h.e(b4c, "contextMenuHandler");
        h.e(dVar, "playerControls");
        h.e(nsb, "navigator");
        this.e = yVar;
        this.f = yVar2;
        this.g = bxd;
        this.h = explicitContentFacade;
        this.i = ageRestrictedContentFacade;
        this.j = b4c;
        this.k = dVar;
        this.l = nsb;
    }

    @Override // com.spotify.music.nowplaying.scroll.widgets.upnext.k.a
    public void a() {
        this.l.c();
    }

    @Override // com.spotify.music.nowplaying.scroll.widgets.upnext.k.a
    public void b(a aVar) {
        h.e(aVar, "model");
        this.j.a(aVar.f(), aVar.e());
    }

    @Override // com.spotify.music.nowplaying.scroll.widgets.upnext.k.a
    public void c(a aVar) {
        h.e(aVar, "model");
        if (this.d && aVar.g()) {
            this.i.d(aVar.f(), aVar.c());
        } else if (!this.c || !aVar.h()) {
            ContextTrack a2 = aVar.a();
            SkipToNextTrackCommand.Builder builder = SkipToNextTrackCommand.builder();
            ContextTrack.Builder metadata = ContextTrack.builder(a2.uri()).uid(a2.uid()).metadata(a2.metadata());
            String provider = a2.provider();
            if (provider == null) {
                provider = "";
            }
            h.d(this.k.a(c.j(builder.track(metadata.provider(provider).build()).build())).subscribe(), "playerControls.execute(s…and(command)).subscribe()");
        } else {
            this.h.e(aVar.f(), aVar.b());
        }
    }

    public final void g(k kVar) {
        h.e(kVar, "binder");
        this.b = kVar;
        kVar.setTrackRowEventListener(this);
        this.a.a(this.h.c().subscribe(new f(this)));
        this.a.a(this.i.c().subscribe(new e(this)));
        this.a.a(this.g.a().a().O(new g(this)).e0(this.f).Q(this.e).subscribe(new h(this)));
    }

    public final void h() {
        k kVar = this.b;
        if (kVar != null) {
            kVar.setTrackRowEventListener(null);
        }
        this.a.c();
    }
}

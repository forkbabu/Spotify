package com.spotify.music.features.podcast.entity.trailer;

import android.content.res.Resources;
import android.view.View;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.n;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.C0707R;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.podcast.episode.util.DurationFormatter;
import com.spotify.playlist.models.Episode;
import com.spotify.rxjava2.p;
import defpackage.yfc;
import io.reactivex.y;

public class PodcastTrailerPresenter implements e {
    private final ajf<a> a;
    private final p b = new p();
    private final yfc.a c;
    private final DurationFormatter f;
    private final Resources n;
    private final snc o;
    private final x57 p;
    private final ExplicitContentFacade q;
    private final String r;
    private final y s;
    private boolean t;

    public interface a {
        void b();
    }

    public PodcastTrailerPresenter(ajf<a> ajf, yfc.a aVar, DurationFormatter durationFormatter, Resources resources, snc snc, x57 x57, ExplicitContentFacade explicitContentFacade, String str, y yVar, n nVar) {
        this.a = ajf;
        this.c = aVar;
        this.f = durationFormatter;
        this.n = resources;
        this.o = snc;
        this.p = x57;
        this.q = explicitContentFacade;
        this.r = str;
        this.s = yVar;
        nVar.A().a(this);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void V(n nVar) {
        d.d(this, nVar);
    }

    public /* synthetic */ void a(Boolean bool) {
        this.t = bool.booleanValue();
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void a0(n nVar) {
        d.c(this, nVar);
    }

    public /* synthetic */ void b(Throwable th) {
        Logger.d("Error in ExplicitContentFacade subscription: %s", th);
        this.t = false;
    }

    public /* synthetic */ void c(String str) {
        this.p.j(str);
    }

    public void d(String str, boolean z, View view) {
        if (z) {
            this.o.a();
        } else {
            this.q.e(str, this.r);
        }
    }

    @Override // androidx.lifecycle.g
    public void d0(n nVar) {
        this.o.onStop();
        this.b.a();
    }

    public void e(qyd qyd, esc esc) {
        String j = qyd.d().j();
        syd h = qyd.h();
        if ((j.isEmpty() || h == null || h.b() == null) ? false : true) {
            Episode b2 = h.b();
            this.o.b(new vnc(j, b2.n(), qyd.d().h()));
            this.c.c(true);
            this.c.m(b2.n());
            this.c.k(this.f.a(DurationFormatter.Format.LONG_MINUTE_AND_SECOND, b2.j()));
            this.c.l(this.n.getString(C0707R.string.show_trailer));
            this.c.f(b2.c().c() != null ? b2.c().c() : "");
            this.c.i(new a(this, j));
            boolean C = b2.C();
            boolean z = !C || !this.t;
            this.c.j(C);
            this.c.g(z);
            this.c.h(new msc(b2.n(), j, "podcast-trailer", true, 0, b2.l() == Episode.MediaType.VIDEO));
            this.c.n(new c(this, j, z));
            this.a.get().b();
        } else {
            this.c.c(false);
            this.a.get().b();
        }
        esc.b(this.c);
    }

    @Override // androidx.lifecycle.g
    public void h0(n nVar) {
        nVar.A().c(this);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void n(n nVar) {
        d.a(this, nVar);
    }

    @Override // androidx.lifecycle.g
    public void o0(n nVar) {
        this.o.onStart();
        this.b.b(this.q.c().o0(this.s).subscribe(new b(this), new d(this)));
    }
}

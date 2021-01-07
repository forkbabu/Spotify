package com.spotify.music.features.queue;

import com.google.common.base.MoreObjects;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.spotify.libs.connect.picker.view.g;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.cosmos.player.v2.queue.PlayTrackQueueUtils;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.features.queue.logging.c;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import com.spotify.player.controls.d;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import io.reactivex.disposables.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class a0 implements lx7, nx7, kx7, jx7 {
    private final g a;
    private final w b;
    private final v c;
    private final c d;
    private final ExplicitContentFacade e;
    private final AgeRestrictedContentFacade f;
    private final d g;
    private final boolean h;
    private final Map<String, sx7> i = new HashMap();
    private final a j = new a();
    private boolean k;
    private boolean l;
    private d0 m;

    public a0(g gVar, w wVar, v vVar, c cVar, ExplicitContentFacade explicitContentFacade, AgeRestrictedContentFacade ageRestrictedContentFacade, d dVar, boolean z) {
        this.a = gVar;
        this.b = wVar;
        this.c = vVar;
        this.d = cVar;
        this.e = explicitContentFacade;
        this.f = ageRestrictedContentFacade;
        this.g = dVar;
        this.h = z;
        vVar.o(z);
    }

    private void l() {
        boolean z = true;
        this.c.o(this.i.isEmpty() && this.h);
        if (this.i.isEmpty()) {
            ((y) this.m).k();
            return;
        }
        boolean z2 = true;
        for (sx7 sx7 : this.i.values()) {
            if (!sx7.d()) {
                z = false;
            }
            if (!sx7.e()) {
                z2 = false;
            }
        }
        ((y) this.m).r(z);
        ((y) this.m).s(z2);
        ((y) this.m).t();
    }

    @Override // defpackage.nx7
    public void a(PlayerTrack playerTrack) {
        if (this.l && PlayerTrackUtil.is19Plus(playerTrack)) {
            this.f.d(playerTrack.uri(), playerTrack.metadata().get("image_large_url"));
        } else if (this.k && PlayerTrackUtil.isExplicit(playerTrack)) {
            this.e.e(playerTrack.uri(), null);
        } else if (this.b.e(playerTrack)) {
            this.d.j(playerTrack.uri());
            ((y) this.m).u();
        } else if (z42.s(playerTrack, "availability_restrictions").isEmpty()) {
            this.d.k(this.b.d(playerTrack.uid()), playerTrack.uri());
            this.j.b(this.g.a(com.spotify.player.controls.c.j(SkipToNextTrackCommand.builder().track(ContextTrack.builder(playerTrack.uri()).uid(playerTrack.uid()).metadata(playerTrack.metadata()).provider(MoreObjects.nullToEmpty(playerTrack.provider())).build()).build())).subscribe());
        }
    }

    @Override // defpackage.lx7
    public void b(sx7 sx7, boolean z) {
        String globallyUniqueUid = PlayTrackQueueUtils.getGloballyUniqueUid(sx7.f());
        int d2 = this.b.d(sx7.f().uid());
        if (z) {
            this.d.q(d2, sx7.f().uri());
            this.i.put(globallyUniqueUid, sx7);
        } else {
            this.d.o(d2, sx7.f().uri());
            this.i.remove(globallyUniqueUid);
        }
        l();
    }

    public /* synthetic */ void c(Boolean bool) {
        this.l = bool.booleanValue();
        ((y) this.m).g(bool.booleanValue());
    }

    public /* synthetic */ void d(Boolean bool) {
        this.k = bool.booleanValue();
        ((y) this.m).j(bool.booleanValue());
    }

    public void e() {
        this.d.c();
        ArrayList arrayList = new ArrayList();
        for (sx7 sx7 : this.i.values()) {
            arrayList.add(sx7.f());
        }
        this.b.a(arrayList);
        this.i.clear();
        ((y) this.m).c();
        l();
    }

    public void f() {
        this.d.d();
        ((y) this.m).e();
    }

    public void g() {
        ImmutableList list = FluentIterable.from(Arrays.asList(this.b.c().a())).transform(b.a).toList();
        this.d.e(list.size());
        this.b.j(list);
    }

    public void h() {
        this.d.f();
        ((y) this.m).e();
    }

    public void i() {
        this.d.g();
    }

    public void j(int i2, int i3) {
        int i4;
        String str;
        boolean f2 = this.b.f(i3);
        this.b.k();
        boolean f3 = this.b.f(i3);
        if (this.c.h(i3) instanceof sx7) {
            sx7 sx7 = (sx7) this.c.h(i3);
            str = sx7.f().uri();
            i4 = this.b.d(sx7.f().uid());
        } else {
            str = "";
            i4 = -1;
        }
        this.d.p(i4, str, f2, f3);
    }

    public boolean k(int i2) {
        return this.b.b(i2);
    }

    public void m() {
        this.d.n();
        ArrayList arrayList = new ArrayList();
        for (sx7 sx7 : this.i.values()) {
            arrayList.add(sx7.f());
        }
        this.b.j(arrayList);
        this.i.clear();
        ((y) this.m).c();
        l();
    }

    public void n() {
        this.a.f();
        this.b.h();
        this.j.b(this.e.c().subscribe(new p(this)));
        this.j.b(this.f.c().subscribe(new q(this)));
    }

    public void o() {
        this.j.f();
        this.b.i();
        this.a.d();
    }

    public void p(d0 d0Var) {
        this.m = d0Var;
    }
}

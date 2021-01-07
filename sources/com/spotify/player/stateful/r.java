package com.spotify.player.stateful;

import com.google.common.base.Optional;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import io.reactivex.z;

public class r implements d {
    private final d a;
    private final StatefulPlayerSimulator b;

    public r(d dVar, StatefulPlayerSimulator statefulPlayerSimulator) {
        this.a = dVar;
        this.b = statefulPlayerSimulator;
    }

    @Override // com.spotify.player.controls.d
    public z<zwd> a(c cVar) {
        cVar.b(new l(this), new e(this), new j(this), new c(this), new g(this), new h(this), new b(this), new f(this), new k(this), new i(this), d.a);
        return this.a.a(cVar);
    }

    public /* synthetic */ void b(c.C0365c cVar) {
        this.b.f();
    }

    public /* synthetic */ void c(c.d dVar) {
        this.b.f();
    }

    public /* synthetic */ void d(c.a aVar) {
        this.b.d();
    }

    public /* synthetic */ void e(c.b bVar) {
        this.b.d();
    }

    public /* synthetic */ void f(c.g gVar) {
        this.b.j();
    }

    public /* synthetic */ void g(c.h hVar) {
        this.b.j();
    }

    public /* synthetic */ void h(c.i iVar) {
        this.b.k(false);
    }

    public void i(c.j jVar) {
        jVar.getClass();
        Optional<SkipToPrevTrackOptions> options = jVar.m().options();
        this.b.k(options.isPresent() ? options.get().allowSeeking().or((Optional<Boolean>) Boolean.FALSE).booleanValue() : false);
    }

    public void j(c.e eVar) {
        StatefulPlayerSimulator statefulPlayerSimulator = this.b;
        eVar.getClass();
        statefulPlayerSimulator.g(eVar.m());
    }

    public void k(c.f fVar) {
        StatefulPlayerSimulator statefulPlayerSimulator = this.b;
        fVar.getClass();
        statefulPlayerSimulator.g(fVar.m().value());
    }
}

package com.spotify.voice.external.experience.domain.model;

import com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent;
import com.spotify.player.model.ContextTrack;
import com.spotify.voice.external.experience.domain.model.a;
import com.spotify.voice.external.experience.domain.model.c;

public abstract class b {

    interface a {
    }

    public static b b(String str, ContextTrack contextTrack) {
        a.b bVar = new a.b();
        bVar.h(new c.d());
        a.b bVar2 = bVar;
        bVar2.l("");
        a.b bVar3 = bVar2;
        bVar3.j(contextTrack);
        a.b bVar4 = bVar3;
        bVar4.b(str);
        a.b bVar5 = bVar4;
        bVar5.e(-1);
        a.b bVar6 = bVar5;
        bVar6.i("");
        a.b bVar7 = bVar6;
        bVar7.k(false);
        a.b bVar8 = bVar7;
        bVar8.n(Boolean.FALSE);
        a.b bVar9 = bVar8;
        bVar9.c("");
        a.b bVar10 = bVar9;
        bVar10.g("");
        return bVar10.a();
    }

    public abstract String a();

    public abstract String c();

    public abstract String d();

    public abstract int e();

    public abstract Integer f();

    public abstract String g();

    public abstract c h();

    public abstract String i();

    public abstract a j();

    public abstract ContextTrack k();

    public abstract boolean l();

    public abstract String m();

    public abstract Integer n();

    public abstract Boolean o();

    public b p(String str) {
        a.b bVar = (a.b) j();
        bVar.d(str);
        return bVar.a();
    }

    public b q(SlimoProto$ParsedQuery$Intent slimoProto$ParsedQuery$Intent) {
        a.b bVar = (a.b) j();
        bVar.e(slimoProto$ParsedQuery$Intent.getNumber());
        return bVar.a();
    }

    public b r(Integer num) {
        a.b bVar = (a.b) j();
        bVar.f(num);
        return bVar.a();
    }

    public b s(c cVar) {
        a.b bVar = (a.b) j();
        bVar.h(cVar);
        return bVar.a();
    }

    public b t(String str) {
        a.b bVar = (a.b) j();
        bVar.i(str);
        return bVar.a();
    }

    public b u(boolean z) {
        a.b bVar = (a.b) j();
        bVar.k(z);
        return bVar.a();
    }

    public b v(String str) {
        a.b bVar = (a.b) j();
        bVar.l(str);
        return bVar.a();
    }

    public b w(Integer num) {
        a.b bVar = (a.b) j();
        bVar.m(num);
        return bVar.a();
    }

    public b x(Boolean bool) {
        a.b bVar = (a.b) j();
        bVar.n(bool);
        return bVar.a();
    }
}

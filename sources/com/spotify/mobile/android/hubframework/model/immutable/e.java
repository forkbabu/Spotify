package com.spotify.mobile.android.hubframework.model.immutable;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel;
import defpackage.p81;
import defpackage.r81;
import defpackage.s81;
import defpackage.w81;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class e extends s81.a {
    private q81 a;
    private w81.a b;
    private r81.a c;
    private p81.a d;
    private p81.a e;
    private p81.a f;
    private a91 g;
    private String h;
    private String i;
    private final k<String, HubsImmutableCommandModel> j;
    private final j<HubsImmutableComponentModel> k;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    e(HubsImmutableComponentModel.c cVar) {
        this.a = cVar.B();
        this.b = cVar.K().toBuilder();
        this.c = cVar.G().toBuilder();
        this.d = cVar.I().toBuilder();
        this.e = cVar.H().toBuilder();
        this.f = cVar.C().toBuilder();
        this.g = cVar.J();
        this.h = cVar.F();
        this.i = cVar.E();
        this.j = new k<>(cVar.D());
        this.k = new j<>(cVar.A());
    }

    @Override // defpackage.s81.a
    public s81.a a(List<? extends s81> list) {
        h.e(list, "components");
        this.k.a(c.a(list));
        return this;
    }

    @Override // defpackage.s81.a
    public s81.a b(s81... s81Arr) {
        h.e(s81Arr, "components");
        this.k.a(c.a(d.c(s81Arr)));
        return this;
    }

    @Override // defpackage.s81.a
    public s81.a c(p81 p81) {
        h.e(p81, "custom");
        this.f = this.f.a(p81);
        return this;
    }

    @Override // defpackage.s81.a
    public s81.a d(String str, Serializable serializable) {
        h.e(str, "key");
        this.f = this.f.o(str, serializable);
        return this;
    }

    @Override // defpackage.s81.a
    public s81.a f(String str, o81 o81) {
        h.e(str, "eventName");
        h.e(o81, "command");
        this.j.c(str, HubsImmutableCommandModel.Companion.c(o81));
        return this;
    }

    @Override // defpackage.s81.a
    public s81.a g(Map<String, ? extends o81> map) {
        h.e(map, "events");
        this.j.a(HubsImmutableCommandModel.Companion.a(map));
        return this;
    }

    @Override // defpackage.s81.a
    public s81.a h(p81 p81) {
        h.e(p81, "logging");
        this.e = this.e.a(p81);
        return this;
    }

    @Override // defpackage.s81.a
    public s81.a i(String str, Serializable serializable) {
        h.e(str, "key");
        this.e = this.e.o(str, serializable);
        return this;
    }

    @Override // defpackage.s81.a
    public s81.a j(p81 p81) {
        h.e(p81, "metadata");
        this.d = this.d.a(p81);
        return this;
    }

    @Override // defpackage.s81.a
    public s81.a k(String str, Serializable serializable) {
        h.e(str, "key");
        this.d = this.d.o(str, serializable);
        return this;
    }

    @Override // defpackage.s81.a
    public s81 l() {
        return HubsImmutableComponentModel.Companion.b(this.a, this.b.build(), this.c.b(), this.d.d(), this.e.d(), this.f.d(), this.g, this.h, this.i, this.j.b(), this.k.b());
    }

    @Override // defpackage.s81.a
    public s81.a m(List<? extends s81> list) {
        this.k.c(c.b(list));
        return this;
    }

    @Override // defpackage.s81.a
    public s81.a n(q81 q81) {
        h.e(q81, "componentId");
        h.d(q81, "Preconditions.checkNotNull(componentId)");
        this.a = q81;
        return this;
    }

    @Override // defpackage.s81.a
    public s81.a o(String str, String str2) {
        h.e(str, "componentId");
        h.e(str2, "category");
        n(HubsImmutableComponentIdentifier.Companion.a(str, str2));
        return this;
    }

    @Override // defpackage.s81.a
    public s81.a p(p81 p81) {
        this.f = p81 != null ? p81.toBuilder() : HubsImmutableComponentBundle.Companion.b();
        return this;
    }

    @Override // defpackage.s81.a
    public s81.a q(Map<String, ? extends o81> map) {
        this.j.d(HubsImmutableCommandModel.Companion.a(map));
        return this;
    }

    @Override // defpackage.s81.a
    public s81.a r(String str) {
        this.i = str;
        return this;
    }

    @Override // defpackage.s81.a
    public s81.a s(String str) {
        this.h = str;
        return this;
    }

    @Override // defpackage.s81.a
    public s81.a u(r81 r81) {
        this.c = r81 != null ? r81.toBuilder() : HubsImmutableComponentImages.Companion.a();
        return this;
    }

    @Override // defpackage.s81.a
    public s81.a v(p81 p81) {
        this.e = p81 != null ? p81.toBuilder() : HubsImmutableComponentBundle.Companion.b();
        return this;
    }

    @Override // defpackage.s81.a
    public s81.a w(p81 p81) {
        this.d = p81 != null ? p81.toBuilder() : HubsImmutableComponentBundle.Companion.b();
        return this;
    }

    @Override // defpackage.s81.a
    public s81.a x(a91 a91) {
        this.g = a91;
        return this;
    }

    @Override // defpackage.s81.a
    public s81.a z(w81 w81) {
        this.b = w81 != null ? w81.toBuilder() : HubsImmutableComponentText.Companion.a();
        return this;
    }
}

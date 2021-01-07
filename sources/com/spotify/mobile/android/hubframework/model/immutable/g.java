package com.spotify.mobile.android.hubframework.model.immutable;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableImage;
import defpackage.p81;
import defpackage.x81;
import java.io.Serializable;
import kotlin.jvm.internal.h;

public final class g extends x81.a {
    private String a;
    private String b;
    private p81.a c;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    g(HubsImmutableImage.c cVar) {
        this.a = cVar.j();
        this.b = cVar.i();
        this.c = cVar.h().toBuilder();
    }

    @Override // defpackage.x81.a
    public x81.a a(p81 p81) {
        h.e(p81, "custom");
        this.c = this.c.a(p81);
        return this;
    }

    @Override // defpackage.x81.a
    public x81.a b(String str, Serializable serializable) {
        h.e(str, "key");
        this.c = this.c.o(str, serializable);
        return this;
    }

    @Override // defpackage.x81.a
    public x81 c() {
        return HubsImmutableImage.Companion.a(this.a, this.b, this.c.d());
    }

    @Override // defpackage.x81.a
    public x81.a d(p81 p81) {
        this.c = p81 != null ? p81.toBuilder() : HubsImmutableComponentBundle.Companion.b();
        return this;
    }

    @Override // defpackage.x81.a
    public x81.a f(String str) {
        this.b = str;
        return this;
    }

    @Override // defpackage.x81.a
    public x81.a g(String str) {
        this.a = str;
        return this;
    }
}

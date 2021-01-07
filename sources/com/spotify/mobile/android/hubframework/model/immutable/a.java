package com.spotify.mobile.android.hubframework.model.immutable;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableCommandModel;
import defpackage.o81;
import defpackage.p81;
import java.io.Serializable;
import kotlin.jvm.internal.h;

public final class a extends o81.a {
    private String a;
    private p81.a b;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    a(HubsImmutableCommandModel.b bVar) {
        this.a = bVar.g();
        this.b = bVar.f().toBuilder();
    }

    @Override // defpackage.o81.a
    public o81.a a(p81 p81) {
        h.e(p81, "custom");
        this.b = this.b.a(p81);
        return this;
    }

    @Override // defpackage.o81.a
    public o81.a b(String str, Serializable serializable) {
        h.e(str, "key");
        this.b = this.b.o(str, serializable);
        return this;
    }

    @Override // defpackage.o81.a
    public o81 c() {
        return HubsImmutableCommandModel.Companion.b(this.a, this.b.d());
    }

    @Override // defpackage.o81.a
    public o81.a d(p81 p81) {
        p81.a aVar;
        if (p81 == null || (aVar = p81.toBuilder()) == null) {
            aVar = HubsImmutableComponentBundle.Companion.b();
        }
        this.b = aVar;
        return this;
    }

    @Override // defpackage.o81.a
    public o81.a e(String str) {
        h.e(str, "name");
        this.a = str;
        return this;
    }
}

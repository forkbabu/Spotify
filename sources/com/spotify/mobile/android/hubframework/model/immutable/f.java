package com.spotify.mobile.android.hubframework.model.immutable;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentText;
import defpackage.w81;

public final class f implements w81.a {
    private String a;
    private String b;
    private String c;
    private String d;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    f(HubsImmutableComponentText.c cVar) {
        this.a = cVar.h();
        this.b = cVar.g();
        this.c = cVar.b();
        this.d = cVar.f();
    }

    @Override // defpackage.w81.a
    public w81.a a(String str) {
        this.a = str;
        return this;
    }

    @Override // defpackage.w81.a
    public w81 build() {
        HubsImmutableComponentText.b bVar = HubsImmutableComponentText.Companion;
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        bVar.getClass();
        return new HubsImmutableComponentText(str, str2, str3, str4);
    }

    @Override // defpackage.w81.a
    public w81.a c(String str) {
        this.d = str;
        return this;
    }

    @Override // defpackage.w81.a
    public w81.a d(String str) {
        this.b = str;
        return this;
    }

    @Override // defpackage.w81.a
    public w81.a e(String str) {
        this.c = str;
        return this;
    }
}

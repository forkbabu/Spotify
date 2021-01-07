package com.spotify.mobile.android.hubframework.model.immutable;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentImages;
import defpackage.r81;
import java.util.Map;
import kotlin.jvm.internal.h;

public final class d extends r81.a {
    private x81 a;
    private x81 b;
    private final k<String, HubsImmutableImage> c;
    private String d;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    d(HubsImmutableComponentImages.c cVar) {
        this.a = cVar.k();
        this.b = cVar.h();
        this.c = new k<>(cVar.i());
        this.d = cVar.j();
    }

    @Override // defpackage.r81.a
    public r81.a a(x81 x81) {
        this.b = x81;
        return this;
    }

    @Override // defpackage.r81.a
    public r81 b() {
        return HubsImmutableComponentImages.Companion.b(this.a, this.b, this.c.b(), this.d);
    }

    @Override // defpackage.r81.a
    public r81.a c(Map<String, ? extends x81> map) {
        h.e(map, "images");
        k<String, HubsImmutableImage> kVar = this.c;
        HubsImmutableComponentImages.Companion.getClass();
        kVar.d(i.a(map, HubsImmutableImage.class, HubsImmutableComponentImages$Companion$immutableImageMap$1.a));
        return this;
    }

    @Override // defpackage.r81.a
    public r81.a e(String str) {
        this.d = str;
        return this;
    }

    @Override // defpackage.r81.a
    public r81.a g(x81 x81) {
        this.a = x81;
        return this;
    }
}

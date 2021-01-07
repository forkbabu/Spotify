package com.spotify.music.features.california.feature;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.m0;
import com.spotify.pageloader.o0;
import io.reactivex.s;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.h;

public final class CaliforniaPage implements psd {
    private final qsd a;
    private final dtd b;

    public CaliforniaPage(qac qac, txc txc, d dVar) {
        h.e(qac, "template");
        h.e(txc, "productState");
        h.e(dVar, "loadedFactory");
        ysd ysd = new ysd("Hello World");
        c cVar = ViewUris.Y0;
        h.d(cVar, "ViewUris.DEBUG");
        PageIdentifiers pageIdentifiers = PageIdentifiers.DEBUG;
        ifd ifd = kfd.n0;
        h.d(ifd, "FeatureIdentifiers.GOLDEN_PATH");
        this.a = new qsd(ysd, cVar, pageIdentifiers, ifd, "arch-california");
        o0 a2 = m0.a(txc.a("employee").S0(3, TimeUnit.SECONDS, s.i0("n/a")).T());
        h.d(a2, "SingleLoadable.create(\n ….firstOrError()\n        )");
        this.b = qac.a(this, a2, new nac(new CaliforniaPage$content$1(dVar), CaliforniaPage$content$2.a, null, null, 12));
    }

    @Override // defpackage.psd
    public qsd a() {
        return this.a;
    }

    @Override // defpackage.psd
    public dtd b() {
        return this.b;
    }

    @Override // defpackage.psd
    public Set<atd> getCapabilities() {
        return EmptySet.a;
    }
}

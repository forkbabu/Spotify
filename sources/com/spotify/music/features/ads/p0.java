package com.spotify.music.features.ads;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.ads.model.AdProduct;
import io.reactivex.disposables.a;

public class p0 {
    private final bs3 a;
    private Optional<fp3> b = Optional.absent();
    private Optional<AdProduct> c = Optional.absent();
    private final a d = new a();

    public p0(bs3 bs3) {
        this.a = bs3;
    }

    private static gp3 a(AdProduct adProduct, fp3 fp3) {
        int ordinal = adProduct.ordinal();
        if (ordinal == 0) {
            return fp3.a();
        }
        if (ordinal != 1) {
            return fp3.b();
        }
        return fp3.c();
    }

    public static void b(p0 p0Var, Optional optional) {
        p0Var.getClass();
        Logger.b("AdProduct received: %s", optional);
        p0Var.c = optional;
        boolean isPresent = optional.isPresent();
        boolean isPresent2 = p0Var.b.isPresent();
        if (isPresent && isPresent2) {
            a(p0Var.c.get(), p0Var.b.get()).a();
        }
    }

    public void c() {
        if (this.b.isPresent() && this.c.isPresent()) {
            a(this.c.get(), this.b.get()).a();
        }
    }

    public void d(fp3 fp3) {
        this.b = Optional.of(fp3);
    }

    public void e() {
        this.d.f();
        this.d.b(this.a.a().subscribe(new l(this), m.a));
    }

    public void f() {
        this.d.f();
    }

    public void g(fp3 fp3) {
        if (this.b.isPresent() && this.b.get().equals(fp3)) {
            this.b = Optional.absent();
        }
    }
}

package com.spotify.magiclink.request;

import android.content.Intent;
import android.util.Patterns;
import com.spotify.magiclink.n;
import defpackage.f11;

public class f implements f11.a {
    private a a;
    private final g11 b;
    private final o11 c;
    private final io.reactivex.disposables.a d = new io.reactivex.disposables.a();

    public interface a {
    }

    public f(g11 g11, o11 o11) {
        this.b = g11;
        this.c = o11;
    }

    @Override // defpackage.f11.a
    public void a() {
        this.c.a(i11.d(p11.b(), m11.h()));
        a aVar = this.a;
        if (aVar != null) {
            ((MagicLinkRequestFragment) aVar).W4();
            ((MagicLinkRequestFragment) this.a).O4(false);
            ((MagicLinkRequestFragment) this.a).T4(false);
        }
    }

    @Override // defpackage.f11.a
    public void b(int i) {
        if (i == 400) {
            this.c.a(i11.d(p11.b(), m11.d()));
        }
        a aVar = this.a;
        if (aVar != null) {
            ((MagicLinkRequestFragment) aVar).V4();
            ((MagicLinkRequestFragment) this.a).T4(false);
        }
    }

    @Override // defpackage.f11.a
    public void c() {
        a aVar = this.a;
        if (aVar != null) {
            ((MagicLinkRequestFragment) aVar).S4(false);
            ((MagicLinkRequestFragment) this.a).T4(false);
        }
    }

    @Override // defpackage.f11.a
    public void d() {
        this.c.a(i11.c(p11.b(), l11.d(), n11.b(), ""));
        a aVar = this.a;
        if (aVar != null) {
            ((MagicLinkRequestFragment) aVar).U4();
            ((MagicLinkRequestFragment) this.a).T4(false);
        }
    }

    @Override // defpackage.f11.a
    public void e() {
        this.c.a(i11.c(p11.b(), l11.a(), n11.b(), ""));
        a aVar = this.a;
        if (aVar != null) {
            ((MagicLinkRequestFragment) aVar).U4();
            ((MagicLinkRequestFragment) this.a).T4(false);
        }
    }

    public void f(String str) {
        String trim = str.trim();
        if (trim.contains("@")) {
            ((MagicLinkRequestFragment) this.a).O4(Patterns.EMAIL_ADDRESS.matcher(trim).matches());
            return;
        }
        ((MagicLinkRequestFragment) this.a).O4(!trim.isEmpty());
    }

    public void g() {
        this.d.dispose();
        this.b.e();
    }

    public void h() {
        MagicLinkRequestFragment magicLinkRequestFragment = (MagicLinkRequestFragment) this.a;
        Intent a2 = n.a(magicLinkRequestFragment.l4());
        if (a2 != null) {
            magicLinkRequestFragment.G4(a2, null);
        }
    }

    public void i(String str) {
        ((MagicLinkRequestFragment) this.a).T4(true);
        this.b.g(str, this);
    }

    public void j(a aVar) {
        this.a = aVar;
    }
}

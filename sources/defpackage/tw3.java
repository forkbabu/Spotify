package defpackage;

import com.spotify.ubi.specification.factories.l;
import kotlin.jvm.internal.h;

/* renamed from: tw3  reason: default package */
public final class tw3 {
    private final ere a;
    private final l b;

    public tw3(ere ere, l lVar) {
        h.e(ere, "ubiLogger");
        h.e(lVar, "eventFactory");
        this.a = ere;
        this.b = lVar;
    }

    public final void a(String str) {
        h.e(str, "albumUri");
        this.a.a(this.b.b().b().c().a(str));
    }

    public final void b(String str) {
        h.e(str, "albumUri");
        this.a.a(this.b.b().b().c().b(str));
    }

    public final void c() {
        this.a.a(this.b.b().b().b().a());
    }

    public final void d(String str) {
        h.e(str, "albumUri");
        this.a.a(this.b.c().a(str));
    }

    public final void e(String str) {
        h.e(str, "albumUri");
        this.a.a(this.b.c().b(str));
    }
}

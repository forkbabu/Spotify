package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.g;

/* renamed from: mh8  reason: default package */
public class mh8 {
    private final ere a;
    private final g b = new g(PageIdentifiers.ADS.name(), ViewUris.i1.toString());

    public mh8(ere ere) {
        this.a = ere;
    }

    public void a(int i, String str, String str2) {
        this.a.a(this.b.b().b(Integer.valueOf(i)).c(str).b(str).a(str2));
    }

    public void b(int i, String str, String str2) {
        this.a.a(this.b.b().b(Integer.valueOf(i)).c(str).c(str).a(str2));
    }

    public void c(int i, String str, String str2, String str3) {
        this.a.a(this.b.b().b(Integer.valueOf(i)).b(str, str2).a(str3));
    }

    public void d(int i, String str, String str2) {
        this.a.a(this.b.b().b(Integer.valueOf(i)).d(str).a(str2));
    }

    public void e() {
        this.a.a(this.b.c().b().a());
    }
}

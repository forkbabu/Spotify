package defpackage;

import com.spotify.music.features.yourlibraryx.domain.YourLibraryXSortOption;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXViewMode;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.u4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

/* renamed from: fh9  reason: default package */
public final class fh9 implements eh9 {
    private static final String c;
    private static final String d;
    private static final String e;
    private final ere a;
    private final u4 b;

    static {
        String cVar = ViewUris.x1.toString();
        h.d(cVar, "ViewUris.COLLECTION_SEARCH.toString()");
        c = cVar;
        String cVar2 = ViewUris.K0.toString();
        h.d(cVar2, "ViewUris.CREATE_PLAYLIST.toString()");
        d = cVar2;
        String cVar3 = ViewUris.c0.toString();
        h.d(cVar3, "ViewUris.SETTINGS.toString()");
        e = cVar3;
    }

    public fh9(ere ere, u4 u4Var) {
        h.e(ere, "ubiLogger");
        h.e(u4Var, "eventFactory");
        this.a = ere;
        this.b = u4Var;
    }

    @Override // defpackage.eh9
    public void a() {
        this.a.a(this.b.e().b().a());
    }

    @Override // defpackage.eh9
    public void b() {
        this.a.a(this.b.b().b().b().c().c());
    }

    @Override // defpackage.eh9
    public String c(int i, String str, YourLibraryXViewMode yourLibraryXViewMode) {
        nqe nqe;
        h.e(str, "uri");
        h.e(yourLibraryXViewMode, "viewDensity");
        u4.b.C0556b c2 = this.b.b().c();
        int ordinal = yourLibraryXViewMode.ordinal();
        if (ordinal == 0) {
            nqe = c2.c(Integer.valueOf(i), str).a(str);
        } else if (ordinal == 1) {
            nqe = c2.b(Integer.valueOf(i), str).a(str);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.a.a(nqe);
        String b2 = nqe.b();
        h.d(b2, "event.id()");
        return b2;
    }

    @Override // defpackage.eh9
    public void d() {
        this.a.a(this.b.e().c().a());
    }

    @Override // defpackage.eh9
    public String e() {
        u4.d d2 = this.b.d();
        String str = e;
        nqe a2 = d2.d(str).a(str);
        this.a.a(a2);
        String b2 = a2.b();
        h.d(b2, "event.id()");
        return b2;
    }

    @Override // defpackage.eh9
    public void f(String str, int i, boolean z) {
        nqe nqe;
        h.e(str, "id");
        u4.c.b c2 = this.b.c().c(str, Integer.valueOf(i));
        if (z) {
            nqe = c2.b();
        } else {
            nqe = c2.a();
        }
        this.a.a(nqe);
    }

    @Override // defpackage.eh9
    public void g() {
        this.a.a(this.b.d().c());
    }

    @Override // defpackage.eh9
    public void h(YourLibraryXViewMode yourLibraryXViewMode) {
        h.e(yourLibraryXViewMode, "viewMode");
        this.a.a(this.b.b().b().c(yourLibraryXViewMode.d()).a());
    }

    @Override // defpackage.eh9
    public void i(int i, String str) {
        h.e(str, "uri");
        this.a.a(this.b.b().d().b(Integer.valueOf(i), str).b().a());
    }

    @Override // defpackage.eh9
    public void j(YourLibraryXSortOption yourLibraryXSortOption) {
        h.e(yourLibraryXSortOption, "sortOption");
        this.a.a(this.b.b().b().b().c().d(yourLibraryXSortOption.d()).a());
    }

    @Override // defpackage.eh9
    public void k() {
        this.a.a(this.b.b().b().b().c().b().a());
    }

    @Override // defpackage.eh9
    public void l() {
        u4.d d2 = this.b.d();
        String str = d;
        this.a.a(d2.b(str).a(str));
    }

    @Override // defpackage.eh9
    public void m(int i, String str, YourLibraryXViewMode yourLibraryXViewMode) {
        h.e(str, "uri");
        h.e(yourLibraryXViewMode, "viewDensity");
    }

    @Override // defpackage.eh9
    public void n() {
        this.a.a(this.b.c().b().a());
    }

    @Override // defpackage.eh9
    public void o() {
        this.a.a(this.b.b().b().b().b());
    }

    @Override // defpackage.eh9
    public void p() {
        this.a.a(this.b.e().d().a());
    }

    @Override // defpackage.eh9
    public String q() {
        u4.d d2 = this.b.d();
        String str = c;
        nqe a2 = d2.e(str).a(str);
        this.a.a(a2);
        String b2 = a2.b();
        h.d(b2, "event.id()");
        return b2;
    }
}

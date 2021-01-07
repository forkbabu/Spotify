package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.ubi.specification.factories.s2;
import com.spotify.ubi.specification.factories.x2;
import kotlin.jvm.internal.h;

/* renamed from: wsc  reason: default package */
public final class wsc implements tsc {
    private final ere a;
    private final s2 b;
    private final x2 c;

    public wsc(ere ere, s2 s2Var, x2 x2Var) {
        h.e(ere, "userBehaviourEventLogger");
        h.e(s2Var, "mobilePodcastEpisodeCardEventFactory");
        h.e(x2Var, "mobilePodcastShareCardEventFactory");
        this.a = ere;
        this.b = s2Var;
        this.c = x2Var;
    }

    @Override // defpackage.tsc
    public void a(String str, String str2, int i) {
        h.e(str, "episodeUri");
        this.a.a(this.b.b(Integer.valueOf(i), str).b().d().a(str));
    }

    @Override // defpackage.tsc
    public String b(String str, String str2, int i) {
        h.e(str, "episodeUri");
        nqe b2 = this.b.b(Integer.valueOf(i), str).b().e().b(str);
        this.a.a(b2);
        String b3 = b2.b();
        h.d(b3, "event.id()");
        return b3;
    }

    @Override // defpackage.tsc
    public String c(String str, String str2, int i) {
        h.e(str, "episodeUri");
        nqe a2 = this.b.b(Integer.valueOf(i), str).b().e().a(str);
        this.a.a(a2);
        String b2 = a2.b();
        h.d(b2, "event.id()");
        return b2;
    }

    @Override // defpackage.tsc
    public void d(String str, String str2, int i) {
        h.e(str, "episodeUri");
        this.a.a(this.b.b(Integer.valueOf(i), str).c(str).a());
    }

    @Override // defpackage.tsc
    public void e(String str, String str2, int i) {
        h.e(str, "episodeUri");
        this.a.a(this.b.b(Integer.valueOf(i), str).d(str));
    }

    @Override // defpackage.tsc
    public void f(String str, String str2, int i) {
        h.e(str, "episodeUri");
        this.a.a(this.b.b(Integer.valueOf(i), str).b().c().b(str));
    }

    @Override // defpackage.tsc
    public void g(String str, String str2, int i, boolean z) {
        nqe nqe;
        h.e(str, "episodeUri");
        h.e(str2, "inSection");
        s2.b.a.C0542a b2 = this.b.b(Integer.valueOf(i), str).b().b();
        if (z) {
            nqe = b2.b(ViewUris.T0.toString());
        } else {
            nqe = b2.a(str);
        }
        this.a.a(nqe);
    }

    @Override // defpackage.tsc
    public void h() {
        this.a.a(this.c.c().b().a());
    }

    @Override // defpackage.tsc
    public void i(String str, String str2, int i) {
        h.e(str, "episodeUri");
        this.a.a(this.b.b(Integer.valueOf(i), str).b().c().a(str));
    }
}

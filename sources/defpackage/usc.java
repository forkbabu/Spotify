package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: usc  reason: default package */
public final class usc implements tsc {
    private final wsc a;
    private final rsc b;

    public usc(wsc wsc, rsc rsc) {
        h.e(wsc, "ubiPodcastEpisodeRowLogger");
        h.e(rsc, "legacyPodcastEpisodeRowLogger");
        this.a = wsc;
        this.b = rsc;
    }

    @Override // defpackage.tsc
    public void a(String str, String str2, int i) {
        h.e(str, "episodeUri");
        h.e(str2, "inSection");
        this.a.a(str, str2, i);
        this.b.a(str, str2, i);
    }

    @Override // defpackage.tsc
    public String b(String str, String str2, int i) {
        h.e(str, "episodeUri");
        h.e(str2, "inSection");
        this.b.b(str, str2, i);
        return this.a.b(str, str2, i);
    }

    @Override // defpackage.tsc
    public String c(String str, String str2, int i) {
        h.e(str, "episodeUri");
        h.e(str2, "inSection");
        this.b.c(str, str2, i);
        return this.a.c(str, str2, i);
    }

    @Override // defpackage.tsc
    public void d(String str, String str2, int i) {
        h.e(str, "episodeUri");
        h.e(str2, "inSection");
        this.a.d(str, str2, i);
        this.b.d(str, str2, i);
    }

    @Override // defpackage.tsc
    public void e(String str, String str2, int i) {
        h.e(str, "episodeUri");
        h.e(str2, "inSection");
        this.a.e(str, str2, i);
        this.b.e(str, str2, i);
    }

    @Override // defpackage.tsc
    public void f(String str, String str2, int i) {
        h.e(str, "episodeUri");
        h.e(str2, "inSection");
        this.a.f(str, str2, i);
        this.b.f(str, str2, i);
    }

    @Override // defpackage.tsc
    public void g(String str, String str2, int i, boolean z) {
        h.e(str, "episodeUri");
        h.e(str2, "inSection");
        this.a.g(str, str2, i, z);
    }

    @Override // defpackage.tsc
    public void h() {
        this.a.h();
    }

    @Override // defpackage.tsc
    public void i(String str, String str2, int i) {
        h.e(str, "episodeUri");
        h.e(str2, "inSection");
        this.a.i(str, str2, i);
        this.b.i(str, str2, i);
    }
}

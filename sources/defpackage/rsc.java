package defpackage;

import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.c;

/* renamed from: rsc  reason: default package */
public class rsc implements tsc {
    private final a a;
    private final cqe b;
    private final jz1 c;
    private final c d;

    public rsc(cqe cqe, jz1 jz1, a aVar, c cVar) {
        this.b = cqe;
        this.c = jz1;
        this.a = aVar;
        this.d = cVar;
    }

    private void j(String str, int i, String str2, String str3) {
        this.c.a(new fa1(null, this.a.path(), this.d.toString(), str, (long) i, str3, "hit", str2, (double) this.b.d()));
    }

    @Override // defpackage.tsc
    public void a(String str, String str2, int i) {
        j(str2, i, "mark-as-played", str);
    }

    @Override // defpackage.tsc
    public String b(String str, String str2, int i) {
        j(str2, i, "play-episode", str);
        return "";
    }

    @Override // defpackage.tsc
    public String c(String str, String str2, int i) {
        j(str2, i, "pause-episode", str);
        return "";
    }

    @Override // defpackage.tsc
    public void d(String str, String str2, int i) {
        j(str2, i, "open-context-menu", str);
    }

    @Override // defpackage.tsc
    public void e(String str, String str2, int i) {
        j(str2, i, "navigate-forward", str);
    }

    @Override // defpackage.tsc
    public void f(String str, String str2, int i) {
        j(str2, i, "remove-downloaded-episode", str);
    }

    @Override // defpackage.tsc
    public void g(String str, String str2, int i, boolean z) {
    }

    @Override // defpackage.tsc
    public void h() {
    }

    @Override // defpackage.tsc
    public void i(String str, String str2, int i) {
        j(str2, i, "download-episode", str);
    }
}

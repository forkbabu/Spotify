package defpackage;

import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;

/* renamed from: yb8  reason: default package */
public class yb8 implements ob8 {
    private final ere a;
    private final jz1 b;
    private final ifd c;
    private final c.a d;
    private final cqe e;
    private final nqe f;

    public yb8(ere ere, jz1 jz1, ifd ifd, c.a aVar, cqe cqe, nqe nqe) {
        this.a = ere;
        this.b = jz1;
        this.c = ifd;
        this.d = aVar;
        this.e = cqe;
        this.f = nqe;
    }

    @Override // defpackage.ob8
    public void a() {
        this.a.a(this.f);
        jz1 jz1 = this.b;
        ifd ifd = this.c;
        ifd.getClass();
        String name = ifd.getName();
        c.a aVar = this.d;
        aVar.getClass();
        jz1.a(new fa1(null, name, aVar.getViewUri().toString(), "MIC_FAB", 0, ViewUris.f2.toString(), InteractionType.TAP.d(), InteractionIntent.NAVIGATE.d(), (double) this.e.d()));
    }
}

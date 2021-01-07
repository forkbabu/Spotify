package defpackage;

import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: tab  reason: default package */
public class tab {
    private final jz1 a;
    private final cqe b;

    public tab(jz1 jz1, cqe cqe) {
        this.a = jz1;
        this.b = cqe;
    }

    public void a() {
        this.a.a(new da1(null, kfd.a0.getName(), ViewUris.n0.toString(), "MIC_BROWSE", -1, ViewUris.f2.toString(), "page", null, (double) this.b.d()));
    }

    public void b() {
        this.a.a(new fa1(null, kfd.a0.getName(), ViewUris.n0.toString(), "MIC_BROWSE", -1, ViewUris.f2.toString(), InteractionType.TAP.d(), InteractionIntent.NAVIGATE.d(), (double) this.b.d()));
    }
}

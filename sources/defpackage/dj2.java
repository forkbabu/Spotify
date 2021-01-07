package defpackage;

import com.spotify.music.libs.viewuri.c;

/* renamed from: dj2  reason: default package */
public class dj2 {
    private final c.a a;
    private final jz1 b;
    private final cqe c;

    public dj2(ifd ifd, c.a aVar, jz1 jz1, cqe cqe) {
        this.a = aVar;
        this.b = jz1;
        this.c = cqe;
    }

    public void a(String str) {
        this.b.a(new fa1(null, kfd.e.getName(), this.a.getViewUri().toString(), null, (long) 0, str, "hit", "navigate-forward", (double) this.c.d()));
    }

    public void b() {
        this.b.a(new da1(null, kfd.e.getName(), this.a.getViewUri().toString(), null, -1, null, "page", null, (double) this.c.d()));
    }
}

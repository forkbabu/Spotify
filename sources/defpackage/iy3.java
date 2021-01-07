package defpackage;

import com.spotify.music.offline.OfflineError;
import defpackage.m8c;

/* renamed from: iy3  reason: default package */
public class iy3 {
    private final cy3 a;
    private final m8c b;
    final m8c.a c = new fx3(this);

    public iy3(cy3 cy3, m8c m8c) {
        this.a = cy3;
        this.b = m8c;
    }

    public static void b(iy3 iy3, OfflineError offlineError) {
        iy3.getClass();
        if (offlineError == OfflineError.OFFLINE_NOT_ALLOWED) {
            iy3.a.a();
        }
    }

    public void a() {
        this.a.b();
    }

    public void c() {
        this.b.d(this.c);
        this.b.c();
    }

    public void d() {
        this.b.b(this.c);
        this.b.a();
    }

    public void e() {
        this.a.g();
    }
}

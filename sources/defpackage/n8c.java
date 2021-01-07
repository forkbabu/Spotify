package defpackage;

import com.spotify.music.offline.OfflineError;
import com.spotify.music.offline.b;
import com.spotify.rxjava2.p;
import defpackage.m8c;
import io.reactivex.android.schedulers.a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: n8c  reason: default package */
public class n8c implements m8c {
    private final b a;
    private final p b = new p();
    private final Set<m8c.a> c = Collections.synchronizedSet(new HashSet());

    public n8c(b bVar) {
        this.a = bVar;
    }

    public static void e(n8c n8c, OfflineError offlineError) {
        synchronized (n8c.c) {
            for (m8c.a aVar : n8c.c) {
                aVar.a(offlineError);
            }
        }
    }

    @Override // defpackage.m8c
    public void a() {
        this.b.a();
    }

    @Override // defpackage.m8c
    public void b(m8c.a aVar) {
        this.c.remove(aVar);
    }

    @Override // defpackage.m8c
    public void c() {
        this.b.b(this.a.a().j0(l8c.a).o0(a.b()).subscribe(new k8c(this), j8c.a));
    }

    @Override // defpackage.m8c
    public void d(m8c.a aVar) {
        aVar.getClass();
        this.c.add(aVar);
    }
}

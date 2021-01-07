package defpackage;

import com.spotify.music.connection.l;
import com.spotify.music.connection.n;
import io.reactivex.s;

/* renamed from: pk1  reason: default package */
public class pk1 {
    private final l a;
    private final n b;

    public pk1(l lVar, n nVar) {
        this.a = lVar;
        this.b = nVar;
    }

    public s<Boolean> a(boolean z) {
        if (z) {
            return this.a.a().j0(ok1.a);
        }
        return this.b.b();
    }
}

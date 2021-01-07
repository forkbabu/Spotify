package defpackage;

import com.google.common.base.Predicate;
import com.spotify.music.connection.l;
import io.reactivex.d0;
import io.reactivex.e0;
import io.reactivex.z;

/* renamed from: ye6  reason: default package */
public class ye6<T> implements e0<T, xe6<T>> {
    private final l a;
    private final Predicate<T> b;

    public ye6(l lVar, Predicate<T> predicate) {
        this.a = lVar;
        this.b = predicate;
    }

    @Override // io.reactivex.e0
    public d0<xe6<T>> a(z<T> zVar) {
        return this.a.a().T().s(new se6(this, zVar));
    }

    public /* synthetic */ d0 b(Object obj) {
        if (this.b.apply(obj)) {
            return z.z(xe6.k(obj));
        }
        return z.z(xe6.c(new RuntimeException("Server returned error")));
    }
}

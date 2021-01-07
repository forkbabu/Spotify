package defpackage;

import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.spotify.music.follow.j;
import com.spotify.music.follow.l;
import com.spotify.music.follow.m;
import defpackage.ts7;
import io.reactivex.s;
import io.reactivex.t;
import java.util.HashMap;

/* renamed from: at7  reason: default package */
public class at7 {
    private final m a;

    public at7(m mVar) {
        this.a = mVar;
    }

    private static ct7 a(j jVar) {
        ct7 ct7 = ct7.a;
        ts7.b bVar = new ts7.b();
        bVar.c(jVar.c());
        bVar.e(jVar.d());
        bVar.d(jVar.g());
        bVar.b(jVar.f());
        return bVar.a();
    }

    static /* synthetic */ void b(HashMap hashMap, t tVar, j jVar) {
        hashMap.put(jVar.e(), a(jVar));
        tVar.onNext(ImmutableMap.copyOf(hashMap));
    }

    public /* synthetic */ void c(ImmutableSet immutableSet, l lVar) {
        UnmodifiableIterator it = immutableSet.iterator();
        while (it.hasNext()) {
            this.a.d((String) it.next(), lVar);
        }
    }

    public /* synthetic */ void d(HashMap hashMap, ImmutableSet immutableSet, t tVar) {
        vs7 vs7 = new vs7(hashMap, tVar);
        UnmodifiableIterator it = immutableSet.iterator();
        while (it.hasNext()) {
            this.a.b((String) it.next(), vs7);
        }
        tVar.e(new xs7(this, immutableSet, vs7));
    }

    public /* synthetic */ void e(String str, boolean z) {
        j c = this.a.c(str);
        if (c == null) {
            this.a.g(j.b(str, 0, 0, z, false));
        } else if (c.g() != z) {
            this.a.e(str, z);
        }
    }

    public s<ImmutableMap<String, ct7>> f(ImmutableSet<String> immutableSet, ImmutableMap<String, ct7> immutableMap) {
        HashMap newHashMapWithExpectedSize = Collections2.newHashMapWithExpectedSize(immutableSet.size());
        UnmodifiableIterator<String> it = immutableSet.iterator();
        while (it.hasNext()) {
            String next = it.next();
            j c = this.a.c(next);
            if (c == null) {
                ct7 orDefault = immutableMap.getOrDefault(next, ct7.a);
                c = j.b(next, orDefault.c(), orDefault.f(), orDefault.e(), orDefault.b());
                this.a.g(c);
            }
            newHashMapWithExpectedSize.put(next, a(c));
        }
        return s.y(new ys7(this, newHashMapWithExpectedSize, immutableSet)).G0(ImmutableMap.copyOf(newHashMapWithExpectedSize)).E();
    }
}

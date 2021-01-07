package androidx.work;

import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {
    private UUID a;
    private d b;
    private Executor c;
    private na d;
    private s e;
    private f f;

    public static class a {
        public List<String> a = Collections.emptyList();
        public List<Uri> b = Collections.emptyList();
    }

    public WorkerParameters(UUID uuid, d dVar, Collection<String> collection, a aVar, int i, Executor executor, na naVar, s sVar, n nVar, f fVar) {
        this.a = uuid;
        this.b = dVar;
        new HashSet(collection);
        this.c = executor;
        this.d = naVar;
        this.e = sVar;
        this.f = fVar;
    }

    public Executor a() {
        return this.c;
    }

    public f b() {
        return this.f;
    }

    public UUID c() {
        return this.a;
    }

    public d d() {
        return this.b;
    }

    public na e() {
        return this.d;
    }

    public s f() {
        return this.e;
    }
}

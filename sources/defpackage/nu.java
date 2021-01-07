package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: nu  reason: default package */
public final class nu {
    private final ConcurrentHashMap<qu, List<Throwable>> a = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> b = new ReferenceQueue<>();

    nu() {
    }

    /* JADX WARN: Incorrect args count in method signature: (Ljava/lang/Throwable;Z)Ljava/util/List<Ljava/lang/Throwable;>; */
    public final List a(Throwable th) {
        Reference<? extends Throwable> poll = this.b.poll();
        while (poll != null) {
            this.a.remove(poll);
            poll = this.b.poll();
        }
        List<Throwable> list = this.a.get(new qu(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.a.putIfAbsent(new qu(th, this.b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}

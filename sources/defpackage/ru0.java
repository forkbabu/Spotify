package defpackage;

import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.h;

/* renamed from: ru0  reason: default package */
public final class ru0 {
    private final Set<a> a;

    /* renamed from: ru0$a */
    public interface a {
        void onStart();

        void onStop();
    }

    public ru0(Set<a> set) {
        h.e(set, "plugins");
        this.a = set;
    }

    public final synchronized void a() {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().onStart();
        }
    }

    public final synchronized void b() {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().onStop();
        }
    }
}

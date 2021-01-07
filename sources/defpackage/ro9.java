package defpackage;

import androidx.lifecycle.u;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.h;

/* renamed from: ro9  reason: default package */
public final class ro9 {
    private final Set<String> a = new LinkedHashSet();
    private final u<Integer> b = new u<>();

    public final int a() {
        return this.a.size();
    }

    public final u<Integer> b() {
        return this.b;
    }

    public final boolean c(String str) {
        h.e(str, "artistUri");
        return this.a.contains(str);
    }

    public final void d(String str, boolean z) {
        h.e(str, "artistUri");
        if (z) {
            this.a.add(str);
        } else {
            this.a.remove(str);
        }
        this.b.l(Integer.valueOf(this.a.size()));
    }
}

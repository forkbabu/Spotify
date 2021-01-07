package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: oc  reason: default package */
abstract class oc<V, O> implements nc<V, O> {
    final List<fe<V>> a;

    oc(V v) {
        this.a = Collections.singletonList(new fe(v));
    }

    @Override // defpackage.nc
    public boolean c() {
        return this.a.isEmpty() || (this.a.size() == 1 && this.a.get(0).h());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }

    oc(List<fe<V>> list) {
        this.a = list;
    }
}

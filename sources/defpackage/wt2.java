package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: wt2  reason: default package */
public class wt2 implements vt2 {
    private final List<ts2> a;

    wt2(Set<ts2> set) {
        this.a = ImmutableList.copyOf((Collection) set);
    }

    @Override // defpackage.vt2
    public List<ts2> a() {
        return this.a;
    }
}

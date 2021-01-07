package defpackage;

import com.google.common.collect.ImmutableList;
import defpackage.a61;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: t61  reason: default package */
public class t61 extends AbstractList<s81> {
    public static final t61 f = new t61(o51.a, Collections.emptyList());
    private final List<s81> a;
    private final List<s81> b;
    private final a61 c;

    static {
        int i = a61.a.a;
    }

    private t61(a61 a61, List<? extends s81> list) {
        list.getClass();
        a61.getClass();
        this.c = a61;
        if (list instanceof ImmutableList) {
            this.a = ImmutableList.copyOf((Collection) list);
        } else {
            this.a = Collections.unmodifiableList(list);
        }
        this.b = a61.a.a(a61.a.b(a61), this.a);
    }

    public static t61 c(a61 a61, List<? extends s81> list) {
        t61 t61 = f;
        if (list == t61 || list == Collections.emptyList() || list == ImmutableList.of()) {
            return t61;
        }
        if (list instanceof t61) {
            t61 t612 = (t61) list;
            if (t612.c == a61) {
                return t612;
            }
        }
        return new t61(a61, list);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        return this.b.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}

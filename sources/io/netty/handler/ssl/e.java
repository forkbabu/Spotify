package io.netty.handler.ssl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class e implements d {
    public static final e a = new e();

    private e() {
    }

    @Override // io.netty.handler.ssl.d
    public String[] a(Iterable<String> iterable, List<String> list, Set<String> set) {
        String next;
        if (iterable == null) {
            return (String[]) list.toArray(new String[list.size()]);
        }
        io.netty.util.internal.e.e();
        ArrayList arrayList = new ArrayList(set.size());
        Iterator<String> it = iterable.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            arrayList.add(next);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}

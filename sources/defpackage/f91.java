package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: f91  reason: default package */
public final class f91 {
    public static final boolean a(p81 p81, String str, Object obj) {
        h.e(p81, "bundle");
        h.e(str, "key");
        return rw.equal(obj, p81.get(str));
    }

    public static final <E> ImmutableList<E> b(List<? extends E> list) {
        if (list == null) {
            ImmutableList<E> of = ImmutableList.of();
            h.d(of, "ImmutableList.of()");
            return of;
        } else if (list instanceof ImmutableList) {
            return (ImmutableList) list;
        } else {
            ImmutableList<E> list2 = FluentIterable.from(list).filter(MoreObjects.notNull()).toList();
            h.d(list2, "FluentIterable.from(othe…cates.notNull()).toList()");
            return list2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> ImmutableMap<K, V> c(Map<? extends K, ? extends V> map) {
        if (map == null) {
            ImmutableMap<K, V> of = ImmutableMap.of();
            h.d(of, "ImmutableMap.of()");
            return of;
        } else if (map instanceof ImmutableMap) {
            ImmutableMap<K, V> copyOf = ImmutableMap.copyOf(map);
            h.d(copyOf, "ImmutableMap.copyOf(other)");
            return copyOf;
        } else {
            h.d(map, "other");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                if ((entry.getKey() == null || entry.getValue() == null) ? false : true) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ImmutableMap<K, V> copyOf2 = ImmutableMap.copyOf(linkedHashMap);
            h.d(copyOf2, "ImmutableMap.copyOf(othe…ll && it.value != null })");
            return copyOf2;
        }
    }
}

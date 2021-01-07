package com.spotify.mobile.android.hubframework.model.immutable;

public final class i {
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: com.google.common.collect.ImmutableMap$Builder */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        if (r3 != false) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <K, V, I> com.google.common.collect.ImmutableMap<K, I> a(java.util.Map<K, ? extends V> r4, java.lang.Class<I> r5, defpackage.nmf<? super V, ? extends I> r6) {
        /*
            java.lang.String r0 = "immutableValueClass"
            kotlin.jvm.internal.h.e(r5, r0)
            java.lang.String r0 = "immutableValueTransformer"
            kotlin.jvm.internal.h.e(r6, r0)
            if (r4 == 0) goto L_0x0083
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0014
            goto L_0x0083
        L_0x0014:
            boolean r0 = r4 instanceof com.google.common.collect.ImmutableMap
            if (r0 == 0) goto L_0x004a
            r0 = r4
            com.google.common.collect.ImmutableMap r0 = (com.google.common.collect.ImmutableMap) r0
            java.util.Collection r1 = r0.values()
            com.google.common.collect.ImmutableCollection r1 = (com.google.common.collect.ImmutableCollection) r1
            java.lang.String r2 = "map.values"
            kotlin.jvm.internal.h.d(r1, r2)
            boolean r2 = r1.isEmpty()
            r3 = 1
            if (r2 == 0) goto L_0x002e
            goto L_0x0047
        L_0x002e:
            java.util.Iterator r1 = r1.iterator()
        L_0x0032:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r1.next()
            java.lang.Class r2 = r2.getClass()
            boolean r2 = kotlin.jvm.internal.h.a(r2, r5)
            if (r2 != 0) goto L_0x0032
            r3 = 0
        L_0x0047:
            if (r3 == 0) goto L_0x004a
            goto L_0x007d
        L_0x004a:
            com.google.common.collect.ImmutableMap$Builder r5 = com.google.common.collect.ImmutableMap.builder()
            java.lang.String r0 = "ImmutableMap.builder()"
            kotlin.jvm.internal.h.d(r5, r0)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x005b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.Object r0 = r6.invoke(r0)
            if (r0 == 0) goto L_0x005b
            r5.mo51put(r1, r0)
            goto L_0x005b
        L_0x0079:
            com.google.common.collect.ImmutableMap r0 = r5.build()
        L_0x007d:
            java.lang.String r4 = "if (map is ImmutableMap<…builder.build()\n        }"
            kotlin.jvm.internal.h.d(r0, r4)
            goto L_0x008c
        L_0x0083:
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.of()
            java.lang.String r4 = "ImmutableMap.of()"
            kotlin.jvm.internal.h.d(r0, r4)
        L_0x008c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.hubframework.model.immutable.i.a(java.util.Map, java.lang.Class, nmf):com.google.common.collect.ImmutableMap");
    }
}

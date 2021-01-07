package com.spotify.mobile.android.cosmos.player.v2;

import java.util.Arrays;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class MapUtils {
    private MapUtils() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <K, V> boolean areMapsEqual(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
        /*
            r0 = 1
            if (r4 != 0) goto L_0x0006
            if (r5 != 0) goto L_0x0006
            return r0
        L_0x0006:
            r1 = 0
            if (r4 != 0) goto L_0x000a
            return r1
        L_0x000a:
            if (r5 != 0) goto L_0x000d
            return r1
        L_0x000d:
            int r2 = r4.size()
            int r3 = r5.size()
            if (r2 == r3) goto L_0x0018
            return r1
        L_0x0018:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0020:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x004a
            java.lang.Object r2 = r4.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r3 = r5.containsKey(r3)
            if (r3 != 0) goto L_0x0037
            return r1
        L_0x0037:
            java.lang.Object r3 = r2.getValue()
            java.lang.Object r2 = r2.getKey()
            java.lang.Object r2 = r5.get(r2)
            boolean r2 = defpackage.rw.equal(r3, r2)
            if (r2 != 0) goto L_0x0020
            return r1
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.cosmos.player.v2.MapUtils.areMapsEqual(java.util.Map, java.util.Map):boolean");
    }

    public static <K, V> int hashOfMap(Map<K, V> map) {
        if (map == null) {
            return 0;
        }
        int i = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return i;
    }
}

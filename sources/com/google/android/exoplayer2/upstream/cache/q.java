package com.google.android.exoplayer2.upstream.cache;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class q implements o {
    public static final q c = new q(Collections.emptyMap());
    private int a;
    private final Map<String, byte[]> b;

    public q() {
        this(Collections.emptyMap());
    }

    private static boolean e(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public q a(p pVar) {
        byte[] bArr;
        HashMap hashMap = new HashMap(this.b);
        List<String> b2 = pVar.b();
        for (int i = 0; i < b2.size(); i++) {
            hashMap.remove(b2.get(i));
        }
        Map<String, Object> a2 = pVar.a();
        for (String str : a2.keySet()) {
            Object obj = a2.get(str);
            if (obj instanceof Long) {
                bArr = ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
            } else if (obj instanceof String) {
                bArr = ((String) obj).getBytes(Charset.forName(Constants.ENCODING));
            } else if (obj instanceof byte[]) {
                bArr = (byte[]) obj;
            } else {
                throw new IllegalArgumentException();
            }
            hashMap.put(str, bArr);
        }
        if (e(this.b, hashMap)) {
            return this;
        }
        return new q(hashMap);
    }

    public Set<Map.Entry<String, byte[]>> b() {
        return this.b.entrySet();
    }

    public final long c(String str, long j) {
        return this.b.containsKey(str) ? ByteBuffer.wrap(this.b.get(str)).getLong() : j;
    }

    public final String d(String str, String str2) {
        if (this.b.containsKey(str)) {
            return new String(this.b.get(str), Charset.forName(Constants.ENCODING));
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        return e(this.b, ((q) obj).b);
    }

    public int hashCode() {
        if (this.a == 0) {
            int i = 0;
            for (Map.Entry<String, byte[]> entry : this.b.entrySet()) {
                i += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.a = i;
        }
        return this.a;
    }

    public q(Map<String, byte[]> map) {
        this.b = Collections.unmodifiableMap(map);
    }
}

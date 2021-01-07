package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p {
    private final Map<String, Object> a = new HashMap();
    private final List<String> b = new ArrayList();

    public static p c(p pVar, long j) {
        Long valueOf = Long.valueOf(j);
        Map<String, Object> map = pVar.a;
        valueOf.getClass();
        map.put("exo_len", valueOf);
        pVar.b.remove("exo_len");
        return pVar;
    }

    public static p d(p pVar, Uri uri) {
        if (uri == null) {
            pVar.b.add("exo_redir");
            pVar.a.remove("exo_redir");
            return pVar;
        }
        String uri2 = uri.toString();
        Map<String, Object> map = pVar.a;
        uri2.getClass();
        map.put("exo_redir", uri2);
        pVar.b.remove("exo_redir");
        return pVar;
    }

    public Map<String, Object> a() {
        HashMap hashMap = new HashMap(this.a);
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public List<String> b() {
        return Collections.unmodifiableList(new ArrayList(this.b));
    }
}

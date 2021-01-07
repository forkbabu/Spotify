package com.spotify.music.features.ads.rules;

import java.util.HashMap;
import java.util.Map;

public class h implements p {
    private final m a;
    private final q b;
    private final k c;

    public h(m mVar, q qVar, k kVar) {
        this.a = mVar;
        this.b = qVar;
        this.c = kVar;
    }

    @Override // com.spotify.music.features.ads.rules.p
    public Map<Class<? extends o>, o> a() {
        HashMap hashMap = new HashMap();
        hashMap.put(m.class, this.a);
        hashMap.put(q.class, this.b);
        hashMap.put(k.class, this.c);
        return hashMap;
    }
}

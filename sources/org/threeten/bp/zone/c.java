package org.threeten.bp.zone;

import com.spotify.player.model.ContextTrack;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class c {
    private static final CopyOnWriteArrayList<c> a = new CopyOnWriteArrayList<>();
    private static final ConcurrentMap<String, c> b = new ConcurrentHashMap(512, 0.75f, 2);

    static {
        b.a();
    }

    protected c() {
    }

    public static Set<String> a() {
        return Collections.unmodifiableSet(b.keySet());
    }

    public static ZoneRules b(String str, boolean z) {
        yif.J(str, "zoneId");
        ConcurrentMap<String, c> concurrentMap = b;
        c cVar = concurrentMap.get(str);
        if (cVar != null) {
            return cVar.c(str, z);
        }
        if (concurrentMap.isEmpty()) {
            throw new ZoneRulesException("No time-zone data files registered");
        }
        throw new ZoneRulesException(je.x0("Unknown time-zone ID: ", str));
    }

    public static void e(c cVar) {
        yif.J(cVar, ContextTrack.Metadata.KEY_PROVIDER);
        for (String str : cVar.d()) {
            yif.J(str, "zoneId");
            if (b.putIfAbsent(str, cVar) != null) {
                throw new ZoneRulesException("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + cVar);
            }
        }
        a.add(cVar);
    }

    /* access modifiers changed from: protected */
    public abstract ZoneRules c(String str, boolean z);

    /* access modifiers changed from: protected */
    public abstract Set<String> d();
}

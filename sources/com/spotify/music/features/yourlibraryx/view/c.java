package com.spotify.music.features.yourlibraryx.view;

import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.h;
import org.threeten.bp.Instant;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;

public final class c implements b {
    private final cqe a;

    public c(cqe cqe) {
        h.e(cqe, "clock");
        this.a = cqe;
    }

    @Override // com.spotify.music.features.yourlibraryx.view.b
    public int a(long j) {
        ZoneId w = ZoneId.w("UTC");
        String id = TimeZone.getDefault().getID();
        Map<String, String> map = ZoneId.a;
        yif.J(id, "zoneId");
        yif.J(map, "aliasMap");
        String str = map.get(id);
        if (str != null) {
            id = str;
        }
        ZoneId w2 = ZoneId.w(id);
        return (int) (ZonedDateTime.Q(Instant.D(this.a.d()), w).L(w2).D().F() - ZonedDateTime.Q(Instant.D(j), w).L(w2).D().F());
    }
}

package com.spotify.mobile.android.service.media.browser;

import com.spotify.music.connection.n;
import io.reactivex.z;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class m {
    private static final Long b = Long.valueOf(TimeUnit.DAYS.toSeconds(7));
    private final n a;

    public m(n nVar) {
        this.a = nVar;
    }

    static /* synthetic */ Map b(Boolean bool) {
        HashMap hashMap = new HashMap(1);
        if (!bool.booleanValue()) {
            hashMap.put("Cache-Control", String.format(Locale.getDefault(), "max-stale=%d", b));
        }
        return hashMap;
    }

    public z<Map<String, String>> a() {
        return this.a.b().R(Boolean.FALSE).A(a.a);
    }
}

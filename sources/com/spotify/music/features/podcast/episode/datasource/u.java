package com.spotify.music.features.podcast.episode.datasource;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.util.t;
import io.reactivex.z;
import java.util.Calendar;
import java.util.Locale;
import okhttp3.e0;
import retrofit2.v;

/* access modifiers changed from: package-private */
public class u {
    private final w a;
    private final y b;
    private final cqe c;
    private final t d;
    private final String e;

    public u(w wVar, y yVar, cqe cqe, t tVar, String str) {
        this.a = wVar;
        this.b = yVar;
        this.c = cqe;
        this.d = tVar;
        this.e = str;
    }

    public z<x> a(String str) {
        w wVar = this.a;
        Calendar e2 = this.c.e();
        e2.set(11, 0);
        e2.set(12, 0);
        e2.set(13, 0);
        e2.set(14, 0);
        String a2 = com.spotify.mobile.android.util.u.a(e2);
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put("platform", "android");
        builder.mo51put("dt", a2);
        builder.mo51put("locale", this.e);
        builder.mo51put("region", Locale.getDefault().getCountry());
        builder.mo51put("signal", String.format("episodeURI:%s", str));
        builder.mo51put("version", this.d.c());
        z<v<e0>> a3 = wVar.a(builder.build());
        y yVar = this.b;
        yVar.getClass();
        return a3.A(new a(yVar));
    }
}

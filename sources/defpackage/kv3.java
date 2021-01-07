package defpackage;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Response;
import com.spotify.music.features.ads.api.e;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: kv3  reason: default package */
public class kv3 {
    private final e a;
    private final ObjectMapper b;
    private final Set<yda> c = new LinkedHashSet();

    public kv3(e eVar, com.spotify.music.json.e eVar2) {
        this.a = eVar;
        this.b = eVar2.c(MapperFeature.USE_ANNOTATIONS, true).c(MapperFeature.AUTO_DETECT_FIELDS, false).c(MapperFeature.AUTO_DETECT_GETTERS, false).build();
    }

    private s<Response> e() {
        return this.a.c("device_info", this.b.writeValueAsString((yda[]) this.c.toArray(new yda[0])), true);
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: io.reactivex.s<java.lang.Object>, io.reactivex.s<com.spotify.cosmos.router.Response> */
    /* access modifiers changed from: protected */
    public s<Response> a(yda yda) {
        if (!this.c.add(yda) || !"car".equals(yda.a())) {
            return o.a;
        }
        return e();
    }

    /* JADX DEBUG: Type inference failed for r3v8. Raw type applied. Possible types: io.reactivex.s<java.lang.Object>, io.reactivex.s<com.spotify.cosmos.router.Response> */
    /* access modifiers changed from: protected */
    public s<Response> b(yda yda) {
        this.c.remove(yda);
        if (!"car".equals(yda.a())) {
            return o.a;
        }
        if (!this.c.isEmpty()) {
            return e();
        }
        return this.a.a("device_info", true);
    }

    public Set<yda> c() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public String d() {
        return this.b.writeValueAsString((yda[]) this.c.toArray(new yda[0]));
    }
}

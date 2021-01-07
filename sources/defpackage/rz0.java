package defpackage;

import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.libs.search.online.entity.RequestEntityType;
import com.spotify.libs.search.online.entity.c;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.z;
import java.util.Map;
import java.util.Set;

/* renamed from: rz0  reason: default package */
public class rz0 implements qz0 {
    private final oz0 a;
    private final String b;
    private final c c;
    private final cqe d;
    private String e;
    private String f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private Optional<Integer> k = Optional.absent();
    private Optional<Integer> l = Optional.absent();

    public rz0(oz0 oz0, String str, c cVar, cqe cqe, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = oz0;
        this.b = str;
        this.c = cVar;
        this.d = cqe;
        this.h = z;
        this.g = z2;
        this.j = z3;
        this.i = z4;
    }

    @Override // defpackage.pz0
    public Optional<String> a(Map<String, String> map) {
        return Optional.fromNullable(map.get("request_id"));
    }

    @Override // defpackage.qz0
    public qz0 b(String str) {
        str.getClass();
        this.e = str;
        return this;
    }

    @Override // defpackage.qz0
    public z<Map<String, String>> build() {
        return this.c.a().N0(1).B0().A(new nz0(this));
    }

    @Override // defpackage.qz0
    public qz0 c(String str) {
        str.getClass();
        this.f = str;
        return this;
    }

    @Override // defpackage.qz0
    public qz0 d(int i2, int i3) {
        this.k = Optional.of(Integer.valueOf(i2));
        this.l = Optional.of(Integer.valueOf(i3));
        return this;
    }

    @Override // defpackage.pz0
    public Optional<Integer> e(Map<String, String> map) {
        String str = map.get("offset");
        if (MoreObjects.isNullOrEmpty(str)) {
            return Optional.absent();
        }
        return Optional.of(Integer.valueOf(str));
    }

    public Map<String, String> f(Set<RequestEntityType> set) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        if (MoreObjects.isNullOrEmpty(this.e)) {
            Assertion.g("Query is missing!");
        }
        if (MoreObjects.isNullOrEmpty(this.f)) {
            Assertion.g("Catalogue is missing!");
        }
        builder.mo51put("query", this.e);
        builder.mo51put("catalogue", this.f);
        builder.mo51put("locale", this.b);
        builder.mo51put("timestamp", String.valueOf(this.d.d()));
        if (!MoreObjects.isNullOrEmpty(null)) {
            builder.mo51put("request_id", null);
        } else {
            builder.mo51put("request_id", this.a.a());
        }
        if (this.g) {
            builder.mo51put("entity_types", Joiner.on(",").join(set));
        }
        if (this.k.isPresent()) {
            builder.mo51put("offset", String.valueOf(this.k.get()));
        }
        if (this.l.isPresent()) {
            builder.mo51put("limit", String.valueOf(this.l.get()));
        }
        boolean z = this.h;
        if (z) {
            builder.mo51put("on_demand_sets_enabled", String.valueOf(z));
        }
        if (this.i) {
            builder.mo51put("pagination_enabled", String.valueOf(true));
        }
        boolean z2 = this.j;
        if (z2) {
            builder.mo51put("include_music_and_talk_episodes", String.valueOf(z2));
        }
        return builder.build();
    }
}

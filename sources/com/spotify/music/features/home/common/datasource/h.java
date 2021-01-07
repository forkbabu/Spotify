package com.spotify.music.features.home.common.datasource;

import com.google.common.base.Charsets;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.hash.Hashing;
import com.spotify.android.flags.c;
import com.spotify.music.libs.podcast.download.f0;
import com.spotify.remoteconfig.AndroidFeatureHomeProperties;
import io.reactivex.s;
import okhttp3.e0;
import retrofit2.v;

public class h {
    private final g a;
    private final c b;
    private final cqe c;
    private final boolean d;
    private final String e;
    private final String f;
    private final String g;
    private final boolean h;
    private final boolean i;
    private final AndroidFeatureHomeProperties j;
    private final hha k;

    public h(g gVar, c cVar, cqe cqe, boolean z, String str, String str2, String str3, boolean z2, boolean z3, AndroidFeatureHomeProperties androidFeatureHomeProperties, hha hha) {
        this.a = gVar;
        this.b = cVar;
        this.c = cqe;
        this.d = z;
        this.f = str2;
        this.g = str3;
        this.h = z2;
        this.i = z3;
        this.j = androidFeatureHomeProperties;
        this.k = hha;
        this.e = Hashing.sha1().hashString(str, Charsets.UTF_8).toString();
    }

    public s<v<e0>> a() {
        g gVar = this.a;
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put("platform", this.i ? "android-tablet" : "android");
        builder.mo51put("client-timezone", this.c.f().getID());
        builder.mo51put("locale", this.g);
        builder.mo51put("salt", this.e);
        builder.mo51put("video", String.valueOf(((Boolean) this.b.M0(rna.d)).booleanValue()));
        builder.mo51put("podcast", String.valueOf(f0.b(this.b)));
        builder.mo51put("is_car_connected", String.valueOf(this.h));
        if (!MoreObjects.isNullOrEmpty(this.f)) {
            builder.mo51put("space-id", this.f);
        }
        if (this.j.g()) {
            builder.mo51put("alt", "protobuf");
        }
        ImmutableMap build = builder.build();
        String str = "no-cache";
        if (!this.d) {
            if (this.k.g()) {
                this.k.a(false);
            } else {
                str = null;
            }
        }
        return gVar.a(build, str).P();
    }
}

package com.spotify.music.libs.podcast.loader;

import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.libs.collection.util.UriBuilder;
import java.util.HashSet;
import java.util.Set;

public class j {
    private final String a;
    private final Set<String> b = new HashSet(0);
    private final Set<String> c = new HashSet(0);
    private boolean d;
    private boolean e;
    private boolean f;
    private SortOption g;
    private Integer h;
    private Integer i;
    private final boolean j;

    public j(String str, boolean z) {
        this.a = str;
        this.j = z;
    }

    public void a(String str) {
        this.c.add(str);
    }

    public UriBuilder b() {
        String str;
        if (this.e) {
            str = "sp://core-collection/unstable/<username>/list/episodes/all";
        } else {
            str = this.f ? "sp://core-collection/unstable/<username>/list/episodes/offline" : "sp://core-collection/unstable/<username>/list/episodes/union";
        }
        UriBuilder uriBuilder = new UriBuilder(str);
        uriBuilder.x(100);
        uriBuilder.y(this.a);
        uriBuilder.u(this.g);
        uriBuilder.t(this.h, this.i);
        uriBuilder.o(UriBuilder.Format.PROTOBUF);
        if (this.b.isEmpty()) {
            uriBuilder.h(this.e);
            uriBuilder.c(this.f);
            uriBuilder.n(this.d);
        } else {
            for (String str2 : this.b) {
                uriBuilder.a(str2);
            }
        }
        uriBuilder.s(this.j);
        uriBuilder.d(true);
        boolean z = this.f;
        return uriBuilder;
    }

    public Set<String> c() {
        return this.c;
    }

    public String d() {
        return this.a;
    }

    public boolean e() {
        return this.f;
    }

    public boolean f() {
        return this.e;
    }

    public void g(boolean z, boolean z2, boolean z3) {
        this.e = z;
        this.f = z2;
        this.d = z3;
    }

    public void h(Integer num, Integer num2) {
        this.h = num;
        this.i = num2;
    }

    public void i(SortOption sortOption) {
        this.g = sortOption;
    }
}

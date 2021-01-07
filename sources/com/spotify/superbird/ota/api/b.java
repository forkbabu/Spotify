package com.spotify.superbird.ota.api;

import com.spotify.http.u;
import com.spotify.superbird.ota.model.VersionedPackage;
import com.spotify.superbird.ota.model.e;
import com.spotify.superbird.ota.model.g;
import io.reactivex.z;
import java.util.List;

public class b {
    private final a a;

    interface a {
        @zqf("carthing-proxy/update/v1/{serial}")
        z<e> a(@mrf("serial") String str);

        @irf("carthing-proxy/update/v1/{serial}")
        z<e> b(@mrf("serial") String str, @uqf List<VersionedPackage> list);
    }

    public b(u uVar) {
        this.a = (a) uVar.c(a.class);
    }

    public z<List<g>> a(@mrf("serial") String str) {
        return this.a.a(str).A(a.a);
    }

    public z<List<g>> b(@mrf("serial") String str, @uqf List<VersionedPackage> list) {
        return this.a.b(str, list).A(a.a);
    }
}

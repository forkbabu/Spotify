package com.spotify.mobile.android.spotlets.appprotocol;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.spotlets.appprotocol.model.b;
import com.spotify.mobile.android.spotlets.appprotocol.service.k0;
import com.spotify.mobile.android.sso.ClientIdentity;
import com.spotify.music.appprotocol.api.NotAuthorizedException;
import com.spotify.music.appprotocol.api.session.a;
import com.spotify.music.builtinauth.authenticator.h0;
import com.spotify.music.libs.bluetooth.CategorizerResponse;
import defpackage.ff2;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class w3 extends a implements ff2.a {
    private static final AtomicInteger n = new AtomicInteger();
    private final t3 b;
    private final Map<String, h0> c;
    private final boolean d;
    private final int e = n.incrementAndGet();
    private final e4 f;
    private final k0 g;
    private final String h;
    private final String i;
    private final b j;
    private final ClientIdentity k;
    private final CategorizerResponse l;
    private volatile int m = 0;

    public w3(t3 t3Var, e4 e4Var, Map<String, h0> map, boolean z, String str, String str2, CategorizerResponse categorizerResponse, k0 k0Var) {
        this.c = ImmutableMap.copyOf(map);
        this.b = t3Var;
        this.f = e4Var;
        this.d = z;
        this.l = categorizerResponse;
        this.j = new b();
        this.h = str;
        this.i = str2;
        this.k = null;
        this.g = k0Var;
        k0Var.c(this);
    }

    @Override // defpackage.ff2.a
    public void a(int i2, int i3, Object obj) {
        if (this.m == 1) {
            this.b.g(i2, i3, obj);
        }
    }

    @Override // com.spotify.music.appprotocol.api.session.a
    public int c() {
        return this.e;
    }

    @Override // com.spotify.music.appprotocol.api.session.a
    public int d() {
        return this.m;
    }

    public void g() {
        if (this.m != 1) {
            throw new NotAuthorizedException(0, 0);
        }
    }

    public Map<String, h0> h() {
        return this.c;
    }

    public CategorizerResponse i() {
        return this.l;
    }

    public Optional<ClientIdentity> j() {
        return Optional.fromNullable(this.k);
    }

    public String k() {
        return this.i;
    }

    public e4 l() {
        return this.f;
    }

    public String m() {
        return this.h;
    }

    public b n() {
        return this.j;
    }

    public boolean o() {
        return this.d;
    }

    public void p(int i2) {
        this.m = i2;
    }

    public void q() {
        r("wamp.error.system_shutdown");
        this.g.d(this);
    }

    public void r(String str) {
        this.m = 2;
        this.f.u0();
        this.b.e(new AppProtocol.Message("App service stopping"), str);
        this.b.stop();
    }

    public w3(t3 t3Var, e4 e4Var, Map<String, h0> map, boolean z, String str, String str2, k0 k0Var, ClientIdentity clientIdentity) {
        this.c = ImmutableMap.copyOf(map);
        this.b = t3Var;
        this.f = e4Var;
        this.d = z;
        this.j = new b();
        this.h = str;
        this.i = str2;
        this.k = clientIdentity;
        this.g = k0Var;
        this.l = null;
        k0Var.c(this);
    }
}

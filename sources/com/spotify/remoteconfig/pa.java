package com.spotify.remoteconfig;

public final class pa implements fjf<oa> {
    private final wlf<l0e> a;

    public pa(wlf<l0e> wlf) {
        this.a = wlf;
    }

    public static oa a(l0e l0e) {
        oa oaVar = (oa) l0e.a(z.a);
        yif.g(oaVar, "Cannot return null from a non-@Nullable @Provides method");
        return oaVar;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}

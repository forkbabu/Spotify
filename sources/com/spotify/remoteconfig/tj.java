package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ri;

public abstract class tj implements n0e {

    public static abstract class a {
        /* access modifiers changed from: package-private */
        public abstract tj a();

        public tj b() {
            tj a = a();
            if (a.b() >= 0 && a.b() <= 5356800) {
                return a;
            }
            throw new IllegalArgumentException("Value for imageResolveConfigurationTtlSec() out of bounds");
        }
    }

    public static tj a() {
        ri.b bVar = new ri.b();
        bVar.c(1209600);
        bVar.d(false);
        return bVar.b();
    }

    public abstract int b();

    public abstract boolean c();
}

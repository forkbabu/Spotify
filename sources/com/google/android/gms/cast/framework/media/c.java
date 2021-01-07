package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.framework.media.v;
import com.google.android.gms.cast.j;
import com.google.android.gms.dynamic.b;

public class c {
    private final v a = new a(null);

    class a extends v.a {
        a(f0 f0Var) {
        }

        public final hr D3(j jVar, int i) {
            return c.this.a(jVar);
        }

        public final hr E3(j jVar, b bVar) {
            return c.this.b(jVar, bVar);
        }

        @Override // com.google.android.gms.cast.framework.media.v
        public final com.google.android.gms.dynamic.a Q1() {
            return b.F3(c.this);
        }
    }

    @Deprecated
    public hr a(j jVar) {
        if (jVar == null || !jVar.s2()) {
            return null;
        }
        return jVar.o2().get(0);
    }

    public hr b(j jVar, b bVar) {
        bVar.getType();
        return a(jVar);
    }
}

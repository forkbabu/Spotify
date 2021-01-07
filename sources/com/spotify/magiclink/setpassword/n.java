package com.spotify.magiclink.setpassword;

import android.content.Intent;
import com.spotify.mobius.q;
import com.spotify.smartlock.store.f;
import com.spotify.smartlock.store.i;

public class n {
    private final f a;
    private final o<r21> b;

    class a extends i {
        a() {
        }

        @Override // com.spotify.smartlock.store.SmartlockProviderCallback
        public void c() {
            n.this.b.c(r21.a());
        }
    }

    public n(f fVar, o<r21> oVar) {
        this.a = fVar;
        this.b = oVar;
    }

    public void b(int i, int i2, Intent intent) {
        if (f.c(i)) {
            this.a.i(i, i2, intent);
        }
    }

    /* access modifiers changed from: package-private */
    public q<r21> c() {
        return this.b;
    }

    public void d(String str, String str2) {
        this.a.l(str, str2, "", new a());
    }
}

package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.IBinder;
import com.google.android.exoplayer2.util.g;

public abstract class k {
    private final Context a;
    private final String b;
    private final a c = new a(null);

    /* access modifiers changed from: package-private */
    public class a extends n {
        a(r rVar) {
        }

        public final String D3() {
            return k.this.b();
        }

        public final boolean E3() {
            return k.this.d();
        }

        public final com.google.android.gms.dynamic.a F3(String str) {
            h a2 = k.this.a(str);
            if (a2 == null) {
                return null;
            }
            return a2.m();
        }
    }

    protected k(Context context, String str) {
        if (context != null) {
            this.a = context.getApplicationContext();
            g.i(str);
            this.b = str;
            return;
        }
        throw new NullPointerException("null reference");
    }

    public abstract h a(String str);

    public final String b() {
        return this.b;
    }

    public final Context c() {
        return this.a;
    }

    public abstract boolean d();

    public final IBinder e() {
        return this.c;
    }
}

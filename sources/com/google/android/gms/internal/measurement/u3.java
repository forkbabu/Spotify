package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f4;
import com.spotify.mobile.android.core.internal.AudioDriver;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class u3 {
    private static volatile u3 b;
    private static volatile u3 c;
    private static final u3 d = new u3(true);
    private final Map<a, f4.f<?, ?>> a;

    static final class a {
        private final Object a;
        private final int b;

        a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * AudioDriver.SPOTIFY_MAX_VOLUME) + this.b;
        }
    }

    u3() {
        this.a = new HashMap();
    }

    public static u3 a() {
        u3 u3Var = b;
        if (u3Var == null) {
            synchronized (u3.class) {
                u3Var = b;
                if (u3Var == null) {
                    u3Var = d;
                    b = u3Var;
                }
            }
        }
        return u3Var;
    }

    public static u3 c() {
        u3 u3Var = c;
        if (u3Var != null) {
            return u3Var;
        }
        synchronized (u3.class) {
            u3 u3Var2 = c;
            if (u3Var2 != null) {
                return u3Var2;
            }
            u3 b2 = d4.b(u3.class);
            c = b2;
            return b2;
        }
    }

    public final <ContainingType extends l5> f4.f<ContainingType, ?> b(ContainingType containingtype, int i) {
        return (f4.f<ContainingType, ?>) this.a.get(new a(containingtype, i));
    }

    private u3(boolean z) {
        this.a = Collections.emptyMap();
    }
}

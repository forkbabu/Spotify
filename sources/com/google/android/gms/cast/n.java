package com.google.android.gms.cast;

import com.google.android.gms.common.internal.m;
import java.util.Arrays;
import org.json.JSONObject;

public class n {
    private final long a;
    private final int b;
    private final boolean c;
    private final JSONObject d;

    public static class a {
        private long a;
        private int b = 0;
        private JSONObject c;

        public n a() {
            return new n(this.a, this.b, false, this.c, null);
        }

        public a b(JSONObject jSONObject) {
            this.c = jSONObject;
            return this;
        }

        public a c(long j) {
            this.a = j;
            return this;
        }

        public a d(int i) {
            this.b = i;
            return this;
        }
    }

    n(long j, int i, boolean z, JSONObject jSONObject, g1 g1Var) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = jSONObject;
    }

    public JSONObject a() {
        return this.d;
    }

    public long b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.a == nVar.a && this.b == nVar.b && this.c == nVar.c && m.a(this.d, nVar.d);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c), this.d});
    }
}

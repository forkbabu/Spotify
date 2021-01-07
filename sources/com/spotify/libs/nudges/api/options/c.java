package com.spotify.libs.nudges.api.options;

import com.spotify.encore.foundation.R;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class c extends a {
    private a b;

    public static final class a {
        private final String a;
        private final int b;
        private final nmf<ov0, f> c;

        public a(String str, int i, nmf nmf, int i2) {
            i = (i2 & 2) != 0 ? R.color.light_invertedlight_text_brightaccent : i;
            nmf = (i2 & 4) != 0 ? SimpleNudgeOptions$Action$1.a : nmf;
            h.e(str, "text");
            h.e(nmf, "onClick");
            this.a = str;
            this.b = i;
            this.c = nmf;
        }

        public final int a() {
            return this.b;
        }

        public final nmf<ov0, f> b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && this.b == aVar.b && h.a(this.c, aVar.c);
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.b) * 31;
            nmf<ov0, f> nmf = this.c;
            if (nmf != null) {
                i = nmf.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Action(text=");
            V0.append(this.a);
            V0.append(", color=");
            V0.append(this.b);
            V0.append(", onClick=");
            V0.append(this.c);
            V0.append(")");
            return V0.toString();
        }
    }

    public final c d(a aVar) {
        h.e(aVar, "action");
        this.b = aVar;
        return this;
    }

    public final a e() {
        return this.b;
    }
}

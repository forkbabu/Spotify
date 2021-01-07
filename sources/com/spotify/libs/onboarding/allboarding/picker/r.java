package com.spotify.libs.onboarding.allboarding.picker;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class r {

    public static final class a extends r {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends r {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            h.e(str, "loadingText");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && h.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return je.I0(je.V0("ShowLoading(loadingText="), this.a, ")");
        }
    }

    public static final class c extends r {
        private final long a;

        public c(long j) {
            super(null);
            this.a = j;
        }

        public final long a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && this.a == ((c) obj).a;
            }
            return true;
        }

        public int hashCode() {
            return e.a(this.a);
        }

        public String toString() {
            return je.E0(je.V0("ShowPicker(stepId="), this.a, ")");
        }
    }

    public static final class d extends r {
        private final boolean a;

        public d(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && this.a == ((d) obj).a;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return je.P0(je.V0("ShowSkipDialog(skippable="), this.a, ")");
        }
    }

    private r() {
    }

    public r(f fVar) {
    }
}

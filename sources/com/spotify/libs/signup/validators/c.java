package com.spotify.libs.signup.validators;

import io.reactivex.z;

public class c {
    private final iae a;

    public static class a {
        private final boolean a;
        private final boolean b;
        private final String c;

        public a(boolean z, boolean z2, String str) {
            this.a = z;
            this.b = z2;
            this.c = str;
        }

        public String a() {
            return this.c;
        }

        public boolean b() {
            return this.b;
        }

        public boolean c() {
            return this.a;
        }
    }

    public c(iae iae) {
        this.a = iae;
    }

    public z<a> a(String str) {
        return this.a.g(str).A(a.a).E(b.a);
    }
}

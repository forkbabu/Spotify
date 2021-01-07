package com.spotify.facebook.authentication.signup.model;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class a {

    /* renamed from: com.spotify.facebook.authentication.signup.model.a$a  reason: collision with other inner class name */
    public static final class C0154a extends a {
        private final Failure a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0154a(Failure failure) {
            super(null);
            h.e(failure, "failure");
            this.a = failure;
        }

        public final Failure a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C0154a) && h.a(this.a, ((C0154a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            Failure failure = this.a;
            if (failure != null) {
                return failure.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Failed(failure=");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    public static final class b extends a {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends a {
        public static final c a = new c();

        private c() {
            super(null);
        }
    }

    private a() {
    }

    public a(f fVar) {
    }
}

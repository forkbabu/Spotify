package com.spotify.libs.onboarding.allboarding;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class a<T> {
    private boolean a;
    private final T b;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Object obj, f fVar) {
        this.b = obj;
    }

    public final T a() {
        if (this.a) {
            return null;
        }
        this.a = true;
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!h.a(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return !(h.a(this.b, ((a) obj).b) ^ true);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.spotify.libs.onboarding.allboarding.OnBoardingEvent<*>");
    }

    public int hashCode() {
        T t = this.b;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }
}

package io.reactivex;

import io.reactivex.internal.functions.a;
import io.reactivex.internal.util.NotificationLite;

public final class r<T> {
    static final r<Object> b = new r<>(null);
    final Object a;

    private r(Object obj) {
        this.a = obj;
    }

    public static <T> r<T> a() {
        return (r<T>) b;
    }

    public static <T> r<T> b(Throwable th) {
        if (th != null) {
            return new r<>(NotificationLite.k(th));
        }
        throw new NullPointerException("error is null");
    }

    public static <T> r<T> c(T t) {
        if (t != null) {
            return new r<>(t);
        }
        throw new NullPointerException("value is null");
    }

    public Throwable d() {
        Object obj = this.a;
        if (NotificationLite.n(obj)) {
            return NotificationLite.l(obj);
        }
        return null;
    }

    public T e() {
        Object obj = this.a;
        if (obj == null || NotificationLite.n(obj)) {
            return null;
        }
        return (T) this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            return a.a(this.a, ((r) obj).a);
        }
        return false;
    }

    public boolean f() {
        return this.a == null;
    }

    public boolean g() {
        return NotificationLite.n(this.a);
    }

    public boolean h() {
        Object obj = this.a;
        return obj != null && !NotificationLite.n(obj);
    }

    public int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (!NotificationLite.n(obj)) {
            return je.G0(je.V0("OnNextNotification["), this.a, "]");
        }
        StringBuilder V0 = je.V0("OnErrorNotification[");
        V0.append(NotificationLite.l(obj));
        V0.append("]");
        return V0.toString();
    }
}

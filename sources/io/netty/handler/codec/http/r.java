package io.netty.handler.codec.http;

import io.netty.util.c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class r implements Iterable<Map.Entry<String, String>> {
    static {
        Iterator<Map.Entry<CharSequence, CharSequence>> it = k.a;
        k kVar = c0.a;
    }

    protected r() {
    }

    public abstract r A(String str, Object obj);

    public r c(CharSequence charSequence, Object obj) {
        return d(charSequence.toString(), obj);
    }

    public abstract r d(String str, Object obj);

    public boolean e(CharSequence charSequence) {
        return h(((c) charSequence).toString());
    }

    public boolean f(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        return i(((c) charSequence).toString(), ((c) charSequence2).toString(), z);
    }

    public abstract boolean h(String str);

    public boolean i(String str, String str2, boolean z) {
        List<String> n = n(str);
        if (n.isEmpty()) {
            return false;
        }
        for (String str3 : n) {
            if (z) {
                if (str3.equalsIgnoreCase(str2)) {
                    return true;
                }
            } else if (str3.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public abstract boolean isEmpty();

    @Override // java.lang.Iterable
    @Deprecated
    public abstract Iterator<Map.Entry<String, String>> iterator();

    public String j(CharSequence charSequence) {
        return k(((c) charSequence).toString());
    }

    public abstract String k(String str);

    public List<String> l(CharSequence charSequence) {
        return n(charSequence.toString());
    }

    public abstract List<String> n(String str);

    public abstract Iterator<Map.Entry<CharSequence, CharSequence>> o();

    public r t(CharSequence charSequence) {
        return u(((c) charSequence).toString());
    }

    public abstract r u(String str);

    public r x(CharSequence charSequence, Iterable<?> iterable) {
        return z(((c) charSequence).toString(), iterable);
    }

    public r y(CharSequence charSequence, Object obj) {
        return A(((c) charSequence).toString(), obj);
    }

    public abstract r z(String str, Iterable<?> iterable);
}

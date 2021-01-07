package com.spotify.mobile.android.util.prefs;

import android.content.SharedPreferences;
import io.reactivex.s;
import java.util.Collections;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class SpSharedPreferences<S> {
    private final wlf<SharedPreferences> a;

    public static class Update<T> {
        public final T a;
        public final Type b;

        public enum Type {
            CHANGED,
            NOT_IN_PREFS,
            SET_TO_NULL
        }

        public Update(Type type, T t) {
            this.b = type;
            this.a = t;
        }
    }

    public static class a<S> {
        private boolean a = false;
        protected final SharedPreferences.Editor b;

        a(SharedPreferences.Editor editor) {
            this.b = editor;
        }

        public a<S> a(b<S, Boolean> bVar, boolean z) {
            bVar.getClass();
            this.b.putBoolean(bVar.a(), z);
            return this;
        }

        public a<S> b(b<S, Integer> bVar, int i) {
            bVar.getClass();
            this.b.putInt(bVar.a(), i);
            return this;
        }

        public a<S> c(b<S, JSONArray> bVar, JSONArray jSONArray) {
            bVar.getClass();
            this.b.putString(bVar.a(), jSONArray.toString());
            return this;
        }

        public a<S> d(b<S, JSONObject> bVar, JSONObject jSONObject) {
            bVar.getClass();
            this.b.putString(bVar.a(), jSONObject.toString());
            return this;
        }

        public a<S> e(b<S, Long> bVar, long j) {
            bVar.getClass();
            this.b.putLong(bVar.a(), j);
            return this;
        }

        public a<S> f(b<S, String> bVar, String str) {
            bVar.getClass();
            this.b.putString(bVar.a(), str);
            return this;
        }

        public a<S> g(b<S, Set<String>> bVar, Set<String> set) {
            bVar.getClass();
            this.b.putStringSet(bVar.a(), set);
            return this;
        }

        public a<S> h(b<S, ?> bVar) {
            bVar.getClass();
            this.b.remove(bVar.a());
            return this;
        }

        public void i() {
            if (!this.a) {
                this.b.apply();
                this.a = true;
                return;
            }
            throw new IllegalStateException("Must not use the same Editor instance twice");
        }

        public void j() {
            if (!this.a) {
                this.b.commit();
                this.a = true;
                return;
            }
            throw new IllegalStateException("Must not use the same Editor instance twice");
        }
    }

    public static final class b<S, T> {
        static final Set<String> b = new HashSet(64);
        private final String a;

        private b(String str) {
            this.a = str;
        }

        public static synchronized <U> b<Object, U> b(String str) {
            synchronized (b.class) {
                if (!b.contains(str)) {
                    return null;
                }
                return new b<>(str);
            }
        }

        public static synchronized <U> b<Object, U> c(String str) {
            b<Object, U> d;
            synchronized (b.class) {
                d = d(str);
            }
            return d;
        }

        private static <S, U> b<S, U> d(String str) {
            str.getClass();
            if (!str.startsWith("__")) {
                Set<String> set = b;
                if (!set.contains(str)) {
                    set.add(str);
                    return new b<>(str);
                }
                throw new AssertionError(je.x0("Requesting same string for a key previously defined somewhere else: ", str));
            }
            throw new AssertionError("Cannot create key in protected namespace");
        }

        public static synchronized <U> b<Object, U> e(String str) {
            b<Object, U> d;
            synchronized (b.class) {
                d = d(str);
            }
            return d;
        }

        public String a() {
            return this.a;
        }
    }

    public SpSharedPreferences(wlf<SharedPreferences> wlf) {
        this.a = wlf;
    }

    private void s(b<S, ?> bVar) {
        if (!k().contains(bVar.a())) {
            StringBuilder V0 = je.V0("key ");
            V0.append(bVar.a());
            V0.append(" has no value");
            throw new NoSuchElementException(V0.toString());
        }
    }

    public boolean a(b<S, ?> bVar) {
        return k().contains(bVar.a());
    }

    public a<S> b() {
        return new a<>(k().edit());
    }

    public boolean c(b<S, Boolean> bVar) {
        s(bVar);
        return d(bVar, false);
    }

    public boolean d(b<S, Boolean> bVar, boolean z) {
        return k().getBoolean(bVar.a(), z);
    }

    public int e(b<S, Integer> bVar) {
        s(bVar);
        return f(bVar, 0);
    }

    public int f(b<S, Integer> bVar, int i) {
        return k().getInt(bVar.a(), i);
    }

    public JSONArray g(b<S, JSONArray> bVar, JSONArray jSONArray) {
        String str = null;
        try {
            str = k().getString(bVar.a(), null);
        } catch (ClassCastException unused) {
        }
        if (str == null) {
            return jSONArray;
        }
        return new JSONArray(str);
    }

    public JSONObject h(b<S, JSONObject> bVar) {
        s(bVar);
        String string = k().getString(bVar.a(), null);
        string.getClass();
        return new JSONObject(string);
    }

    public long i(b<S, Long> bVar) {
        s(bVar);
        return j(bVar, 0);
    }

    public long j(b<S, Long> bVar, long j) {
        return k().getLong(bVar.a(), j);
    }

    /* access modifiers changed from: package-private */
    public SharedPreferences k() {
        return this.a.get();
    }

    public String l(b<S, String> bVar) {
        s(bVar);
        return m(bVar, null);
    }

    public String m(b<S, String> bVar, String str) {
        return k().getString(bVar.a(), str);
    }

    public String n(b<S, String> bVar, String str) {
        String string = k().getString(bVar.a(), str);
        string.getClass();
        return string;
    }

    public Set<String> o(b<S, Set<String>> bVar, Set<String> set) {
        Set<String> stringSet = k().getStringSet(bVar.a(), set);
        if (stringSet == null) {
            return null;
        }
        return Collections.unmodifiableSet(stringSet);
    }

    public s<Update<Boolean>> p(b<S, Boolean> bVar) {
        return s.y(new h(this, bVar, a.a));
    }

    public s<Update<JSONObject>> q(b<S, JSONObject> bVar) {
        return s.y(new h(this, bVar, g.a));
    }

    public s<Update<String>> r(b<S, String> bVar) {
        return s.y(new h(this, bVar, d.a));
    }
}

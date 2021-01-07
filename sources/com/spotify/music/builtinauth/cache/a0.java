package com.spotify.music.builtinauth.cache;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public abstract class a0 {
    private static final Pattern a = Pattern.compile("[\\[\\]]");
    private static final Pattern b = Pattern.compile(", ");

    public static a0 a(String str, String str2, String str3, long j, String str4, String str5, long j2) {
        return new z(str, str2, str3, j, str4, str5, j2);
    }

    public abstract String b();

    public abstract String c();

    public abstract long d();

    public abstract String e();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (!rw.equal(c(), a0Var.c()) || !rw.equal(f(), a0Var.f()) || !rw.equal(e(), a0Var.e()) || !rw.equal(b(), a0Var.b())) {
            return false;
        }
        return true;
    }

    public abstract String f();

    public abstract String g();

    public Set<String> h() {
        return new HashSet(Arrays.asList(b.split(a.matcher(g()).replaceAll(""))));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{c(), f(), e(), b()});
    }

    public abstract long i();
}

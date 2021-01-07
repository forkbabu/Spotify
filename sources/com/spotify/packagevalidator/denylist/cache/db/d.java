package com.spotify.packagevalidator.denylist.cache.db;

import com.google.gson.JsonIOException;
import com.google.gson.internal.r;
import com.google.gson.j;
import com.google.gson.k;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Set;

public final class d {

    /* access modifiers changed from: package-private */
    public static class a extends z20<Set<String>> {
        a() {
        }
    }

    public static String a(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return "";
        }
        k kVar = new k();
        kVar.b();
        j a2 = kVar.a();
        Class<?> cls = set.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            a2.f(set, cls, a2.e(r.c(stringWriter)));
            return stringWriter.toString();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public static Set<String> b(String str) {
        if (str == null || str.isEmpty()) {
            return Collections.emptySet();
        }
        return (Set) new j().b(str, new a().d());
    }
}

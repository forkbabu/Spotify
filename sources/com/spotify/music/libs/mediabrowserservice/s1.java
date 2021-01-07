package com.spotify.music.libs.mediabrowserservice;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class s1 {
    private final Set<u1> a;

    public s1(Set<u1> set) {
        this.a = set;
    }

    public static String a(String str, String str2) {
        return je.y0(str, "---", str2);
    }

    public static String d(String str) {
        String[] split = str.split("---");
        if (split.length != 2) {
            return str;
        }
        return split[1];
    }

    public String b(String str) {
        String[] split = str.split("---");
        if (split.length != 2) {
            if (c(str)) {
                return str;
            }
            return null;
        } else if (c(split[0])) {
            return split[0];
        } else {
            return null;
        }
    }

    public boolean c(String str) {
        HashSet hashSet = new HashSet(1);
        for (u1 u1Var : this.a) {
            if (u1Var.d(str)) {
                hashSet.add(u1Var);
            }
        }
        if (hashSet.size() > 1) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Logger.d("Configurator for package '%s': '%s'", str, ((u1) it.next()).getClass().getName());
            }
            Assertion.g(String.format("Multiple handlers registered for package: '%s'", str));
        }
        return !hashSet.isEmpty();
    }
}

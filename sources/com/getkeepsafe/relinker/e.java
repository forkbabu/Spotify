package com.getkeepsafe.relinker;

import com.getkeepsafe.relinker.b;

/* access modifiers changed from: package-private */
public final class e implements b.AbstractC0082b {
    e() {
    }

    public String a(String str) {
        if (!str.startsWith("lib") || !str.endsWith(".so")) {
            return System.mapLibraryName(str);
        }
        return str;
    }
}

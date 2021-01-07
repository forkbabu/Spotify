package com.google.firebase.components;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements t10 {
    private final Set a;

    private j(Set set) {
        this.a = set;
    }

    public static t10 a(Set set) {
        return new j(set);
    }

    @Override // defpackage.t10
    public Object get() {
        Set<s> set = this.a;
        int i = l.f;
        HashSet hashSet = new HashSet();
        for (s sVar : set) {
            hashSet.add(sVar.get());
        }
        return Collections.unmodifiableSet(hashSet);
    }
}

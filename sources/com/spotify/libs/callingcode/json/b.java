package com.spotify.libs.callingcode.json;

import java.util.Comparator;

public final /* synthetic */ class b implements Comparator {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = CallingCode.a;
        return ((CallingCode) obj).c().compareTo(((CallingCode) obj2).c());
    }
}

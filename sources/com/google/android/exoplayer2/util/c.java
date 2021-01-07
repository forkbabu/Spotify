package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.util.z;
import java.util.Comparator;

public final /* synthetic */ class c implements Comparator {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = z.h;
        return Float.compare(((z.b) obj).c, ((z.b) obj2).c);
    }
}

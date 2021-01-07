package com.spotify.music.libs.assistedcuration.provider;

import com.spotify.music.libs.assistedcuration.model.h;
import java.util.Comparator;

public final /* synthetic */ class j implements Comparator {
    public final /* synthetic */ c0 a;

    public /* synthetic */ j(c0 c0Var) {
        this.a = c0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return c0.j(this.a, (h) obj, (h) obj2);
    }
}

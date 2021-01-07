package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.offline.t;
import java.util.Collections;
import java.util.List;

public abstract class g implements t<g> {
    public final String a;
    public final List<String> b;
    public final boolean c;

    protected g(String str, List<String> list, boolean z) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }
}

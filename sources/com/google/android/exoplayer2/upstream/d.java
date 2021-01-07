package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.x;

public final /* synthetic */ class d implements x {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    public final boolean a(Object obj) {
        String Q = f0.Q((String) obj);
        return !TextUtils.isEmpty(Q) && (!Q.contains("text") || Q.contains("text/vtt")) && !Q.contains("html") && !Q.contains("xml");
    }
}

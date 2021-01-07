package com.spotify.mobile.android.util;

import android.widget.TextView;
import com.spotify.mobile.android.util.ui.g;
import com.spotify.music.C0707R;
import com.spotify.playlist.models.offline.a;

public final /* synthetic */ class f implements nmf {
    public final /* synthetic */ TextView a;

    public /* synthetic */ f(TextView textView) {
        this.a = textView;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        a.c cVar = (a.c) obj;
        g.c(this.a, 0, C0707R.id.drawable_group_download_indicator);
        return kotlin.f.a;
    }
}

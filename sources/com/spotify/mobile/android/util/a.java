package com.spotify.mobile.android.util;

import android.widget.TextView;
import com.spotify.mobile.android.util.ui.g;
import com.spotify.music.C0707R;
import com.spotify.playlist.models.offline.a;
import kotlin.f;

public final /* synthetic */ class a implements nmf {
    public final /* synthetic */ TextView a;

    public /* synthetic */ a(TextView textView) {
        this.a = textView;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        a.g gVar = (a.g) obj;
        g.c(this.a, 0, C0707R.id.drawable_group_download_indicator);
        return f.a;
    }
}

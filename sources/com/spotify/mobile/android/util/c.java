package com.spotify.mobile.android.util;

import android.content.Context;
import android.widget.TextView;
import com.spotify.mobile.android.util.ui.g;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable;
import com.spotify.playlist.models.offline.a;
import kotlin.f;

public final /* synthetic */ class c implements nmf {
    public final /* synthetic */ Context a;
    public final /* synthetic */ TextView b;

    public /* synthetic */ c(Context context, TextView textView) {
        this.a = context;
        this.b = textView;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        Context context = this.a;
        a.h hVar = (a.h) obj;
        ((DownloadIndicatorDrawable) g.a(context, this.b, 0, C0707R.id.drawable_group_download_indicator, new g(context))).a(DownloadIndicatorDrawable.DownloadState.WAITING);
        return f.a;
    }
}

package com.spotify.mobile.android.util;

import android.content.Context;
import android.widget.TextView;
import com.spotify.mobile.android.util.ui.g;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.DownloadIndicatorDrawable;
import com.spotify.playlist.models.offline.a;
import kotlin.f;

public final /* synthetic */ class k implements nmf {
    public final /* synthetic */ Context a;
    public final /* synthetic */ TextView b;

    public /* synthetic */ k(Context context, TextView textView) {
        this.a = context;
        this.b = textView;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        Context context = this.a;
        TextView textView = this.b;
        ((DownloadIndicatorDrawable) g.a(context, textView, 0, C0707R.id.drawable_group_download_indicator, new e(context))).a(DownloadIndicatorDrawable.DownloadState.DOWNLOADING);
        int c = ((a.b) obj).c();
        if (c > 0) {
            textView.setText(context.getString(C0707R.string.header_downloading_progress, Integer.valueOf(c)));
        }
        return f.a;
    }
}

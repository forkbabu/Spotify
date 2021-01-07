package com.spotify.music.features.widget;

import android.appwidget.AppWidgetManager;
import android.widget.RemoteViews;
import com.spotify.music.features.widget.i;

public final /* synthetic */ class a implements i.a {
    public final /* synthetic */ RemoteViews a;

    public /* synthetic */ a(RemoteViews remoteViews) {
        this.a = remoteViews;
    }

    @Override // com.spotify.music.features.widget.i.a
    public final void a(Object obj, Object obj2) {
        ((AppWidgetManager) obj).updateAppWidget((int[]) obj2, this.a);
    }
}

package com.spotify.music.features.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.C0707R;
import com.spotify.music.features.widget.e;
import com.spotify.music.features.widget.f;

/* access modifiers changed from: package-private */
public class i {

    public interface a<T1, T2> {
        void a(T1 t1, T2 t2);
    }

    private static void b(Context context, RemoteViews remoteViews, int i, Intent intent) {
        remoteViews.setOnClickPendingIntent(i, PendingIntent.getBroadcast(context, 1, intent, 134217728));
    }

    private static void c(Context context, RemoteViews remoteViews, e eVar) {
        eVar.getClass();
        if (eVar instanceof e.a) {
            remoteViews.setViewVisibility(C0707R.id.btn_play_disabled, 8);
            remoteViews.setViewVisibility(C0707R.id.btn_play_normal, 8);
            remoteViews.setViewVisibility(C0707R.id.btn_pause_disabled, 0);
            remoteViews.setViewVisibility(C0707R.id.btn_pause_normal, 8);
        } else if (eVar instanceof e.b) {
            remoteViews.setViewVisibility(C0707R.id.btn_play_disabled, 8);
            remoteViews.setViewVisibility(C0707R.id.btn_play_normal, 8);
            remoteViews.setViewVisibility(C0707R.id.btn_pause_disabled, 8);
            remoteViews.setViewVisibility(C0707R.id.btn_pause_normal, 0);
            b(context, remoteViews, C0707R.id.btn_pause_normal, ((e.b) eVar).a());
        } else if (eVar instanceof e.c) {
            remoteViews.setViewVisibility(C0707R.id.btn_play_disabled, 0);
            remoteViews.setViewVisibility(C0707R.id.btn_play_normal, 8);
            remoteViews.setViewVisibility(C0707R.id.btn_pause_disabled, 8);
            remoteViews.setViewVisibility(C0707R.id.btn_pause_normal, 8);
        } else if (eVar instanceof e.d) {
            remoteViews.setViewVisibility(C0707R.id.btn_play_disabled, 8);
            remoteViews.setViewVisibility(C0707R.id.btn_play_normal, 0);
            remoteViews.setViewVisibility(C0707R.id.btn_pause_disabled, 8);
            remoteViews.setViewVisibility(C0707R.id.btn_pause_normal, 8);
            b(context, remoteViews, C0707R.id.btn_play_normal, ((e.d) eVar).a());
        }
    }

    private static void d(Context context, RemoteViews remoteViews, f fVar) {
        fVar.getClass();
        if (fVar instanceof f.b) {
            remoteViews.setViewVisibility(C0707R.id.btn_next_disabled, 8);
            remoteViews.setViewVisibility(C0707R.id.btn_next_normal, 0);
            b(context, remoteViews, C0707R.id.btn_next_normal, ((f.b) fVar).a());
            return;
        }
        remoteViews.setViewVisibility(C0707R.id.btn_next_disabled, 0);
        remoteViews.setViewVisibility(C0707R.id.btn_next_normal, 8);
    }

    private static void e(Context context, RemoteViews remoteViews, f fVar) {
        fVar.getClass();
        if (fVar instanceof f.b) {
            remoteViews.setViewVisibility(C0707R.id.btn_prev_disabled, 8);
            remoteViews.setViewVisibility(C0707R.id.btn_prev_normal, 0);
            b(context, remoteViews, C0707R.id.btn_prev_normal, ((f.b) fVar).a());
            return;
        }
        remoteViews.setViewVisibility(C0707R.id.btn_prev_disabled, 0);
        remoteViews.setViewVisibility(C0707R.id.btn_prev_normal, 8);
    }

    private static void g(Context context, a<AppWidgetManager, int[]> aVar) {
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        if (instance != null) {
            try {
                aVar.a(instance, instance.getAppWidgetIds(new ComponentName(context, SpotifyWidget.class)));
            } catch (RuntimeException e) {
                Logger.e(e, "failing to update widget", new Object[0]);
            }
        }
    }

    public void a(Context context, boolean z) {
        e eVar;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) C0707R.layout.widget);
        e(context, remoteViews, new f.a());
        if (z) {
            eVar = new e.c();
        } else {
            eVar = new e.a();
        }
        c(context, remoteViews, eVar);
        d(context, remoteViews, new f.a());
        g(context, new b(remoteViews));
    }

    public void f(Context context, m mVar) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) C0707R.layout.widget);
        Optional<Bitmap> b = mVar.b();
        if (b.isPresent()) {
            remoteViews.setImageViewBitmap(C0707R.id.coverart, b.get());
        } else {
            remoteViews.setImageViewResource(C0707R.id.coverart, C0707R.drawable.widget_placeholder);
        }
        remoteViews.setTextViewText(C0707R.id.title, mVar.h());
        remoteViews.setTextViewText(C0707R.id.artist, mVar.g());
        e(context, remoteViews, mVar.f());
        c(context, remoteViews, mVar.d());
        d(context, remoteViews, mVar.e());
        PendingIntent a2 = mVar.a();
        remoteViews.setOnClickPendingIntent(C0707R.id.widget_layout, a2);
        remoteViews.setOnClickPendingIntent(C0707R.id.coverart, a2);
        remoteViews.setOnClickPendingIntent(C0707R.id.title, a2);
        remoteViews.setOnClickPendingIntent(C0707R.id.artist, a2);
        g(context, new a(remoteViews));
    }
}

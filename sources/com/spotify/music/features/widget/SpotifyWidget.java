package com.spotify.music.features.widget;

import android.app.ActivityManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.o;
import dagger.android.a;
import java.util.Iterator;
import kotlin.jvm.internal.h;

public class SpotifyWidget extends AppWidgetProvider {
    o a;
    h2e b;
    i c;

    private void b(Context context, String str) {
        Intent c2 = this.a.c(context, str);
        h.e(c2, "intent");
        c2.putExtra("needs_foreground_start", true);
        this.b.b(context, c2, "SpotifyWidget", new Object[0]);
    }

    public void a(Context context, Intent intent) {
        this.c.a(context, intent.getBooleanExtra("paused", true));
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean z = true;
        Logger.g("SpotifyWidget received intent: %s", intent);
        if (intent != null) {
            a.c(this, context);
            String action = intent.getAction();
            if ("android.appwidget.action.APPWIDGET_ENABLED".equals(action)) {
                this.c.f(context, n.d(context, Optional.absent(), Optional.absent(), this.a.b(context)));
            } else if ("android.appwidget.action.APPWIDGET_UPDATE".equals(action)) {
                Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if ("com.spotify.mobile.android.service.SpotifyService".equals(it.next().service.getClassName())) {
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    b(context, "com.spotify.mobile.android.service.action.request.update.WIDGET");
                } else {
                    this.c.f(context, n.d(context, Optional.absent(), Optional.absent(), this.a.b(context)));
                }
            } else if ("com.spotify.mobile.android.ui.widget.PREVIOUS".equals(action)) {
                a(context, intent);
                b(context, "com.spotify.music.feature.widget.SKIP_PREV");
            } else if ("com.spotify.mobile.android.ui.widget.PAUSE".equals(action)) {
                a(context, intent);
                b(context, "com.spotify.music.feature.widget.PAUSE");
            } else if ("com.spotify.mobile.android.ui.widget.RESUME".equals(action)) {
                a(context, intent);
                b(context, "com.spotify.music.feature.widget.RESUME");
            } else if ("com.spotify.mobile.android.ui.widget.NEXT".equals(action)) {
                a(context, intent);
                b(context, "com.spotify.music.feature.widget.SKIP_NEXT");
            }
        }
    }
}

package com.spotify.music.features.preloadnotification;

import android.app.AlarmManager;
import android.app.Application;
import android.app.NotificationManager;
import com.spotify.music.features.preloadnotification.conditions.e;
import com.spotify.music.navigation.o;

public final class c implements fjf<b> {
    public static void a(PreloadNotificationReceiver preloadNotificationReceiver, a aVar) {
        preloadNotificationReceiver.a = aVar;
    }

    public static a b(Object obj, e eVar, Object obj2, th7 th7, uh7 uh7, cqe cqe) {
        return new a((d) obj, eVar, (e) obj2, th7, uh7, cqe);
    }

    public static b c(a aVar) {
        return new b(aVar);
    }

    public static d d(th7 th7, AlarmManager alarmManager, Application application) {
        return new d(th7, alarmManager, application);
    }

    public static e e(Application application, uh7 uh7, NotificationManager notificationManager, o oVar) {
        return new e(application, uh7, notificationManager, oVar);
    }
}

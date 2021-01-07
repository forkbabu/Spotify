package com.spotify.workmanager;

import android.app.Application;
import androidx.work.ListenableWorker;
import com.google.common.base.MoreObjects;
import dagger.android.b;
import dagger.android.h;

public final class a {
    public static void a(ListenableWorker listenableWorker) {
        Application application = (Application) listenableWorker.a();
        if (application instanceof h) {
            h hVar = (h) application;
            b<Object> C = hVar.C();
            MoreObjects.checkNotNull(C, "%s.androidInjector() returned null", hVar.getClass());
            C.a(listenableWorker);
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", application.getClass().getCanonicalName(), h.class.getCanonicalName()));
    }
}

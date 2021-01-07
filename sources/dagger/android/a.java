package dagger.android;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import dagger.android.b;
import java.util.Map;

public final class a {
    public static void a(Activity activity) {
        Application application = activity.getApplication();
        if (application instanceof h) {
            e(activity, (h) application);
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", application.getClass().getCanonicalName(), h.class.getCanonicalName()));
    }

    public static void b(Service service) {
        Application application = service.getApplication();
        if (application instanceof h) {
            e(service, (h) application);
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", application.getClass().getCanonicalName(), h.class.getCanonicalName()));
    }

    public static void c(BroadcastReceiver broadcastReceiver, Context context) {
        if (context != null) {
            Application application = (Application) context.getApplicationContext();
            if (application instanceof h) {
                e(broadcastReceiver, (h) application);
                return;
            }
            throw new RuntimeException(String.format("%s does not implement %s", application.getClass().getCanonicalName(), h.class.getCanonicalName()));
        }
        throw new NullPointerException("context");
    }

    public static void d(ContentProvider contentProvider) {
        Application application = (Application) contentProvider.getContext().getApplicationContext();
        if (application instanceof h) {
            e(contentProvider, (h) application);
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", application.getClass().getCanonicalName(), h.class.getCanonicalName()));
    }

    private static void e(Object obj, h hVar) {
        b<Object> C = hVar.C();
        yif.h(C, "%s.androidInjector() returned null", hVar.getClass());
        C.a(obj);
    }

    public static void f(c cVar, DispatchingAndroidInjector<Object> dispatchingAndroidInjector) {
        cVar.a = dispatchingAndroidInjector;
    }

    public static <T> DispatchingAndroidInjector<T> g(Map<Class<?>, wlf<b.a<?>>> map, Map<String, wlf<b.a<?>>> map2) {
        return new DispatchingAndroidInjector<>(map, map2);
    }
}

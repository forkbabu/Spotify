package dagger.android.support;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.b;
import dagger.android.h;

public final class a {
    public static void a(Fragment fragment) {
        h hVar;
        Fragment fragment2 = fragment;
        while (true) {
            fragment2 = fragment2.P2();
            if (fragment2 != null) {
                if (fragment2 instanceof h) {
                    hVar = (h) fragment2;
                    break;
                }
            } else {
                c B2 = fragment.B2();
                if (B2 instanceof h) {
                    hVar = (h) B2;
                } else if (B2.getApplication() instanceof h) {
                    hVar = (h) B2.getApplication();
                } else {
                    throw new IllegalArgumentException(String.format("No injector was found for %s", fragment.getClass().getCanonicalName()));
                }
            }
        }
        if (Log.isLoggable("dagger.android.support", 3)) {
            String.format("An injector for %s was found in %s", fragment.getClass().getCanonicalName(), hVar.getClass().getCanonicalName());
        }
        b<Object> C = hVar.C();
        yif.h(C, "%s.androidInjector() returned null", hVar.getClass());
        C.a(fragment);
    }

    public static void b(b bVar, DispatchingAndroidInjector<Object> dispatchingAndroidInjector) {
        bVar.A = dispatchingAndroidInjector;
    }

    public static void c(DaggerAppCompatDialogFragment daggerAppCompatDialogFragment, DispatchingAndroidInjector<Object> dispatchingAndroidInjector) {
        daggerAppCompatDialogFragment.u0 = dispatchingAndroidInjector;
    }

    public static void d(DaggerDialogFragment daggerDialogFragment, DispatchingAndroidInjector<Object> dispatchingAndroidInjector) {
        daggerDialogFragment.u0 = dispatchingAndroidInjector;
    }

    public static void e(DaggerFragment daggerFragment, DispatchingAndroidInjector<Object> dispatchingAndroidInjector) {
        daggerFragment.g0 = dispatchingAndroidInjector;
    }
}

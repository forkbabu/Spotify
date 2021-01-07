package com.spotify.android.glue.patterns.toolbarmenu;

import android.content.Context;
import android.view.Menu;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.util.x;

public class ToolbarConfig {

    public enum Visibility {
        HIDE,
        SHOW,
        ONLY_MAKE_ROOM
    }

    public interface a extends atd {
        Visibility z0();
    }

    public interface b extends atd {
        boolean G();
    }

    public interface c extends atd {
    }

    public interface d extends atd {
    }

    public static a0 a(Context context, Menu menu, com.spotify.music.libs.viewuri.c cVar) {
        return new u(context, menu, new s(cVar));
    }

    public static void b(Context context, d0 d0Var, Menu menu) {
        menu.clear();
        d0Var.g(new u(context, menu, new s(d0Var.getViewUri())));
    }

    public static <T extends Fragment & d0> void c(T t, Menu menu) {
        T t2 = t;
        if (t.e3()) {
            b(t.j4(), t2, menu);
        }
    }

    private static <T extends atd> T d(Fragment fragment, Class<T> cls) {
        if (cls.isAssignableFrom(fragment.getClass())) {
            return (T) ((atd) fragment);
        }
        if (zsd.class.isAssignableFrom(fragment.getClass())) {
            return (T) ((zsd) fragment).U1(cls);
        }
        return null;
    }

    public static boolean e(Context context, Fragment fragment) {
        if (!(context == null || fragment == null)) {
            b bVar = (b) d(fragment, b.class);
            if (bVar != null) {
                return bVar.G();
            }
            if (x.h(context) && d(fragment, d.class) != null) {
                return true;
            }
            if (x.f(context) && d(fragment, c.class) != null) {
                return true;
            }
        }
        return false;
    }

    public static Visibility f(Fragment fragment) {
        a aVar;
        Visibility visibility = Visibility.SHOW;
        return (fragment == null || (aVar = (a) d(fragment, a.class)) == null) ? visibility : aVar.z0();
    }
}

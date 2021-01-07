package androidx.navigation;

import android.view.View;
import android.view.ViewParent;
import com.spotify.music.C0707R;
import java.lang.ref.WeakReference;

public final class u {
    public static NavController a(View view) {
        NavController navController;
        NavController navController2;
        View view2 = view;
        while (true) {
            navController = null;
            if (view2 == null) {
                break;
            }
            Object tag = view2.getTag(C0707R.id.nav_controller_view_tag);
            if (tag instanceof WeakReference) {
                navController2 = (NavController) ((WeakReference) tag).get();
            } else {
                navController2 = tag instanceof NavController ? (NavController) tag : null;
            }
            if (navController2 != null) {
                navController = navController2;
                break;
            }
            ViewParent parent = view2.getParent();
            view2 = parent instanceof View ? (View) parent : null;
        }
        if (navController != null) {
            return navController;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }
}

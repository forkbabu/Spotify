package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import defpackage.rbd;
import io.reactivex.a;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: pcd */
public final class pcd {
    static v a(Context context, SnackbarManager snackbarManager, y yVar, rbd.f fVar) {
        String string = context.getString(C0707R.string.social_listening_notification_snack_you_ended_multi_output_design);
        if (fVar.a()) {
            return a.L(1000, TimeUnit.MILLISECONDS, yVar).l(g(snackbarManager, string)).N();
        }
        return g(snackbarManager, string).N();
    }

    static v f(Context context, SnackbarManager snackbarManager, y yVar, rbd.h hVar) {
        String string = context.getString(C0707R.string.social_listening_notification_snack_you_left_multi_output_design);
        if (hVar.a()) {
            return a.L(1000, TimeUnit.MILLISECONDS, yVar).l(g(snackbarManager, string)).N();
        }
        return g(snackbarManager, string).N();
    }

    private static a g(SnackbarManager snackbarManager, String str) {
        return a.u(new xbd(snackbarManager, str));
    }
}

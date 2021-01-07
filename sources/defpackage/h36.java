package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;

/* renamed from: h36  reason: default package */
public class h36 {
    private final Context a;
    private final SnackbarManager b;

    public h36(Context context, SnackbarManager snackbarManager) {
        this.a = context;
        this.b = snackbarManager;
    }

    public void a() {
        this.b.show(SnackbarConfiguration.builder(this.a.getString(C0707R.string.blend_leave_error)).build());
    }
}

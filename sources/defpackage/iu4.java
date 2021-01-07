package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;

/* renamed from: iu4  reason: default package */
public class iu4 {
    private final Context a;
    private final SnackbarManager b;

    public iu4(Context context, SnackbarManager snackbarManager) {
        this.a = context;
        this.b = snackbarManager;
    }

    public void a(String str) {
        this.b.showOnNextAttach(SnackbarConfiguration.builder(this.a.getString(C0707R.string.toast_added_to_playlist, str)).build());
    }
}

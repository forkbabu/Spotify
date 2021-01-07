package defpackage;

import android.content.res.Resources;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;

/* renamed from: k65  reason: default package */
public class k65 {
    private final SnackbarManager a;
    private final Resources b;

    public k65(SnackbarManager snackbarManager, Resources resources) {
        snackbarManager.getClass();
        this.a = snackbarManager;
        resources.getClass();
        this.b = resources;
    }

    public void a() {
        je.e(C0707R.string.freetier_education_toastie_artist_ban, this.a);
    }

    public void b(String str) {
        this.a.show(SnackbarConfiguration.builder(String.format(this.b.getString(C0707R.string.freetier_artist_snackbar_artist_followed), str)).build());
    }

    public void c(String str) {
        this.a.show(SnackbarConfiguration.builder(String.format(this.b.getString(C0707R.string.freetier_artist_snackbar_artist_unfollowed), str)).build());
    }
}

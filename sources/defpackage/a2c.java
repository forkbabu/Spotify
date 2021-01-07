package defpackage;

import android.view.View;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.music.navigation.t;
import kotlin.jvm.internal.h;

/* renamed from: a2c  reason: default package */
public final class a2c implements z1c {
    private final SnackbarManager a;
    private final t b;

    /* renamed from: a2c$a */
    static final class a implements View.OnClickListener {
        final /* synthetic */ a2c a;

        a(a2c a2c) {
            this.a = a2c;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.b.d("spotify:premium-destination");
        }
    }

    public a2c(SnackbarManager snackbarManager, t tVar) {
        h.e(snackbarManager, "snackbarManager");
        h.e(tVar, "navigator");
        this.a = snackbarManager;
        this.b = tVar;
    }

    @Override // defpackage.z1c
    public void a(View view) {
        h.e(view, "anchor");
        SnackbarConfiguration build = SnackbarConfiguration.builder((int) C0707R.string.npv_free_experience_snackbar_text).actionTextRes(C0707R.string.npv_free_experience_snackbar_action).onClickListener(new a(this)).build();
        SnackbarManager snackbarManager = this.a;
        h.d(build, "configuration");
        snackbarManager.show(build);
    }
}

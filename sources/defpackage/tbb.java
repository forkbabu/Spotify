package defpackage;

import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.music.C0707R;
import com.spotify.music.features.addtoplaylist.d;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: tbb  reason: default package */
public final class tbb implements rbb {
    private final d a;
    private final obb b;

    public tbb(d dVar, obb obb) {
        h.e(dVar, "addToPlaylistNavigator");
        h.e(obb, "snackbarManager");
        this.a = dVar;
        this.b = obb;
    }

    public static final void c(tbb tbb, List list, String str) {
        tbb.a.a(list, str, str);
    }

    @Override // defpackage.rbb
    public void a() {
        obb obb = this.b;
        SnackbarConfiguration a2 = ubb.a();
        h.d(a2, "FAILURE_CONFIG");
        obb.a(a2);
    }

    @Override // defpackage.rbb
    public void b(String str, String str2) {
        h.e(str, "episodeUri");
        h.e(str2, "viewUri");
        SnackbarConfiguration build = SnackbarConfiguration.builder((int) C0707R.string.your_episodes_add_snackbar_success_info_text).actionTextRes(C0707R.string.your_episodes_add_snackbar_success_action_text).onClickListener(new sbb(this, kotlin.collections.d.t(str), str2)).build();
        obb obb = this.b;
        h.d(build, "successConfig");
        obb.a(build);
    }
}

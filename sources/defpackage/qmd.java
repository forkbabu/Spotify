package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import kotlin.f;
import kotlin.jvm.internal.h;

/* renamed from: qmd  reason: default package */
public final class qmd {
    public static final void a(a0 a0Var, cmf<f> cmf) {
        h.e(a0Var, "$this$addShare");
        h.e(cmf, "action");
        a0Var.j(C0707R.id.actionbar_item_share, C0707R.string.actionbar_item_share, l70.i(a0Var.getContext(), SpotifyIconV2.SHARE_ANDROID)).a(new pmd(cmf));
    }
}

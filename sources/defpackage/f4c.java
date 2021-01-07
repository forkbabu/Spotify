package defpackage;

import android.view.ViewGroup;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.scroll.widgets.upnext.a;
import com.spotify.paste.graphics.drawable.d;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import kotlin.jvm.internal.h;
import kotlin.text.e;

/* renamed from: f4c  reason: default package */
public final class f4c {
    private final Picasso a;

    public f4c(Picasso picasso) {
        h.e(picasso, "picasso");
        this.a = picasso;
    }

    public final y90 a(ViewGroup viewGroup, a aVar) {
        h.e(viewGroup, "parent");
        h.e(aVar, "model");
        s0 s0Var = new s0(viewGroup.getContext(), C0707R.style.res_2132083581_theme_upnext);
        y90 j = e90.d().j(s0Var, viewGroup, false);
        j.z0(z42.j(s0Var, SpotifyIconV2.MORE_ANDROID, new svd(s0Var).a(androidx.core.content.a.b(s0Var, C0707R.color.rowAccessory))));
        j.setTitle(aVar.e());
        j.setSubtitle(aVar.d());
        TextLabelUtil.a(s0Var, j.getSubtitleView(), aVar.g());
        TextLabelUtil.b(s0Var, j.getSubtitleView(), aVar.h());
        Picasso picasso = this.a;
        String c = aVar.c();
        if (c == null || e.n(c)) {
            c = null;
        }
        z m = picasso.m(c);
        if (aVar.i()) {
            m.o(rwd.f(j.getImageView(), d.a((float) j.getView().getResources().getDimensionPixelSize(C0707R.dimen.corner_radius))));
        } else {
            m.n(j.getImageView(), null);
        }
        h.d(j, "rowView.apply {\n        …)\n            }\n        }");
        return j;
    }
}

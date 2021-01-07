package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.hubframework.defaults.components.glue.w;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import com.spotify.music.preview.q;
import com.spotify.music.preview.t;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.s51;

/* renamed from: m24  reason: default package */
public class m24 implements s51<View> {
    private final q a;
    private final Picasso b;

    public m24(q qVar, Picasso picasso) {
        this.a = qVar;
        this.b = picasso;
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
        g91.a(view, s81, aVar, iArr);
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        t51.a(w51, view, s81);
        int i = e90.i;
        y90 y90 = (y90) l70.o(view, y90.class);
        w81 text = s81.text();
        y90.setTitle(text.title());
        y90.setSubtitle(text.subtitle());
        int i2 = w.c;
        y90.setAppearsDisabled(s81.custom().boolValue("appearDisabled", false));
        TextView subtitleView = y90.getSubtitleView();
        Context context = subtitleView.getContext();
        TextLabelUtil.b(context, subtitleView, nt2.a(s81));
        TextLabelUtil.a(context, subtitleView, s81.metadata().boolValue("is19plus", false));
        x81 main = s81.images().main();
        Uri uri = null;
        String uri2 = main != null ? main.uri() : null;
        i91.b(w51.b()).e("imageClick").d(s81).c(y90.getImageView()).a();
        i91.b(w51.b()).e("click").d(s81).c(y90.getView()).a();
        i91.b(w51.b()).e("rightAccessoryClick").d(s81).c(y90.W1()).a();
        String str = (String) x.n(s81.metadata().string("preview_id"), "");
        String str2 = (String) x.n(s81.metadata().string("preview_key"), "");
        Picasso picasso = this.b;
        if (uri2 != null) {
            uri = !TextUtils.isEmpty(uri2) ? Uri.parse(uri2) : Uri.EMPTY;
        }
        z l = picasso.l(uri);
        l.s(C0707R.drawable.cat_placeholder_track);
        l.o(t.b(y90.getImageView(), this.a, str, str2));
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        y90 i = e90.d().i(viewGroup.getContext(), viewGroup);
        ImageButton g = z42.g(viewGroup.getContext());
        Context context = viewGroup.getContext();
        g.setImageDrawable(z42.f(context, SpotifyIconV2.PLUS_ALT, a.c(context, R.color.white)));
        i.z0(g);
        return i.getView();
    }
}

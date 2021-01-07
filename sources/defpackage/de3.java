package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.android.paste.app.c;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: de3  reason: default package */
public class de3 implements Object<Button>, pk9 {
    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a aVar, int[] iArr) {
        g91.a((Button) view, s81, aVar, iArr);
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        Button button = (Button) view;
        String icon = s81.images().icon();
        SpotifyIconV2 orNull = !TextUtils.isEmpty(icon) ? n71.a(icon).orNull() : null;
        String title = s81.text().title();
        Context context = button.getContext();
        if (TextUtils.isEmpty(title)) {
            title = "";
        }
        x42.b(context, button, orNull, title);
        t51.a(w51, button, s81);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.fixed_size_hubs_shuffle_button;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        Context context = viewGroup.getContext();
        Button a = c.g().a(context);
        a.addOnAttachStateChangeListener(new ce3(this, context, new be3(this, a)));
        return a;
    }
}

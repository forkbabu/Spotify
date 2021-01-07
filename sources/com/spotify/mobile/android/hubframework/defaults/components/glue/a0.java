package com.spotify.mobile.android.hubframework.defaults.components.glue;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.android.paste.app.c;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.mobile.android.util.x;
import defpackage.s51;
import java.util.EnumSet;

class a0 implements d<Button> {
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
        if (x.f(button.getContext())) {
            l70.a(button, title, orNull);
        } else {
            Context context = button.getContext();
            if (TextUtils.isEmpty(title)) {
                title = "";
            }
            x42.b(context, button, orNull, title);
        }
        t51.a(w51, button, s81);
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        Button button;
        Context context = viewGroup.getContext();
        if (x.f(viewGroup.getContext())) {
            button = l70.h(viewGroup.getContext(), "", SpotifyIconV2.PLAY, null);
        } else {
            button = c.g().a(viewGroup.getContext());
        }
        button.addOnAttachStateChangeListener(new z(this, context, new y(this, button)));
        return button;
    }
}

package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.common.base.Optional;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;
import com.spotify.android.glue.patterns.header.headers.d;
import com.spotify.android.glue.patterns.prettylist.r;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.squareup.picasso.z;

class c0 implements d {
    final /* synthetic */ GlueHeaderView a;
    final /* synthetic */ s81 b;
    final /* synthetic */ d0 c;

    class a extends dwd {
        a() {
        }

        @Override // defpackage.dwd
        public void onColorExtracted(int i) {
            c0.this.a.setColor(i);
        }
    }

    c0(d0 d0Var, GlueHeaderView glueHeaderView, s81 s81) {
        this.c = d0Var;
        this.a = glueHeaderView;
        this.b = s81;
    }

    @Override // com.spotify.android.glue.patterns.header.headers.d
    public void a(r rVar) {
        Drawable drawable;
        ImageView backgroundImageView = rVar.getBackgroundImageView();
        d0.a(this.c).a(backgroundImageView);
        this.a.setColor(0);
        x81 background = this.b.images().background();
        if (background != null) {
            String placeholder = background.placeholder();
            String uri = background.uri();
            if (uri != null) {
                Context context = this.a.getContext();
                if (placeholder == null) {
                    drawable = null;
                } else {
                    drawable = yc0.d(context, n71.a(placeholder).or((Optional<SpotifyIconV2>) SpotifyIconV2.TRACK), (float) nud.g(64.0f, context.getResources()));
                }
                z m = this.c.a.f().m(uri);
                m.t(drawable);
                m.o(rwd.h(backgroundImageView, new a()));
                return;
            }
            d0.a(this.c).g(backgroundImageView, placeholder);
        }
    }
}

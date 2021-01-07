package com.spotify.mobile.android.hubframework.defaults.components.glue;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;
import com.spotify.android.glue.patterns.header.headers.d;
import com.spotify.android.glue.patterns.prettylist.r;
import com.spotify.mobile.android.hubframework.defaults.components.glue.n;
import com.squareup.picasso.z;

class p implements d {
    final /* synthetic */ Integer a;
    final /* synthetic */ GlueHeaderView b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ x81 e;
    final /* synthetic */ n.c f;

    class a extends dwd {
        a() {
        }

        @Override // defpackage.dwd
        public void onColorExtracted(int i) {
            p.this.b.setColor(i);
        }
    }

    p(n.c cVar, Integer num, GlueHeaderView glueHeaderView, String str, String str2, x81 x81) {
        this.f = cVar;
        this.a = num;
        this.b = glueHeaderView;
        this.c = str;
        this.d = str2;
        this.e = x81;
    }

    @Override // com.spotify.android.glue.patterns.header.headers.d
    public void a(r rVar) {
        ImageView backgroundImageView = rVar.getBackgroundImageView();
        this.f.i().a(backgroundImageView);
        Integer num = this.a;
        this.b.setColor(num == null ? 0 : num.intValue());
        if (this.c != null) {
            Drawable a2 = n.a(this.b.getContext(), this.d);
            z m = this.f.i().f().m(this.c);
            m.t(a2);
            if (this.a == null) {
                m.o(rwd.h(backgroundImageView, new a()));
            } else {
                m.n(backgroundImageView, null);
            }
        } else if (this.e != null) {
            this.f.i().g(backgroundImageView, this.d);
        }
    }
}

package com.spotify.music.features.browse.component.findcard;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.google.common.base.Optional;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.debugtools.flags.DebugFlag;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import com.squareup.picasso.z;
import defpackage.s51;

public class f extends e {
    private final d b;
    private final u64 c;
    private final HubsGlueImageDelegate f;
    private final Picasso n;
    private final int o;

    public f(d dVar, u64 u64, HubsGlueImageDelegate hubsGlueImageDelegate, Picasso picasso) {
        super(dVar.e());
        this.b = dVar;
        this.c = u64;
        hubsGlueImageDelegate.getClass();
        this.f = hubsGlueImageDelegate;
        picasso.getClass();
        this.n = picasso;
        this.o = nud.g(8.0f, dVar.e().getContext().getResources());
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c.a
    public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        g91.a(this.a, s81, aVar, iArr);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c.a
    public void z(s81 s81, w51 w51, s51.b bVar) {
        this.b.k(s81.text().title());
        Optional fromNullable = Optional.fromNullable(s81.images().main());
        if (fromNullable.isPresent()) {
            f0 c2 = this.b.c();
            x81 x81 = (x81) fromNullable.get();
            Drawable e = this.f.e(x81.placeholder(), HubsGlueImageConfig.CARD);
            z l = this.n.l(this.f.b(x81.uri()));
            l.t(e);
            l.g(e);
            l.o(c2);
        }
        String string = s81.custom().string("backgroundColor");
        if (!TextUtils.isEmpty(string)) {
            try {
                this.c.a(this.b, Color.parseColor(string));
            } catch (IllegalArgumentException e2) {
                Assertion.i("Cannot parse color: " + string, e2);
            }
        } else {
            StringBuilder V0 = je.V0("Card has no background color. title=");
            V0.append(s81.text().title());
            V0.append(" backgroundImage=");
            V0.append(s81.images().background());
            Assertion.g(V0.toString());
        }
        x81 main = s81.images().main();
        if (!"rounded".equalsIgnoreCase(main != null ? main.custom().string("style") : null)) {
            DebugFlag debugFlag = DebugFlag.FIND_CARD_ROUNDED_CORNERS;
            this.b.i(0.0f);
        } else {
            this.b.i((float) this.o);
        }
        View a = this.b.a();
        i91.b(w51.b()).e("click").d(s81).c(a).a();
        bvd b2 = dvd.b(a);
        b2.g(this.b.d());
        b2.a();
    }
}

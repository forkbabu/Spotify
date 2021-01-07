package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ui.BadgesFactory;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.fa0;
import defpackage.s51;
import java.util.EnumSet;

public abstract class p<T extends fa0> extends i<T> {
    private final HubsGlueImageDelegate c;
    private final BadgesFactory f;

    public static class a extends p<u90> {
        public a(HubsGlueImageDelegate hubsGlueImageDelegate, BadgesFactory badgesFactory) {
            super(hubsGlueImageDelegate, badgesFactory, u90.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public /* bridge */ /* synthetic */ void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
            i((u90) g90, s81, w51);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            return j(context, viewGroup);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [fa0, s81] */
        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.p
        public void g(u90 u90, s81 s81) {
            a.b(u90, s81);
        }

        /* access modifiers changed from: protected */
        public fa0 j(Context context, ViewGroup viewGroup) {
            return e90.d().d(context, viewGroup);
        }
    }

    public static class b extends p<y90> {
        public b(HubsGlueImageDelegate hubsGlueImageDelegate, BadgesFactory badgesFactory) {
            super(hubsGlueImageDelegate, badgesFactory, y90.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public /* bridge */ /* synthetic */ void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
            i((y90) g90, s81, w51);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            return j(context, viewGroup);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [fa0, s81] */
        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.p
        public void g(y90 y90, s81 s81) {
            a.c(y90, s81);
        }

        /* access modifiers changed from: protected */
        public fa0 j(Context context, ViewGroup viewGroup) {
            return e90.d().j(context, viewGroup, false);
        }
    }

    protected p(HubsGlueImageDelegate hubsGlueImageDelegate, BadgesFactory badgesFactory, Class<T> cls) {
        super(EnumSet.of(GlueLayoutTraits.Trait.STACKABLE), cls);
        hubsGlueImageDelegate.getClass();
        this.c = hubsGlueImageDelegate;
        this.f = badgesFactory;
    }

    /* access modifiers changed from: protected */
    public abstract void g(T t, s81 s81);

    /* JADX WARN: Incorrect args count in method signature: (TT;Ls81;Lw51;Ls51$b;)V */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: fa0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    public void i(fa0 fa0, s81 s81, w51 w51) {
        i91.a(fa0.getView());
        g(fa0, s81);
        t51.a(w51, fa0.getView(), s81);
        if (s81.events().containsKey("longClick")) {
            i91.b(w51.b()).e("longClick").d(s81).c(fa0.getView()).b();
        }
        Assertion.l(s81.images().main() != null, "main image is missing");
        ImageView imageView = fa0.getImageView();
        x81 main = s81.images().main();
        Picasso f2 = this.c.f();
        if (main != null) {
            Drawable e = this.c.e(main.placeholder(), HubsGlueImageConfig.THUMBNAIL);
            z l = f2.l(this.c.b(main.uri()));
            l.t(e);
            l.g(e);
            Context context = imageView.getContext();
            BadgesFactory badgesFactory = this.f;
            pud a2 = HubsGlueImageSettings.Style.CIRCULAR == a.d(main.custom().string("style")) ? com.spotify.paste.graphics.drawable.b.a() : null;
            yvd yvd = a2;
            if ("verified".equals(main.custom().get("badge"))) {
                BadgesFactory.BadgeSize a3 = com.spotify.mobile.android.hubframework.defaults.components.common.a.a(HubsGlueImageDelegate.ImageConfig.ImageSize.SMALL);
                badgesFactory.getClass();
                yvd = new yvd(new com.spotify.mobile.android.util.ui.a(BadgesFactory.Badge.VERIFIED, context, a3), a2, context);
            }
            if (yvd == null) {
                l.m(imageView);
            } else {
                l.o(rwd.g(imageView, yvd, null));
            }
        } else {
            f2.b(imageView);
            imageView.setImageDrawable(null);
        }
        Optional<SpotifyIconV2> a4 = n71.a((String) s81.custom().get("accessoryRightIcon"));
        if (a4.isPresent()) {
            View k = z42.k(fa0.getView().getContext(), a4.get());
            if (s81.events().containsKey("rightAccessoryClick")) {
                i91.b(w51.b()).e("rightAccessoryClick").d(s81).c(k).a();
            }
            fa0.z0(k);
        } else {
            fa0.z0(null);
        }
        fa0.setActive(s81.custom().boolValue("active", false));
    }
}

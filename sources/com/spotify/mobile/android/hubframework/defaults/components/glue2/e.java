package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.common.base.MoreObjects;
import com.spotify.android.glue.components.card.Card;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.CardAccessoryDrawable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.c0;
import com.squareup.picasso.h0;
import com.squareup.picasso.r;
import com.squareup.picasso.z;
import defpackage.s51;
import java.util.EnumSet;

abstract class e<C extends Card> extends i<C> {
    private final HubsGlueImageDelegate c;

    /* access modifiers changed from: private */
    public static final class b {
        private static final kg0<CardAccessoryDrawable.Size> a = kg0.a(CardAccessoryDrawable.Size.class);
    }

    static final class c extends e<Card> {
        c(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, Card.class, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            Card a = e90.a().a(context, viewGroup);
            ((com.spotify.android.glue.components.card.glue.a) a).setTextLayout(Card.TextLayout.DOUBLE_LINE_TITLE);
            return a;
        }
    }

    static final class d extends e<Card> {
        d(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(EnumSet.of(GlueLayoutTraits.Trait.BIG_CARD), hubsGlueImageDelegate, Card.class, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            Card b = e90.a().b(context, viewGroup);
            ((com.spotify.android.glue.components.card.glue.a) b).setTextLayout(Card.TextLayout.DOUBLE_LINE_TITLE);
            return b;
        }
    }

    /* renamed from: com.spotify.mobile.android.hubframework.defaults.components.glue2.e$e  reason: collision with other inner class name */
    static final class C0180e extends e<Card> {
        C0180e(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(EnumSet.of(GlueLayoutTraits.Trait.BIG_CARD), hubsGlueImageDelegate, Card.class, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.e, com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
            Card card = (Card) g90;
            x81 main = s81.images().main();
            Assertion.m(main != null, "main image missing, id=%s", s81.id());
            l(card.getImageView(), main);
            i91.a(card.getView());
            card.setAccessoryDrawable(e.k(card.getView().getContext(), s81.custom()));
            t51.a(w51, card.getView(), s81);
            if (s81.events().containsKey("longClick")) {
                i91.b(w51.b()).e("longClick").d(s81).c(card.getView()).b();
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            Card c = e90.a().c(context, viewGroup);
            ((com.spotify.android.glue.components.card.glue.a) c).setTextLayout(Card.TextLayout.DOUBLE_LINE_TITLE);
            return c;
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.e
        public void j(Card card, s81 s81, w51 w51, s51.b bVar) {
            x81 main = s81.images().main();
            Assertion.m(main != null, "main image missing, id=%s", s81.id());
            l(card.getImageView(), main);
            i91.a(card.getView());
            card.setAccessoryDrawable(e.k(card.getView().getContext(), s81.custom()));
            t51.a(w51, card.getView(), s81);
            if (s81.events().containsKey("longClick")) {
                i91.b(w51.b()).e("longClick").d(s81).c(card.getView()).b();
            }
        }
    }

    static final class f extends e<com.spotify.android.glue.components.card.a> {
        f(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, com.spotify.android.glue.components.card.a.class, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.e, com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public /* bridge */ /* synthetic */ void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
            a((com.spotify.android.glue.components.card.a) g90, s81, w51, bVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            com.spotify.android.glue.components.card.a g = e90.a().g(context, viewGroup);
            ((com.spotify.android.glue.components.card.glue.a) g).setTextLayout(Card.TextLayout.DOUBLE_LINE_TITLE);
            return g;
        }
    }

    static final class g extends i {
        g(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            com.spotify.android.glue.components.card.b e = e90.a().e(context, viewGroup);
            ((com.spotify.android.glue.components.card.glue.a) e).setTextLayout(Card.TextLayout.DOUBLE_LINE_TITLE);
            return e;
        }
    }

    static final class h extends i {
        h(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            com.spotify.android.glue.components.card.b f = e90.a().f(context, viewGroup);
            ((com.spotify.android.glue.components.card.glue.a) f).setTextLayout(Card.TextLayout.DOUBLE_LINE_TITLE);
            return f;
        }
    }

    static abstract class i extends e<com.spotify.android.glue.components.card.b> {
        i(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, com.spotify.android.glue.components.card.b.class, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.e, com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
            com.spotify.android.glue.components.card.b bVar2 = (com.spotify.android.glue.components.card.b) g90;
            a(bVar2, s81, w51, bVar);
            bVar2.setSubtitle(s81.text().subtitle());
        }
    }

    e(HubsGlueImageDelegate hubsGlueImageDelegate, Class cls, a aVar) {
        super(EnumSet.of(GlueLayoutTraits.Trait.CARD, GlueLayoutTraits.Trait.ONE_COLUMN), cls);
        hubsGlueImageDelegate.getClass();
        this.c = hubsGlueImageDelegate;
    }

    /* access modifiers changed from: private */
    public static CardAccessoryDrawable k(Context context, p81 p81) {
        CardAccessoryDrawable.Size size;
        int i2;
        SpotifyIconV2 orNull = n71.a(p81.string("accessoryIcon", "")).orNull();
        if (orNull == null) {
            return null;
        }
        String string = p81.string("accessorySize");
        try {
            size = (CardAccessoryDrawable.Size) b.a.g(string);
        } catch (Exception unused) {
            je.p("Failed to parse size: ", string);
            size = CardAccessoryDrawable.Size.SMALL;
        }
        String string2 = p81.string("accessoryColor", "");
        try {
            i2 = Color.parseColor(string2);
        } catch (Exception unused2) {
            je.p("Failed to parse color: ", string2);
            i2 = -65536;
        }
        return CardAccessoryDrawable.a(context, i2, size, orNull);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void l(ImageView imageView, x81 x81) {
        HubsGlueImageSettings.Style style;
        h0 h0Var;
        Picasso f2 = this.c.f();
        if (x81 == null || f2 == null) {
            if (f2 != null) {
                f2.b(imageView);
            }
            imageView.setImageDrawable(null);
            return;
        }
        Drawable e = this.c.e(x81.placeholder(), HubsGlueImageConfig.CARD);
        Object obj = x81.custom().get("style");
        if (obj instanceof HubsGlueImageSettings.Style) {
            style = (HubsGlueImageSettings.Style) obj;
        } else {
            style = a.d(x81.custom().string("style"));
        }
        pud a2 = style == HubsGlueImageSettings.Style.CIRCULAR ? com.spotify.paste.graphics.drawable.b.a() : null;
        z c2 = new r(new c0(f2), imageView.getContext()).c(this.c.b(x81.uri()));
        c2.t(e);
        c2.g(e);
        int ordinal = style.ordinal();
        if (ordinal == 2) {
            h0Var = this.c.c().a();
        } else if (ordinal != 3) {
            h0Var = gwd.c();
        } else {
            h0Var = this.c.c().c();
        }
        c2.x(h0Var);
        if (a2 == null) {
            c2.m(imageView);
        } else {
            c2.o(rwd.g(imageView, a2, null));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void a(C c2, s81 s81, w51 w51, s51.b bVar) {
        Drawable drawable;
        String title = s81.text().title();
        Assertion.m(!MoreObjects.isNullOrEmpty(title), "title is missing, id=%s", s81.id());
        x81 main = s81.images().main();
        Assertion.m(main != null, "main image missing, id=%s", s81.id());
        l(c2.getImageView(), main);
        Context context = c2.getView().getContext();
        String nullToEmpty = MoreObjects.nullToEmpty(s81.custom().string("titleBadge"));
        if (s81.custom().boolValue("isFresh", false)) {
            drawable = androidx.core.content.a.d(context, C0707R.drawable.freshness_badge);
        } else {
            drawable = nullToEmpty.equals("shuffle") ? l70.f(context) : null;
        }
        c2.m0(title, drawable);
        i91.a(c2.getView());
        c2.setAccessoryDrawable(k(c2.getView().getContext(), s81.custom()));
        t51.a(w51, c2.getView(), s81);
        if (s81.events().containsKey("longClick")) {
            i91.b(w51.b()).e("longClick").d(s81).c(c2.getView()).b();
        }
    }

    e(EnumSet enumSet, HubsGlueImageDelegate hubsGlueImageDelegate, Class cls, a aVar) {
        super(enumSet, cls);
        hubsGlueImageDelegate.getClass();
        this.c = hubsGlueImageDelegate;
    }
}

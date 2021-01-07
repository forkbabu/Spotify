package com.spotify.mobile.android.hubframework.defaults.components.glue;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.common.base.Optional;
import com.spotify.android.glue.components.card.Card;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueCard;
import defpackage.s51;
import java.util.EnumSet;

abstract class f<C extends Card> extends h<C> {
    private final HubsGlueImageDelegate c;

    static final class b extends f<Card> {
        b(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, Card.class, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.h
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            return e90.a().d(context, viewGroup);
        }
    }

    static final class c extends f<com.spotify.android.glue.components.card.a> {
        c(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, com.spotify.android.glue.components.card.a.class, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.f, com.spotify.mobile.android.hubframework.defaults.components.glue.h
        public void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
            com.spotify.android.glue.components.card.a aVar = (com.spotify.android.glue.components.card.a) g90;
            i(aVar, s81, w51);
            aVar.setTitle(HubsGlueCard.Settings.d(s81));
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.h
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            return e90.a().g(context, viewGroup);
        }
    }

    static final class d extends f<com.spotify.android.glue.components.card.b> {
        d(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, com.spotify.android.glue.components.card.b.class, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.f, com.spotify.mobile.android.hubframework.defaults.components.glue.h
        public void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
            com.spotify.android.glue.components.card.b bVar2 = (com.spotify.android.glue.components.card.b) g90;
            i(bVar2, s81, w51);
            bVar2.setTitle(HubsGlueCard.Settings.d(s81));
            bVar2.setSubtitle(HubsGlueCard.Settings.c(s81));
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.h
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            return e90.a().e(context, viewGroup);
        }
    }

    static final class e extends f<com.spotify.android.glue.components.card.b> {
        e(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, com.spotify.android.glue.components.card.b.class, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.f, com.spotify.mobile.android.hubframework.defaults.components.glue.h
        public void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
            com.spotify.android.glue.components.card.b bVar2 = (com.spotify.android.glue.components.card.b) g90;
            i(bVar2, s81, w51);
            bVar2.setTitle(HubsGlueCard.Settings.d(s81));
            CharSequence c = HubsGlueCard.Settings.c(s81);
            if (TextUtils.isEmpty(c)) {
                c = HubsGlueCard.Settings.b(s81);
            }
            bVar2.setSubtitle(c);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.h
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            return e90.a().f(context, viewGroup);
        }
    }

    f(HubsGlueImageDelegate hubsGlueImageDelegate, Class cls, a aVar) {
        super(EnumSet.of(GlueLayoutTraits.Trait.CARD, GlueLayoutTraits.Trait.ONE_COLUMN), cls);
        hubsGlueImageDelegate.getClass();
        this.c = hubsGlueImageDelegate;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.h
    public /* bridge */ /* synthetic */ void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
        i((Card) g90, s81, w51);
    }

    /* JADX WARN: Incorrect args count in method signature: (TC;Ls81;Lw51;Ls51$b;)V */
    /* access modifiers changed from: protected */
    public void i(Card card, s81 s81, w51 w51) {
        HubsGlueCard.Settings.TextLayout textLayout;
        this.c.d(card.getImageView(), s81.images().main(), HubsGlueImageConfig.CARD);
        Object obj = s81.custom().get("textLayout");
        if (obj instanceof HubsGlueCard.Settings.TextLayout) {
            textLayout = (HubsGlueCard.Settings.TextLayout) obj;
        } else if (obj instanceof String) {
            textLayout = (HubsGlueCard.Settings.TextLayout) HubsGlueCard.Settings.TextLayout.a.a.f(obj.toString()).or((Optional) HubsGlueCard.Settings.TextLayout.DEFAULT);
        } else {
            textLayout = HubsGlueCard.Settings.TextLayout.DEFAULT;
        }
        card.setTextLayout(textLayout.h());
        i91.a(card.getView());
        t51.a(w51, card.getView(), s81);
        if (s81.events().containsKey("longClick")) {
            i91.b(w51.b()).e("longClick").d(s81).c(card.getView()).b();
        }
    }
}

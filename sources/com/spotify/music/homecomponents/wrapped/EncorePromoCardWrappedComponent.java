package com.spotify.music.homecomponents.wrapped;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;
import kotlin.jvm.internal.h;
import libs.encore.consumer.components.promo.api.wrapped.PromoCardWrapped$Events;
import libs.encore.consumer.components.promo.api.wrapped.a;
import libs.encore.consumer.components.promo.api.wrapped.b;

public final class EncorePromoCardWrappedComponent extends qk9<Holder> {
    private final ComponentFactory<Component<b, PromoCardWrapped$Events>, a> a;
    private final com.spotify.music.homecomponents.promotionv2.encore.b b;

    public static final class Holder extends s51.c.a<View> {
        private s81 b = HubsImmutableComponentModel.Companion.a().l();
        private final Component<b, PromoCardWrapped$Events> c;
        private final com.spotify.music.homecomponents.promotionv2.encore.b f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Holder(Component<b, PromoCardWrapped$Events> component, com.spotify.music.homecomponents.promotionv2.encore.b bVar) {
            super(component.getView());
            h.e(component, "card");
            h.e(bVar, "listener");
            this.c = component;
            this.f = bVar;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            je.h(s81, "model", aVar, "action", iArr, "indexPath");
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            h.e(s81, "data");
            h.e(w51, "config");
            h.e(bVar, "state");
            this.b = s81;
            Component<b, PromoCardWrapped$Events> component = this.c;
            String title = s81.text().title();
            String str = "";
            if (title == null) {
                title = str;
            }
            String subtitle = this.b.text().subtitle();
            if (subtitle != null) {
                str = subtitle;
            }
            component.render(new b(title, str));
            this.c.onEvent(new EncorePromoCardWrappedComponent$Holder$onBind$1(this, s81));
        }
    }

    public EncorePromoCardWrappedComponent(ComponentFactory<Component<b, PromoCardWrapped$Events>, a> componentFactory, com.spotify.music.homecomponents.promotionv2.encore.b bVar) {
        h.e(componentFactory, "cardFactory");
        h.e(bVar, "listener");
        this.a = componentFactory;
        this.b = bVar;
    }

    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        return new Holder(this.a.make(), this.b);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.encore_promo_card_wrapped;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
        h.d(of, "EnumSet.of(Trait.STACKABLE)");
        return of;
    }
}

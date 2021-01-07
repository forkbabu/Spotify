package com.spotify.music.homecomponents.promotionv2.encore;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.promo.api.promocard.PromoCardHome;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.C0707R;
import com.spotify.music.homecomponents.promotionv2.HomePromotionPlayClickCommandHandler;
import com.spotify.player.model.PlayerState;
import defpackage.s51;
import io.reactivex.disposables.a;
import io.reactivex.g;
import io.reactivex.y;
import java.util.EnumSet;
import kotlin.jvm.internal.h;

public final class EncorePromoCardHomeComponent extends qk9<Holder> {
    private final a a = new a();
    private final ComponentFactory<Component<PromoCardHome.Model, PromoCardHome.Events>, PromoCardHome.Configuration> b;
    private final w50 c;
    private final g<PlayerState> f;
    private final b n;
    private final mq9 o;
    private final y p;

    public static final class Holder extends s51.c.a<View> {
        private final Component<PromoCardHome.Model, PromoCardHome.Events> b;
        private final b c;
        private final g<PlayerState> f;
        private final y n;
        private final w50 o;
        private final mq9 p;
        private final io.reactivex.disposables.a q;

        static final class a<T> implements io.reactivex.functions.g<PlayerState> {
            final /* synthetic */ Holder a;
            final /* synthetic */ PromoCardHome.Model b;
            final /* synthetic */ String c;

            a(Holder holder, PromoCardHome.Model model, String str) {
                this.a = holder;
                this.b = model;
                this.c = str;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // io.reactivex.functions.g
            public void accept(PlayerState playerState) {
                PlayerState playerState2 = playerState;
                h.e(playerState2, "playerState");
                this.a.b.render(PromoCardHome.Model.copy$default(this.b, null, null, null, null, false, HomePromotionPlayClickCommandHandler.e(playerState2, this.c), 0, 95, null));
            }
        }

        static final class b<T> implements io.reactivex.functions.g<Throwable> {
            final /* synthetic */ Holder a;
            final /* synthetic */ PromoCardHome.Model b;

            b(Holder holder, PromoCardHome.Model model) {
                this.a = holder;
                this.b = model;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // io.reactivex.functions.g
            public void accept(Throwable th) {
                Throwable th2 = th;
                h.e(th2, AppProtocol.LogMessage.SEVERITY_ERROR);
                Logger.e(th2, "Error subscribing to player state from EncorePromoCardHomeComponent.", new Object[0]);
                this.a.b.render(PromoCardHome.Model.copy$default(this.b, null, null, null, null, false, false, 0, 95, null));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Holder(Component<PromoCardHome.Model, PromoCardHome.Events> component, b bVar, g<PlayerState> gVar, y yVar, w50 w50, mq9 mq9, io.reactivex.disposables.a aVar) {
            super(component.getView());
            h.e(component, "card");
            h.e(bVar, "listener");
            h.e(gVar, "playerStateObs");
            h.e(yVar, "mainScheduler");
            h.e(w50, "homeSizeItemLogger");
            h.e(mq9, "oneShotPreDrawListener");
            h.e(aVar, "disposables");
            this.b = component;
            this.c = bVar;
            this.f = gVar;
            this.n = yVar;
            this.o = w50;
            this.p = mq9;
            this.q = aVar;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            je.h(s81, "model", aVar, "action", iArr, "indexPath");
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            int i;
            PromoCardHome.Headline headline;
            String str;
            h.e(s81, "data");
            h.e(w51, "config");
            h.e(bVar, "state");
            String string = s81.custom().string("accentColor");
            if (sq9.c(string)) {
                i = Color.parseColor(string);
            } else {
                i = androidx.core.content.a.b(this.b.getView().getContext(), R.color.white);
            }
            x81 background = s81.images().background();
            String str2 = null;
            String uri = background != null ? background.uri() : null;
            String str3 = uri != null ? uri : "";
            x81 x81 = (x81) s81.images().custom().get("logo");
            if (x81 != null) {
                str2 = x81.uri();
            }
            boolean containsKey = s81.events().containsKey("promotionPlayClick");
            String string2 = s81.custom().string("label");
            if (string2 == null) {
                string2 = "";
            }
            if (str2 != null) {
                String title = s81.text().title();
                if (title == null) {
                    title = "";
                }
                headline = new PromoCardHome.Headline.Logo(str2, title);
            } else {
                String title2 = s81.text().title();
                if (title2 == null) {
                    title2 = "";
                }
                headline = new PromoCardHome.Headline.Text(title2);
            }
            String subtitle = s81.text().subtitle();
            if (subtitle != null) {
                str = subtitle;
            } else {
                str = "";
            }
            PromoCardHome.Model model = new PromoCardHome.Model(string2, headline, str, str3, containsKey, false, i);
            o81 o81 = (o81) s81.events().get("promotionPlayClick");
            if (o81 != null) {
                this.q.b(this.f.Q(this.n).subscribe(new a(this, model, HomePromotionPlayClickCommandHandler.d(o81)), new b(this, model)));
            } else {
                this.b.render(model);
            }
            this.b.onEvent(new EncorePromoCardHomeComponent$Holder$onBind$3(this, s81));
            mq9 mq9 = this.p;
            V v = this.a;
            h.d(v, "view");
            mq9.a(v, new EncorePromoCardHomeComponent$Holder$onBind$4(this, s81));
        }
    }

    public EncorePromoCardHomeComponent(n nVar, ComponentFactory<Component<PromoCardHome.Model, PromoCardHome.Events>, PromoCardHome.Configuration> componentFactory, w50 w50, g<PlayerState> gVar, b bVar, mq9 mq9, y yVar) {
        h.e(nVar, "lifecycleOwner");
        h.e(componentFactory, "cardFactory");
        h.e(w50, "homeSizeItemLogger");
        h.e(gVar, "playerStateObs");
        h.e(bVar, "promoCardInteractionListener");
        h.e(mq9, "oneShotPreDrawListener");
        h.e(yVar, "mainScheduler");
        this.b = componentFactory;
        this.c = w50;
        this.f = gVar;
        this.n = bVar;
        this.o = mq9;
        this.p = yVar;
        nVar.A().a(new m(this) {
            /* class com.spotify.music.homecomponents.promotionv2.encore.EncorePromoCardHomeComponent.AnonymousClass1 */
            final /* synthetic */ EncorePromoCardHomeComponent a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.a = r1;
            }

            @w(Lifecycle.Event.ON_STOP)
            public final void onStop() {
                this.a.a.f();
            }
        });
    }

    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        return new Holder(this.b.make(), this.n, this.f, this.p, this.c, this.o, this.a);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.encore_promo_card_home;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.TOP_ITEM);
        h.d(of, "EnumSet.of(GlueLayoutTraits.Trait.TOP_ITEM)");
        return of;
    }
}

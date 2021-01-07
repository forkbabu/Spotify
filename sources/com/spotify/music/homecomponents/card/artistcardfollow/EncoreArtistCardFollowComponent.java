package com.spotify.music.homecomponents.card.artistcardfollow;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.artist.api.artistcardfollow.ArtistCardFollow;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;
import kotlin.jvm.internal.h;

public final class EncoreArtistCardFollowComponent extends qk9<Holder> implements m {
    private final aq9 a;
    private final b b;
    private final wlf<Component<ArtistCardFollow.Model, ArtistCardFollow.Events>> c;

    public static final class Holder extends s51.c.a<View> {
        private s81 b = HubsImmutableComponentModel.Companion.a().l();
        private String c;
        private final Component<ArtistCardFollow.Model, ArtistCardFollow.Events> f;
        private final b n;
        private final aq9 o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Holder(Component<ArtistCardFollow.Model, ArtistCardFollow.Events> component, b bVar, aq9 aq9) {
            super(component.getView());
            h.e(component, "card");
            h.e(bVar, "listener");
            h.e(aq9, "homeFollowManager");
            this.f = component;
            this.n = bVar;
            this.o = aq9;
        }

        public static final /* synthetic */ String B(Holder holder) {
            String str = holder.c;
            if (str != null) {
                return str;
            }
            h.k("artistUri");
            throw null;
        }

        /* access modifiers changed from: private */
        public final ArtistCardFollow.Model F() {
            String title = this.b.text().title();
            String str = "";
            if (title == null) {
                title = str;
            }
            x81 main = this.b.images().main();
            String uri = main != null ? main.uri() : null;
            if (uri != null) {
                str = uri;
            }
            Artwork.ImageData imageData = new Artwork.ImageData(str);
            aq9 aq9 = this.o;
            String str2 = this.c;
            if (str2 != null) {
                return new ArtistCardFollow.Model(title, imageData, aq9.f(str2));
            }
            h.k("artistUri");
            throw null;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            je.h(s81, "model", aVar, "action", iArr, "indexPath");
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            p81 data;
            h.e(s81, "hubsModel");
            h.e(w51, "config");
            h.e(bVar, "state");
            this.b = s81;
            h.e(s81, "cardModel");
            o81 o81 = (o81) s81.events().get("followClick");
            String string = (o81 == null || (data = o81.data()) == null) ? null : data.string("uri");
            if (string == null || string.length() == 0) {
                Logger.d("ArtistCardFollow: Failed to get artist URI from the follow click event model.", new Object[0]);
            }
            this.c = String.valueOf(string);
            this.f.render(F());
            this.f.onEvent(new EncoreArtistCardFollowComponent$Holder$onBind$1(this, s81));
        }
    }

    public EncoreArtistCardFollowComponent(aq9 aq9, b bVar, wlf<Component<ArtistCardFollow.Model, ArtistCardFollow.Events>> wlf, n nVar) {
        h.e(aq9, "homeFollowManager");
        h.e(bVar, "clickListener");
        h.e(wlf, "artistCardFollowProvider");
        h.e(nVar, "lifecycleOwner");
        this.a = aq9;
        this.b = bVar;
        this.c = wlf;
        nVar.A().a(this);
    }

    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        Component<ArtistCardFollow.Model, ArtistCardFollow.Events> component = this.c.get();
        h.d(component, "artistCardFollowProvider.get()");
        return new Holder(component, this.b, this.a);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.home_inline_onboarding_card_component;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.CARD, GlueLayoutTraits.Trait.ONE_COLUMN);
        h.d(of, "EnumSet.of(GlueLayoutTra…tTraits.Trait.ONE_COLUMN)");
        return of;
    }

    @w(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        this.a.c();
    }
}

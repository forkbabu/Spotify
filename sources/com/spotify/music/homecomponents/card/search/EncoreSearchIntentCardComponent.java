package com.spotify.music.homecomponents.card.search;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.api.searchintentcard.SearchIntentCard;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;
import kotlin.jvm.internal.h;

public final class EncoreSearchIntentCardComponent implements Object<View>, pk9 {
    private Component<SearchIntentCard.Model, SearchIntentCard.Events> a;
    private final ComponentFactory<Component<SearchIntentCard.Model, SearchIntentCard.Events>, SearchIntentCard.Configuration> b;
    private final c c;

    public EncoreSearchIntentCardComponent(ComponentFactory<Component<SearchIntentCard.Model, SearchIntentCard.Events>, SearchIntentCard.Configuration> componentFactory, c cVar) {
        h.e(componentFactory, "cardFactory");
        h.e(cVar, "listener");
        this.b = componentFactory;
        this.c = cVar;
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
        h.e(view, "view");
        h.e(s81, "model");
        h.e(aVar, "action");
        h.e(iArr, "indexPath");
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        h.e(view, "view");
        h.e(s81, "data");
        h.e(w51, "config");
        h.e(bVar, "state");
        Component<SearchIntentCard.Model, SearchIntentCard.Events> component = this.a;
        if (component != null) {
            String title = s81.text().title();
            if (title == null) {
                title = "";
            }
            component.render(new SearchIntentCard.Model(title));
            Component<SearchIntentCard.Model, SearchIntentCard.Events> component2 = this.a;
            if (component2 != null) {
                component2.onEvent(new EncoreSearchIntentCardComponent$bindView$1(this, s81));
            } else {
                h.k("searchIntentCard");
                throw null;
            }
        } else {
            h.k("searchIntentCard");
            throw null;
        }
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.home_inline_onboarding_search;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.CARD, GlueLayoutTraits.Trait.ONE_COLUMN);
        h.d(of, "EnumSet.of(GlueLayoutTra…tTraits.Trait.ONE_COLUMN)");
        return of;
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        Component<SearchIntentCard.Model, SearchIntentCard.Events> make = this.b.make();
        this.a = make;
        if (make != null) {
            return make.getView();
        }
        h.k("searchIntentCard");
        throw null;
    }
}

package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.home.api.likedsongscard.LikedSongsCardHome;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;
import kotlin.jvm.internal.h;

/* renamed from: io9  reason: default package */
public final class io9 extends qk9<a> {
    private final ComponentFactory<Component<LikedSongsCardHome.Model, LikedSongsCardHome.Events>, LikedSongsCardHome.Configuration> a;

    /* renamed from: io9$a */
    public static final class a extends s51.c.a<View> {
        private final Component<LikedSongsCardHome.Model, LikedSongsCardHome.Events> b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Component<LikedSongsCardHome.Model, LikedSongsCardHome.Events> component) {
            super(component.getView());
            h.e(component, "card");
            this.b = component;
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
            String title = s81.text().title();
            String str = "";
            if (title == null) {
                title = str;
            }
            String subtitle = s81.text().subtitle();
            if (subtitle != null) {
                str = subtitle;
            }
            this.b.render(new LikedSongsCardHome.Model(title, str, s81.custom().boolValue("downloadedBadge", false)));
        }
    }

    public io9(ComponentFactory<Component<LikedSongsCardHome.Model, LikedSongsCardHome.Events>, LikedSongsCardHome.Configuration> componentFactory) {
        h.e(componentFactory, "cardFactory");
        this.a = componentFactory;
    }

    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        return new a(this.a.make());
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.encore_home_liked_songs_card;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.ONE_COLUMN);
        h.d(of, "EnumSet.of(GlueLayoutTraits.Trait.ONE_COLUMN)");
        return of;
    }
}

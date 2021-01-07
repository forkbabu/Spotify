package defpackage;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.consumer.components.genrehub.api.genrehubheader.GenreHubHeader;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import defpackage.s51;
import java.util.EnumSet;
import kotlin.jvm.internal.h;

/* renamed from: u74  reason: default package */
public final class u74 implements d<View> {
    private final Component<GenreHubHeader.Model, GenreHubHeader.Events> a;

    public u74(wlf<ComponentFactory<Component<GenreHubHeader.Model, GenreHubHeader.Events>, GenreHubHeader.Configuration>> wlf) {
        h.e(wlf, "componentProvider");
        this.a = wlf.get().make();
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
        String title = s81.text().title();
        if (title == null) {
            title = "";
        }
        this.a.render(new GenreHubHeader.Model(title, Color.parseColor(s81.custom().string("color"))));
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.HEADER);
        h.d(of, "EnumSet.of(GlueLayoutTraits.Trait.HEADER)");
        return of;
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        return this.a.getView();
    }
}

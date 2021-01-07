package defpackage;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.music.libs.search.hubs.util.image.ImageConfig;
import com.spotify.searchview.proto.Entity;

/* renamed from: iwa  reason: default package */
public class iwa {
    private final pwa<Entity> a;
    private final awa b;
    private final Entity c;
    private final wsa d;
    private ImageConfig.Style e = ImageConfig.Style.SQUARE;

    public iwa(pwa<Entity> pwa, awa awa, Entity entity, wsa wsa) {
        this.b = awa;
        this.a = pwa;
        this.c = entity;
        this.d = wsa;
    }

    public s81 a() {
        String f = this.a.f(this.c);
        String str = tqa.c;
        return z81.c().o(tqa.c, HubsComponentCategory.CARD.d()).s(pqa.b(this.d.d(), this.d.b())).y(z81.h().a(this.c.o())).t(z81.f().f(z81.e().g(this.c.n()).e(this.b.a(this.c)).b("style", this.e.name()))).x(z81.g(this.c.r())).d("searchHistorySubtitle", f).v(pqa.a(this.d)).l();
    }

    public iwa b(ImageConfig.Style style) {
        this.e = style;
        return this;
    }
}

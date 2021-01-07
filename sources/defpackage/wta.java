package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.EntityType;
import com.spotify.ubi.specification.factories.p3;
import defpackage.p81;
import defpackage.wsa;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wta  reason: default package */
public class wta implements sg0<gua, b91> {
    private final qqa a;
    private final mwa b;
    private final jwa c;
    private final hwa<Entity, EntityType> d;
    private final p3 e;
    private final boolean f;

    public wta(qqa qqa, hwa<Entity, EntityType> hwa, mwa mwa, jwa jwa, p3 p3Var, boolean z) {
        this.a = qqa;
        this.b = mwa;
        this.c = jwa;
        this.d = hwa;
        this.e = p3Var;
        this.f = z;
    }

    private static p81 a(gua gua) {
        PageIdentifiers pageIdentifiers;
        p81.a p = HubsImmutableComponentBundle.builder().p("searchTerm", gua.d()).p("requestId", gua.e());
        switch (gua.b().ordinal()) {
            case 1:
                pageIdentifiers = PageIdentifiers.SEARCH_ARTISTS;
                break;
            case 2:
                pageIdentifiers = PageIdentifiers.SEARCH_SONGS;
                break;
            case 3:
                pageIdentifiers = PageIdentifiers.SEARCH_ALBUMS;
                break;
            case 4:
                pageIdentifiers = PageIdentifiers.SEARCH_PLAYLISTS;
                break;
            case 5:
                pageIdentifiers = PageIdentifiers.SEARCH_GENRES;
                break;
            case 6:
                pageIdentifiers = PageIdentifiers.SEARCH_SHOWS;
                break;
            case 7:
                pageIdentifiers = PageIdentifiers.SEARCH_AUDIOS;
                break;
            case 8:
                pageIdentifiers = PageIdentifiers.SEARCH_PROFILES;
                break;
            case 9:
                pageIdentifiers = PageIdentifiers.SEARCH_TOPICS;
                break;
            default:
                pageIdentifiers = PageIdentifiers.SEARCH;
                break;
        }
        p81.a b2 = p.p("pageIdentifier", pageIdentifiers.path()).b("isLastPage", gua.f().h() < 20);
        if (gua.c().isPresent()) {
            b2 = b2.j("lastOffset", gua.c().get().intValue());
        }
        return b2.d();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.sg0
    public b91 apply(gua gua) {
        String str;
        s81 s81;
        gua gua2 = gua;
        if (gua2.f().h() > 0) {
            List<Entity> i = gua2.f().i();
            int intValue = gua2.c().isPresent() ? gua2.c().get().intValue() : 0;
            ArrayList arrayList = new ArrayList(i.size());
            for (int i2 = 0; i2 < i.size(); i2++) {
                String e2 = gua2.e();
                int i3 = intValue + i2;
                Entity entity = i.get(i2);
                switch (entity.m().ordinal()) {
                    case 0:
                        str = "artist-results";
                        break;
                    case 1:
                        str = "track-results";
                        break;
                    case 2:
                        str = "album-results";
                        break;
                    case 3:
                        str = "playlist-results";
                        break;
                    case 4:
                        str = "genre-results";
                        break;
                    case 5:
                        str = "show-results";
                        break;
                    case 6:
                        str = "audioepisodes-results";
                        break;
                    case 7:
                        str = "profile-results";
                        break;
                    default:
                        str = "search-results";
                        break;
                }
                rqe a2 = this.e.b(Integer.valueOf(i3), entity.r(), e2).a();
                wsa.a a3 = wsa.a();
                a3.e(a2);
                a3.a(i3);
                a3.b(entity.r());
                a3.d(str);
                a3.c(e2);
                wsa build = a3.build();
                if (entity.m() == Entity.EntityCase.PLAYLIST) {
                    s81 = this.c.b(entity, build).a();
                } else {
                    lwa b2 = this.b.b(entity, build);
                    b2.b(this.f);
                    int ordinal = entity.m().ordinal();
                    if (ordinal == 1 || ordinal == 2 || ordinal == 5 || ordinal == 6 || ordinal == 8) {
                        b2.c(true);
                    }
                    s81 = b2.a();
                }
                arrayList.add(s81);
            }
            return z81.i().m(this.d.e(gua2.b(), gua2.d())).e(arrayList).h(a(gua2)).g();
        } else if (!gua2.c().isPresent() || gua2.c().get().intValue() == 0) {
            return this.a.b(gua2.d(), false).toBuilder().c(a(gua2)).g();
        } else {
            return HubsImmutableViewModel.EMPTY.toBuilder().c(z81.a().b("isLastPage", true).d()).g();
        }
    }
}

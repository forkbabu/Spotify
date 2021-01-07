package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import defpackage.b91;
import defpackage.mg0;

/* renamed from: t71  reason: default package */
public final class t71 {
    private static final mg0<b91> a = mg0.b(new a());
    private static final mg0<b91> b = mg0.b(new b());
    public static final /* synthetic */ int c = 0;

    /* renamed from: t71$a */
    static class a implements mg0.b<b91> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.mg0.b
        public b91 create() {
            return z81.i().k("hubs/placeholder").g();
        }
    }

    /* renamed from: t71$b */
    static class b implements mg0.b<b91> {
        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.mg0.b
        public b91 create() {
            return t71.d().l(z81.c().n(HubsCommonComponent.LOADING_SPINNER).l()).g();
        }
    }

    public static b91 a(SpotifyIconV2 spotifyIconV2, String str, String str2) {
        return b(spotifyIconV2, str, str2, HubsImmutableComponentBundle.create());
    }

    public static b91 b(SpotifyIconV2 spotifyIconV2, String str, String str2, p81 p81) {
        return d().l(z81.c().n(HubsGlueComponent.EMPTY_VIEW).t(z81.f().d(spotifyIconV2)).y(z81.h().a(str).c(str2)).p(p81).l()).g();
    }

    public static b91 c() {
        return b.a();
    }

    public static b91.a d() {
        return a.a().toBuilder();
    }
}

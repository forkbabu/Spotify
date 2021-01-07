package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration;
import com.spotify.music.features.playlistentity.configuration.a;
import com.spotify.music.features.playlistentity.configuration.b;
import com.spotify.music.features.playlistentity.configuration.c;
import com.spotify.music.features.playlistentity.configuration.i;
import com.spotify.remoteconfig.w9;

/* renamed from: en6  reason: default package */
public class en6 {
    private final w9 a;

    /* access modifiers changed from: package-private */
    /* renamed from: en6$a */
    public class a implements xo6 {
        a() {
        }

        @Override // defpackage.xo6
        public b.c a(b.c cVar) {
            b.c.a d = cVar.d();
            d.d(false);
            return d.a();
        }

        @Override // defpackage.xo6
        public /* synthetic */ c b(c cVar) {
            return wo6.c(this, cVar);
        }

        @Override // defpackage.xo6
        public com.spotify.music.features.playlistentity.configuration.a c(com.spotify.music.features.playlistentity.configuration.a aVar) {
            a.C0241a c = aVar.c();
            c.c(true);
            return c.b();
        }

        @Override // defpackage.xo6
        public PlaylistDataSourceConfiguration.c d(PlaylistDataSourceConfiguration.c cVar) {
            PlaylistDataSourceConfiguration.c.a e = cVar.e();
            e.d(Boolean.FALSE);
            return e.a();
        }

        @Override // defpackage.xo6
        public i.c e(i.c cVar) {
            return en6.a(en6.this, cVar);
        }
    }

    public en6(w9 w9Var) {
        this.a = w9Var;
    }

    static i.c a(en6 en6, i.c cVar) {
        en6.getClass();
        i.c.a d = cVar.d();
        d.b(!en6.a.a());
        return d.a();
    }

    public xo6 b() {
        return new a();
    }

    public ItemListConfiguration c(ItemListConfiguration itemListConfiguration) {
        ItemListConfiguration.a t = itemListConfiguration.t();
        t.i(!this.a.a());
        t.f(true);
        t.p(false);
        return t.d();
    }
}

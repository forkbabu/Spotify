package defpackage;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter;
import com.spotify.music.features.playlistentity.additionaladapters.l;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.features.playlistentity.vanilla.footer.FooterConfiguration;
import com.spotify.music.playlist.extender.g0;
import com.spotify.rxjava2.p;

/* renamed from: p07  reason: default package */
public class p07 extends t.a implements AdditionalAdapter, v07 {
    public static final /* synthetic */ int p = 0;
    private final s07 b;
    private final FooterConfiguration c;
    private final p f = new p();
    private final io.reactivex.subjects.a<Integer> n = io.reactivex.subjects.a.h1();
    private AdditionalAdapter.a.AbstractC0240a o = j07.a;

    /* renamed from: p07$a */
    class a implements AdditionalAdapter.a {
        a() {
        }

        @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter.a
        public /* synthetic */ void a(AdditionalAdapter.a.b bVar) {
            l.c(this, bVar);
        }

        @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter.a
        public void b(AdditionalAdapter.a.AbstractC0240a aVar) {
            p07.this.o = aVar;
        }

        @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter.a
        public RecyclerView.e<? extends RecyclerView.b0> c(ViewGroup viewGroup) {
            ((g0) p07.this.b.f()).E(viewGroup);
            return ((g0) p07.this.b.f()).y();
        }

        @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter.a
        public io.reactivex.subjects.a<Integer> d() {
            return p07.this.n;
        }
    }

    /* renamed from: p07$b */
    public interface b {
        p07 a(FooterConfiguration footerConfiguration);
    }

    public p07(t07 t07, FooterConfiguration footerConfiguration) {
        this.b = t07.b(footerConfiguration.a());
        this.c = footerConfiguration;
    }

    @Override // com.spotify.music.features.playlistentity.t.a, com.spotify.music.features.playlistentity.t
    public void c(Bundle bundle) {
        this.b.i(bundle);
    }

    @Override // com.spotify.music.features.playlistentity.t.a, com.spotify.music.features.playlistentity.t
    public void d(Bundle bundle) {
        this.b.h(bundle);
    }

    @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter
    public AdditionalAdapter.a e() {
        return new a();
    }

    @Override // com.spotify.music.features.playlistentity.t.a, com.spotify.music.features.playlistentity.t
    public void f() {
        this.b.e(null);
        this.f.a();
    }

    @Override // com.spotify.music.features.playlistentity.t.a, com.spotify.music.features.playlistentity.t
    public void h() {
        this.b.e(this);
        p pVar = this.f;
        io.reactivex.subjects.a<Integer> aVar = this.n;
        s07 s07 = this.b;
        s07.getClass();
        pVar.b(aVar.subscribe(new o07(s07)));
    }

    public void u() {
        this.o.a(((g0) this.b.f()).y().u());
    }

    @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter
    public boolean v(h76 h76) {
        boolean l = this.b.l(h76);
        boolean z = this.c.b(h76.a()) == FooterConfiguration.Type.PLEX;
        this.b.j(z);
        ((g0) this.b.f()).H();
        if (!z || !l) {
            return false;
        }
        return true;
    }
}

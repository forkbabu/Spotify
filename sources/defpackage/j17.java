package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter;
import com.spotify.music.features.playlistentity.additionaladapters.l;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.features.playlistentity.vanilla.footer.FooterConfiguration;
import com.spotify.rxjava2.p;
import java.util.ArrayList;
import java.util.List;

/* renamed from: j17  reason: default package */
public class j17 extends t.a implements AdditionalAdapter, s17 {
    public static final /* synthetic */ int u = 0;
    private final Context b;
    private final i61 c;
    private final o17 f;
    private final FooterConfiguration n;
    private final ifd o;
    private final p p = new p();
    private final io.reactivex.subjects.a<Integer> q = io.reactivex.subjects.a.h1();
    private s81 r;
    private List<s81> s;
    private AdditionalAdapter.a.b t = y07.a;

    /* renamed from: j17$a */
    class a implements AdditionalAdapter.a {
        a() {
        }

        @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter.a
        public void a(AdditionalAdapter.a.b bVar) {
            j17.this.t = bVar;
        }

        @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter.a
        public /* synthetic */ void b(AdditionalAdapter.a.AbstractC0240a aVar) {
            l.b(this, aVar);
        }

        @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter.a
        public RecyclerView.e<? extends RecyclerView.b0> c(ViewGroup viewGroup) {
            j17.this.r = z81.c().s("mlt-header").n(HubsGlueSectionHeader.SECTION_HEADER).y(z81.h().a(j17.this.b.getString(C0707R.string.more_like_this_section_header_title))).i("ui:source", j17.this.o.getName()).l();
            j17.this.s = new ArrayList();
            s81 l = z81.c().s("mlt-loading-spinner").n(HubsCommonComponent.LOADING_SPINNER).i("ui:source", j17.this.o.getName()).l();
            j17.this.s.add(j17.this.r);
            j17.this.s.add(l);
            return j17.this.c;
        }

        @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter.a
        public io.reactivex.subjects.a<Integer> d() {
            return j17.this.q;
        }
    }

    /* renamed from: j17$b */
    public interface b {
        j17 a(FooterConfiguration footerConfiguration);
    }

    public j17(i61 i61, o17 o17, Context context, ifd ifd, FooterConfiguration footerConfiguration) {
        this.b = context;
        this.c = i61;
        this.f = o17;
        this.n = footerConfiguration;
        this.o = ifd;
    }

    public void C() {
        this.t.a(false);
    }

    public void D(ImmutableList<HubsImmutableComponentModel> immutableList) {
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.mo53add((ImmutableList.Builder) this.r);
        builder.addAll((Iterable) immutableList);
        this.c.c0(builder.build());
        this.c.z();
        this.t.a(true);
    }

    public void E() {
        this.c.c0(this.s);
        this.c.z();
        this.t.a(true);
    }

    @Override // com.spotify.music.features.playlistentity.t.a, com.spotify.music.features.playlistentity.t
    public void c(Bundle bundle) {
        this.f.e(bundle);
    }

    @Override // com.spotify.music.features.playlistentity.t.a, com.spotify.music.features.playlistentity.t
    public void d(Bundle bundle) {
        this.f.d(bundle);
    }

    @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter
    public AdditionalAdapter.a e() {
        return new a();
    }

    @Override // com.spotify.music.features.playlistentity.t.a, com.spotify.music.features.playlistentity.t
    public void f() {
        this.f.a(null);
        this.p.a();
    }

    @Override // com.spotify.music.features.playlistentity.t.a, com.spotify.music.features.playlistentity.t
    public void h() {
        this.f.a(this);
        p pVar = this.p;
        io.reactivex.subjects.a<Integer> aVar = this.q;
        o17 o17 = this.f;
        o17.getClass();
        pVar.b(aVar.subscribe(new h17(o17)));
    }

    @Override // com.spotify.music.features.playlistentity.t.a, com.spotify.music.features.playlistentity.t
    public void l(t.b bVar) {
        this.f.h();
    }

    @Override // com.spotify.music.features.playlistentity.t.a, com.spotify.music.features.playlistentity.t
    public void onStop() {
        this.f.i();
    }

    @Override // com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter
    public boolean v(h76 h76) {
        this.f.g(h76);
        return this.n.b(h76.a()) == FooterConfiguration.Type.MLT;
    }
}

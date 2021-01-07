package com.spotify.music.features.playlistentity.additionaladapters;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter;
import com.spotify.music.features.playlistentity.additionaladapters.m;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.features.playlistentity.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class r implements p, q {
    private static final int o = r.class.hashCode();
    private final Map<AdditionalAdapter.Position, ? extends List<? extends AdditionalAdapter>> a;
    private final m b;
    private final w c;
    private RecyclerView f;
    private twd n;

    /* access modifiers changed from: private */
    public interface a {
        void a(AdditionalAdapter additionalAdapter);
    }

    r(m.a aVar, w wVar, Map<AdditionalAdapter.Position, ? extends List<? extends AdditionalAdapter>> map) {
        this.a = map;
        this.b = aVar.create();
        this.c = wVar;
    }

    private void i(a aVar) {
        Iterator<? extends List<? extends AdditionalAdapter>> it = this.a.values().iterator();
        while (it.hasNext()) {
            for (AdditionalAdapter additionalAdapter : (List) it.next()) {
                aVar.a(additionalAdapter);
            }
        }
    }

    public void b(h76 h76) {
        Iterator<? extends List<? extends AdditionalAdapter>> it = this.a.values().iterator();
        while (it.hasNext()) {
            for (AdditionalAdapter additionalAdapter : (List) it.next()) {
                int hashCode = additionalAdapter.hashCode() + o;
                if (additionalAdapter.v(h76)) {
                    this.n.l0(hashCode);
                } else {
                    this.n.i0(hashCode);
                }
            }
        }
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void c(Bundle bundle) {
        i(new g(bundle));
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void d(Bundle bundle) {
        i(new h(bundle));
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void f() {
        i(i.a);
        this.b.a(null);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public io.reactivex.a g() {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends List<? extends AdditionalAdapter>> it = this.a.values().iterator();
        while (it.hasNext()) {
            for (AdditionalAdapter additionalAdapter : (List) it.next()) {
                arrayList.add(additionalAdapter.g());
            }
        }
        arrayList.add(this.b.b());
        return io.reactivex.a.y(arrayList);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void h() {
        this.b.a(this);
        i(k.a);
    }

    public /* synthetic */ void j(int i, boolean z) {
        if (z) {
            this.n.l0(i);
        } else {
            this.n.i0(i);
        }
    }

    public /* synthetic */ void k(int i, int i2) {
        this.c.c(i, i2);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void l(t.b bVar) {
        this.b.e(bVar);
        i(new e(bVar));
    }

    @Override // com.spotify.music.features.playlistentity.additionaladapters.p
    public void n(twd twd, RecyclerView recyclerView) {
        this.f = recyclerView;
        this.n = twd;
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void onStop() {
        i(a.a);
        this.b.f();
    }

    @Override // com.spotify.music.features.playlistentity.additionaladapters.p
    public void p(LayoutInflater layoutInflater, ViewGroup viewGroup, AdditionalAdapter.Position position) {
        for (AdditionalAdapter additionalAdapter : (List) MoreObjects.firstNonNull(this.a.get(position), ImmutableList.of())) {
            int hashCode = additionalAdapter.hashCode() + o;
            AdditionalAdapter.a e = additionalAdapter.e();
            this.n.Z(e.c(viewGroup), hashCode);
            this.n.i0(hashCode);
            io.reactivex.subjects.a<Integer> d = e.d();
            if (d != null) {
                this.f.n(new u(hashCode, d, this.n));
            }
            e.a(new f(this, hashCode));
            e.b(new d(this, hashCode));
        }
    }
}

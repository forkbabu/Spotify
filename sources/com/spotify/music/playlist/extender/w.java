package com.spotify.music.playlist.extender;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentConfiguration;
import com.spotify.encore.ComponentFactory;
import com.spotify.encore.ViewProvider;
import com.spotify.encore.consumer.components.api.trackrowplaylistextender.Events;
import com.spotify.encore.consumer.components.api.trackrowplaylistextender.TrackRowPlaylistExtender;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.playlist.extender.g0;
import com.spotify.music.playlist.extender.model.RecTrack;
import com.spotify.music.playlist.extender.v;
import com.spotify.remoteconfig.z9;
import defpackage.d42;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.f;

/* access modifiers changed from: package-private */
public class w extends v<RecyclerView.b0, RecTrack> {
    private final Activity c;
    private final c f;
    private final b42 n;
    private final boolean o;
    private final int p;
    private List<t> q = new ArrayList();
    private final v.b r;
    private boolean s;
    private String t;
    private v.a u;
    private final Drawable v;
    private final Drawable w;
    private final boolean x;
    private final ComponentFactory<Component<TrackRowPlaylistExtender.Model, Events>, ComponentConfiguration> y;
    private final b4<RecTrack> z = new a();

    class a implements b4<RecTrack> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.spotify.mobile.android.ui.contextmenu.b4
        public r3 p0(RecTrack recTrack) {
            RecTrack recTrack2 = recTrack;
            d42.f w = w.this.n.a(recTrack2.getUri(), recTrack2.getName(), w.this.f.toString()).a(w.this.f).t(true).g(true).r(true).w(false);
            w.j(false);
            return w.b();
        }
    }

    protected static class b extends RecyclerView.b0 {
        private final ViewProvider C;

        public b(ViewProvider viewProvider) {
            super(viewProvider.getView());
            this.C = viewProvider;
        }

        public ViewProvider h0() {
            return this.C;
        }
    }

    w(Activity activity, c cVar, int i, b42 b42, ComponentFactory<Component<TrackRowPlaylistExtender.Model, Events>, ComponentConfiguration> componentFactory, z9 z9Var, boolean z2, v.b bVar) {
        this.c = activity;
        this.f = cVar;
        this.o = z2;
        this.p = i;
        this.n = b42;
        this.y = componentFactory;
        this.r = bVar;
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.ADD_TO_PLAYLIST;
        int i2 = R.color.white;
        this.v = z42.f(activity, spotifyIconV2, androidx.core.content.a.c(activity, i2));
        this.w = z42.f(activity, SpotifyIconV2.CHECK, androidx.core.content.a.c(activity, i2));
        this.x = z9Var.a();
        U(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void K(androidx.recyclerview.widget.RecyclerView.b0 r20, int r21) {
        /*
        // Method dump skipped, instructions count: 249
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.playlist.extender.w.K(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        Component<TrackRowPlaylistExtender.Model, Events> component;
        if (this.x) {
            component = this.y.make();
        } else {
            ga0 d = e90.d();
            Activity activity = this.c;
            boolean z2 = true;
            if (i != 1) {
                z2 = false;
            }
            component = new d0(d.h(activity, viewGroup, z2), this.f, this.v, this.w, this.z, this.r);
        }
        return new b(component);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void Q(RecyclerView.b0 b0Var) {
        if (b0Var instanceof b) {
            b bVar = (b) b0Var;
            if (bVar.h0() instanceof d0) {
                ((d0) bVar.h0()).I0();
            }
        }
    }

    public void Z(List<RecTrack> list) {
        List<t> list2 = this.q;
        ArrayList arrayList = new ArrayList(list.size());
        for (RecTrack recTrack : list) {
            t tVar = new t();
            tVar.a = recTrack;
            tVar.b = false;
            arrayList.add(tVar);
        }
        list2.addAll(arrayList);
        z();
    }

    public int b0() {
        return Math.min(this.q.size(), this.p);
    }

    public RecTrack c0(int i) {
        return this.q.get(i).a;
    }

    public ImmutableList<RecTrack> f0() {
        List<t> list = this.q;
        ArrayList arrayList = new ArrayList(list.size());
        for (t tVar : list) {
            arrayList.add(tVar.a);
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }

    public boolean g0() {
        return this.s;
    }

    public f i0(t tVar, int i, Events events) {
        v.a aVar;
        if (events instanceof Events.RowClicked) {
            this.r.a(i);
        } else if (events instanceof Events.RowLongClicked) {
            ContextMenuFragment.b5(this.c, this.z, tVar.a, this.f);
        } else if ((events instanceof Events.AddToPlaylistClicked) && (aVar = this.u) != null) {
            tVar.b = true;
            ((g0.b) aVar).a(tVar.a.getUri(), i, new g(this, tVar));
        }
        return f.a;
    }

    public void j0(String str) {
        int size = this.q.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (this.q.get(i).a.getUri().equals(str)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            this.q.remove(i);
            z();
        }
    }

    public void k0() {
        this.q.clear();
        z();
    }

    public void l0() {
        List<t> list = this.q;
        this.q = list.subList(Math.min(list.size(), this.p), this.q.size());
        z();
    }

    public void m0(String str) {
        if (!rw.equal(this.t, str)) {
            this.t = str;
            z();
        }
    }

    public void n0(boolean z2) {
        if (z2 != this.s) {
            this.s = z2;
            z();
        }
    }

    public void p0(v.a aVar) {
        this.u = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return Math.min(this.q.size(), this.p);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        return (long) this.q.get(i).a.getUri().hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        return !this.o ? 1 : 0;
    }
}

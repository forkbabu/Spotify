package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.api.sectionheading.SectionHeading2;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlist.participants.ui.PlaylistParticipantsAdapter;
import com.spotify.music.features.playlist.participants.ui.c;
import com.spotify.music.features.playlist.participants.ui.d;
import com.spotify.music.features.playlist.participants.ui.e;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;
import com.spotify.playlist.endpoints.d;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.h;

/* renamed from: o06  reason: default package */
public final class o06 implements n06 {
    private View a;
    private v<d.a.C0369a, PlaylistParticipantsAdapter.ViewHolder> b;
    private com.spotify.music.features.playlist.participants.ui.d c;
    private Component<SectionHeading2.Model, f> d;
    private LinearLayoutManager e;
    private Parcelable f;
    private final PlaylistParticipantsAdapter.b g;
    private final d.a h;
    private final wlf<Component<SectionHeading2.Model, f>> i;

    public o06(PlaylistParticipantsAdapter.b bVar, d.a aVar, wlf<Component<SectionHeading2.Model, f>> wlf) {
        h.e(bVar, "participantsAdapterFactory");
        h.e(aVar, "toolbarFactory");
        h.e(wlf, "sectionHeadingProvider");
        this.g = bVar;
        this.h = aVar;
        this.i = wlf;
    }

    @Override // defpackage.n06
    public Parcelable a() {
        LinearLayoutManager linearLayoutManager = this.e;
        if (linearLayoutManager != null) {
            return linearLayoutManager.i1();
        }
        h.k("layoutManager");
        throw null;
    }

    @Override // defpackage.n06
    public void b(Parcelable parcelable) {
        h.e(parcelable, "state");
        this.f = parcelable;
    }

    @Override // defpackage.n06
    public void c(List<d.a.C0369a> list) {
        h.e(list, "collaborators");
        v<d.a.C0369a, PlaylistParticipantsAdapter.ViewHolder> vVar = this.b;
        if (vVar != null) {
            vVar.b0(list);
            Parcelable parcelable = this.f;
            if (parcelable != null) {
                LinearLayoutManager linearLayoutManager = this.e;
                if (linearLayoutManager != null) {
                    linearLayoutManager.h1(parcelable);
                } else {
                    h.k("layoutManager");
                    throw null;
                }
            }
            this.f = null;
            return;
        }
        h.k("participantsAdapter");
        throw null;
    }

    @Override // defpackage.n06
    public void d(int i2) {
        if (i2 <= 1) {
            Component<SectionHeading2.Model, f> component = this.d;
            if (component != null) {
                component.getView().setVisibility(8);
            } else {
                h.k("header");
                throw null;
            }
        } else {
            Component<SectionHeading2.Model, f> component2 = this.d;
            if (component2 != null) {
                String quantityString = component2.getView().getResources().getQuantityString(C0707R.plurals.playlist_participants_title, i2, Integer.valueOf(i2));
                h.d(quantityString, "header.view.resources\n  …ants_title, count, count)");
                Component<SectionHeading2.Model, f> component3 = this.d;
                if (component3 != null) {
                    component3.render(new SectionHeading2.Model(quantityString, null, 2, null));
                    Component<SectionHeading2.Model, f> component4 = this.d;
                    if (component4 != null) {
                        component4.getView().setVisibility(0);
                    } else {
                        h.k("header");
                        throw null;
                    }
                } else {
                    h.k("header");
                    throw null;
                }
            } else {
                h.k("header");
                throw null;
            }
        }
    }

    @Override // defpackage.n06
    public void e(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, c cVar) {
        h.e(context, "context");
        h.e(layoutInflater, "inflater");
        h.e(cVar, "listener");
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_playlist_participants, viewGroup, false);
        this.b = this.g.a(cVar);
        Component<SectionHeading2.Model, f> component = this.i.get();
        h.d(component, "sectionHeadingProvider.get()");
        this.d = component;
        ViewGroup viewGroup2 = (ViewGroup) q4.G(inflate, C0707R.id.header_container);
        Component<SectionHeading2.Model, f> component2 = this.d;
        if (component2 != null) {
            viewGroup2.addView(component2.getView());
            View G = q4.G(inflate, C0707R.id.toolbar_container);
            h.d(G, "requireViewById<ViewGrou…, R.id.toolbar_container)");
            this.c = this.h.a((ViewGroup) G, cVar);
            this.e = new LinearLayoutManager(1, false);
            View G2 = q4.G(inflate, C0707R.id.recycler_view);
            RecyclerView recyclerView = (RecyclerView) G2;
            v<d.a.C0369a, PlaylistParticipantsAdapter.ViewHolder> vVar = this.b;
            if (vVar != null) {
                recyclerView.setAdapter(vVar);
                LinearLayoutManager linearLayoutManager = this.e;
                if (linearLayoutManager != null) {
                    recyclerView.setLayoutManager(linearLayoutManager);
                    recyclerView.setHasFixedSize(true);
                    h.d(G2, "requireViewById<Recycler…FixedSize(true)\n        }");
                    RecyclerView recyclerView2 = (RecyclerView) G2;
                    RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) q4.G(inflate, C0707R.id.recycler_view_fast_scroll);
                    recyclerViewFastScroller.setRecyclerView(recyclerView2);
                    recyclerViewFastScroller.setVerticalScrollBarEnabled(true);
                    recyclerViewFastScroller.setEnabled(true);
                    recyclerView2.setVerticalScrollBarEnabled(false);
                    this.a = inflate;
                    return;
                }
                h.k("layoutManager");
                throw null;
            }
            h.k("participantsAdapter");
            throw null;
        }
        h.k("header");
        throw null;
    }

    @Override // defpackage.n06
    public View getView() {
        return this.a;
    }

    @Override // defpackage.n06
    public void setTitle(String str) {
        h.e(str, "title");
        com.spotify.music.features.playlist.participants.ui.d dVar = this.c;
        if (dVar != null) {
            ((e) dVar).a(str);
        } else {
            h.k("toolbarDelegate");
            throw null;
        }
    }
}

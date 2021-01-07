package com.spotify.music.features.localfilesimport.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.android.flags.d;
import com.spotify.android.glue.patterns.prettylist.compat.c;
import com.spotify.android.glue.patterns.prettylist.compat.g;
import com.spotify.android.glue.patterns.prettylist.k;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.C0707R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity;
import com.spotify.music.features.localfilesimport.model.LocalItem;
import com.spotify.music.features.localfilesimport.model.PageType;
import com.spotify.music.features.localfilesimport.util.e;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.util.filterheader.FilterHeaderView;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.rxjava2.p;
import com.squareup.picasso.Picasso;
import defpackage.mn5;
import defpackage.rn5;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.List;

public class ItemsFragment extends LifecycleListenableFragment {
    private int A0;
    private int B0;
    Picasso C0;
    qn5 D0;
    y E0;
    jz1 F0;
    e G0;
    private final FilterHeaderView.g H0 = new a();
    private final List<SortOption> h0 = new ArrayList();
    private final SortOption i0 = new SortOption("name", (int) C0707R.string.sort_order_name);
    private final SortOption j0 = new SortOption("name", (int) C0707R.string.sort_order_title);
    private final p k0 = new p();
    private twd l0;
    private mn5 m0;
    private mn5.b n0;
    private TextView o0;
    private LoadingView p0;
    private gb0 q0;
    private gb0 r0;
    private FilterHeaderView s0;
    private RecyclerView t0;
    private k u0;
    private com.spotify.music.libs.viewuri.c v0 = ViewUris.P1;
    private SortOption w0;
    private String x0;
    private Parcelable y0;
    private PageType z0;

    class a implements FilterHeaderView.g {
        a() {
        }

        @Override // com.spotify.music.util.filterheader.FilterHeaderView.g
        public void a(SortOption sortOption) {
            ItemsFragment.this.w0 = sortOption;
            ItemsFragment.this.Y4();
        }

        @Override // com.spotify.music.util.filterheader.FilterHeaderView.g
        public void b() {
        }

        @Override // com.spotify.music.util.filterheader.FilterHeaderView.g
        public void c(boolean z) {
        }

        @Override // com.spotify.music.util.filterheader.FilterHeaderView.g
        public void d(String str) {
            ItemsFragment.this.x0 = str;
            ItemsFragment.this.Y4();
            if (ItemsFragment.this.s0.l()) {
                ItemsFragment.this.u0.getStickyRecyclerView().setAutoHideHeader(false);
            }
        }
    }

    class b implements mn5.b.a {
        b() {
        }

        @Override // defpackage.mn5.b.a
        public void a() {
            ItemsFragment.this.Z4();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ItemsFragment.this.V4()) {
                ItemsFragment.this.n0.e(ItemsFragment.this.m0.f0(), false, null);
                ItemsFragment itemsFragment = ItemsFragment.this;
                itemsFragment.G0.b(itemsFragment.z0);
                return;
            }
            ItemsFragment.this.n0.e(ItemsFragment.this.m0.f0(), true, null);
            ItemsFragment itemsFragment2 = ItemsFragment.this;
            itemsFragment2.G0.q(itemsFragment2.z0);
        }
    }

    public static ItemsFragment U4(com.spotify.android.flags.c cVar, PageType pageType) {
        ItemsFragment itemsFragment = new ItemsFragment();
        cVar.getClass();
        d.a(itemsFragment, cVar);
        itemsFragment.D2().putSerializable("type", pageType);
        return itemsFragment;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean V4() {
        ImmutableList<LocalItem> f0 = this.m0.f0();
        if (f0 == null || f0.isEmpty()) {
            return false;
        }
        UnmodifiableListIterator<LocalItem> listIterator = f0.listIterator();
        while (listIterator.hasNext()) {
            if (!this.n0.b(listIterator.next())) {
                return false;
            }
        }
        return true;
    }

    public static void W4(ItemsFragment itemsFragment, Throwable th) {
        itemsFragment.getClass();
        Logger.e(th, "Failed to get local items: %s", th.getMessage());
        itemsFragment.p0.n();
    }

    public static void X4(ItemsFragment itemsFragment, com.spotify.music.features.localfilesimport.model.d dVar) {
        itemsFragment.getClass();
        Logger.b("Local files: Got %d items. isAdded() %s", Integer.valueOf(dVar.getItems().size()), Boolean.valueOf(itemsFragment.e3()));
        if (itemsFragment.e3()) {
            itemsFragment.m0.g0(dVar.getItems());
            itemsFragment.p0.n();
            boolean isEmpty = dVar.getItems().isEmpty();
            boolean z = dVar.getUnfilteredLength() > 0;
            boolean l = itemsFragment.s0.l();
            if (!isEmpty) {
                itemsFragment.q0.getView().setVisibility(8);
                itemsFragment.l0.i0(1);
                itemsFragment.t0.setVisibility(0);
                itemsFragment.l0.n0(0);
            } else if (l) {
                itemsFragment.q0.getView().setVisibility(8);
                itemsFragment.t0.setVisibility(0);
                itemsFragment.l0.l0(1);
                itemsFragment.r0.setTitle(itemsFragment.W2(C0707R.string.placeholder_no_result_title, itemsFragment.x0));
            } else {
                int ordinal = itemsFragment.z0.ordinal();
                if (ordinal == 0) {
                    itemsFragment.q0.setTitle(itemsFragment.V2(z ? C0707R.string.local_files_import_empty_folders_title_everything_imported : C0707R.string.local_files_import_empty_folders_title));
                    itemsFragment.q0.setSubtitle(itemsFragment.V2(C0707R.string.local_files_import_empty_folders_body));
                } else if (ordinal == 1) {
                    itemsFragment.q0.setTitle(itemsFragment.V2(z ? C0707R.string.local_files_import_empty_artists_title_everything_imported : C0707R.string.local_files_import_empty_artists_title));
                    itemsFragment.q0.setSubtitle(itemsFragment.V2(C0707R.string.local_files_import_empty_artists_body));
                } else if (ordinal == 2) {
                    itemsFragment.q0.setTitle(itemsFragment.V2(z ? C0707R.string.local_files_import_empty_albums_title_everything_imported : C0707R.string.local_files_import_empty_albums_title));
                    itemsFragment.q0.setSubtitle(itemsFragment.V2(C0707R.string.local_files_import_empty_albums_body));
                } else if (ordinal != 3) {
                    StringBuilder V0 = je.V0("The type ");
                    V0.append(itemsFragment.z0);
                    V0.append(" is unsupported.");
                    Assertion.p(V0.toString());
                } else {
                    itemsFragment.q0.setTitle(itemsFragment.V2(z ? C0707R.string.local_files_import_empty_songs_title_everything_imported : C0707R.string.local_files_import_empty_songs_title));
                    itemsFragment.q0.setSubtitle(itemsFragment.V2(C0707R.string.local_files_import_empty_songs_body));
                }
                itemsFragment.t0.setVisibility(8);
                itemsFragment.q0.getView().setVisibility(0);
                itemsFragment.l0.i0(1);
            }
            RecyclerView.m layoutManager = itemsFragment.t0.getLayoutManager();
            Parcelable parcelable = itemsFragment.y0;
            if (!(parcelable == null || layoutManager == null)) {
                layoutManager.h1(parcelable);
                itemsFragment.y0 = null;
            }
            itemsFragment.Z4();
            itemsFragment.o0.setEnabled(true);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void Y4() {
        Optional<ane> optional;
        s sVar;
        p pVar = this.k0;
        Optional fromNullable = Optional.fromNullable(this.w0);
        if (fromNullable.isPresent()) {
            optional = Optional.of(z42.F((SortOption) fromNullable.get()));
        } else {
            optional = Optional.absent();
        }
        rn5.a a2 = rn5.a();
        a2.b(this.x0);
        a2.a(optional);
        a2.c(true);
        rn5 build = a2.build();
        int ordinal = this.z0.ordinal();
        if (ordinal == 0) {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            qn5 qn5 = this.D0;
            rn5.a g = build.g();
            g.e(ImmutableList.of("numTracks gt 0"));
            g.d(ImmutableList.of("link.isDuplicate eq false", "inCollection eq false"));
            g.f(ImmutableList.of(absolutePath));
            sVar = qn5.b(g.build().d());
        } else if (ordinal == 1) {
            qn5 qn52 = this.D0;
            rn5.a g2 = build.g();
            g2.e(ImmutableList.of("numTracks gt 0"));
            g2.d(ImmutableList.of("link.isDuplicate eq false", "inCollection eq false"));
            sVar = qn52.e(g2.build().d());
        } else if (ordinal == 2) {
            qn5 qn53 = this.D0;
            rn5.a g3 = build.g();
            g3.e(ImmutableList.of("numTracks gt 0"));
            g3.d(ImmutableList.of("link.isDuplicate eq false", "inCollection eq false"));
            sVar = qn53.c(g3.build().d());
        } else if (ordinal != 3) {
            StringBuilder V0 = je.V0("The type ");
            V0.append(this.z0);
            V0.append(" is unsupported.");
            sVar = s.P(new Throwable(V0.toString()));
        } else {
            qn5 qn54 = this.D0;
            rn5.a g4 = build.g();
            g4.e(ImmutableList.of("link.isDuplicate eq false", "inCollection eq false"));
            sVar = qn54.d(g4.build().d());
        }
        pVar.b(sVar.o0(this.E0).subscribe(new b(this), new a(this)));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void Z4() {
        if (V4()) {
            this.o0.setText(this.B0);
        } else {
            this.o0.setText(this.A0);
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        RecyclerView.m layoutManager;
        RecyclerView recyclerView = this.t0;
        if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null)) {
            bundle.putParcelable("list", layoutManager.i1());
        }
        super.N3(bundle);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        Y4();
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        FilterHeaderView filterHeaderView = this.s0;
        if (filterHeaderView != null) {
            filterHeaderView.k();
        }
        this.k0.b(EmptyDisposable.INSTANCE);
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        u4(false);
        if (this.n0 == null) {
            this.n0 = ((LocalFilesImportActivity) j4()).b1();
        }
        this.n0.f(new b());
        PageType pageType = (PageType) k4().getSerializable("type");
        this.z0 = pageType;
        SortOption sortOption = this.i0;
        int ordinal = pageType.ordinal();
        if (ordinal == 0) {
            this.v0 = ViewUris.Q1;
            sortOption = this.i0;
            this.h0.add(sortOption);
            this.A0 = C0707R.string.local_files_import_select_all_folders_button;
            this.B0 = C0707R.string.local_files_import_deselect_all_folders_button;
        } else if (ordinal == 1) {
            this.v0 = ViewUris.R1;
            sortOption = this.i0;
            this.h0.add(sortOption);
            this.A0 = C0707R.string.local_files_import_select_all_artists_button;
            this.B0 = C0707R.string.local_files_import_deselect_all_artists_button;
        } else if (ordinal == 2) {
            this.v0 = ViewUris.S1;
            sortOption = new SortOption("artist.name", (int) C0707R.string.sort_order_artist);
            sortOption.i(this.j0);
            this.h0.add(this.j0);
            this.h0.add(sortOption);
            this.A0 = C0707R.string.local_files_import_select_all_albums_button;
            this.B0 = C0707R.string.local_files_import_deselect_all_albums_button;
        } else if (ordinal != 3) {
            StringBuilder V0 = je.V0("The type ");
            V0.append(this.z0);
            V0.append(" is unsupported.");
            Assertion.p(V0.toString());
        } else {
            this.v0 = ViewUris.T1;
            sortOption = this.j0;
            this.h0.add(sortOption);
            this.A0 = C0707R.string.local_files_import_select_all_songs_button;
            this.B0 = C0707R.string.local_files_import_deselect_all_songs_button;
        }
        if (this.x0 == null) {
            this.x0 = "";
        }
        if (this.w0 == null) {
            this.w0 = sortOption;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0707R.layout.fragment_local_files_import, viewGroup, false);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(C0707R.id.content);
        ViewGroup viewGroup4 = (ViewGroup) viewGroup3.findViewById(C0707R.id.list);
        if (bundle != null) {
            this.y0 = bundle.getParcelable("list");
        }
        TextView textView = (TextView) viewGroup3.findViewById(C0707R.id.select_all_btn);
        this.o0 = textView;
        textView.setEnabled(false);
        this.o0.setOnClickListener(new c());
        if (this.s0 == null) {
            this.s0 = FilterHeaderView.i(layoutInflater, this.x0, this.h0, this.w0, this.H0);
        }
        androidx.fragment.app.c j4 = j4();
        this.s0.setBackgroundColor(androidx.core.content.a.b(j4, C0707R.color.bg_filter));
        this.s0.m(this.v0, PageIdentifiers.LOCALFILESIMPORT, this.F0);
        this.s0.setHint(C0707R.string.header_filter_hint);
        c.a<g> a2 = com.spotify.android.glue.patterns.prettylist.compat.c.d(j4).c().a();
        a2.h(this.s0);
        a2.e(true);
        a2.d(true);
        a2.c(false);
        com.spotify.android.glue.patterns.prettylist.compat.c<g> a3 = a2.a(this);
        k kVar = (k) a3.i();
        this.u0 = kVar;
        kVar.getStickyRecyclerView().setAutoHideHeader(true);
        gb0 a4 = e90.c().a(j4, null);
        a4.b2(false);
        a4.getTitleView().setSingleLine(false);
        a4.getTitleView().setEllipsize(null);
        a4.getSubtitleView().setSingleLine(false);
        a4.getSubtitleView().setEllipsize(null);
        a4.setTitle(j4.getString(C0707R.string.placeholder_no_result_title, ""));
        a4.setSubtitle(j4.getString(C0707R.string.placeholder_no_result_body));
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(j4, SpotifyIcon.FLAG_32, (float) j4.getResources().getDimensionPixelSize(C0707R.dimen.empty_view_icon_size));
        spotifyIconDrawable.r(nud.h(j4, C0707R.attr.pasteColorPlaceholder));
        a4.D2().c(spotifyIconDrawable);
        this.r0 = a4;
        this.l0 = new twd(false);
        mn5 mn5 = new mn5(l4(), this.n0, this.C0, this.G0, this.z0);
        this.m0 = mn5;
        this.l0.Z(mn5, 0);
        this.l0.Z(new v02(this.r0.getView(), false), 1);
        this.l0.n0(0);
        this.l0.i0(1);
        RecyclerView g = a3.g();
        this.t0 = g;
        g.setTag(this.v0.toString());
        this.t0.setLayoutManager(new LinearLayoutManager(1, false));
        this.t0.setAdapter(this.l0);
        viewGroup4.addView(a3.i(), new FrameLayout.LayoutParams(-1, -1));
        gb0 a5 = e90.c().a(j4, viewGroup3);
        this.q0 = a5;
        a5.getView().setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        this.q0.getView().setLayoutParams(layoutParams);
        viewGroup3.addView(this.q0.getView());
        viewGroup3.setVisibility(4);
        LoadingView m = LoadingView.m(layoutInflater, j4, viewGroup3);
        this.p0 = m;
        viewGroup2.addView(m);
        this.p0.r();
        return viewGroup2;
    }

    @Override // androidx.fragment.app.Fragment
    public void y3() {
        super.y3();
        FilterHeaderView filterHeaderView = this.s0;
        if (filterHeaderView != null) {
            int i = FilterHeaderView.A;
            filterHeaderView.setObserver(null);
        }
        this.m0.c0();
    }
}

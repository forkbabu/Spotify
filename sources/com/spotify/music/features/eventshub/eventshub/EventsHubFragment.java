package com.spotify.music.features.eventshub.eventshub;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.common.base.MoreObjects;
import com.spotify.android.glue.patterns.prettylist.HidingHeaderListView;
import com.spotify.android.glue.patterns.prettylist.PrettyHeaderView;
import com.spotify.android.glue.patterns.prettylist.compat.c;
import com.spotify.android.glue.patterns.prettylist.compat.g;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.androidx.fragment.app.LifecycleListenableFragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.fragments.r;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ui.h;
import com.spotify.music.C0707R;
import com.spotify.music.connection.l;
import com.spotify.music.contentviewstate.ContentViewManager;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.eventshub.model.ConcertResult;
import com.spotify.music.features.eventshub.model.EventResult;
import com.spotify.music.features.eventshub.model.EventSection;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.NavigationItem;
import com.spotify.music.navigation.t;
import com.spotify.rxjava2.q;
import com.squareup.picasso.Picasso;
import io.reactivex.BackpressureStrategy;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class EventsHubFragment extends LifecycleListenableFragment implements NavigationItem, l, s, AbsListView.OnScrollListener, ToolbarConfig.d, ToolbarConfig.c {
    public static final String x0 = ViewUris.j0.toString();
    j h0;
    l i0;
    Picasso j0;
    h k0;
    cqe l0;
    y m0;
    t n0;
    ContentViewManager o0;
    private Map<EventSection, f> p0;
    private v42 q0;
    private LoadingView r0;
    private c<g> s0;
    private gb0 t0;
    private final q u0 = new q();
    private final View.OnClickListener v0 = new a();
    private Button w0;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EventsHubFragment.this.h0.c();
        }
    }

    class b implements AdapterView.OnItemClickListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Object item = EventsHubFragment.this.s0.h().getListView().getAdapter().getItem(i);
            if (item instanceof ConcertResult) {
                ConcertResult concertResult = (ConcertResult) item;
                EventsHubFragment.this.h0.d(concertResult, j, concertResult.getSourceType());
            } else if (item instanceof EventResult) {
                EventResult eventResult = (EventResult) item;
                EventsHubFragment.this.h0.f(eventResult, j, eventResult.getSourceType());
            }
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String D0(Context context) {
        return context != null ? context.getString(C0707R.string.events_hub_title) : "";
    }

    public void L4(List<EventResult> list, EventSection eventSection) {
        if (e3()) {
            Assertion.e(list);
            Assertion.e(eventSection);
            f fVar = this.p0.get(eventSection);
            Assertion.e(fVar);
            fVar.clear();
            fVar.addAll(list);
            this.q0.p(eventSection.d());
        }
    }

    public void M4(String str) {
        if (e3()) {
            ImageView e = this.s0.e();
            e.clearColorFilter();
            this.j0.m(str).n(e, null);
        }
    }

    public void N4(String str) {
        if (e3()) {
            StringBuilder sb = new StringBuilder();
            sb.append(D0(B2()));
            if (!MoreObjects.isNullOrEmpty(str)) {
                sb.append('\n');
                sb.append(str);
            }
            this.s0.j().setText(sb);
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void O3() {
        super.O3();
        this.u0.a(this.i0.b().Y0(BackpressureStrategy.BUFFER).Q(this.m0).subscribe(new a(this), b.a));
    }

    public void O4(EventSection eventSection, Object... objArr) {
        this.q0.m(eventSection.d(), W2(eventSection.g(), objArr));
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void P3() {
        super.P3();
        this.u0.c();
        this.h0.a();
    }

    public void P4() {
        if (e3()) {
            this.t0.b2(false);
            this.o0.i(true);
        }
    }

    @Override // com.spotify.androidx.fragment.app.LifecycleListenableFragment, androidx.fragment.app.Fragment
    public void Q3(View view, Bundle bundle) {
        TextView textView;
        super.Q3(view, bundle);
        this.p0 = new EnumMap(EventSection.class);
        this.q0 = new v42(B2());
        EventSection[] eventSectionArr = EventSection.n;
        for (EventSection eventSection : eventSectionArr) {
            f fVar = new f(B2(), new ArrayList(), this.k0, this.l0);
            this.p0.put(eventSection, fVar);
            v42 v42 = this.q0;
            int g = eventSection.g();
            int d = eventSection.d();
            androidx.fragment.app.c B2 = B2();
            B2.getClass();
            Assertion.l(true, "EventSection was null in EventsHub when trying to create a footer");
            if (eventSection != EventSection.ALL) {
                textView = null;
            } else {
                textView = com.spotify.android.paste.app.c.f(B2);
                nud.p(B2, textView, C0707R.attr.pasteTextAppearanceSecondary);
                textView.setGravity(17);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setText(B2.getString(C0707R.string.events_hub_section_footer_popular));
                int dimensionPixelOffset = B2.getResources().getDimensionPixelOffset(C0707R.dimen.eventshub_footer_padding);
                textView.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            }
            v42.c(fVar, g, d, null, textView);
        }
        this.q0.j(new int[0]);
        ListView listView = this.s0.h().getListView();
        listView.setAdapter((ListAdapter) this.q0);
        ContentViewManager.b bVar = new ContentViewManager.b(B2(), this.t0, this.s0.i());
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.EVENTS;
        bVar.d(spotifyIconV2, C0707R.string.events_hub_choose_location_title, C0707R.string.events_hub_choose_location_body);
        bVar.a(spotifyIconV2, C0707R.string.events_hub_no_concerts_found_title, C0707R.string.events_hub_no_concerts_found_body);
        bVar.c(C0707R.string.events_hub_not_available_due_to_error_title, C0707R.string.events_hub_not_available_due_to_error_body);
        bVar.b(C0707R.string.error_no_connection_title, C0707R.string.events_hub_not_available_body);
        this.o0 = bVar.f();
        listView.setOnScrollListener(this);
        listView.setOnItemClickListener(new b());
    }

    public void Q4() {
        if (e3()) {
            this.o0.g(this.r0);
        }
    }

    public void R4() {
        if (e3()) {
            this.t0.b2(true);
            this.o0.f(true);
        }
    }

    public void S4() {
        if (e3()) {
            this.t0.b2(true);
            this.o0.k(true);
        }
    }

    public void T4() {
        if (e3()) {
            this.t0.b2(false);
            this.o0.h(true);
        }
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public /* synthetic */ Fragment e() {
        return r.a(this);
    }

    @Override // com.spotify.mobile.android.ui.fragments.s
    public String i0() {
        return x0;
    }

    @Override // com.spotify.music.navigation.NavigationItem
    public NavigationItem.NavigationGroup k0() {
        return NavigationItem.NavigationGroup.FIND;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            if (!this.q0.isEmpty()) {
                Object item = this.s0.h().getListView().getAdapter().getItem(i4);
                if (item instanceof ConcertResult) {
                    ConcertResult concertResult = (ConcertResult) item;
                    this.h0.getClass();
                }
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        dagger.android.support.a.a(this);
        super.p3(context);
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.CONCERTS, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(B2());
        com.spotify.music.contentviewstate.view.b bVar = LoadingView.y;
        LoadingView loadingView = (LoadingView) layoutInflater.inflate(C0707R.layout.loading_view, (ViewGroup) null);
        this.r0 = loadingView;
        frameLayout.addView(loadingView);
        c.b b2 = c.b(B2()).b();
        this.w0 = com.spotify.android.paste.app.c.d(B2());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int f = nud.f(8.0f, B2().getResources());
        layoutParams.bottomMargin = f;
        layoutParams.topMargin = f;
        this.w0.setLayoutParams(layoutParams);
        this.w0.setText(B2().getString(C0707R.string.events_hub_location_button_text));
        this.w0.setOnClickListener(this.v0);
        c.a<g> b3 = b2.b(this.w0, 1);
        b3.c(true);
        b3.b(true);
        c<g> a2 = b3.a(this);
        this.s0 = a2;
        ((HidingHeaderListView) a2.h().getListView()).setCanAlwaysHideHeader(false);
        this.s0.j().setText(D0(B2()));
        View headerView = this.s0.h().getHeaderView();
        if (headerView instanceof PrettyHeaderView) {
            ((PrettyHeaderView) headerView).setHasFixedSize(true);
        }
        frameLayout.addView(this.s0.i());
        gb0 a3 = e90.c().a(B2(), null);
        this.t0 = a3;
        a3.getView().setVisibility(8);
        Button i = this.t0.i();
        this.w0 = i;
        i.setText(B2().getString(C0707R.string.events_hub_location_button_text));
        this.w0.setOnClickListener(this.v0);
        frameLayout.addView(this.t0.getView());
        return frameLayout;
    }

    @Override // defpackage.ifd.b
    public ifd z1() {
        return kfd.s0;
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.n;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.music.libs.assistedcuration.adapter.a;
import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.music.libs.assistedcuration.model.h;
import com.spotify.music.libs.assistedcuration.model.i;
import com.spotify.music.libs.assistedcuration.presenter.AssistedCurationContentPresenter;
import com.spotify.music.libs.assistedcuration.presenter.s;
import com.spotify.music.preview.v;
import com.spotify.paste.widgets.carousel.CarouselLayoutManager;
import com.spotify.paste.widgets.carousel.CarouselView;
import com.spotify.paste.widgets.carousel.g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b2a  reason: default package */
public class b2a implements a2a {
    private final Context a;
    private final com.spotify.music.libs.assistedcuration.adapter.a b;
    private final SnackbarManager c;
    private final AssistedCurationContentPresenter d;
    private CarouselView e;
    private kb0 f;
    private int g;
    private Parcelable h;
    private final g i = new a();

    /* renamed from: b2a$a */
    class a implements g {
        a() {
        }

        @Override // com.spotify.paste.widgets.carousel.g
        public int a() {
            return b2a.this.g;
        }

        @Override // com.spotify.paste.widgets.carousel.g
        public int b() {
            return b2a.this.g;
        }

        @Override // com.spotify.paste.widgets.carousel.g
        public void c(View view, float f, int i) {
        }

        @Override // com.spotify.paste.widgets.carousel.g
        public void d(View view, float f, int i) {
        }
    }

    /* renamed from: b2a$b */
    class b implements CarouselView.b {
        b() {
        }

        @Override // com.spotify.paste.widgets.carousel.CarouselView.b
        public void a(int i) {
        }

        @Override // com.spotify.paste.widgets.carousel.CarouselView.b
        public void b(int i, int i2, float f) {
        }

        @Override // com.spotify.paste.widgets.carousel.CarouselView.b
        public void c(int i) {
            b2a.this.d.d(b2a.this.b.Z(i), b2a.this.b.X(i));
        }
    }

    public b2a(Activity activity, SnackbarManager snackbarManager, AssistedCurationContentPresenter.a aVar, a.AbstractC0280a aVar2, v.a aVar3, com.spotify.instrumentation.a aVar4, x1a x1a) {
        this.a = activity;
        this.c = snackbarManager;
        v create = aVar3.create();
        this.b = aVar2.a(this, create);
        this.d = aVar.a((n) activity, this, aVar4, create, x1a);
    }

    @Override // defpackage.a2a
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) layoutInflater.inflate(C0707R.layout.content_assisted_curation, viewGroup, false);
        this.g = nud.f(10.0f, this.a.getResources());
        this.e = (CarouselView) coordinatorLayout.findViewById(C0707R.id.carousel);
        CarouselLayoutManager carouselLayoutManager = new CarouselLayoutManager(CarouselLayoutManager.MeasureMode.FILL);
        carouselLayoutManager.d2(this.i);
        this.e.setLayoutManager(carouselLayoutManager);
        this.b.c0(nud.m(this.a));
        this.e.setAdapter(this.b);
        RecyclerView.j itemAnimator = this.e.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.u(500);
        }
        iz9.o(this.e);
        this.e.T0(new b());
        ViewGroup viewGroup2 = (ViewGroup) coordinatorLayout.findViewById(C0707R.id.content);
        nb0 b2 = pb0.b(this.a, viewGroup2);
        this.f = b2;
        viewGroup2.addView(b2.getView());
        this.f.getView().setVisibility(8);
        return coordinatorLayout;
    }

    @Override // defpackage.a2a
    public void b(String str) {
        SnackbarConfiguration build = SnackbarConfiguration.builder(this.a.getString(C0707R.string.assisted_curation_duplicates_toast_body, str)).build();
        if (!this.c.isAttached()) {
            this.c.showOnNextAttach(build);
        } else {
            this.c.show(build);
        }
    }

    @Override // defpackage.pz9.a
    public void c(h hVar) {
        this.d.e(hVar);
    }

    @Override // defpackage.a2a
    public void d(Bundle bundle) {
        this.d.k(i.e(bundle));
        this.h = bundle.getParcelable("list");
    }

    @Override // defpackage.rz9.a
    public void e(h hVar, e eVar, int i2) {
        this.d.g(hVar, eVar, i2);
    }

    @Override // defpackage.a2a
    public void f(Bundle bundle) {
        RecyclerView.m layoutManager;
        i b2 = this.d.b();
        List<byte[]> c2 = b2.c();
        for (int i2 = 0; i2 < c2.size(); i2++) {
            bundle.putByteArray(je.p0("cards_state_item", i2), c2.get(i2));
        }
        bundle.putInt("cards_state_length", c2.size());
        bundle.putInt("cards_count", b2.b());
        bundle.putString("current_card_id", b2.d());
        CarouselView carouselView = this.e;
        if (!(carouselView == null || (layoutManager = carouselView.getLayoutManager()) == null)) {
            bundle.putParcelable("list", layoutManager.i1());
        }
    }

    @Override // defpackage.rz9.a
    public void g(h hVar, e eVar, int i2) {
        this.d.h(hVar, eVar, i2);
    }

    @Override // defpackage.a2a
    public void h() {
        this.f.getView().setVisibility(8);
    }

    @Override // defpackage.a2a
    public void i(ArrayList<String> arrayList) {
        this.d.f(arrayList);
    }

    @Override // defpackage.a2a
    public void j(List<h> list, boolean z, boolean z2) {
        this.b.b0(list, z, z2);
        int u = this.b.u();
        if (u > 0) {
            int min = Math.min(this.e.getCurrentPosition(), u - 1);
            this.d.d(this.b.Z(min), this.b.X(min));
        }
        Parcelable parcelable = this.h;
        if (parcelable != null) {
            this.e.post(new z1a(this, parcelable));
            this.h = null;
        }
    }

    @Override // defpackage.rz9.a
    public void k(h hVar, e eVar, int i2) {
        this.d.i(hVar, eVar, i2);
    }

    @Override // defpackage.a2a
    public void l() {
        this.f.setTitle(this.a.getString(C0707R.string.assisted_curation_empty_view_no_connection_title));
        this.f.setSubtitle(this.a.getString(C0707R.string.assisted_curation_empty_view_no_connection_subtitle));
        this.f.getSubtitleView().setVisibility(0);
        this.f.getView().setVisibility(0);
    }

    @Override // defpackage.a2a
    public void m(String str) {
        SnackbarConfiguration build = SnackbarConfiguration.builder(this.a.getString(C0707R.string.assisted_curation_added_toast_body, str)).build();
        if (!this.c.isAttached()) {
            this.c.showOnNextAttach(build);
        } else {
            this.c.show(build);
        }
    }

    @Override // defpackage.a2a
    public void n(s sVar) {
        this.d.l(sVar);
    }

    @Override // defpackage.a2a
    public void o() {
        this.e.post(new y1a(this));
    }

    @Override // defpackage.a2a
    public void p() {
        this.f.setTitle(this.a.getString(C0707R.string.assisted_curation_empty_view_no_cards_title));
        this.f.getSubtitleView().setVisibility(8);
        this.f.getView().setVisibility(0);
    }

    public /* synthetic */ void t() {
        this.e.setPosition(this.b.Y());
    }

    public /* synthetic */ void u(Parcelable parcelable) {
        RecyclerView.m layoutManager = this.e.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.h1(parcelable);
        }
    }
}

package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.paste.app.d;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.mobile.android.spotlets.common.recyclerview.c;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.w;
import com.squareup.picasso.Picasso;
import java.util.List;

/* renamed from: gs6  reason: default package */
final class gs6 implements fs6 {
    private final js6 a;
    private final Picasso b;
    private final Context c;
    private final wlf<c> d;
    private final m e;
    private twd f;
    private RecyclerView g;
    private FrameLayout h;
    private ViewGroup i;
    private Parcelable j;

    /* renamed from: gs6$a */
    class a extends RecyclerView.q {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void a(RecyclerView recyclerView, int i) {
            if (i == 0 || i == 1) {
                gs6.this.b.q(Integer.valueOf((int) C0707R.id.image_on_item_in_list_loaded_with_picasso));
            } else {
                gs6.this.b.n(Integer.valueOf((int) C0707R.id.image_on_item_in_list_loaded_with_picasso));
            }
        }
    }

    public gs6(js6 js6, Context context, Picasso picasso, w wVar, wlf<c> wlf, m mVar) {
        this.a = js6;
        this.b = picasso;
        this.c = context;
        this.d = wlf;
        wVar.e(new es6(this));
        this.e = mVar;
    }

    @Override // defpackage.fs6
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0707R.layout.playlist_root, viewGroup, false);
        this.a.getClass();
        this.f = new twd(true);
        this.h = (FrameLayout) viewGroup2.findViewById(C0707R.id.container);
        this.i = (ViewGroup) viewGroup2.findViewById(C0707R.id.toolbar_container);
        return viewGroup2;
    }

    @Override // defpackage.fs6
    public void b() {
        if (this.g.getAdapter() == null) {
            this.g.setAdapter(this.f);
        }
        RecyclerView.m layoutManager = this.g.getLayoutManager();
        Parcelable parcelable = this.j;
        if (parcelable != null && layoutManager != null) {
            layoutManager.h1(parcelable);
            this.j = null;
        }
    }

    @Override // defpackage.fs6
    public void c(Bundle bundle) {
        RecyclerView.m layoutManager;
        RecyclerView recyclerView = this.g;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            bundle.putParcelable(gs6.class.getName(), layoutManager.i1());
        }
    }

    @Override // defpackage.fs6
    public void d(Bundle bundle) {
        if (bundle != null) {
            this.j = bundle.getParcelable(gs6.class.getName());
        }
    }

    @Override // defpackage.fs6
    public ViewGroup e() {
        return this.i;
    }

    @Override // defpackage.fs6
    public twd f() {
        return this.f;
    }

    @Override // defpackage.fs6
    public void g(ar6 ar6, List<? extends View> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.h.addView((View) list.get(i2), i2);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        if (ar6.i()) {
            layoutParams.topMargin = 0;
        } else {
            layoutParams.topMargin = d.c(this.c);
        }
        this.h.setLayoutParams(layoutParams);
    }

    @Override // defpackage.fs6
    public void h(List<? extends View> list) {
        for (View view : list) {
            this.h.addView(view);
        }
    }

    @Override // defpackage.fs6
    public void i(RecyclerView recyclerView) {
        this.g = recyclerView;
        recyclerView.setLayoutManager(this.e.create());
        this.g.n(new a());
        this.d.get().g(this.g);
    }

    public /* synthetic */ int k(int i2) {
        twd twd = this.f;
        if (twd != null) {
            return twd.g0(i2);
        }
        return -1;
    }
}

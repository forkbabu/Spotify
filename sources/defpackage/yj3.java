package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.core.app.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Optional;
import com.spotify.android.glue.components.toolbar.e;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarManager;
import com.spotify.android.goldenpath.a;
import com.spotify.android.paste.app.c;
import com.spotify.android.paste.app.d;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.addtoplaylist.AddToPlaylistActivity;
import com.spotify.playlist.models.j;
import defpackage.di9;
import defpackage.zh3;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yj3  reason: default package */
public class yj3 implements wj3, zh3.c {
    private final Activity a;
    private final gi9 b;
    private final zh3 c;
    private final fi3 d;
    private final fj3 e;
    private Button f;
    private ck3 g;
    private Parcelable h;
    private LoadingView i;
    private RecyclerView j;
    private twd k;
    private ToolbarManager l;
    private ViewGroup m;
    private ViewGroup n;
    private View o;

    public yj3(Activity activity, fi3 fi3, gi9 gi9, zh3.a aVar, fj3 fj3) {
        this.a = activity;
        this.b = gi9;
        this.c = aVar.a(this);
        this.d = fi3;
        this.e = fj3;
    }

    public void A() {
        this.l.b(false);
    }

    @Override // defpackage.zh3.c
    public void a(j jVar, int i2) {
        this.e.a(jVar, i2);
    }

    public void c() {
        this.a.finishAffinity();
    }

    public void d() {
        this.k.i0(0);
    }

    public void e() {
        this.k.i0(3);
    }

    public void f() {
        this.k.i0(4);
    }

    public void g() {
        this.k.i0(1);
    }

    public void h() {
        this.o.setVisibility(8);
        this.b.f();
    }

    public void i() {
        this.l.b(true);
    }

    public /* synthetic */ void j(View view) {
        this.e.k();
    }

    public /* synthetic */ void k(View view) {
        this.e.f();
    }

    public /* synthetic */ void l(View view) {
        this.e.m();
    }

    public /* synthetic */ void m(Parcelable parcelable) {
        RecyclerView.m layoutManager = this.j.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.h1(parcelable);
        }
    }

    public /* synthetic */ void n(View view) {
        this.e.b();
        this.a.finish();
    }

    public View o(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0707R.layout.activity_add_to_playlist, viewGroup, false);
        this.m = viewGroup2;
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(C0707R.id.content);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        RecyclerView recyclerView = new RecyclerView(this.a, null);
        this.j = recyclerView;
        recyclerView.setId(C0707R.id.recycler_view);
        this.j.setLayoutParams(layoutParams);
        this.j.setLayoutManager(new LinearLayoutManager(this.a));
        LinearLayout linearLayout = new LinearLayout(this.a);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.addView(this.j);
        linearLayout.setVisibility(4);
        viewGroup3.addView(linearLayout);
        this.k = new twd(false);
        LinearLayout linearLayout2 = new LinearLayout(this.a);
        this.f = c.g().a(this.a);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(17);
        this.f.setId(C0707R.id.add_to_playlist_create_button);
        this.f.setText(this.a.getString(C0707R.string.add_to_playlist_create_button));
        this.f.setOnClickListener(new tj3(this));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = nud.g(24.0f, this.a.getResources());
        layoutParams2.bottomMargin = nud.g(24.0f, this.a.getResources());
        linearLayout2.addView(this.f, layoutParams2);
        this.k.Z(new v02(linearLayout2, true), 0);
        View a2 = new ak3(layoutInflater, viewGroup3).a();
        a2.setOnClickListener(new vj3(this));
        this.k.Z(new v02(a2, true), 1);
        this.k.i0(1);
        if (this.e.g()) {
            ck3 ck3 = new ck3(viewGroup3);
            ck3.a().setOnClickListener(new sj3(this));
            this.g = ck3;
            this.k.Z(new v02(ck3.a(), true), 2);
        }
        this.k.Z(this.c, Integer.MIN_VALUE);
        gb0 a3 = e90.c().a(this.a, viewGroup3);
        a3.setTitle(this.a.getString(C0707R.string.add_to_playlist_empty_folder_title));
        a3.setSubtitle(this.a.getString(C0707R.string.add_to_playlist_empty_folder_subtitle));
        this.k.Z(new v02(a3.getView(), false), 4);
        this.k.i0(4);
        gb0 a4 = e90.c().a(this.a, viewGroup3);
        a4.setTitle(this.a.getString(C0707R.string.add_to_playlist_empty_filter_title));
        a4.setSubtitle(this.a.getString(C0707R.string.add_to_playlist_empty_filter_subtitle));
        this.k.Z(new v02(a4.getView(), false), 3);
        this.k.i0(3);
        this.j.setAdapter(this.k);
        LoadingView m2 = LoadingView.m(layoutInflater, this.a, linearLayout);
        this.i = m2;
        m2.n();
        viewGroup3.addView(this.i, -1, -1);
        this.i.setBackgroundResource(R.color.black_50);
        if (bundle != null) {
            this.h = bundle.getParcelable("list");
            this.e.e(Optional.fromNullable(bundle.getString("text_field")));
        }
        ViewGroup viewGroup4 = (ViewGroup) this.m.findViewById(C0707R.id.toolbar_wrapper);
        this.n = viewGroup4;
        a.b(this.a);
        com.spotify.android.glue.components.toolbar.c c2 = l70.c(this.a, viewGroup4);
        e eVar = (e) c2;
        eVar.setTitle(this.a.getString(C0707R.string.add_to_playlist_title));
        d.d(viewGroup4, this.a);
        viewGroup4.addView(eVar.getView());
        ToolbarManager toolbarManager = new ToolbarManager(this.a, c2, new uj3(this));
        this.l = toolbarManager;
        toolbarManager.h(true);
        this.l.g(true);
        this.e.h(this);
        return this.m;
    }

    public void p(List<j> list) {
        this.c.c0(list);
        Parcelable parcelable = this.h;
        if (parcelable != null) {
            this.j.post(new rj3(this, parcelable));
            this.h = null;
        }
    }

    public void q(Bundle bundle) {
        RecyclerView.m layoutManager;
        RecyclerView recyclerView = this.j;
        if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null)) {
            bundle.putParcelable("list", layoutManager.i1());
        }
        bundle.putString("text_field", this.e.l().orNull());
    }

    public void r(String str, String str2, List<String> list) {
        String m2 = this.d.m();
        String d2 = this.d.d();
        Activity activity = this.a;
        int i2 = AddToPlaylistActivity.R;
        Intent intent = new Intent(activity, AddToPlaylistActivity.class);
        intent.putExtra("folder_uri", str);
        intent.putExtra("folder_title", str2);
        intent.putStringArrayListExtra("item_uris", new ArrayList<>(list));
        intent.putExtra("source_view_uri", d2);
        intent.putExtra("source_context_uri", m2);
        Activity activity2 = this.a;
        Bundle c2 = b.a(activity2, 17432576, 17432577).c();
        int i3 = androidx.core.content.a.b;
        int i4 = Build.VERSION.SDK_INT;
        activity2.startActivity(intent, c2);
    }

    public void s(boolean z) {
        ck3 ck3 = this.g;
        if (ck3 != null) {
            ck3.b(z);
        }
    }

    public void t(int i2) {
        ck3 ck3 = this.g;
        if (ck3 != null) {
            ck3.c(i2);
        }
    }

    public void u() {
        this.k.l0(0);
    }

    public void v() {
        this.k.l0(3);
    }

    public void w() {
        this.k.l0(4);
    }

    public void x() {
        this.k.l0(1);
    }

    public void y(String str) {
        if (this.o == null) {
            ViewGroup viewGroup = this.n;
            ViewGroup viewGroup2 = this.m;
            gi9 gi9 = this.b;
            LayoutInflater from = LayoutInflater.from(this.a);
            di9.a a2 = di9.a();
            a2.c(true);
            this.o = gi9.h(from, viewGroup, viewGroup2, a2.a(), new xj3(this));
            int g2 = nud.g(8.0f, this.a.getResources());
            this.o.setPadding(0, g2, g2, g2);
            viewGroup.addView(this.o);
        }
        this.o.setVisibility(0);
        this.b.e(str);
        this.b.b();
    }

    public void z(boolean z) {
        if (z) {
            this.i.q();
            this.i.r();
            return;
        }
        this.i.n();
    }
}

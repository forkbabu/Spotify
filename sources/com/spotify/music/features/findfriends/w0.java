package com.spotify.music.features.findfriends;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.spotify.music.C0707R;
import com.spotify.music.features.findfriends.model.UserModel;
import com.spotify.pageloader.s0;
import io.reactivex.s;

public class w0 implements s0, c1 {
    private final y0 a;
    private final l15 b;
    private final r0 c;
    private RecyclerView f;
    private View n;
    private View o;
    private EditText p;
    private View q;

    class a extends l62 {
        a() {
        }

        @Override // defpackage.l62, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            w0.this.a.l(charSequence != null ? charSequence.toString() : "");
        }
    }

    class b extends RecyclerView.q {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void a(RecyclerView recyclerView, int i) {
            w0.this.p.clearFocus();
            ((InputMethodManager) recyclerView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(w0.this.p.getWindowToken(), 0);
        }
    }

    public w0(s<p0> sVar, z0 z0Var, l15 l15, r0 r0Var) {
        y0 b2 = z0Var.b(this, sVar);
        this.a = b2;
        this.b = l15;
        this.c = r0Var;
        l15.f0(new b(b2));
        l15.g0(new l0(b2));
        l15.i0(new j0(b2));
    }

    @Override // com.spotify.music.features.findfriends.c1
    public void a(ImmutableList<UserModel> immutableList) {
        this.b.j0(immutableList);
        RecyclerView recyclerView = this.f;
        if (recyclerView != null && recyclerView.getAdapter() == null) {
            this.f.setAdapter(this.b);
        }
    }

    @Override // com.spotify.music.features.findfriends.c1
    public void b(int i) {
        this.c.a(i, new t(this), new q(this));
    }

    @Override // com.spotify.music.features.findfriends.c1
    public void c(boolean z) {
        this.b.k0(z);
    }

    @Override // com.spotify.music.features.findfriends.c1
    public void e(boolean z) {
        View view = this.o;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.spotify.music.features.findfriends.c1
    public void g(boolean z) {
        this.q.setVisibility(z ? 0 : 8);
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.n;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_findfriends, viewGroup, false);
        this.n = inflate;
        EditText editText = (EditText) inflate.findViewById(C0707R.id.findfriends_filter);
        this.p = editText;
        editText.addTextChangedListener(new a());
        this.p.setOnFocusChangeListener(new s(this));
        RecyclerView recyclerView = (RecyclerView) this.n.findViewById(C0707R.id.recycler_view);
        this.f = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.f.n(new b());
        this.o = this.n.findViewById(C0707R.id.unconnected_views);
        ((Button) this.n.findViewById(C0707R.id.findfriends_connect_fb_button)).setOnClickListener(new r(this));
        nb0 b2 = pb0.b(context, (ViewGroup) this.n);
        b2.setTitle(context.getString(C0707R.string.error_general_title));
        b2.setSubtitle(context.getResources().getString(C0707R.string.find_friends_flow_empty));
        View view = b2.getView();
        this.q = view;
        view.setVisibility(8);
        ((ViewGroup) this.n).addView(this.q);
    }

    public /* synthetic */ void l(View view, boolean z) {
        if (z) {
            this.a.b();
        }
    }

    public /* synthetic */ void m(View view) {
        this.a.a();
    }

    public /* synthetic */ void n(DialogInterface dialogInterface, int i) {
        this.a.d();
    }

    public void o(DialogInterface dialogInterface, int i) {
        this.a.getClass();
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        this.a.n();
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        this.a.o();
    }
}

package com.spotify.music.libs.callingcode;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.glue.components.toolbar.GlueToolbarLayout;
import com.spotify.android.glue.components.toolbar.ToolbarSide;
import com.spotify.android.glue.components.toolbar.e;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.libs.callingcode.json.CallingCode;
import com.spotify.music.C0707R;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.b;
import dagger.android.h;
import java.util.List;

public class CallingCodePickerActivity extends jd0 implements m, h, zq0 {
    public static final /* synthetic */ int G = 0;
    yq0 C;
    DispatchingAndroidInjector<Object> D;
    private RecyclerView.m E;
    private d F;

    class a implements SearchView.l {
        a() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean a(String str) {
            CallingCodePickerActivity.this.C.d(str);
            return true;
        }
    }

    @Override // dagger.android.h
    public b<Object> C() {
        return this.D;
    }

    public void O0(String str) {
        this.F.k0(str);
    }

    public void P0(int i) {
        this.E.v1(i);
    }

    public void R0(List<CallingCode> list) {
        this.F.f0(list);
    }

    @Override // defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        dagger.android.a.a(this);
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_calling_code_picker);
        e eVar = new e((GlueToolbarLayout) findViewById(C0707R.id.toolbar));
        eVar.setTitle(getString(C0707R.string.title));
        ImageButton i = z42.i(this, SpotifyIconV2.X);
        i.setId(C0707R.id.action_cancel);
        eVar.H1(ToolbarSide.START, i, C0707R.id.action_cancel);
        i.setOnClickListener(new a(this));
        ((SearchView) findViewById(C0707R.id.search_view)).setOnQueryTextListener(new a());
        this.E = new LinearLayoutManager(1, false);
        yq0 yq0 = this.C;
        yq0.getClass();
        this.F = new d(new b(yq0));
        View findViewById = findViewById(C0707R.id.recycler_view);
        findViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) findViewById;
        recyclerView.setLayoutManager(this.E);
        recyclerView.setAdapter(this.F);
    }

    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onResume() {
        super.onResume();
        findViewById(C0707R.id.search_view_container).requestFocus();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        this.C.f(this, getIntent().getStringExtra("selected-country-code"), getIntent().getParcelableArrayListExtra("calling-codes"));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        super.onStop();
        this.C.g();
    }
}

package com.spotify.music.features.createplaylist;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.n;
import com.google.common.base.MoreObjects;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.instrumentation.a;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.t0;
import java.util.ArrayList;
import java.util.List;

public class CreatePlaylistActivity extends ss2 implements yt4, mfd, c.a, xt4 {
    public static final /* synthetic */ int P = 0;
    n G;
    t0<String> H;
    zac I;
    su4 J;
    private String K;
    private List<String> L;
    private String M;
    private String N;
    private PageLoaderView<String> O;

    public static Intent U0(Context context, String str, List<String> list, String str2, String str3) {
        for (String str4 : list) {
            MoreObjects.checkArgument(l0.c(str4, LinkType.TRACK, LinkType.ALBUM, LinkType.SHOW_EPISODE), "The item uri must be either a track, episode or an album uri.");
        }
        if (!MoreObjects.isNullOrEmpty(str)) {
            MoreObjects.checkArgument(l0.b(str, LinkType.COLLECTION_PLAYLIST_FOLDER), "The folder uri must be a folder uri.");
        }
        Intent y = je.y(context, CreatePlaylistActivity.class, "folder_uri", str);
        y.putStringArrayListExtra("item_uris", new ArrayList<>(list));
        y.putExtra("source_view_uri", str2);
        y.putExtra("source_context_uri", str3);
        return y;
    }

    @Override // defpackage.xt4
    public String d() {
        String str = this.M;
        return str != null ? str : "";
    }

    @Override // defpackage.mfd
    public a g1() {
        return PageIdentifiers.PLAYLIST_CREATE;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public c getViewUri() {
        return ViewUris.K0;
    }

    @Override // defpackage.yt4
    public String i() {
        return this.K;
    }

    @Override // defpackage.yt4
    public List<String> l() {
        return this.L;
    }

    @Override // defpackage.xt4
    public String m() {
        String str = this.N;
        return str != null ? str : "";
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.J.a();
        super.onBackPressed();
    }

    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        ArrayList<String> arrayList;
        if (bundle != null) {
            arrayList = bundle.getStringArrayList("item_uris");
            this.K = bundle.getString("folder_uri");
            this.M = bundle.getString("source_view_uri");
            this.N = bundle.getString("source_context_uri");
        } else {
            arrayList = getIntent().getStringArrayListExtra("item_uris");
            this.K = getIntent().getStringExtra("folder_uri");
            this.M = getIntent().getStringExtra("source_view_uri");
            this.N = getIntent().getStringExtra("source_context_uri");
        }
        this.L = (List) MoreObjects.firstNonNull(arrayList, new ArrayList(0));
        super.onCreate(bundle);
        this.J.c(bundle);
        PageLoaderView.a b = this.I.b(ViewUris.K0, u0());
        b.e(new a(this));
        PageLoaderView<String> a = b.a(this);
        this.O = a;
        setContentView(a);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("item_uris", new ArrayList<>(this.L));
        bundle.putString("folder_uri", this.K);
        bundle.putString("source_view_uri", this.M);
        bundle.putString("source_context_uri", this.N);
        this.J.b(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        this.O.j0(this.G, this.H);
        this.H.start();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        super.onStop();
        this.H.stop();
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.PLAYLIST_CREATE, ViewUris.K0.toString());
    }
}

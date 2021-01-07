package com.spotify.music.features.localfilesimport.activity;

import android.common.view.SlidingTabLayout;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import androidx.viewpager.widget.ViewPager;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.d0;
import com.spotify.android.glue.patterns.toolbarmenu.e0;
import com.spotify.android.paste.app.a;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.foundation.R;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.activity.PermissionsRequestActivity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.o0;
import com.spotify.music.C0707R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.localfilesimport.model.LocalItem;
import com.spotify.music.features.localfilesimport.model.PageType;
import com.spotify.music.features.localfilesimport.util.LocalFilesImportMessaging;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.t;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.rxjava2.p;
import defpackage.mn5;
import io.reactivex.functions.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.y;
import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class LocalFilesImportActivity extends ss2 implements d0, com.spotify.android.glue.components.toolbar.d, mfd {
    private static final String f0 = ViewUris.t1.toString();
    private static final com.spotify.music.libs.viewuri.c g0 = ViewUris.P1;
    public static final /* synthetic */ int h0 = 0;
    private ActionBar G;
    private LocalFilesImportMessaging H;
    private com.spotify.android.flags.c I;
    private final p J = new p();
    private s<e> K;
    private final Set<String> L = new HashSet();
    private boolean M;
    private View N;
    private LoadingView O;
    private View P;
    private ViewPager Q;
    private boolean R;
    t S;
    o0 T;
    y U;
    y V;
    t8a W;
    w52 X;
    ln5 Y;
    qn5 Z;
    com.spotify.music.features.localfilesimport.util.e a0;
    ContentResolver b0;
    private final g<e> c0 = new i(this);
    final mn5.b d0 = new a();
    private final u e0 = new b();

    /* access modifiers changed from: private */
    public enum Status {
        SCANNING,
        HAVE_CONTENT,
        NO_CONTENT_NO_FILES,
        NO_CONTENT_EVERYTHING_IMPORTED,
        NEED_PERMISSIONS
    }

    class a implements mn5.b {
        private final Set<mn5.b.a> a = new HashSet();

        a() {
        }

        @Override // defpackage.mn5.b
        public void a(LocalItem localItem, boolean z, mn5.b.a aVar) {
            e(ImmutableList.of(localItem), z, aVar);
        }

        @Override // defpackage.mn5.b
        public boolean b(LocalItem localItem) {
            return LocalFilesImportActivity.this.L.containsAll(localItem.trackIds());
        }

        @Override // defpackage.mn5.b
        public boolean c(LocalItem localItem) {
            for (String str : localItem.trackIds()) {
                if (LocalFilesImportActivity.this.L.contains(str)) {
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.mn5.b
        public void d(mn5.b.a aVar) {
            this.a.remove(aVar);
        }

        @Override // defpackage.mn5.b
        public void e(ImmutableList<LocalItem> immutableList, boolean z, mn5.b.a aVar) {
            if (z) {
                UnmodifiableListIterator<LocalItem> listIterator = immutableList.listIterator();
                while (listIterator.hasNext()) {
                    LocalFilesImportActivity.this.L.addAll(listIterator.next().trackIds());
                }
            } else {
                UnmodifiableListIterator<LocalItem> listIterator2 = immutableList.listIterator();
                while (listIterator2.hasNext()) {
                    LocalFilesImportActivity.this.L.removeAll(listIterator2.next().trackIds());
                }
            }
            for (mn5.b.a aVar2 : this.a) {
                if (!aVar2.equals(aVar)) {
                    aVar2.a();
                }
            }
            LocalFilesImportActivity.V0(LocalFilesImportActivity.this);
        }

        @Override // defpackage.mn5.b
        public void f(mn5.b.a aVar) {
            this.a.add(aVar);
        }
    }

    class b implements u {
        b() {
        }

        @Override // com.spotify.android.glue.patterns.prettylist.u
        public void a(float f) {
        }

        @Override // com.spotify.android.glue.patterns.prettylist.u
        public void b(boolean z) {
        }

        @Override // com.spotify.android.glue.patterns.prettylist.u
        public void c(float f) {
        }

        @Override // com.spotify.android.glue.patterns.prettylist.u
        public void o(float f) {
        }

        @Override // com.spotify.android.glue.patterns.prettylist.u
        public void setTitle(String str) {
            LocalFilesImportActivity.this.G.n(str);
        }

        @Override // com.spotify.android.glue.patterns.prettylist.u
        public void u(Drawable drawable) {
        }
    }

    class c extends ViewPager.l {
        private boolean a;
        private int b;
        private int c;

        c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public void a(int i) {
            boolean z = this.a;
            if (!z && i == 1) {
                this.a = true;
                this.c = this.b;
            } else if (z && i == 0) {
                this.a = false;
                if (this.b != this.c) {
                    LocalFilesImportActivity.this.a0.p();
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void g(int i) {
            LocalFilesImportActivity.this.a0.o(PageType.n[i]);
            this.b = i;
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LocalFilesImportActivity.X0(LocalFilesImportActivity.this);
        }
    }

    /* access modifiers changed from: private */
    public static class e {
        private final Status a;

        public e(Status status, ImmutableList<? extends LocalItem> immutableList) {
            this.a = status;
            if (immutableList != null) {
                ImmutableList.copyOf((Collection) immutableList);
            }
        }

        public Status a() {
            return this.a;
        }
    }

    static void V0(LocalFilesImportActivity localFilesImportActivity) {
        View view = localFilesImportActivity.P;
        if (view != null) {
            view.setEnabled(!localFilesImportActivity.L.isEmpty());
        }
    }

    static void X0(LocalFilesImportActivity localFilesImportActivity) {
        localFilesImportActivity.R = true;
        int size = localFilesImportActivity.L.size();
        if (size > 0) {
            localFilesImportActivity.W.c((String[]) localFilesImportActivity.L.toArray(new String[0]), "local_files_import", false);
            LocalFilesImportMessaging localFilesImportMessaging = localFilesImportActivity.H;
            if (localFilesImportMessaging == LocalFilesImportMessaging.DIALOG) {
                String quantityString = localFilesImportActivity.getResources().getQuantityString(C0707R.plurals.local_files_imported_dialog_body, size, Integer.valueOf(size));
                a.C0151a aVar = new a.C0151a(localFilesImportActivity, C0707R.style.res_2132083498_theme_glue_dialog);
                aVar.j(C0707R.string.local_files_imported_dialog_dismiss, new a(localFilesImportActivity));
                aVar.g(C0707R.string.local_files_imported_dialog_view, new g(localFilesImportActivity));
                aVar.i(new q(localFilesImportActivity));
                aVar.e(quantityString);
                aVar.f(localFilesImportActivity, PageIdentifiers.DIALOG_LOCALFILESIMPORT_SONGS.path(), g0.toString());
                aVar.c().show();
                localFilesImportActivity.a0.i();
            } else {
                if (localFilesImportMessaging == LocalFilesImportMessaging.TOAST) {
                    localFilesImportActivity.T.b(SpotifyIconV2.CHECK, localFilesImportActivity.getResources().getQuantityString(C0707R.plurals.toast_imported_to_collection, size, Integer.valueOf(size)), 0, 0);
                }
                localFilesImportActivity.finish();
            }
        }
        localFilesImportActivity.a0.h();
    }

    private void f1() {
        a.C0151a aVar = new a.C0151a(this, C0707R.style.res_2132083498_theme_glue_dialog);
        aVar.j(C0707R.string.local_files_confirm_abort_dialog_button_ok, new b(this));
        aVar.g(C0707R.string.local_files_confirm_abort_dialog_button_cancel, new p(this));
        aVar.d(C0707R.string.local_files_confirm_abort_dialog_body);
        aVar.f(this, PageIdentifiers.DIALOG_LOCALFILESIMPORT_DISCARD.path(), g0.toString());
        aVar.c().show();
        this.a0.d();
    }

    private void i1(int i, DialogInterface.OnClickListener onClickListener) {
        a.C0151a aVar = new a.C0151a(this, C0707R.style.res_2132083498_theme_glue_dialog);
        aVar.j(C0707R.string.local_files_import_dialog_button_ok, onClickListener);
        aVar.i(new o(this));
        aVar.d(i);
        aVar.f(this, PageIdentifiers.DIALOG_LOCALFILESIMPORT_OK.path(), g0.toString());
        aVar.c().show();
    }

    private void j1(Status status) {
        if (!this.R) {
            int ordinal = status.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        this.R = true;
                        this.a0.m();
                        this.O.q();
                        this.N.setVisibility(8);
                        i1(C0707R.string.local_files_import_empty_body, new d(this));
                    } else if (ordinal == 3) {
                        this.R = true;
                        this.a0.f();
                        this.O.q();
                        this.N.setVisibility(8);
                        i1(C0707R.string.local_files_import_empty_body_everything_imported, new h(this));
                    } else if (ordinal != 4) {
                        Assertion.p("Unknown status " + status);
                    } else {
                        this.R = true;
                        this.O.q();
                        this.N.setVisibility(8);
                        i1(C0707R.string.local_files_import_need_permission_body, new j(this));
                    }
                } else if (this.O.p()) {
                    this.O.n();
                    this.a0.o(PageType.n[this.Q.getCurrentItem()]);
                }
            } else if (!this.O.p()) {
                if (this.O.o()) {
                    this.O.q();
                }
                this.O.r();
            }
        }
    }

    @Override // com.spotify.android.glue.components.toolbar.d
    public void P() {
    }

    @Override // com.spotify.android.glue.components.toolbar.d
    public u R() {
        return this.e0;
    }

    /* access modifiers changed from: package-private */
    public s<Set<String>> a1(Uri uri) {
        return s.c0(new c(this, uri)).I0(this.V).o0(this.U);
    }

    public mn5.b b1() {
        return this.d0;
    }

    public void c1(e eVar) {
        Logger.b("Local files: status and tracks observable onNext() status %s", eVar.a());
        j1(eVar.a());
        View view = this.P;
        if (view != null) {
            view.setEnabled(true ^ this.L.isEmpty());
        }
    }

    public /* synthetic */ void d1(DialogInterface dialogInterface, int i) {
        com.spotify.music.features.localfilesimport.util.e eVar = this.a0;
        String str = f0;
        this.S.b(str, eVar.k(str));
        finish();
    }

    @Override // com.spotify.android.glue.patterns.toolbarmenu.d0
    public void g(a0 a0Var) {
        View n = e0.n(a0Var, getString(C0707R.string.local_files_import_import_button), C0707R.id.actionbar_item_done, new d());
        this.P = n;
        n.setEnabled(!this.L.isEmpty());
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.LOCALFILESIMPORT;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public com.spotify.music.libs.viewuri.c getViewUri() {
        return g0;
    }

    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 4660) {
            boolean z = !((PermissionsRequestActivity.a) intent.getParcelableExtra("permission_result")).a();
            this.M = z;
            j1(z ? Status.NEED_PERMISSIONS : Status.SCANNING);
            if (!this.M) {
                this.J.b(this.K.subscribe(this.c0, m.a));
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (LocalFilesImportActivity.this.L.isEmpty()) {
            super.onBackPressed();
        } else {
            f1();
        }
    }

    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        SpannableString spannableString;
        File externalStoragePublicDirectory;
        super.onCreate(bundle);
        com.spotify.android.flags.c b2 = com.spotify.android.flags.d.b(this);
        this.I = b2;
        if (!on5.c(b2)) {
            finish();
            return;
        }
        setContentView(C0707R.layout.activity_local_files_import);
        View findViewById = findViewById(C0707R.id.root);
        this.N = findViewById(C0707R.id.content);
        LoadingView loadingView = (LoadingView) findViewById(C0707R.id.loading_view);
        this.O = loadingView;
        loadingView.setTargetContentView(this.N);
        this.O.setListener(new com.spotify.music.contentviewstate.view.a(this, this.N));
        this.N.setVisibility(4);
        j1(Status.SCANNING);
        this.Q = (ViewPager) this.N.findViewById(C0707R.id.pager);
        this.Q.setAdapter(this.Y.b(v0(), this, this.I));
        this.Q.setOffscreenPageLimit(kn5.j);
        this.Q.c(new c());
        ((SlidingTabLayout) this.N.findViewById(C0707R.id.tabs)).setViewPager(this.Q);
        boolean z = false;
        if (bundle == null) {
            Intent intent = getIntent();
            this.Q.setCurrentItem(((PageType) intent.getSerializableExtra("page")).ordinal());
            this.H = (LocalFilesImportMessaging) intent.getSerializableExtra("messaging");
        } else {
            ViewPager viewPager = this.Q;
            PageType pageType = PageType.FOLDERS;
            viewPager.setCurrentItem(bundle.getInt("page", 0));
            this.H = (LocalFilesImportMessaging) bundle.getSerializable("messaging");
            int i = bundle.getInt("num_staged");
            this.L.clear();
            for (int i2 = 0; i2 < i; i2++) {
                Set<String> set = this.L;
                set.add(bundle.getString("staged_item" + i2));
            }
        }
        ActionBar I0 = I0();
        I0.getClass();
        this.G = I0;
        I0.j(true);
        this.G.i(true);
        this.G.l(new SpotifyIconDrawable(this, SpotifyIcon.X_24));
        this.G.k(0.0f);
        String string = getString(C0707R.string.local_files_import_title);
        Typeface e2 = i2.e(this, R.font.encore_font_circular_bold);
        int i3 = sud.b;
        if (string == null) {
            spannableString = null;
        } else {
            SpannableString spannableString2 = new SpannableString(string);
            spannableString2.setSpan(new sud(e2), 0, string.length(), 33);
            spannableString = spannableString2;
        }
        setTitle(spannableString);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, com.spotify.android.paste.app.d.b(this), 0, 0);
        findViewById.setLayoutParams(layoutParams);
        String externalStorageState = Environment.getExternalStorageState();
        this.K = s.m(a1(MediaStore.Audio.Media.INTERNAL_CONTENT_URI), a1(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI), s.i0(ImmutableSet.of((("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) && (externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC)) != null && !MoreObjects.isNullOrEmpty(externalStoragePublicDirectory.getAbsolutePath())) ? externalStoragePublicDirectory.getAbsolutePath() : "")), n.a).J0(new k(this)).J0(new f(this)).o0(this.U);
        if (Build.VERSION.SDK_INT >= 23 && !this.X.f(this, "android.permission.READ_EXTERNAL_STORAGE")) {
            this.X.c(this, "android.permission.READ_EXTERNAL_STORAGE");
            z = true;
        }
        this.M = z;
    }

    @Override // defpackage.jd0, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        ToolbarConfig.b(this, this, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            if (LocalFilesImportActivity.this.L.isEmpty()) {
                finish();
            } else {
                f1();
            }
            this.a0.a();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putSerializable("messaging", this.H);
        ViewPager viewPager = this.Q;
        if (viewPager != null) {
            bundle.putInt("page", viewPager.getCurrentItem());
        }
        bundle.putInt("num_staged", this.L.size());
        int i = 0;
        for (String str : this.L) {
            StringBuilder V0 = je.V0("staged_item");
            int i2 = i + 1;
            V0.append(i);
            bundle.putString(V0.toString(), str);
            i = i2;
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        if (!this.M) {
            this.J.b(this.K.subscribe(this.c0, l.a));
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        super.onStop();
        this.J.b(EmptyDisposable.INSTANCE);
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.LOCALFILESIMPORT, null);
    }
}

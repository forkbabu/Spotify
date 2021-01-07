package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import com.spotify.android.glue.components.toolbar.ToolbarSide;
import com.spotify.android.glue.components.toolbar.e;
import com.spotify.android.paste.app.d;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.features.editplaylist.dialog.SavePlaylistDialog;
import com.spotify.music.features.editplaylist.header.SimpleHeaderLayout;
import com.spotify.music.features.editplaylist.header.SimpleHeaderView;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorButton;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;
import com.spotify.playlist.models.l;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.iw4;
import java.util.List;

/* renamed from: gy4  reason: default package */
public class gy4 implements fy4 {
    private final Picasso a;
    private final Activity b;
    private final iw4 c;
    private final com.spotify.music.imagepicker.c d;
    private final SavePlaylistDialog e;
    private final px4 f;
    private RecyclerView g;
    private Drawable h;
    private kb0 i;
    private v02 j;
    private iy4 k;

    /* access modifiers changed from: package-private */
    /* renamed from: gy4$a */
    public class a extends l62 {
        a() {
        }

        @Override // defpackage.l62, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            gy4.this.f.o(charSequence.toString().trim());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: gy4$b */
    public class b extends l62 {
        b() {
        }

        @Override // defpackage.l62, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            gy4.this.f.i(charSequence.toString().trim());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: gy4$c */
    public class c extends RecyclerView.g {
        c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void a() {
            gy4.this.f.u(gy4.this.c.g0());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void d(int i, int i2) {
            gy4.this.f.u(gy4.this.c.g0());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void f(int i, int i2) {
            gy4.this.f.u(gy4.this.c.g0());
        }
    }

    public gy4(Picasso picasso, Activity activity, iw4.a aVar, com.spotify.music.imagepicker.c cVar, SavePlaylistDialog savePlaylistDialog, px4 px4) {
        this.a = picasso;
        this.b = activity;
        this.c = aVar.a(this);
        this.d = cVar;
        this.e = savePlaylistDialog;
        this.f = px4;
    }

    public void A(String str) {
        this.k.setText(str);
    }

    public void B(boolean z) {
        this.k.J0(z);
    }

    public void C(boolean z) {
        this.c.l0(z);
    }

    public void D(boolean z) {
        this.k.I0(z);
    }

    public void E(boolean z) {
        this.k.S0(z);
    }

    public void F(boolean z) {
        this.k.Z0(z);
    }

    public void G(boolean z) {
        this.k.A1(z);
    }

    public void H(boolean z) {
        this.k.E1(z);
    }

    public void I(boolean z) {
        iw4 iw4;
        v02 v02;
        RecyclerView.e adapter = this.g.getAdapter();
        if (z && adapter != (v02 = this.j)) {
            this.g.setAdapter(v02);
        } else if (!z && adapter != (iw4 = this.c)) {
            this.g.setAdapter(iw4);
        }
    }

    public void J(boolean z) {
        if (z) {
            this.i.setTitle(C0707R.string.edit_playlist_empty_view_title);
        } else {
            this.i.setTitle("");
        }
    }

    public void K() {
        this.e.i(SavePlaylistDialog.State.ERROR);
    }

    public void L() {
        this.e.i(SavePlaylistDialog.State.SAVING);
    }

    @Override // defpackage.iw4.b
    public void a(l lVar, int i2) {
        this.f.a(lVar, i2);
    }

    @Override // defpackage.iw4.b
    public void b(l lVar, String str, String str2, int i2, int i3) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.b.getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            accessibilityManager.interrupt();
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            obtain.getText().add(this.b.getString(C0707R.string.edit_playlist_row_moved_accessibility_announcement, new Object[]{lVar.e(), Integer.toString(i2), Integer.toString(i3)}));
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
        this.f.h(lVar.getUri(), str, str2);
    }

    public void e(l lVar, int i2) {
        this.c.f0(lVar, i2);
    }

    public void f() {
        this.b.finish();
    }

    public void g() {
        this.e.d();
    }

    public boolean h() {
        return Build.VERSION.SDK_INT >= 23 && this.b.checkSelfPermission("android.permission.CAMERA") != 0;
    }

    public boolean i() {
        return Build.VERSION.SDK_INT >= 23 && this.b.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
    }

    public /* synthetic */ void j(View view) {
        this.f.f();
    }

    public /* synthetic */ void k(View view) {
        this.f.n();
    }

    public /* synthetic */ void l(View view) {
        this.f.s();
    }

    public /* synthetic */ void m(View view) {
        this.f.t();
    }

    public /* synthetic */ void n(View view) {
        this.f.t();
    }

    public void o(int i2, int i3, Intent intent) {
        if (i2 == 1 && i3 == -1 && intent != null && intent.getData() != null) {
            this.f.l(Uri.parse(intent.getData().toString()));
        }
    }

    public View p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0707R.layout.edit_playlist_activity, viewGroup, false);
        com.spotify.android.goldenpath.a.b(this.b);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C0707R.id.toolbar_wrapper);
        e eVar = (e) l70.c(this.b, viewGroup2);
        eVar.setTitle(this.b.getString(C0707R.string.edit_playlist_title));
        d.d(eVar.getView(), this.b);
        viewGroup2.addView(eVar.getView());
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(this.b);
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        stateListAnimatorImageButton.setBackground(null);
        Activity activity = this.b;
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(activity, SpotifyIconV2.X, (float) activity.getResources().getDimensionPixelSize(C0707R.dimen.toolbar_icon_size));
        spotifyIconDrawable.r(androidx.core.content.a.b(this.b, R.color.white));
        stateListAnimatorImageButton.setImageDrawable(spotifyIconDrawable);
        stateListAnimatorImageButton.setContentDescription(this.b.getString(C0707R.string.generic_content_description_close));
        stateListAnimatorImageButton.setOnClickListener(new yx4(this));
        eVar.H1(ToolbarSide.START, stateListAnimatorImageButton, C0707R.id.toolbar_up_button);
        StateListAnimatorButton stateListAnimatorButton = new StateListAnimatorButton(this.b);
        stateListAnimatorButton.setBackground(null);
        stateListAnimatorButton.setText(C0707R.string.edit_playlist_save_button);
        nud.p(this.b, stateListAnimatorButton, C0707R.attr.pasteActionBarTitleTextAppearance);
        stateListAnimatorButton.setOnClickListener(new vx4(this));
        eVar.H1(ToolbarSide.END, stateListAnimatorButton, C0707R.id.toolbar_save_button);
        this.h = yc0.f(this.b);
        SimpleHeaderView simpleHeaderView = (SimpleHeaderView) ((SimpleHeaderLayout) inflate.findViewById(C0707R.id.glue_header_layout)).findViewById(C0707R.id.header_view);
        iy4 iy4 = new iy4(this.b, simpleHeaderView);
        this.k = iy4;
        simpleHeaderView.setContentViewBinder(iy4);
        this.k.W(new wx4(this));
        this.k.c().setOnClickListener(new ux4(this));
        this.k.b().setOnClickListener(new xx4(this));
        this.k.g().addTextChangedListener(new a());
        this.k.d().addTextChangedListener(new b());
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0707R.id.recycler_view);
        this.g = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.b));
        p pVar = new p(new lw4(this.c));
        pVar.g(this.g);
        this.c.j0(pVar);
        this.c.T(new c());
        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) inflate.findViewById(C0707R.id.recycler_view_fast_scroll);
        recyclerViewFastScroller.setVerticalScrollBarEnabled(true);
        recyclerViewFastScroller.setRecyclerView(this.g);
        recyclerViewFastScroller.setEnabled(true);
        this.g.setVerticalScrollBarEnabled(false);
        gb0 a2 = e90.c().a(this.b, this.g);
        this.i = a2;
        a2.setTitle(this.b.getString(C0707R.string.edit_playlist_empty_view_title));
        this.i.getTitleView().setSingleLine(false);
        this.i.getTitleView().setEllipsize(null);
        this.i.getSubtitleView().setVisibility(8);
        this.j = new v02(this.i.getView(), false);
        SavePlaylistDialog savePlaylistDialog = this.e;
        px4 px4 = this.f;
        px4.getClass();
        dy4 dy4 = new dy4(px4);
        px4 px42 = this.f;
        px42.getClass();
        cy4 cy4 = new cy4(px42);
        px4 px43 = this.f;
        px43.getClass();
        savePlaylistDialog.h(dy4, cy4, new ey4(px43));
        ((ViewGroup) inflate.findViewById(C0707R.id.content)).addView(this.k.J());
        this.f.p(this);
        return inflate;
    }

    public void q(int i2, String[] strArr, int[] iArr) {
        if (i2 == 8) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                this.f.j();
            } else {
                this.f.w();
            }
        } else if (i2 != 4) {
        } else {
            if (iArr.length <= 0 || iArr[0] != 0) {
                this.f.m();
            } else {
                this.f.q();
            }
        }
    }

    public void r() {
        this.d.a(1, true, false);
    }

    public void s() {
        this.d.a(1, false, false);
    }

    public void t() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.b.requestPermissions(new String[]{"android.permission.CAMERA"}, 8);
        }
    }

    public void u() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.b.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
        }
    }

    public void v(int i2, int i3) {
        this.k.P0(i2, i3);
    }

    public void w(List<l> list) {
        this.c.k0(list);
        if (this.g.getAdapter() == null) {
            this.g.setAdapter(this.c);
        }
    }

    public void x(String str) {
        this.k.b1(str);
    }

    public void y(Uri uri) {
        ImageView c2 = this.k.c();
        z l = this.a.l(uri);
        l.t(this.h);
        l.g(this.h);
        l.m(c2);
    }

    public void z(boolean z) {
        this.k.z1(z);
    }
}

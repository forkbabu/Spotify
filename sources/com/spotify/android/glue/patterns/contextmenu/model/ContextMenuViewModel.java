package com.spotify.android.glue.patterns.contextmenu.model;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.List;

public class ContextMenuViewModel {
    private final List<c> a = new ArrayList();
    private final List<b> b = new ArrayList();
    private a c = new a();
    private String d;
    private HeaderViewType e = HeaderViewType.TWO_LINE_SQUARE_IMAGE;
    private boolean f;
    private boolean g;
    private boolean h = true;
    private final ItemAppearance i = ItemAppearance.LEFT_ALIGNED_WITH_ICONS;

    public enum HeaderViewType {
        TWO_LINE_SQUARE_IMAGE,
        TWO_LINE_LANDSCAPE_IMAGE,
        LARGE_IMAGE
    }

    public enum ItemAppearance {
        LEFT_ALIGNED_WITH_ICONS(C0707R.layout.solar_context_menu_item, 1, C0707R.integer.solar_context_menu_initial_visible_items, true);
        
        public final boolean mAlwaysShowIcons;
        public final int mGravity;
        public final int mLayoutRes;
        public final int mVisibleItemsRes;

        private ItemAppearance(int i, int i2, int i3, boolean z) {
            this.mLayoutRes = i;
            this.mGravity = i2;
            this.mVisibleItemsRes = i3;
            this.mAlwaysShowIcons = z;
        }
    }

    public ContextMenuViewModel A(boolean z) {
        this.f = z;
        return this;
    }

    public ContextMenuViewModel B(String str) {
        this.d = str;
        return this;
    }

    public ContextMenuViewModel C(SpotifyIconV2 spotifyIconV2) {
        this.c.l(spotifyIconV2);
        return this;
    }

    public void D(boolean z) {
        this.g = z;
    }

    public void E(boolean z) {
        this.h = z;
    }

    public ContextMenuViewModel F(String str) {
        this.c.m(str);
        return this;
    }

    public ContextMenuViewModel G(String str) {
        this.c.n(str);
        return this;
    }

    public ContextMenuViewModel H(int i2) {
        this.c.o(i2);
        return this;
    }

    public boolean I() {
        return this.g;
    }

    public boolean J() {
        return this.h;
    }

    public b a(int i2, CharSequence charSequence) {
        b.C0146b bVar = new b.C0146b(i2, charSequence);
        this.b.add(bVar);
        return bVar;
    }

    public b b(int i2, CharSequence charSequence, Drawable drawable) {
        b.C0146b bVar = new b.C0146b(i2, charSequence, drawable);
        this.b.add(bVar);
        return bVar;
    }

    public b c(int i2, CharSequence charSequence, Drawable drawable, int i3) {
        b.C0146b bVar = new b.C0146b(i2, charSequence, drawable);
        this.b.add(i3, bVar);
        return bVar;
    }

    public void d() {
        this.b.add(new b.a());
    }

    public c e(int i2, CharSequence charSequence, ImmutableList<Drawable> immutableList) {
        c cVar = new c(i2, charSequence, immutableList, 0);
        this.a.add(cVar);
        return cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextMenuViewModel)) {
            return false;
        }
        ContextMenuViewModel contextMenuViewModel = (ContextMenuViewModel) obj;
        if (this.f != contextMenuViewModel.f) {
            return false;
        }
        a aVar = this.c;
        if (aVar == null ? contextMenuViewModel.c != null : !aVar.equals(contextMenuViewModel.c)) {
            return false;
        }
        String str = this.d;
        if (str == null ? contextMenuViewModel.d != null : !str.equals(contextMenuViewModel.d)) {
            return false;
        }
        if (this.e != contextMenuViewModel.e) {
            return false;
        }
        List<b> list = this.b;
        if (list != null) {
            return list.equals(contextMenuViewModel.b);
        }
        if (contextMenuViewModel.b == null) {
            return true;
        }
        return false;
    }

    public void f() {
        this.b.clear();
    }

    public String g() {
        return this.c.a();
    }

    public String h() {
        return this.c.b();
    }

    public int hashCode() {
        a aVar = this.c;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        HeaderViewType headerViewType = this.e;
        int hashCode3 = (((hashCode2 + (headerViewType != null ? headerViewType.hashCode() : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        List<b> list = this.b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode3 + i2;
    }

    public a i() {
        return this.c;
    }

    public Uri j() {
        return this.c.c();
    }

    public ItemAppearance k() {
        return this.i;
    }

    public List<b> l() {
        return this.b;
    }

    public String m() {
        return this.d;
    }

    public SpotifyIconV2 n() {
        return this.c.d();
    }

    public String o() {
        return this.c.e();
    }

    public String p() {
        return this.c.f();
    }

    public List<c> q() {
        return this.a;
    }

    public boolean r() {
        return this.c.g();
    }

    public boolean s() {
        return this.e == HeaderViewType.TWO_LINE_LANDSCAPE_IMAGE;
    }

    public boolean t() {
        return this.e == HeaderViewType.LARGE_IMAGE;
    }

    public boolean u() {
        return this.f;
    }

    public ContextMenuViewModel v(String str) {
        this.c.h(str);
        return this;
    }

    public void w(a aVar) {
        this.c = aVar;
    }

    public ContextMenuViewModel x(Uri uri) {
        this.c.j(uri);
        return this;
    }

    public ContextMenuViewModel y(HeaderViewType headerViewType) {
        this.e = headerViewType;
        return this;
    }

    public ContextMenuViewModel z(boolean z) {
        this.c.k(z);
        return this;
    }
}

package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.hubframework.defaults.components.glue.b;
import com.spotify.mobile.android.util.Assertion;
import defpackage.s51;

public final class n extends b {
    private final boolean a;

    protected static class a extends b.C0174b {
        protected a(ViewGroup viewGroup, w51 w51, boolean z) {
            super(viewGroup, w51, z);
        }

        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.b.C0174b, defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            int i;
            String string = s81.custom().string("backgroundColor");
            Assertion.l(!MoreObjects.isNullOrEmpty(string), "background color missing ");
            super.z(s81, w51, bVar);
            try {
                i = Color.parseColor(string);
            } catch (IllegalArgumentException unused) {
                i = 0;
            }
            V v = this.a;
            Drawable e = nud.e(((RecyclerView) v).getContext(), i);
            int i2 = q4.g;
            int i3 = Build.VERSION.SDK_INT;
            v.setBackground(e);
        }
    }

    public n(boolean z) {
        this.a = z;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a(viewGroup, w51, this.a);
    }
}

package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.hubframework.defaults.components.glue.b;
import com.spotify.music.C0707R;
import defpackage.owd;
import defpackage.s51;

/* renamed from: s65  reason: default package */
public final class s65 extends b implements pk9<View> {
    private final zvd a;
    private final boolean b;

    /* renamed from: s65$a */
    private static class a extends b.C0174b {
        private final zvd p;
        private final Resources q;
        private final owd<View> r = new owd<>(new C0680a());

        /* renamed from: s65$a$a  reason: collision with other inner class name */
        class C0680a implements owd.d {
            C0680a() {
            }

            @Override // defpackage.owd.d
            public void a(int i) {
                Drawable I = a.this.I(i);
                V v = a.this.a;
                int i2 = q4.g;
                int i3 = Build.VERSION.SDK_INT;
                v.setBackground(I);
            }

            @Override // defpackage.owd.d
            public void b(Drawable drawable) {
                Logger.d("Failed to extract color for background in freetier:onDemandContainer component.", new Object[0]);
                a.this.J();
            }
        }

        protected a(ViewGroup viewGroup, w51 w51, zvd zvd, boolean z) {
            super(viewGroup, w51, z);
            this.p = zvd;
            Resources resources = viewGroup.getContext().getResources();
            this.q = resources;
            ((RecyclerView) this.a).setPadding(viewGroup.getPaddingLeft(), nud.g(16.0f, resources), viewGroup.getPaddingRight(), nud.g(12.0f, resources));
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private Drawable I(int i) {
            Resources resources = this.q;
            int i2 = R.color.gray_7;
            int h = s2.h(i2.c(resources, i2, null), 102);
            int h2 = s2.h(i2.c(this.q, i2, null), 229);
            return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{s2.e(h, i), s2.e(h2, i)});
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void J() {
            Drawable I = I(i2.c(this.q, C0707R.color.gray_background_30, null));
            V v = this.a;
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            v.setBackground(I);
        }

        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.b.C0174b, defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            super.z(s81, w51, bVar);
            x81 background = s81.images().background();
            if (background != null) {
                this.p.e(background.uri()).o(this.r);
            } else {
                J();
            }
        }
    }

    public s65(zvd zvd, boolean z) {
        this.a = zvd;
        this.b = z;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a(viewGroup, w51, this.a, this.b);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.free_tier_on_demand_container;
    }
}

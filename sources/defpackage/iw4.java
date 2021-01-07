package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import com.google.common.collect.Collections2;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.playlist.ui.h0;
import com.spotify.playlist.models.l;
import defpackage.d5;
import java.util.ArrayList;
import java.util.List;

/* renamed from: iw4  reason: default package */
public class iw4 extends RecyclerView.e<e> implements mw4 {
    static final int q = iw4.class.hashCode();
    static final int r = (iw4.class.hashCode() + 1);
    private final b c;
    private final h0 f;
    private List<l> n = new ArrayList();
    private p o;
    private boolean p;

    /* renamed from: iw4$a */
    public interface a {
        iw4 a(b bVar);
    }

    /* renamed from: iw4$b */
    public interface b {
        void a(l lVar, int i);

        void b(l lVar, String str, String str2, int i, int i2);
    }

    /* renamed from: iw4$c */
    class c extends e implements nw4 {
        private final ImageButton C;
        private final x90 D;
        private final Drawable E = this.a.getBackground();

        /* access modifiers changed from: package-private */
        /* renamed from: iw4$c$a */
        public class a extends z3 {
            final /* synthetic */ Context a;

            a(c cVar, Context context) {
                this.a = context;
            }

            @Override // defpackage.z3
            public void onInitializeAccessibilityNodeInfo(View view, d5 d5Var) {
                super.onInitializeAccessibilityNodeInfo(view, d5Var);
                d5Var.b(new d5.a(16, this.a.getString(C0707R.string.edit_playlist_row_reorder_item_action_description)));
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(android.view.ViewGroup r5) {
            /*
                r3 = this;
                defpackage.iw4.this = r4
                android.widget.LinearLayout r4 = new android.widget.LinearLayout
                android.content.Context r0 = r5.getContext()
                r4.<init>(r0)
                r3.<init>(r4)
                r0 = 0
                r4.setOrientation(r0)
                android.view.View r1 = r3.a
                android.content.res.Resources r1 = r1.getResources()
                r2 = 1090519040(0x41000000, float:8.0)
                int r1 = defpackage.nud.g(r2, r1)
                r4.setPadding(r1, r0, r0, r0)
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
                r1 = -1
                r2 = -2
                r0.<init>(r1, r2)
                r4.setLayoutParams(r0)
                android.content.Context r0 = r5.getContext()
                android.content.Context r1 = r5.getContext()
                com.spotify.android.paste.graphics.SpotifyIconV2 r2 = com.spotify.android.paste.graphics.SpotifyIconV2.BLOCK
                android.graphics.drawable.Drawable r1 = defpackage.z42.e(r1, r2)
                android.widget.ImageButton r0 = defpackage.z42.h(r0, r1)
                r3.C = r0
                r4.addView(r0)
                ga0 r0 = defpackage.e90.d()
                android.content.Context r1 = r5.getContext()
                x90 r5 = r0.g(r1, r5)
                r3.D = r5
                android.view.View r5 = r5.getView()
                r4.addView(r5)
                android.view.View r4 = r3.a
                android.graphics.drawable.Drawable r4 = r4.getBackground()
                r3.E = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.iw4.c.<init>(iw4, android.view.ViewGroup):void");
        }

        @Override // defpackage.nw4
        public void h() {
            View view = this.a;
            Drawable drawable = this.E;
            int i = q4.g;
            int i2 = Build.VERSION.SDK_INT;
            view.setBackground(drawable);
        }

        public void h0(l lVar) {
            Context context = this.a.getContext();
            x90 x90 = this.D;
            this.a.setTag(lVar);
            x90.setTitle(lVar.e());
            x90.setSubtitle(iw4.this.f.a(lVar, false, iw4.this.p));
            this.C.setContentDescription(context.getString(C0707R.string.edit_playlist_row_remove_item_content_description));
            this.C.setOnClickListener(new gw4(this, lVar));
            ImageButton h = z42.h(context, z42.e(context, SpotifyIconV2.DRAG_AND_DROP));
            h.setContentDescription(context.getString(C0707R.string.edit_playlist_row_reorder_item_content_description));
            q4.I(h, new a(this, context));
            if (iw4.this.o != null) {
                h.setOnTouchListener(new hw4(this));
            }
            x90.z0(h);
        }

        @Override // defpackage.nw4
        public void j() {
            View view = this.a;
            view.setBackgroundColor(androidx.core.content.a.b(view.getContext(), C0707R.color.gray_layer));
        }
    }

    /* renamed from: iw4$d */
    static class d extends e implements nw4 {
        public d(ViewGroup viewGroup) {
            super(new LinearLayout(viewGroup.getContext()));
        }

        @Override // defpackage.nw4
        public void h() {
        }

        @Override // defpackage.nw4
        public void j() {
        }
    }

    /* renamed from: iw4$e */
    public static class e extends RecyclerView.b0 {
        public e(View view) {
            super(view);
        }
    }

    public iw4(h0 h0Var, b bVar) {
        this.c = bVar;
        this.f = h0Var;
        U(true);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(e eVar, int i) {
        e eVar2 = eVar;
        if (w(i) == r) {
            ((c) eVar2).h0(this.n.get(i - 1));
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public e M(ViewGroup viewGroup, int i) {
        if (i == q) {
            return new d(viewGroup);
        }
        return new c(viewGroup);
    }

    public void f0(l lVar, int i) {
        this.n.add(i - 1, lVar);
        C(i);
    }

    public boolean g0() {
        return this.n.isEmpty();
    }

    public boolean i0(int i, int i2) {
        l remove = this.n.remove(i - 1);
        int i3 = i2 - 1;
        l lVar = i3 < this.n.size() ? this.n.get(i3) : null;
        this.n.add(i3, remove);
        D(i, i2);
        this.c.b(remove, remove.f(), lVar != null ? lVar.f() : null, i, i2);
        return true;
    }

    public void j0(p pVar) {
        this.o = pVar;
    }

    public void k0(List<l> list) {
        this.n = Collections2.newArrayList(list);
        z();
    }

    public void l0(boolean z) {
        if (this.p != z) {
            this.p = z;
            z();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.n.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        if (i < 1) {
            return (long) Integer.valueOf(i).hashCode();
        }
        l lVar = this.n.get(i - 1);
        long hashCode = (long) (hashCode() ^ lVar.getUri().hashCode());
        String f2 = lVar.f();
        return f2 != null ? hashCode ^ ((long) f2.hashCode()) : hashCode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        if (i < 1) {
            return q;
        }
        return r;
    }
}

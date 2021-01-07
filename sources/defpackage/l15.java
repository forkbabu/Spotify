package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.ui.h;
import com.spotify.music.C0707R;
import com.spotify.music.features.findfriends.model.UserModel;

/* renamed from: l15  reason: default package */
public class l15 extends RecyclerView.e<e> {
    private final h c;
    private ImmutableList<UserModel> f = ImmutableList.of();
    private boolean n;
    private a o = g15.a;
    private c p = j15.a;
    private c q = k15.a;

    /* renamed from: l15$a */
    public interface a {
        void a();
    }

    /* renamed from: l15$b */
    public class b extends e {
        private final Button C;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(android.view.ViewGroup r5) {
            /*
                r3 = this;
                defpackage.l15.this = r4
                android.widget.FrameLayout r4 = new android.widget.FrameLayout
                android.content.Context r0 = r5.getContext()
                r4.<init>(r0)
                r3.<init>(r4)
                r0 = 2131428511(0x7f0b049f, float:1.8478669E38)
                r4.setId(r0)
                android.view.View r4 = r3.a
                androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = new androidx.recyclerview.widget.RecyclerView$LayoutParams
                r1 = -1
                r2 = -2
                r0.<init>(r1, r2)
                r4.setLayoutParams(r0)
                android.content.Context r4 = r5.getContext()
                android.widget.Button r4 = com.spotify.android.paste.app.c.d(r4)
                r3.C = r4
                r0 = 2131428510(0x7f0b049e, float:1.8478667E38)
                r4.setId(r0)
                r0 = 1
                r4.setSingleLine(r0)
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r0 = r5.getResources()
                r1 = 1111490560(0x42400000, float:48.0)
                int r0 = defpackage.nud.f(r1, r0)
                r1 = 0
                r4.setPadding(r0, r1, r0, r1)
                android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
                r0.<init>(r2, r2)
                r2 = 17
                r0.gravity = r2
                android.content.res.Resources r5 = r5.getResources()
                r2 = 1097859072(0x41700000, float:15.0)
                int r5 = defpackage.nud.f(r2, r5)
                r0.setMargins(r1, r5, r1, r5)
                r4.setLayoutParams(r0)
                f15 r5 = new f15
                r5.<init>(r3)
                r4.setOnClickListener(r5)
                android.view.View r5 = r3.a
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                r5.addView(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.l15.b.<init>(l15, android.view.ViewGroup):void");
        }

        public void h0() {
            this.C.setText(this.a.getResources().getString(C0707R.string.find_friends_flow_follow_all, Integer.valueOf(l15.this.f.size())));
        }
    }

    /* renamed from: l15$c */
    public interface c {
        void a(UserModel userModel, int i);
    }

    /* renamed from: l15$d */
    public class d extends e {
        public d(ViewGroup viewGroup) {
            super(e90.d().d(viewGroup.getContext(), viewGroup).getView());
        }
    }

    /* renamed from: l15$e */
    public static abstract class e extends RecyclerView.b0 {
        public e(View view) {
            super(view);
        }
    }

    public l15(h hVar) {
        this.c = hVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void K(defpackage.l15.e r5, int r6) {
        /*
            r4 = this;
            l15$e r5 = (defpackage.l15.e) r5
            boolean r0 = r4.n
            int r1 = r6 - r0
            r2 = 2
            r3 = 1
            if (r6 >= r0) goto L_0x000c
            r6 = 1
            goto L_0x000d
        L_0x000c:
            r6 = 2
        L_0x000d:
            if (r6 == r3) goto L_0x0071
            if (r6 == r2) goto L_0x0012
            goto L_0x0076
        L_0x0012:
            l15$d r5 = (defpackage.l15.d) r5
            com.google.common.collect.ImmutableList<com.spotify.music.features.findfriends.model.UserModel> r6 = r4.f
            java.lang.Object r6 = r6.get(r1)
            com.spotify.music.features.findfriends.model.UserModel r6 = (com.spotify.music.features.findfriends.model.UserModel) r6
            android.view.View r0 = r5.a
            java.lang.Class<u90> r2 = defpackage.u90.class
            int r3 = defpackage.e90.i
            g90 r0 = defpackage.l70.o(r0, r2)
            u90 r0 = (defpackage.u90) r0
            android.view.View r2 = r0.getView()
            i15 r3 = new i15
            r3.<init>(r5, r6, r1)
            r2.setOnClickListener(r3)
            android.view.View r2 = r0.W1()
            if (r2 != 0) goto L_0x0047
            android.view.View r2 = r5.a
            android.content.Context r2 = r2.getContext()
            android.view.View r2 = com.spotify.music.follow.i.b(r2)
            r0.z0(r2)
        L_0x0047:
            h15 r3 = new h15
            r3.<init>(r5, r6, r1)
            r2.setOnClickListener(r3)
            android.widget.Checkable r2 = (android.widget.Checkable) r2
            boolean r1 = r6.isFollowing()
            r2.setChecked(r1)
            l15 r5 = defpackage.l15.this
            com.spotify.mobile.android.util.ui.h r5 = Z(r5)
            android.widget.ImageView r1 = r0.getImageView()
            java.lang.String r2 = r6.image()
            r5.k(r1, r2)
            java.lang.String r5 = r6.title()
            r0.setText(r5)
            goto L_0x0076
        L_0x0071:
            l15$b r5 = (defpackage.l15.b) r5
            r5.h0()
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l15.K(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public e M(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new b(viewGroup);
        }
        if (i == 2) {
            return new d(viewGroup);
        }
        throw new RuntimeException("No such view type");
    }

    public void f0(a aVar) {
        this.o = aVar;
    }

    public void g0(c cVar) {
        this.p = cVar;
    }

    public void i0(c cVar) {
        this.q = cVar;
    }

    public void j0(ImmutableList<UserModel> immutableList) {
        this.f = immutableList;
        z();
    }

    public void k0(boolean z) {
        if (this.n != z) {
            this.n = z;
            z();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.f.size() + (this.n ? 1 : 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int w(int r2) {
        /*
            r1 = this;
            boolean r0 = r1.n
            if (r2 >= r0) goto L_0x0006
            r2 = 1
            return r2
        L_0x0006:
            r2 = 2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l15.w(int):int");
    }
}

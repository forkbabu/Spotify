package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.MoreObjects;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderV2Behavior;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.music.C0707R;
import com.spotify.music.libs.search.transition.k;
import defpackage.e61;
import defpackage.z54;

/* renamed from: og4  reason: default package */
public class og4 extends r51 implements ng4 {
    private final Context a;
    private final boolean b;
    private final RecyclerView c;
    private final GlueHeaderLayout d;
    private final RecyclerView e;
    private final ViewGroup f;
    private final b g;
    private final a64 h;
    private final pb4 i;
    private final bg4 j;
    private b91 k;
    private q61 l;
    private final jg4 m;

    /* renamed from: og4$a */
    private static class a extends e61.a {
        public static final Parcelable.Creator<a> CREATOR = new C0657a();
        public final Parcelable c;
        public final boolean f;

        /* renamed from: og4$a$a  reason: collision with other inner class name */
        static class C0657a implements Parcelable.Creator<a> {
            C0657a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public a createFromParcel(Parcel parcel) {
                e61.a createFromParcel = e61.a.CREATOR.createFromParcel(parcel);
                return new a(createFromParcel.a, createFromParcel.b, parcel.readParcelable(a.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3, boolean z) {
            super(parcelable, parcelable2);
            this.c = parcelable3;
            this.f = z;
        }

        @Override // defpackage.e61.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeInt(this.f ? 1 : 0);
        }
    }

    /* renamed from: og4$b */
    static class b {
        private final String a;

        public b(String str) {
            this.a = str;
        }

        /* access modifiers changed from: package-private */
        public String a(b91 b91) {
            String str;
            if (b91 != null) {
                s81 header = b91.header();
                str = header != null ? header.text().title() : b91.title();
            } else {
                str = null;
            }
            return MoreObjects.isNullOrEmpty(str) ? this.a : str;
        }
    }

    public og4(w51 w51, m mVar, Context context, pb4 pb4, boolean z, jg4 jg4, b bVar, bg4 bg4, a64 a64) {
        this.i = pb4;
        this.j = bg4;
        w51.getClass();
        context.getClass();
        this.a = context;
        this.b = z;
        jg4.getClass();
        this.m = jg4;
        bVar.getClass();
        this.g = bVar;
        a64.getClass();
        this.h = a64;
        GridLayoutManager create = mVar.create();
        RecyclerView D = r51.D(context);
        D.setLayoutManager(create);
        D.setId(C0707R.id.glue_header_layout_recycler);
        this.c = D;
        GlueHeaderLayout glueHeaderLayout = new GlueHeaderLayout(context, null);
        glueHeaderLayout.z(D);
        glueHeaderLayout.setFakeActionBarWhenNoHeader(false);
        this.d = glueHeaderLayout;
        RecyclerView E = r51.E(context);
        E.setId(C0707R.id.hub_glue_header_layout_overlays);
        this.e = E;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(C0707R.id.hub_glue_header_layout_container);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        frameLayout.addView(glueHeaderLayout, layoutParams);
        frameLayout.addView(E, layoutParams);
        this.f = frameLayout;
        pb4.g(D);
        pb4.g(E);
    }

    @Override // defpackage.ng4
    public void B() {
        z54 z54;
        ViewGroup viewGroup = this.f;
        viewGroup.getClass();
        View findViewById = viewGroup.findViewById(C0707R.id.find_search_field);
        ViewGroup viewGroup2 = this.f;
        viewGroup2.getClass();
        TextView textView = (TextView) viewGroup2.findViewById(C0707R.id.find_search_field_text);
        if (findViewById != null && textView != null) {
            String str = "";
            String charSequence = textView.getText() == null ? str : textView.getText().toString();
            if (textView.getContentDescription() != null) {
                str = textView.getContentDescription().toString();
            }
            Rect b2 = k.b(findViewById);
            if (b2.width() > 0) {
                e74 a2 = e74.a(b2, charSequence, str);
                z54.a b3 = z54.b();
                b3.a(a2);
                z54 = b3.b();
            } else {
                z54 = z54.a;
            }
            this.h.a(z54);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView F() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView G() {
        return this.e;
    }

    public /* synthetic */ void I() {
        this.d.A(false);
    }

    public void J() {
        View e2 = this.l.e(this.d);
        this.d.setToolbarUpdater(l70.k(this.a));
        if (e2 instanceof GlueHeaderViewV2) {
            GlueHeaderViewV2 glueHeaderViewV2 = (GlueHeaderViewV2) e2;
            this.d.G(glueHeaderViewV2, new GlueHeaderV2Behavior(), false);
            this.d.setFakeActionBarWhenNoHeader(false);
            if (glueHeaderViewV2.getId() == -1) {
                glueHeaderViewV2.setId(C0707R.id.glue_header_layout_header);
            }
        }
        String a2 = this.g.a(this.k);
        this.d.setTitle(a2);
        this.j.setTitle(a2);
        s81 a3 = this.l.d().a();
        this.m.a(this.d, a3);
        this.i.h(a3);
        ((Activity) this.a).invalidateOptionsMenu();
    }

    @Override // defpackage.ng4
    public boolean a() {
        return this.d.C(true) instanceof GlueHeaderViewV2;
    }

    @Override // defpackage.e61
    public View b() {
        ViewGroup viewGroup = this.f;
        viewGroup.getClass();
        return viewGroup;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r0 == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r0.e0(r3) != 0) goto L_0x0021;
     */
    @Override // defpackage.r51, defpackage.e61
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable e() {
        /*
            r5 = this;
            boolean r0 = r5.b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0027
            androidx.recyclerview.widget.RecyclerView r0 = r5.c
            android.view.View r3 = r0.getChildAt(r2)
            if (r3 == 0) goto L_0x0023
            int r4 = r0.X(r3)
            if (r4 != 0) goto L_0x0021
            androidx.recyclerview.widget.RecyclerView$m r0 = r0.getLayoutManager()
            r0.getClass()
            int r0 = r0.e0(r3)
            if (r0 == 0) goto L_0x0023
        L_0x0021:
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            og4$a r0 = new og4$a
            androidx.recyclerview.widget.RecyclerView r2 = r5.c
            androidx.recyclerview.widget.RecyclerView$m r2 = r2.getLayoutManager()
            r2.getClass()
            android.os.Parcelable r2 = r2.i1()
            androidx.recyclerview.widget.RecyclerView r3 = r5.e
            androidx.recyclerview.widget.RecyclerView$m r3 = r3.getLayoutManager()
            r3.getClass()
            android.os.Parcelable r3 = r3.i1()
            com.spotify.android.glue.patterns.header.GlueHeaderLayout r4 = r5.d
            android.os.Parcelable r4 = r4.onSaveInstanceState()
            r0.<init>(r2, r3, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og4.e():android.os.Parcelable");
    }

    @Override // defpackage.r51, defpackage.e61
    public void f(Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            RecyclerView.m layoutManager = this.c.getLayoutManager();
            layoutManager.getClass();
            layoutManager.h1(aVar.a);
            RecyclerView.m layoutManager2 = this.e.getLayoutManager();
            layoutManager2.getClass();
            layoutManager2.h1(aVar.b);
            Parcelable parcelable2 = aVar.c;
            if (parcelable2 != null) {
                this.d.onRestoreInstanceState(parcelable2);
            }
            if ((this.d.C(true) instanceof GlueHeaderViewV2) && aVar.f) {
                this.d.post(new gg4(this));
            }
        }
    }

    @Override // defpackage.r51, defpackage.e61
    public void k(q61 q61) {
        this.l = q61;
        q61.i(new fg4(this));
    }

    @Override // defpackage.r51, defpackage.e61
    public void s(b91 b91) {
        b91.getClass();
        this.k = b91;
        r51.H(this.e, !b91.overlays().isEmpty());
    }

    @Override // defpackage.ng4
    public void z(a0 a0Var) {
        q61 q61 = this.l;
        if (q61 != null) {
            this.m.a(this.d, q61.d().a());
        }
    }
}

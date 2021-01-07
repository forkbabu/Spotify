package com.spotify.music.features.entityselector.pages.search.view;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.music.features.entityselector.common.a;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;
import com.spotify.music.libs.search.view.l;
import defpackage.uz4;
import defpackage.xz4;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import kotlin.f;

public final class SearchViews implements g<wz4, uz4> {
    private final View a;
    private final PublishSubject<com.spotify.music.features.entityselector.common.a> b;
    private final TextView c;
    private final TextView f;
    private final ToolbarSearchFieldView n;
    private final TextView o;
    private final TextView p;
    private f q;
    private final a r;
    private final RecyclerView s;
    private final hj0<wz4> t;
    private final l.b u;
    private final cmf<f> v;

    public static final class a implements h<wz4> {
        final /* synthetic */ SearchViews a;
        final /* synthetic */ io.reactivex.disposables.b b;

        a(SearchViews searchViews, io.reactivex.disposables.b bVar) {
            this.a = searchViews;
            this.b = bVar;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            wz4 wz4 = (wz4) obj;
            kotlin.jvm.internal.h.e(wz4, "model");
            this.a.t.e(wz4);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.b.dispose();
            SearchViews.b(this.a).q(this.a.u);
        }
    }

    static final class b<T> implements io.reactivex.functions.g<com.spotify.music.features.entityselector.common.a> {
        final /* synthetic */ da2 a;

        b(da2 da2) {
            this.a = da2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(com.spotify.music.features.entityselector.common.a aVar) {
            com.spotify.music.features.entityselector.common.a aVar2 = aVar;
            if (aVar2 instanceof a.c) {
                this.a.accept(new uz4.c(((a.c) aVar2).a()));
            } else if (aVar2 instanceof a.b) {
                this.a.accept(new uz4.b(((a.b) aVar2).a()));
            } else if (aVar2 instanceof a.C0229a) {
                this.a.accept(new uz4.a(((a.C0229a) aVar2).a()));
            }
        }
    }

    public static final class c implements l.b {
        final /* synthetic */ SearchViews a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(SearchViews searchViews) {
            this.a = searchViews;
        }

        @Override // com.spotify.music.libs.search.view.l.b
        public void L(boolean z) {
        }

        @Override // com.spotify.music.libs.search.view.l.b
        public void f(String str) {
            kotlin.jvm.internal.h.e(str, "currentQuery");
            SearchViews.d(this.a);
        }

        @Override // com.spotify.music.libs.search.view.l.b
        public void n() {
        }

        @Override // com.spotify.music.libs.search.view.l.b
        public void r(String str) {
            kotlin.jvm.internal.h.e(str, "newQuery");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.spotify.music.features.entityselector.pages.search.view.c] */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x00bb: APUT  
      (r4v6 hj0[])
      (0 ??[int, short, byte, char])
      (wrap: hj0 : 0x00b7: INVOKE  (r5v4 hj0) = 
      (wrap: xi0 : 0x00a7: CHECK_CAST (r5v3 xi0) = (xi0) (r5v2 kotlin.reflect.g))
      (wrap: hj0 : 0x00b3: INVOKE  (r6v2 hj0) = 
      (wrap: com.spotify.music.features.entityselector.pages.search.view.b : 0x00b0: CONSTRUCTOR  (r1v5 com.spotify.music.features.entityselector.pages.search.view.b) = 
      (wrap: com.spotify.music.features.entityselector.pages.search.view.SearchViews$diffuser$2 : 0x00ab: CONSTRUCTOR  (r6v1 com.spotify.music.features.entityselector.pages.search.view.SearchViews$diffuser$2) = (r2v0 'this' com.spotify.music.features.entityselector.pages.search.view.SearchViews A[IMMUTABLE_TYPE, THIS]) call: com.spotify.music.features.entityselector.pages.search.view.SearchViews$diffuser$2.<init>(com.spotify.music.features.entityselector.pages.search.view.SearchViews):void type: CONSTRUCTOR)
     call: com.spotify.music.features.entityselector.pages.search.view.b.<init>(nmf):void type: CONSTRUCTOR)
     type: STATIC call: hj0.a(wi0):hj0)
     type: STATIC call: hj0.d(xi0, hj0):hj0)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SearchViews(android.view.LayoutInflater r3, android.view.ViewGroup r4, com.squareup.picasso.Picasso r5, com.spotify.music.preview.q r6, defpackage.cmf<kotlin.f> r7) {
        /*
            r2 = this;
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.h.e(r3, r0)
            java.lang.String r0 = "picasso"
            kotlin.jvm.internal.h.e(r5, r0)
            java.lang.String r0 = "previewOverlay"
            kotlin.jvm.internal.h.e(r6, r0)
            java.lang.String r0 = "stopPreviewAction"
            kotlin.jvm.internal.h.e(r7, r0)
            r2.<init>()
            r2.v = r7
            r7 = 2131625056(0x7f0e0460, float:1.887731E38)
            r0 = 0
            android.view.View r3 = r3.inflate(r7, r4, r0)
            java.lang.String r4 = "inflater.inflate(R.layou…_fragment, parent, false)"
            kotlin.jvm.internal.h.d(r3, r4)
            r2.a = r3
            io.reactivex.subjects.PublishSubject r4 = io.reactivex.subjects.PublishSubject.h1()
            java.lang.String r7 = "PublishSubject.create<UserInteraction>()"
            kotlin.jvm.internal.h.d(r4, r7)
            r2.b = r4
            r7 = 2131428357(0x7f0b0405, float:1.8478356E38)
            android.view.View r7 = defpackage.q4.G(r3, r7)
            java.lang.String r1 = "requireViewById<TextView…, R.id.empty_search_view)"
            kotlin.jvm.internal.h.d(r7, r1)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r2.c = r7
            r7 = 2131428358(0x7f0b0406, float:1.8478358E38)
            android.view.View r7 = defpackage.q4.G(r3, r7)
            java.lang.String r1 = "requireViewById<TextView…pty_search_view_subtitle)"
            kotlin.jvm.internal.h.d(r7, r1)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r2.f = r7
            r7 = 2131431230(0x7f0b0f3e, float:1.8484183E38)
            android.view.View r7 = defpackage.q4.G(r3, r7)
            java.lang.String r1 = "requireViewById<ToolbarS…oot, R.id.search_toolbar)"
            kotlin.jvm.internal.h.d(r7, r1)
            com.spotify.music.libs.search.view.ToolbarSearchFieldView r7 = (com.spotify.music.libs.search.view.ToolbarSearchFieldView) r7
            r2.n = r7
            r7 = 2131428463(0x7f0b046f, float:1.8478571E38)
            android.view.View r7 = defpackage.q4.G(r3, r7)
            java.lang.String r1 = "requireViewById<TextView…, R.id.fail_search_title)"
            kotlin.jvm.internal.h.d(r7, r1)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r2.o = r7
            r7 = 2131428462(0x7f0b046e, float:1.847857E38)
            android.view.View r7 = defpackage.q4.G(r3, r7)
            java.lang.String r1 = "requireViewById<TextView….id.fail_search_subtitle)"
            kotlin.jvm.internal.h.d(r7, r1)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r2.p = r7
            com.spotify.music.features.entityselector.pages.search.view.a r7 = new com.spotify.music.features.entityselector.pages.search.view.a
            r7.<init>(r5, r6, r4)
            r2.r = r7
            r4 = 2131431225(0x7f0b0f39, float:1.8484173E38)
            android.view.View r3 = defpackage.q4.G(r3, r4)
            java.lang.String r4 = "requireViewById<Recycler…arch_result_recyclerview)"
            kotlin.jvm.internal.h.d(r3, r4)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r2.s = r3
            r4 = 1
            hj0[] r4 = new defpackage.hj0[r4]
            kotlin.reflect.g r5 = com.spotify.music.features.entityselector.pages.search.view.SearchViews$diffuser$1.a
            if (r5 == 0) goto L_0x00a7
            com.spotify.music.features.entityselector.pages.search.view.c r6 = new com.spotify.music.features.entityselector.pages.search.view.c
            r6.<init>(r5)
            r5 = r6
        L_0x00a7:
            xi0 r5 = (defpackage.xi0) r5
            com.spotify.music.features.entityselector.pages.search.view.SearchViews$diffuser$2 r6 = new com.spotify.music.features.entityselector.pages.search.view.SearchViews$diffuser$2
            r6.<init>(r2)
            com.spotify.music.features.entityselector.pages.search.view.b r1 = new com.spotify.music.features.entityselector.pages.search.view.b
            r1.<init>(r6)
            hj0 r6 = defpackage.hj0.a(r1)
            hj0 r5 = defpackage.hj0.d(r5, r6)
            r4[r0] = r5
            hj0 r4 = defpackage.hj0.b(r4)
            r2.t = r4
            com.spotify.music.features.entityselector.pages.search.view.SearchViews$c r4 = new com.spotify.music.features.entityselector.pages.search.view.SearchViews$c
            r4.<init>(r2)
            r2.u = r4
            r3.setAdapter(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.entityselector.pages.search.view.SearchViews.<init>(android.view.LayoutInflater, android.view.ViewGroup, com.squareup.picasso.Picasso, com.spotify.music.preview.q, cmf):void");
    }

    public static final /* synthetic */ f b(SearchViews searchViews) {
        f fVar = searchViews.q;
        if (fVar != null) {
            return fVar;
        }
        kotlin.jvm.internal.h.k("searchField");
        throw null;
    }

    public static final void d(SearchViews searchViews) {
        Object systemService = searchViews.a.getContext().getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).hideSoftInputFromWindow(searchViews.a.getWindowToken(), 0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    public static final void e(SearchViews searchViews, xz4 xz4) {
        searchViews.getClass();
        if (xz4 instanceof xz4.a) {
            searchViews.c.setVisibility(0);
            searchViews.f.setVisibility(0);
            searchViews.o.setVisibility(8);
            searchViews.p.setVisibility(8);
            searchViews.s.setVisibility(8);
        } else if (xz4 instanceof xz4.b) {
            String a2 = ((xz4.b) xz4).a();
            searchViews.c.setVisibility(8);
            searchViews.f.setVisibility(8);
            searchViews.o.setVisibility(0);
            searchViews.p.setVisibility(0);
            searchViews.s.setVisibility(8);
            Context context = searchViews.a.getContext();
            String string = context.getString(C0707R.string.fail_search_result, '\"' + a2 + '\"');
            kotlin.jvm.internal.h.d(string, "root.context.getString(R…\"\\u0022${searchQuery}\\\"\")");
            searchViews.o.setText(string);
        } else if (xz4 instanceof xz4.c) {
            List<uy4> a3 = ((xz4.c) xz4).a();
            searchViews.c.setVisibility(8);
            searchViews.f.setVisibility(8);
            searchViews.o.setVisibility(8);
            searchViews.p.setVisibility(8);
            searchViews.s.setVisibility(0);
            searchViews.r.X(a3);
        }
    }

    public final View f() {
        return this.a;
    }

    @Override // com.spotify.mobius.g
    public h<wz4> t(da2<uz4> da2) {
        kotlin.jvm.internal.h.e(da2, "eventConsumer");
        f fVar = new f(this.n, this.v, new SearchViews$connect$1(da2));
        this.q = fVar;
        if (fVar != null) {
            fVar.l(250);
            f fVar2 = this.q;
            if (fVar2 != null) {
                fVar2.g(this.u);
                return new a(this, this.b.subscribe(new b(da2)));
            }
            kotlin.jvm.internal.h.k("searchField");
            throw null;
        }
        kotlin.jvm.internal.h.k("searchField");
        throw null;
    }
}

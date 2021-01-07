package com.spotify.mobile.android.hubframework.defaults.components.glue;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.mobile.android.ui.layout_traits.TraitsLayoutManager;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;

public abstract class b extends d.a<C0174b> {
    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE, GlueLayoutTraits.Trait.OUTSIDE_CONTENT_AREA);
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.spotify.mobile.android.hubframework.defaults.components.glue.b$b  reason: collision with other inner class name */
    public static class C0174b extends s51.c.a<RecyclerView> {
        private final C0175b b;
        private final i61 c;
        private final c f;
        private s81 n;
        private s51.b o;

        /* renamed from: com.spotify.mobile.android.hubframework.defaults.components.glue.b$b$a */
        class a implements View.OnAttachStateChangeListener {
            a() {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                C0174b.this.f.a();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                C0174b.this.f.b();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: com.spotify.mobile.android.hubframework.defaults.components.glue.b$b$b  reason: collision with other inner class name */
        public static class C0175b extends TraitsLayoutManager {
            public C0175b(Context context, com.spotify.mobile.android.ui.layout_traits.a aVar) {
                super(context, aVar, context.getResources().getInteger(C0707R.integer.hugs_grid_columns));
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
            public boolean B() {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
            public boolean C() {
                return false;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: com.spotify.mobile.android.hubframework.defaults.components.glue.b$b$c */
        public class c implements ViewTreeObserver.OnScrollChangedListener {
            private ViewTreeObserver a;

            c(a aVar) {
            }

            /* access modifiers changed from: package-private */
            public void a() {
                ViewTreeObserver viewTreeObserver = this.a;
                if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                    ViewTreeObserver viewTreeObserver2 = ((RecyclerView) C0174b.this.a).getViewTreeObserver();
                    this.a = viewTreeObserver2;
                    viewTreeObserver2.addOnScrollChangedListener(this);
                }
            }

            /* access modifiers changed from: package-private */
            public void b() {
                ViewTreeObserver viewTreeObserver = this.a;
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    this.a.removeOnScrollChangedListener(this);
                }
                this.a = null;
            }

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                s81 s81 = C0174b.this.n;
                s51.b bVar = C0174b.this.o;
                if (s81 != null && bVar != null) {
                    bVar.b(s81, new d(C0174b.this.c.b0(), C0174b.this.b.i1()));
                }
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0174b(android.view.ViewGroup r6, defpackage.w51 r7, boolean r8) {
            /*
                r5 = this;
                androidx.recyclerview.widget.RecyclerView r0 = new androidx.recyclerview.widget.RecyclerView
                android.content.Context r1 = r6.getContext()
                r2 = 0
                r0.<init>(r1, r2)
                android.content.Context r1 = r6.getContext()
                android.view.ViewGroup$LayoutParams r1 = com.spotify.android.goldenpath.a.c(r1, r6)
                r0.setLayoutParams(r1)
                r5.<init>(r0)
                androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
                r1 = 0
                r0.setNestedScrollingEnabled(r1)
                V extends android.view.View r0 = r5.a
                androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
                android.content.Context r0 = r0.getContext()
                u51 r3 = r7.g()
                com.spotify.mobile.android.hubframework.defaults.a r4 = new com.spotify.mobile.android.hubframework.defaults.a
                r4.<init>(r3)
                com.spotify.mobile.android.ui.layout_traits.a r8 = com.spotify.mobile.android.glue.GlueLayoutTraits.a(r0, r4, r8)
                com.spotify.mobile.android.hubframework.defaults.components.glue.b$b$b r3 = new com.spotify.mobile.android.hubframework.defaults.components.glue.b$b$b
                r3.<init>(r0, r8)
                r5.b = r3
                V extends android.view.View r8 = r5.a
                androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
                r8.setLayoutManager(r3)
                i61 r8 = new i61
                r8.<init>(r7)
                r5.c = r8
                V extends android.view.View r7 = r5.a
                androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
                r7.setHasFixedSize(r1)
                boolean r7 = r6 instanceof androidx.recyclerview.widget.RecyclerView
                if (r7 == 0) goto L_0x0068
                androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
                androidx.recyclerview.widget.RecyclerView$e r7 = r6.getAdapter()
                boolean r7 = r7 instanceof defpackage.i61
                if (r7 == 0) goto L_0x0068
                V extends android.view.View r7 = r5.a
                androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
                androidx.recyclerview.widget.RecyclerView$r r6 = r6.getRecycledViewPool()
                r7.setRecycledViewPool(r6)
            L_0x0068:
                V extends android.view.View r6 = r5.a
                androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
                r6.S0(r8, r1)
                com.spotify.mobile.android.hubframework.defaults.components.glue.b$b$c r6 = new com.spotify.mobile.android.hubframework.defaults.components.glue.b$b$c
                r6.<init>(r2)
                r5.f = r6
                V extends android.view.View r6 = r5.a
                androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
                com.spotify.mobile.android.hubframework.defaults.components.glue.b$b$a r7 = new com.spotify.mobile.android.hubframework.defaults.components.glue.b$b$a
                r7.<init>()
                r6.addOnAttachStateChangeListener(r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.hubframework.defaults.components.glue.b.C0174b.<init>(android.view.ViewGroup, w51, boolean):void");
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            g91.b((RecyclerView) this.a, aVar, iArr);
        }

        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            this.n = s81;
            this.o = bVar;
            this.c.c0(s81.children());
            d dVar = (d) bVar.a(s81);
            if (dVar != null) {
                this.c.Z(dVar.a);
                this.b.h1(dVar.b);
            } else {
                this.c.Z(null);
                this.b.t2(0, 0);
            }
            this.c.z();
        }

        /* access modifiers changed from: private */
        /* renamed from: com.spotify.mobile.android.hubframework.defaults.components.glue.b$b$d */
        public static class d implements Parcelable {
            public static final Parcelable.Creator<d> CREATOR = new a();
            final Parcelable a;
            final Parcelable b;

            /* renamed from: com.spotify.mobile.android.hubframework.defaults.components.glue.b$b$d$a */
            static class a implements Parcelable.Creator<d> {
                a() {
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // android.os.Parcelable.Creator
                public d createFromParcel(Parcel parcel) {
                    return new d(parcel, (a) null);
                }

                /* Return type fixed from 'java.lang.Object[]' to match base method */
                @Override // android.os.Parcelable.Creator
                public d[] newArray(int i) {
                    return new d[i];
                }
            }

            d(Parcelable parcelable, Parcelable parcelable2) {
                this.a = parcelable;
                this.b = parcelable2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.a, i);
                parcel.writeParcelable(this.b, i);
            }

            d(Parcel parcel, a aVar) {
                this.a = parcel.readParcelable(i61.class.getClassLoader());
                this.b = parcel.readParcelable(C0175b.class.getClassLoader());
            }
        }
    }
}

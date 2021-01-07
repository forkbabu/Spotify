package com.spotify.music.features.followfeed.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptySet;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class FollowRecsView extends LinearLayout {
    private TextView a;
    private RecyclerView b;
    private LinearLayoutManager c;
    private c f;
    private c n;
    private nmf<? super Set<Integer>, f> o;
    private io.reactivex.disposables.b p;
    private Set<Integer> q;
    private final PublishSubject<jnf> r;

    public static final class a extends RecyclerView.l {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
            RecyclerView.m layoutManager;
            h.e(rect, "outRect");
            h.e(view, "view");
            h.e(recyclerView, "parent");
            h.e(yVar, "state");
            int X = recyclerView.X(view);
            if (X != -1 && (layoutManager = recyclerView.getLayoutManager()) != null) {
                h.d(layoutManager, "parent.layoutManager ?: return");
                rect.set(X == 0 ? this.a : this.b, 0, X == layoutManager.i0() + -1 ? this.a : this.b, 0);
            }
        }
    }

    public static final class b extends RecyclerView.q {
        final /* synthetic */ FollowRecsView a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(FollowRecsView followRecsView) {
            this.a = followRecsView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void c(RecyclerView recyclerView, int i, int i2) {
            h.e(recyclerView, "recyclerView");
            this.a.r.onNext(new jnf(this.a.c.U1(), this.a.c.Z1()));
        }
    }

    public interface c {
        void a(String str);

        void b(String str, int i);

        void c(String str);
    }

    public FollowRecsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static final f f(FollowRecsView followRecsView, cmf cmf) {
        c cVar = followRecsView.f;
        if (cVar == null) {
            return null;
        }
        if (cVar.u() > 0) {
            cmf.invoke();
        } else {
            ValueAnimator duration = ValueAnimator.ofInt(followRecsView.getHeight(), 0).setDuration(300L);
            duration.setInterpolator(new y5());
            duration.addUpdateListener(new e(duration, followRecsView, cmf));
            duration.addListener(new f(followRecsView, cmf));
            duration.start();
        }
        return f.a;
    }

    /* access modifiers changed from: private */
    public final void setHeight(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i;
        setLayoutParams(layoutParams);
    }

    public final void i(List<j45> list, c cVar) {
        h.e(list, "artists");
        h.e(cVar, "followRecsClickListener");
        this.n = cVar;
        c cVar2 = this.f;
        if (cVar2 != null) {
            cVar2.c0(list);
            cVar2.f0(new FollowRecsView$bindCarousel$$inlined$apply$lambda$1(this, list));
        }
        c cVar3 = this.f;
        if (cVar3 != null) {
            cVar3.z();
        }
    }

    public final void j(String str) {
        h.e(str, "sectionTitle");
        this.a.setText(str);
    }

    public final void k(Parcelable parcelable) {
        this.c.h1(parcelable);
    }

    public final Parcelable l() {
        return this.c.i1();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p = this.r.E().z(250, TimeUnit.MILLISECONDS, io.reactivex.schedulers.a.a()).y0(new jnf(0, 0), new g(this)).j0(new h(this)).subscribe(new i(this));
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        io.reactivex.disposables.b bVar = this.p;
        if (bVar != null) {
            bVar.dispose();
        }
        this.p = null;
    }

    public final void setAdapter(c cVar) {
        h.e(cVar, "adapter");
        this.f = cVar;
        this.b.setAdapter(cVar);
    }

    public final void setOnScrollListener(nmf<? super Set<Integer>, f> nmf) {
        h.e(nmf, "scrollConsumer");
        this.o = nmf;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowRecsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        this.o = FollowRecsView$followRecsScrollConsumer$1.a;
        this.q = EmptySet.a;
        PublishSubject<jnf> h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create<IntRange>()");
        this.r = h1;
        LinearLayout.inflate(context, C0707R.layout.follow_recs_view, this);
        setOrientation(1);
        View G = q4.G(this, C0707R.id.section_title);
        h.d(G, "ViewCompat.requireViewBy…this, R.id.section_title)");
        this.a = (TextView) G;
        View G2 = q4.G(this, C0707R.id.recycler_view);
        h.d(G2, "ViewCompat.requireViewBy…this, R.id.recycler_view)");
        this.b = (RecyclerView) G2;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.c = linearLayoutManager;
        this.b.setLayoutManager(linearLayoutManager);
        this.b.setHasFixedSize(true);
        this.b.k(new a(getResources().getDimensionPixelSize(C0707R.dimen.follow_recs_space_start_and_end), getResources().getDimensionPixelSize(C0707R.dimen.follow_recs_margin_middle)), -1);
        this.b.n(new b(this));
    }
}

package com.spotify.music.contentviewstate.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.spotify.music.C0707R;

public class LoadingView extends FrameLayout {
    public static final b y = new a();
    private View a;
    private b b;
    private int c;
    private final int f;
    private final int n;
    private final int o;
    private int p;
    private View q;
    private Animation r;
    private Animation s;
    private State t;
    private final Runnable u;
    private final Runnable v;
    private final Runnable w;
    private final Animation.AnimationListener x;

    /* access modifiers changed from: private */
    public enum State {
        WAITING_TO_BE_SHOWN,
        WAITING_TO_START_FADE_IN,
        FADING_IN,
        FULLY_VISIBLE,
        FADING_OUT,
        VISIBILITY_SET_TO_GONE
    }

    static class a implements b {
        a() {
        }

        @Override // com.spotify.music.contentviewstate.view.b
        public void a() {
        }

        @Override // com.spotify.music.contentviewstate.view.b
        public long b() {
            return 0;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (LoadingView.this.t == State.WAITING_TO_START_FADE_IN) {
                LoadingView.this.t = State.FADING_IN;
                LoadingView.c(LoadingView.this);
                LoadingView loadingView = LoadingView.this;
                loadingView.postDelayed(loadingView.v, LoadingView.this.b.b());
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (LoadingView.this.t == State.FADING_IN || LoadingView.this.t == State.FULLY_VISIBLE) {
                LoadingView.f(LoadingView.this);
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int ordinal = LoadingView.this.t.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                if (LoadingView.this.t == State.WAITING_TO_START_FADE_IN) {
                    LoadingView loadingView = LoadingView.this;
                    loadingView.removeCallbacks(loadingView.u);
                }
                LoadingView.this.t = State.VISIBILITY_SET_TO_GONE;
                LoadingView.g(LoadingView.this);
                LoadingView.this.b.a();
                LoadingView.this.setVisibility(8);
            } else if (ordinal == 2 || ordinal == 3) {
                if (LoadingView.this.t == State.FADING_IN) {
                    LoadingView.g(LoadingView.this);
                }
                LoadingView loadingView2 = LoadingView.this;
                loadingView2.removeCallbacks(loadingView2.v);
                LoadingView.this.t = State.FADING_OUT;
                LoadingView.h(LoadingView.this);
                LoadingView.this.b.a();
            }
        }
    }

    class e extends k62 {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (animation == LoadingView.this.r) {
                if (LoadingView.this.t == State.FADING_IN) {
                    LoadingView.this.t = State.FULLY_VISIBLE;
                }
            } else if (animation == LoadingView.this.s) {
                LoadingView.this.t = State.VISIBILITY_SET_TO_GONE;
                LoadingView.this.setVisibility(8);
            }
        }
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = new b();
        this.v = new c();
        this.w = new d();
        this.x = new e();
        this.b = y;
        this.c = getResources().getInteger(C0707R.integer.loading_view_delay_before_showing);
        this.f = getResources().getInteger(C0707R.integer.loading_view_duration_fade_in);
        this.n = getResources().getInteger(C0707R.integer.loading_view_duration_fade_out);
        this.o = getResources().getInteger(C0707R.integer.loading_view_duration_content_crossfade);
        this.t = State.WAITING_TO_BE_SHOWN;
    }

    static void c(LoadingView loadingView) {
        loadingView.getClass();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        loadingView.r = alphaAnimation;
        alphaAnimation.setDuration((long) loadingView.f);
        loadingView.r.setInterpolator(loadingView.getContext(), 17563649);
        loadingView.r.setAnimationListener(loadingView.x);
        loadingView.startAnimation(loadingView.r);
        loadingView.setVisibility(0);
    }

    static void f(LoadingView loadingView) {
        loadingView.getClass();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration((long) loadingView.f);
        loadingView.a.startAnimation(alphaAnimation);
        loadingView.a.setVisibility(0);
    }

    static void g(LoadingView loadingView) {
        if (loadingView.q != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration((long) loadingView.o);
            alphaAnimation.setInterpolator(loadingView.getContext(), 17563649);
            loadingView.q.startAnimation(alphaAnimation);
            loadingView.q.setVisibility(0);
        }
    }

    static void h(LoadingView loadingView) {
        loadingView.getClass();
        AlphaAnimation alphaAnimation = new AlphaAnimation(((float) loadingView.p) / 255.0f, 0.0f);
        loadingView.s = alphaAnimation;
        alphaAnimation.setFillAfter(true);
        loadingView.s.setFillEnabled(true);
        loadingView.s.setDuration((long) loadingView.n);
        loadingView.r.setInterpolator(loadingView.getContext(), 17563649);
        loadingView.s.setAnimationListener(loadingView.x);
        loadingView.startAnimation(loadingView.s);
    }

    public static LoadingView l(LayoutInflater layoutInflater) {
        return (LoadingView) layoutInflater.inflate(C0707R.layout.loading_view, (ViewGroup) null);
    }

    public static LoadingView m(LayoutInflater layoutInflater, Context context, View view) {
        LoadingView loadingView = (LoadingView) layoutInflater.inflate(C0707R.layout.loading_view, (ViewGroup) null);
        loadingView.setTargetContentView(view);
        loadingView.setListener(new a(context, view));
        return loadingView;
    }

    public void n() {
        post(this.w);
    }

    public boolean o() {
        return this.t == State.FADING_OUT;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = findViewById(C0707R.id.progress);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public boolean onSetAlpha(int i) {
        this.p = i;
        return super.onSetAlpha(i);
    }

    public boolean p() {
        State state = this.t;
        return state == State.WAITING_TO_START_FADE_IN || state == State.FADING_IN || state == State.FULLY_VISIBLE;
    }

    public void q() {
        removeCallbacks(this.u);
        removeCallbacks(this.v);
        removeCallbacks(this.w);
        setAnimation(null);
        this.a.setAnimation(null);
        View view = this.q;
        if (view != null) {
            view.setAnimation(null);
        }
        setVisibility(8);
        this.a.setVisibility(4);
        this.t = State.WAITING_TO_BE_SHOWN;
    }

    public void r() {
        s(this.c);
    }

    public void s(int i) {
        if (this.t == State.WAITING_TO_BE_SHOWN) {
            this.t = State.WAITING_TO_START_FADE_IN;
            postDelayed(this.u, (long) i);
        }
    }

    public void setDelayBeforeShowing(int i) {
        this.c = i;
    }

    public void setListener(b bVar) {
        if (bVar == null) {
            this.b = y;
        } else {
            this.b = bVar;
        }
    }

    public void setTargetContentView(View view) {
        this.q = view;
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}

package com.spotify.music.share.v2.view;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import com.google.common.base.Optional;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.e0;
import com.spotify.mobile.android.video.r;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.music.share.logging.ShareMenuLogger;
import defpackage.g2d;
import defpackage.i2d;
import defpackage.l2d;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.EmptyList;
import kotlin.collections.d;

public final class ShareMenuViews implements g<k2d, i2d>, m, b {
    private final Runnable A;
    private final View a;
    private final ConstraintLayout b;
    private final ImageView c;
    private final Space f;
    private final View n;
    private final View o;
    private final View p;
    private final View q;
    private View r;
    private ImageView s;
    private VideoSurfaceView t;
    private da2<i2d> u;
    private r v;
    private String w;
    private final ShareMenuLogger x;
    private final SnackbarManager y;
    private final Lifecycle z;

    public static final class a implements h<k2d> {
        final /* synthetic */ ShareMenuViews a;
        final /* synthetic */ ShareDestinationsView b;

        a(ShareMenuViews shareMenuViews, ShareDestinationsView shareDestinationsView) {
            this.a = shareMenuViews;
            this.b = shareDestinationsView;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            k2d k2d = (k2d) obj;
            kotlin.jvm.internal.h.e(k2d, "model");
            ShareDestinationsView shareDestinationsView = this.b;
            List<o8e> b2 = k2d.b();
            if (b2 == null) {
                b2 = EmptyList.a;
            }
            shareDestinationsView.setDestinations(b2);
            this.b.setMenuLogger(this.a.x);
            ShareMenuViews.h(this.a, k2d.e());
            ShareMenuViews.i(this.a, k2d.e());
            if (k2d.e() instanceof g2d.a) {
                this.a.m(C0707R.string.share_menu_preview_error, i2d.b.a, ShareMenuLogger.ErrorMessageReason.PREVIEW_FAILED_TO_LOAD);
            }
            ShareMenuViews.f(this.a, k2d);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            r rVar = this.a.v;
            if (rVar != null) {
                rVar.d();
            }
            this.a.z.c(this.a);
            this.a.u = null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {
        final /* synthetic */ ShareMenuViews a;
        final /* synthetic */ ShareMenuLogger.ErrorMessageReason b;
        final /* synthetic */ i2d c;

        b(ShareMenuViews shareMenuViews, ShareMenuLogger.ErrorMessageReason errorMessageReason, i2d i2d) {
            this.a = shareMenuViews;
            this.b = errorMessageReason;
            this.c = i2d;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.x.g(this.b);
            da2 da2 = this.a.u;
            if (da2 != null) {
                da2.accept(this.c);
            }
        }
    }

    public ShareMenuViews(LayoutInflater layoutInflater, ViewGroup viewGroup, ShareMenuLogger shareMenuLogger, SnackbarManager snackbarManager, Lifecycle lifecycle, Runnable runnable) {
        kotlin.jvm.internal.h.e(layoutInflater, "inflater");
        kotlin.jvm.internal.h.e(shareMenuLogger, "shareMenuLogger");
        kotlin.jvm.internal.h.e(snackbarManager, "snackbarManager");
        kotlin.jvm.internal.h.e(lifecycle, "lifecycle");
        kotlin.jvm.internal.h.e(runnable, "dismissAction");
        this.x = shareMenuLogger;
        this.y = snackbarManager;
        this.z = lifecycle;
        this.A = runnable;
        View inflate = layoutInflater.inflate(C0707R.layout.share_menu_v2, viewGroup, false);
        kotlin.jvm.internal.h.d(inflate, "inflater.inflate(R.layou…e_menu_v2, parent, false)");
        this.a = inflate;
        View findViewById = inflate.findViewById(C0707R.id.content);
        kotlin.jvm.internal.h.d(findViewById, "root.findViewById(R.id.content)");
        this.b = (ConstraintLayout) findViewById;
        View findViewById2 = inflate.findViewById(C0707R.id.sticker_preview);
        kotlin.jvm.internal.h.d(findViewById2, "root.findViewById(R.id.sticker_preview)");
        this.c = (ImageView) findViewById2;
        View findViewById3 = inflate.findViewById(C0707R.id.status_bar_space);
        kotlin.jvm.internal.h.d(findViewById3, "root.findViewById(R.id.status_bar_space)");
        this.f = (Space) findViewById3;
        View findViewById4 = inflate.findViewById(C0707R.id.progress_layout);
        kotlin.jvm.internal.h.d(findViewById4, "root.findViewById(R.id.progress_layout)");
        this.n = findViewById4;
        View findViewById5 = inflate.findViewById(C0707R.id.preview_loading_background);
        kotlin.jvm.internal.h.d(findViewById5, "root.findViewById(R.id.preview_loading_background)");
        this.o = findViewById5;
        View findViewById6 = inflate.findViewById(C0707R.id.preview_loading_sticker);
        kotlin.jvm.internal.h.d(findViewById6, "root.findViewById(R.id.preview_loading_sticker)");
        this.p = findViewById6;
        View findViewById7 = inflate.findViewById(C0707R.id.preview_gradient_overlay);
        kotlin.jvm.internal.h.d(findViewById7, "root.findViewById(R.id.preview_gradient_overlay)");
        this.q = findViewById7;
    }

    public static final void f(ShareMenuViews shareMenuViews, k2d k2d) {
        shareMenuViews.getClass();
        l2d g = k2d.g();
        if (g != null) {
            if (g instanceof l2d.c) {
                rzc d = k2d.d();
                if (d != null) {
                    d.a();
                }
                shareMenuViews.A.run();
            } else if (g instanceof l2d.a) {
                l2d.a aVar = (l2d.a) g;
                shareMenuViews.m(C0707R.string.share_menu_error, new i2d.e(aVar.b(), aVar.a()), ShareMenuLogger.ErrorMessageReason.SHARE_FAILED);
            }
            shareMenuViews.n.setVisibility(g instanceof l2d.b ? 0 : 8);
        }
    }

    public static final void h(ShareMenuViews shareMenuViews, g2d g2d) {
        boolean z2 = g2d instanceof g2d.b;
        boolean z3 = true;
        int i = 0;
        shareMenuViews.o.setVisibility(z2 || (g2d instanceof g2d.a) ? 0 : 8);
        View view = shareMenuViews.p;
        if (!z2 && !(g2d instanceof g2d.a)) {
            z3 = false;
        }
        if (!z3) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public static final void i(ShareMenuViews shareMenuViews, g2d g2d) {
        Integer num;
        shareMenuViews.q.setVisibility((g2d instanceof g2d.b) || (g2d instanceof g2d.a) || ((g2d instanceof g2d.c) && !(((szc) ((g2d.c) g2d).a()).a() instanceof GradientDrawable)) ? 0 : 8);
        if (g2d instanceof g2d.c) {
            szc szc = (szc) ((g2d.c) g2d).a();
            Optional<l8e> c2 = szc.c();
            kotlin.jvm.internal.h.d(c2, "stickerMedia()");
            if (c2.isPresent()) {
                shareMenuViews.c.setVisibility(0);
                shareMenuViews.c.setImageBitmap(szc.c().get().c());
            } else {
                shareMenuViews.c.setVisibility(8);
            }
            m8e a2 = szc.a();
            if (a2 instanceof k8e) {
                m8e a3 = szc.a();
                if (a3 != null) {
                    k8e k8e = (k8e) a3;
                    if (shareMenuViews.r == null) {
                        View findViewById = shareMenuViews.a.findViewById(C0707R.id.gradient_background_preview_stub);
                        kotlin.jvm.internal.h.d(findViewById, "root.findViewById<ViewSt…_background_preview_stub)");
                        findViewById.setVisibility(0);
                        shareMenuViews.r = shareMenuViews.a.findViewById(C0707R.id.gradient_background_preview);
                    }
                    List<String> b2 = k8e.b();
                    kotlin.jvm.internal.h.d(b2, "gradientShareMedia.gradientColors()");
                    ArrayList arrayList = new ArrayList();
                    for (T t2 : b2) {
                        kotlin.jvm.internal.h.d(t2, "color");
                        try {
                            num = Integer.valueOf(Color.parseColor(t2));
                        } catch (IllegalArgumentException unused) {
                            num = null;
                        }
                        if (num != null) {
                            arrayList.add(num);
                        }
                    }
                    int[] P = d.P(arrayList);
                    View view = shareMenuViews.r;
                    if (view != null) {
                        view.setVisibility(0);
                        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, P));
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.share.sharedata.media.GradientShareMedia");
            } else if (a2 instanceof l8e) {
                m8e a4 = szc.a();
                if (a4 != null) {
                    l8e l8e = (l8e) a4;
                    if (shareMenuViews.s == null) {
                        View findViewById2 = shareMenuViews.a.findViewById(C0707R.id.image_background_preview_stub);
                        kotlin.jvm.internal.h.d(findViewById2, "root.findViewById<ViewSt…_background_preview_stub)");
                        findViewById2.setVisibility(0);
                        shareMenuViews.s = (ImageView) shareMenuViews.a.findViewById(C0707R.id.image_background_preview);
                    }
                    ImageView imageView = shareMenuViews.s;
                    if (imageView != null) {
                        e2.u(imageView, true);
                    }
                    ImageView imageView2 = shareMenuViews.s;
                    if (imageView2 != null) {
                        imageView2.setImageBitmap(l8e.c());
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.share.sharedata.media.ImageShareMedia");
            } else if (a2 instanceof n8e) {
                m8e a5 = szc.a();
                if (a5 != null) {
                    n8e n8e = (n8e) a5;
                    if (shareMenuViews.t == null) {
                        ViewStub viewStub = (ViewStub) shareMenuViews.a.findViewById(C0707R.id.video_background_preview_stub);
                        if (viewStub != null) {
                            e2.u(viewStub, true);
                        }
                        shareMenuViews.t = (VideoSurfaceView) shareMenuViews.a.findViewById(C0707R.id.video_background_preview);
                    }
                    String uri = n8e.b().toString();
                    kotlin.jvm.internal.h.d(uri, "videoShareMedia.videoUri().toString()");
                    if (shareMenuViews.v != null && (!kotlin.jvm.internal.h.a(uri, shareMenuViews.w))) {
                        shareMenuViews.l(uri);
                    }
                    shareMenuViews.w = uri;
                    ViewGroup.LayoutParams layoutParams = shareMenuViews.c.getLayoutParams();
                    if (layoutParams != null) {
                        ((ConstraintLayout.LayoutParams) layoutParams).N = 0.8f;
                        shareMenuViews.c.requestLayout();
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.share.sharedata.media.VideoShareMedia");
            }
        } else {
            shareMenuViews.c.setVisibility(8);
            View view2 = shareMenuViews.r;
            if (view2 != null) {
                e2.u(view2, false);
            }
            ImageView imageView3 = shareMenuViews.s;
            if (imageView3 != null) {
                e2.u(imageView3, false);
            }
            VideoSurfaceView videoSurfaceView = shareMenuViews.t;
            if (videoSurfaceView != null) {
                e2.u(videoSurfaceView, false);
            }
        }
    }

    private final void l(String str) {
        VideoSurfaceView videoSurfaceView = this.t;
        if (videoSurfaceView != null) {
            r rVar = this.v;
            if (rVar != null) {
                rVar.L(videoSurfaceView);
            }
            r rVar2 = this.v;
            if (rVar2 != null) {
                rVar2.P(true);
            }
            videoSurfaceView.setScaleType(VideoSurfaceView.ScaleType.ASPECT_FILL);
            e0.a a2 = e0.a();
            a2.e(false);
            a2.d(true);
            a2.f(str);
            e0 b2 = a2.b();
            r rVar3 = this.v;
            if (rVar3 != null) {
                rVar3.K(b2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void m(int i, i2d i2d, ShareMenuLogger.ErrorMessageReason errorMessageReason) {
        SnackbarConfiguration build = SnackbarConfiguration.builder(i).actionTextRes(C0707R.string.share_menu_error_retry).onClickListener(new b(this, errorMessageReason, i2d)).build();
        SnackbarManager snackbarManager = this.y;
        kotlin.jvm.internal.h.d(build, "snackbarConfig");
        snackbarManager.showInView(build, this.b);
        this.x.f(errorMessageReason);
    }

    @Override // com.spotify.music.share.v2.view.b
    public void a(r rVar) {
        kotlin.jvm.internal.h.e(rVar, "videoPlayer");
        this.v = rVar;
        String str = this.w;
        if (str != null) {
            l(str);
        }
    }

    public final View k() {
        return this.a;
    }

    @w(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        r rVar;
        if (this.w != null && (rVar = this.v) != null) {
            rVar.pause();
        }
    }

    @w(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        r rVar;
        if (this.w != null && (rVar = this.v) != null) {
            rVar.resume();
        }
    }

    @Override // com.spotify.mobius.g
    public h<k2d> t(da2<i2d> da2) {
        kotlin.jvm.internal.h.e(da2, "eventConsumer");
        this.z.a(this);
        this.u = da2;
        Space space = this.f;
        ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = com.spotify.android.goldenpath.a.d(this.a.getContext());
            space.setLayoutParams(layoutParams);
            ShareDestinationsView shareDestinationsView = (ShareDestinationsView) this.a.findViewById(C0707R.id.destinations_view);
            shareDestinationsView.D(new ShareMenuViews$connect$$inlined$apply$lambda$1(da2));
            return new a(this, shareDestinationsView);
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}

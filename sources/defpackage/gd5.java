package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.base.MoreObjects;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.image.provider.e;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.a0;
import com.spotify.mobile.android.video.e0;
import com.spotify.mobile.android.video.r;
import com.spotify.mobile.android.video.s;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.music.features.fullscreen.story.FullscreenStoryTouchListener;
import com.spotify.music.libs.fullscreen.story.domain.FullscreenStoryViewState;
import com.spotify.music.libs.fullscreen.story.domain.OverlayModel;
import com.spotify.music.libs.fullscreen.story.domain.b;
import com.spotify.music.libs.fullscreen.story.domain.c;
import com.spotify.music.libs.fullscreen.story.domain.i;
import com.spotify.music.libs.fullscreen.story.domain.m;
import com.spotify.music.libs.fullscreen.story.domain.p;
import com.spotify.music.nowplaying.common.view.heart.HeartButton;
import com.spotify.music.nowplaying.common.view.trackinfo.MarqueeTrackInfoView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import java.util.Collections;

/* renamed from: gd5  reason: default package */
public final class gd5 implements g<m, i>, fd5, ed5 {
    private HeartButton A;
    private ViewGroup B;
    private View C;
    private ToggleButton D;
    private MarqueeTrackInfoView E;
    private View F;
    private View G;
    private ImageView H;
    private TextView I;
    private TextView J;
    private View K;
    private View L;
    private View M;
    private View N;
    private r O;
    private hj0<m> P;
    private final b a;
    private final s b;
    private final l72 c;
    private final sc5 f;
    private final DisplayMetrics n;
    private final Picasso o;
    private final boolean p;
    private ConstraintLayout q;
    private View r;
    private VideoSurfaceView s;
    private ImageView t;
    private ImageView u;
    private ConstraintLayout v;
    private ViewGroup w;
    private TextView x;
    private TextView y;
    private ImageView z;

    /* renamed from: gd5$a */
    class a implements h<m> {
        a() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            gd5.c(gd5.this, (m) obj);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            gd5.this.q.getClass();
            gd5.this.q.setOnTouchListener(null);
            gd5.this.q.findViewById(C0707R.id.close_button).setOnClickListener(null);
            ImageView imageView = gd5.this.z;
            imageView.getClass();
            imageView.setOnClickListener(null);
            HeartButton heartButton = gd5.this.A;
            heartButton.getClass();
            heartButton.setListener(null);
            View view = gd5.this.C;
            view.getClass();
            view.setOnClickListener(null);
            View view2 = gd5.this.N;
            view2.getClass();
            view2.setOnClickListener(null);
            q4.P(gd5.this.q, null);
            if (gd5.this.O != null) {
                gd5.this.O.d();
                gd5.this.O = null;
            }
            gd5.this.q = null;
            gd5.this.r = null;
            gd5.this.G = null;
            gd5.this.K = null;
            gd5.this.L = null;
            gd5.this.t = null;
            gd5.this.v = null;
            gd5.this.s = null;
            gd5.this.N = null;
            gd5.this.w = null;
            gd5.this.x = null;
            gd5.this.y = null;
            gd5.this.z = null;
            gd5.this.A = null;
            gd5.this.E = null;
            gd5.this.F = null;
            gd5.this.u = null;
            gd5.this.B = null;
            gd5.this.H = null;
            gd5.this.I = null;
            gd5.this.J = null;
            gd5.this.M = null;
        }
    }

    /* renamed from: gd5$b */
    public interface b {
        void close();

        View i();
    }

    public gd5(b bVar, s sVar, l72 l72, sc5 sc5, DisplayMetrics displayMetrics, Picasso picasso, boolean z2) {
        this.a = bVar;
        this.f = sc5;
        displayMetrics.getClass();
        this.n = displayMetrics;
        this.o = picasso;
        this.b = sVar;
        this.c = l72;
        this.p = z2;
    }

    private void J(String str, a0 a0Var) {
        r rVar = this.O;
        rVar.getClass();
        e0.a a2 = e0.a();
        a2.f(str);
        a2.d(false);
        a2.e(false);
        rVar.t(a2.b(), a0Var);
    }

    private void K(int i, float f2) {
        this.w.getClass();
        ((ProgressBar) this.w.getChildAt(i)).setProgress((int) (f2 * 10000.0f));
    }

    static void c(gd5 gd5, m mVar) {
        int i;
        gd5.getClass();
        FullscreenStoryViewState fullscreenStoryViewState = FullscreenStoryViewState.PLAYING_AUDIO;
        FullscreenStoryViewState fullscreenStoryViewState2 = FullscreenStoryViewState.PLAYING_VIDEO;
        FullscreenStoryViewState fullscreenStoryViewState3 = FullscreenStoryViewState.ERROR;
        FullscreenStoryViewState i2 = mVar.i();
        if (i2 != FullscreenStoryViewState.BUFFERING) {
            FullscreenStoryViewState fullscreenStoryViewState4 = FullscreenStoryViewState.OFFLINE;
            if (i2 == fullscreenStoryViewState4 || i2 == fullscreenStoryViewState3) {
                MoreObjects.checkState(i2 == fullscreenStoryViewState4 || i2 == fullscreenStoryViewState3);
                int i3 = i2 == fullscreenStoryViewState4 ? C0707R.string.fullscreen_story_error_no_connection_title : C0707R.string.fullscreen_story_error_error_title;
                int i4 = i2 == fullscreenStoryViewState4 ? C0707R.string.fullscreen_story_error_no_connection_body : C0707R.string.fullscreen_story_error_error_body;
                SpotifyIconV2 spotifyIconV2 = i2 == fullscreenStoryViewState4 ? SpotifyIconV2.OFFLINE : SpotifyIconV2.WARNING;
                ImageView imageView = gd5.H;
                imageView.getClass();
                ConstraintLayout constraintLayout = gd5.q;
                constraintLayout.getClass();
                Context context = constraintLayout.getContext();
                ConstraintLayout constraintLayout2 = gd5.q;
                constraintLayout2.getClass();
                imageView.setImageDrawable(yc0.d(context, spotifyIconV2, (float) nud.g(32.0f, constraintLayout2.getResources())));
                TextView textView = gd5.I;
                textView.getClass();
                textView.setText(i3);
                TextView textView2 = gd5.J;
                textView2.getClass();
                textView2.setText(i4);
            }
            int i5 = 8;
            if (i2 == FullscreenStoryViewState.LOADING) {
                View view = gd5.K;
                view.getClass();
                view.setVisibility(0);
                View view2 = gd5.G;
                view2.getClass();
                view2.setVisibility(8);
            } else {
                View view3 = gd5.K;
                view3.getClass();
                view3.setVisibility(8);
                View view4 = gd5.G;
                view4.getClass();
                view4.setVisibility((i2 == fullscreenStoryViewState4 || i2 == fullscreenStoryViewState3) ? 0 : 8);
                ConstraintLayout constraintLayout3 = gd5.v;
                constraintLayout3.getClass();
                constraintLayout3.setVisibility(i2 == fullscreenStoryViewState2 ? 0 : 8);
                if (i2 != fullscreenStoryViewState) {
                    View view5 = gd5.r;
                    view5.getClass();
                    view5.setBackground(null);
                }
                gd5.P.e(mVar);
                ImageView imageView2 = gd5.t;
                imageView2.getClass();
                imageView2.setVisibility(i2 == fullscreenStoryViewState ? 0 : 8);
                View view6 = gd5.M;
                view6.getClass();
                if (i2 == fullscreenStoryViewState || i2 == fullscreenStoryViewState2) {
                    i5 = 0;
                }
                view6.setVisibility(i5);
            }
            if (mVar.h() != null) {
                p h = mVar.h();
                gd5.y.getClass();
                gd5.x.getClass();
                gd5.x.setText(h.f());
                gd5.y.setText(h.e());
                gd5.o.m(h.getImageUri()).n(gd5.z, null);
                boolean g = mVar.g();
                gd5.L.getClass();
                gd5.M.getClass();
                int i6 = 4;
                if (g) {
                    bd0.c(gd5.L);
                    if (i2 == fullscreenStoryViewState || i2 == fullscreenStoryViewState2) {
                        bd0.c(gd5.M);
                    }
                } else {
                    bd0.f(gd5.L, 4);
                    bd0.f(gd5.M, 4);
                }
                int size = h.b().size();
                int c2 = mVar.c();
                gd5.w.getClass();
                if (gd5.w.getChildCount() != size) {
                    gd5.w.removeAllViews();
                    LayoutInflater from = LayoutInflater.from(gd5.w.getContext());
                    int i7 = 0;
                    while (i7 < size) {
                        ProgressBar progressBar = (ProgressBar) from.inflate(C0707R.layout.fullscreen_story_progress_bar, gd5.w, false);
                        progressBar.setMax(10000);
                        Resources resources = gd5.w.getContext().getResources();
                        if (i7 == size + -1) {
                            i = 0;
                        } else {
                            i = resources.getDimensionPixelSize(C0707R.dimen.progress_bar_padding);
                        }
                        progressBar.setPadding(0, 0, i, 0);
                        gd5.w.addView(progressBar);
                        i7++;
                    }
                }
                if (c2 >= 0) {
                    c cVar = h.b().get(c2);
                    if (cVar.b() instanceof b.a) {
                        b.a aVar = (b.a) cVar.b();
                        View view7 = gd5.r;
                        view7.getClass();
                        view7.setBackgroundColor(aVar.a());
                        z m = gd5.o.m(aVar.getImageUri());
                        m.s(C0707R.drawable.cover_art_placeholder);
                        ImageView imageView3 = gd5.t;
                        imageView3.getClass();
                        m.m(imageView3);
                    }
                    View view8 = gd5.N;
                    view8.getClass();
                    if (i2 == fullscreenStoryViewState2) {
                        i6 = 0;
                    }
                    view8.setVisibility(i6);
                    for (int i8 = 0; i8 < size; i8++) {
                        if (i8 < c2) {
                            gd5.K(i8, 1.0f);
                        } else {
                            float f2 = 0.0f;
                            if (i8 == c2) {
                                if (mVar.e() != 0) {
                                    f2 = ((float) mVar.f()) / ((float) mVar.e());
                                }
                                gd5.K(i8, f2);
                            } else {
                                gd5.K(i8, 0.0f);
                            }
                        }
                    }
                }
            }
        }
    }

    public void I(m mVar) {
        OverlayModel overlayModel;
        if (mVar.h() == null) {
            overlayModel = null;
        } else {
            overlayModel = mVar.h().b().get(mVar.c()).c();
        }
        this.E.getClass();
        if (overlayModel == null) {
            this.B.setVisibility(4);
            return;
        }
        this.B.setVisibility(0);
        this.E.setTitle(overlayModel.i());
        this.E.setSubtitle(overlayModel.h());
        int b2 = overlayModel.b();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(b2);
        gradientDrawable.setCornerRadius((float) this.q.getResources().getDimensionPixelSize(C0707R.dimen.fullscreen_story_track_overlay_corner_radius));
        View view = this.F;
        view.getClass();
        view.setBackground(gradientDrawable);
        z m = this.o.m(overlayModel.getImageUri());
        int ordinal = overlayModel.f().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                m.x(new com.spotify.image.provider.b());
            } else if (ordinal == 2) {
                m.x(new e());
            } else {
                throw new AssertionError("unsupported  image style");
            }
        }
        m.s(C0707R.drawable.cover_art_placeholder);
        ImageView imageView = this.u;
        imageView.getClass();
        m.m(imageView);
        int ordinal2 = overlayModel.j().ordinal();
        if (ordinal2 == 0 || ordinal2 == 1) {
            boolean g = overlayModel.g();
            HeartButton heartButton = this.A;
            heartButton.getClass();
            heartButton.setVisibility(0);
            View view2 = this.C;
            view2.getClass();
            view2.setVisibility(0);
            ToggleButton toggleButton = this.D;
            toggleButton.getClass();
            toggleButton.setVisibility(8);
            HeartButton heartButton2 = this.A;
            heartButton2.getClass();
            heartButton2.setHeartState(g);
        } else if (ordinal2 == 2) {
            boolean g2 = overlayModel.g();
            HeartButton heartButton3 = this.A;
            heartButton3.getClass();
            heartButton3.setVisibility(8);
            View view3 = this.C;
            view3.getClass();
            view3.setVisibility(8);
            ToggleButton toggleButton2 = this.D;
            toggleButton2.getClass();
            toggleButton2.setVisibility(0);
            ToggleButton toggleButton3 = this.D;
            toggleButton3.getClass();
            toggleButton3.setChecked(g2);
        } else {
            throw new AssertionError("unsupported overlay type");
        }
    }

    @Override // defpackage.ed5
    public void a(boolean z2) {
        this.O.getClass();
        if (z2) {
            this.O.resume();
        } else {
            this.O.pause();
        }
    }

    @Override // defpackage.ed5
    public void b(c cVar, long j) {
        a0.a a2 = a0.a();
        a2.d(Long.valueOf(j));
        a2.e(true);
        a0 b2 = a2.b();
        com.spotify.music.libs.fullscreen.story.domain.b b3 = cVar.b();
        if (b3 instanceof b.C0289b) {
            J(this.c.a(((b.C0289b) b3).a()), b2);
        } else if (b3 instanceof b.a) {
            J(((b.a) b3).b(), b2);
        }
    }

    @Override // defpackage.fd5
    public void close() {
        this.a.close();
    }

    @Override // com.spotify.mobius.g
    public h<m> t(da2<i> da2) {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.a.i();
        this.q = constraintLayout;
        this.r = constraintLayout.findViewById(C0707R.id.content_frame);
        this.G = this.q.findViewById(C0707R.id.error_root);
        this.K = this.q.findViewById(C0707R.id.loading_root);
        this.v = (ConstraintLayout) this.q.findViewById(C0707R.id.video_root);
        this.L = this.q.findViewById(C0707R.id.header_root);
        this.t = (ImageView) this.q.findViewById(C0707R.id.song_image);
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) this.q.findViewById(C0707R.id.video_surface);
        this.s = videoSurfaceView;
        videoSurfaceView.setScaleType(VideoSurfaceView.ScaleType.ASPECT_FILL);
        boolean z2 = false;
        this.s.setBufferingThrobberEnabled(false);
        this.w = (ViewGroup) this.q.findViewById(C0707R.id.progress_container);
        this.x = (TextView) this.q.findViewById(C0707R.id.title);
        this.y = (TextView) this.q.findViewById(C0707R.id.subtitle);
        this.z = (ImageView) this.q.findViewById(C0707R.id.playlist_cover);
        this.H = (ImageView) this.G.findViewById(C0707R.id.fullscreen_story_error_image);
        this.I = (TextView) this.G.findViewById(C0707R.id.fullscreen_story_error_title);
        this.J = (TextView) this.G.findViewById(C0707R.id.fullscreen_story_error_subtitle);
        this.M = this.q.findViewById(C0707R.id.footer_root);
        ConstraintLayout constraintLayout2 = this.q;
        constraintLayout2.getClass();
        View findViewById = constraintLayout2.findViewById(C0707R.id.footer_context_menu_button);
        this.N = findViewById;
        findViewById.setOnClickListener(new vc5(da2));
        ImageView imageView = this.z;
        imageView.getClass();
        imageView.setOnClickListener(new cd5(da2));
        MoreObjects.checkState(this.O == null);
        s sVar = this.b;
        sVar.d("fullscreen_story");
        sVar.g(false);
        sVar.j(this.s);
        sVar.c(Collections.singletonList(this.f));
        this.O = sVar.a();
        ConstraintLayout constraintLayout3 = this.q;
        constraintLayout3.getClass();
        View findViewById2 = constraintLayout3.findViewById(C0707R.id.overlay_root);
        findViewById2.getClass();
        ViewGroup viewGroup = (ViewGroup) findViewById2;
        this.B = viewGroup;
        this.u = (ImageView) viewGroup.findViewById(C0707R.id.overlay_image_thumbnail);
        this.A = (HeartButton) this.B.findViewById(C0707R.id.overlay_heart_button);
        this.C = this.B.findViewById(C0707R.id.overlay_context_menu_button);
        this.D = (ToggleButton) this.B.findViewById(C0707R.id.overlay_follow_button);
        this.E = (MarqueeTrackInfoView) this.B.findViewById(C0707R.id.overlay_info_view);
        this.F = this.B.findViewById(C0707R.id.overlay_surface);
        HeartButton heartButton = this.A;
        heartButton.getClass();
        heartButton.b(this.p);
        HeartButton heartButton2 = this.A;
        heartButton2.getClass();
        heartButton2.b(false);
        HeartButton heartButton3 = this.A;
        heartButton3.getClass();
        heartButton3.setListener(new ad5(da2));
        View view = this.C;
        view.getClass();
        view.setOnClickListener(new uc5(da2));
        ToggleButton toggleButton = this.D;
        toggleButton.getClass();
        toggleButton.setOnClickListener(new zc5(da2));
        this.q.getClass();
        this.q.setOnTouchListener(new FullscreenStoryTouchListener(this.q.getContext(), this.n, new wc5(da2)));
        this.q.findViewById(C0707R.id.close_button).setOnClickListener(new dd5(da2));
        this.q.findViewById(C0707R.id.overlay_touch_area).setOnClickListener(new bd5(da2));
        DisplayMetrics displayMetrics = this.n;
        boolean z3 = ((float) displayMetrics.heightPixels) / ((float) displayMetrics.widthPixels) > 1.7777778f;
        Context context = this.q.getContext();
        context.getClass();
        boolean isInMultiWindowMode = (!(context instanceof Activity) || Build.VERSION.SDK_INT < 24) ? false : ((Activity) context).isInMultiWindowMode();
        this.r.getClass();
        ViewGroup.LayoutParams layoutParams = this.r.getLayoutParams();
        if (!z3 || isInMultiWindowMode) {
            layoutParams.height = -1;
        } else {
            layoutParams.height = 0;
        }
        this.r.setLayoutParams(layoutParams);
        View findViewById3 = this.q.findViewById(C0707R.id.corners_bottom);
        findViewById3.getClass();
        if (!z3 || isInMultiWindowMode) {
            findViewById3.setVisibility(8);
        } else {
            findViewById3.setVisibility(0);
        }
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.i(this.q);
        if (z3 && !isInMultiWindowMode) {
            View view2 = this.M;
            View view3 = this.r;
            DisplayMetrics displayMetrics2 = this.n;
            view2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = view2.getMeasuredHeight();
            view3.measure(View.MeasureSpec.makeMeasureSpec(displayMetrics2.widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            if (measuredHeight <= displayMetrics2.heightPixels - Math.round((((float) view3.getMeasuredWidth()) * 16.0f) / 9.0f)) {
                z2 = true;
            }
            if (z2) {
                bVar.l(this.M.getId(), 3, this.r.getId(), 4);
                bVar.g(this.M.getId(), 4);
                bVar.c(this.q);
                this.P = hj0.c(yc5.a, new xc5(this));
                return new a();
            }
        }
        bVar.l(this.M.getId(), 4, this.r.getId(), 4);
        bVar.g(this.M.getId(), 3);
        bVar.c(this.q);
        this.P = hj0.c(yc5.a, new xc5(this));
        return new a();
    }
}

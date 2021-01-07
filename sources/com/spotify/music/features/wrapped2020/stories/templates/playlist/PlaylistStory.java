package com.spotify.music.features.wrapped2020.stories.templates.playlist;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradientView;
import com.spotify.music.C0707R;
import com.spotify.music.features.wrapped2020.stories.templates.d;
import com.spotify.playlist.endpoints.p;
import com.spotify.playlist.endpoints.v;
import com.spotify.rxjava2.q;
import defpackage.jx1;
import defpackage.ox1;
import io.reactivex.functions.g;
import io.reactivex.s;
import io.reactivex.z;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

public final class PlaylistStory extends d {
    private Animator j;
    private Animator k;
    private f l;
    private final q m = new q();
    private boolean n;
    private final d o;
    private final v p;
    private final p q;
    private final ez8 r;

    public enum PlaylistState {
        ADDED,
        NOT_ADDED,
        INDETERMINATE
    }

    public static final class a extends AnimatorListenerAdapter {
        final /* synthetic */ PlaylistStory a;

        a(PlaylistStory playlistStory) {
            this.a = playlistStory;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            PlaylistStory.r(this.a);
        }
    }

    static final class b<T> implements g<Boolean> {
        final /* synthetic */ PlaylistStory a;

        b(PlaylistStory playlistStory) {
            this.a = playlistStory;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Boolean bool) {
            Boolean bool2 = bool;
            PlaylistStory playlistStory = this.a;
            h.d(bool2, "isPlaylistAdd");
            playlistStory.n = bool2.booleanValue();
            if (bool2.booleanValue()) {
                this.a.w(PlaylistState.ADDED);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlaylistStory(Activity activity, d dVar, v vVar, p pVar, List<? extends cmf<com.spotify.mobile.android.share.menu.preview.api.d>> list, ez8 ez8) {
        super(activity, new jx1.a(10300, TimeUnit.MILLISECONDS), C0707R.layout.story_template_playlist, dVar.j(), dVar.k(), list);
        h.e(activity, "activity");
        h.e(dVar, "viewData");
        h.e(vVar, "rootlistOperation");
        h.e(pVar, "rootlistEndpoint");
        h.e(list, "storySharePayloads");
        h.e(ez8, "storiesLogger");
        this.o = dVar;
        this.p = vVar;
        this.q = pVar;
        this.r = ez8;
    }

    public static final z k(PlaylistStory playlistStory, String str) {
        z F = playlistStory.p.c(str).P(Boolean.TRUE).F(Boolean.FALSE);
        h.d(F, "rootlistOperation.addPla….onErrorReturnItem(false)");
        return F;
    }

    public static final void q(PlaylistStory playlistStory) {
        Animator animator = playlistStory.k;
        if (animator != null) {
            wz8.b(animator);
        }
        if (playlistStory.n) {
            playlistStory.w(PlaylistState.ADDED);
            Animator v = playlistStory.v();
            v.setStartDelay(2000);
            v.start();
            playlistStory.k = v;
            return;
        }
        Animator v2 = playlistStory.v();
        v2.setStartDelay(8000);
        v2.start();
        playlistStory.k = v2;
        f fVar = playlistStory.l;
        if (fVar != null) {
            fVar.b().setOnClickListener(new c(playlistStory));
        }
    }

    public static final void r(PlaylistStory playlistStory) {
        ix1 g = playlistStory.g();
        if (g != null) {
            g.a(ox1.c.a);
        }
    }

    /* access modifiers changed from: private */
    public final Animator v() {
        AnimatorSet animatorSet = new AnimatorSet();
        f fVar = this.l;
        if (fVar != null) {
            animatorSet.playTogether(wz8.a(fVar.b(), C0707R.animator.animator_playlist_button_exit), wz8.a(fVar.e(), C0707R.animator.animator_playlist_text_exit), wz8.a(fVar.f(), C0707R.animator.animator_playlist_text_exit), wz8.a(fVar.c(), C0707R.animator.animator_playlist_art_exit), wz8.a(fVar.d(), C0707R.animator.animator_playlist_art_exit));
        }
        animatorSet.addListener(new a(this));
        return animatorSet;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void w(PlaylistState playlistState) {
        Button b2;
        f fVar = this.l;
        if (fVar != null && (b2 = fVar.b()) != null) {
            int ordinal = playlistState.ordinal();
            if (ordinal == 0) {
                b2.setEnabled(false);
                b2.setText(this.o.h());
            } else if (ordinal == 1) {
                b2.setEnabled(true);
                b2.setText(this.o.a());
            } else if (ordinal == 2) {
                b2.setEnabled(false);
                b2.setText(this.o.a());
            }
        }
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d, defpackage.hx1
    public void dispose() {
        super.dispose();
        Animator animator = this.k;
        if (animator != null) {
            wz8.b(animator);
        }
        Animator animator2 = this.j;
        if (animator2 != null) {
            wz8.b(animator2);
        }
        this.k = null;
        this.j = null;
        this.l = null;
        this.m.c();
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d
    public void i(View view) {
        h.e(view, "view");
        view.setBackgroundColor(this.o.c());
        View G = q4.G(view, C0707R.id.gradient);
        ((WrappedGradientView) G).setGradient(this.o.e());
        h.d(G, "requireViewById<WrappedG…ta.gradient\n            }");
        WrappedGradientView wrappedGradientView = (WrappedGradientView) G;
        View G2 = q4.G(view, C0707R.id.playlistImage);
        ((ImageView) G2).setImageBitmap(this.o.g());
        h.d(G2, "requireViewById<ImageVie…laylistArt)\n            }");
        ImageView imageView = (ImageView) G2;
        View G3 = q4.G(view, C0707R.id.headerText);
        TextView textView = (TextView) G3;
        textView.setText(this.o.f());
        textView.setTextColor(this.o.l());
        h.d(G3, "requireViewById<TextView….textColor)\n            }");
        TextView textView2 = (TextView) G3;
        View G4 = q4.G(view, C0707R.id.bodyText);
        TextView textView3 = (TextView) G4;
        textView3.setText(this.o.d());
        textView3.setTextColor(this.o.l());
        h.d(G4, "requireViewById<TextView….textColor)\n            }");
        TextView textView4 = (TextView) G4;
        View G5 = q4.G(view, C0707R.id.addPlaylistButton);
        h.d(G5, "requireViewById(view, R.id.addPlaylistButton)");
        f fVar = new f(view, wrappedGradientView, imageView, textView2, textView4, (Button) G5);
        this.j = fVar.c().a();
        this.l = fVar;
        AnimatorSet animatorSet = new AnimatorSet();
        f fVar2 = this.l;
        if (fVar2 != null) {
            ObjectAnimator ofInt = ObjectAnimator.ofInt(fVar2.a(), "backgroundColor", this.o.c(), this.o.b());
            ofInt.setEvaluator(new ArgbEvaluator());
            ofInt.setDuration(800L);
            ofInt.setStartDelay(200);
            b09 b09 = b09.d;
            ofInt.setInterpolator(b09.b());
            animatorSet.playTogether(ofInt, wz8.a(fVar2.d(), C0707R.animator.animator_playlist_art_enter), wz8.a(fVar2.c(), C0707R.animator.animator_playlist_gradient_enter), wz8.a(fVar2.f(), C0707R.animator.animator_playlist_text_enter), wz8.a(fVar2.e(), C0707R.animator.animator_playlist_text_enter), wz8.a(fVar2.b(), C0707R.animator.animator_playlist_button_enter));
        }
        animatorSet.addListener(new b(this));
        this.k = animatorSet;
        w(PlaylistState.NOT_ADDED);
        q qVar = this.m;
        s<U> x = this.q.c(kotlin.collections.d.t(this.o.i())).x(a.a);
        U u = (U) Boolean.FALSE;
        z<U> F = x.R(u).F(u);
        h.d(F, "rootlistEndpoint.contain….onErrorReturnItem(false)");
        qVar.a(F.B(io.reactivex.android.schedulers.a.b()).subscribe(new b(this)));
        this.r.b(this.o.k());
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d, defpackage.hx1
    public void pause() {
        if (Build.VERSION.SDK_INT >= 19) {
            Animator animator = this.k;
            if (animator != null) {
                animator.pause();
            }
            Animator animator2 = this.j;
            if (animator2 != null) {
                animator2.pause();
            }
        }
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d, defpackage.hx1
    public void resume() {
        if (Build.VERSION.SDK_INT >= 19) {
            Animator animator = this.k;
            if (animator != null) {
                animator.resume();
            }
            Animator animator2 = this.j;
            if (animator2 != null) {
                animator2.resume();
            }
        }
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d, defpackage.hx1
    public void start() {
        Animator animator = this.k;
        if (animator != null) {
            animator.start();
        }
        Animator animator2 = this.j;
        if (animator2 != null) {
            animator2.start();
        }
        super.start();
    }
}

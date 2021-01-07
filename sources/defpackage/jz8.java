package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradientShape;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradientView;
import com.spotify.music.C0707R;
import com.spotify.music.features.wrapped2020.stories.templates.d;
import defpackage.jx1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

/* renamed from: jz8  reason: default package */
public final class jz8 extends d {
    private mz8 j;
    private final kz8 k;
    private final ez8 l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jz8(Activity activity, kz8 kz8, List<? extends cmf<com.spotify.mobile.android.share.menu.preview.api.d>> list, ez8 ez8) {
        super(activity, new jx1.a(12800, TimeUnit.MILLISECONDS), C0707R.layout.story_template_basic, kz8.g(), kz8.h(), list);
        h.e(activity, "activity");
        h.e(kz8, "viewData");
        h.e(list, "storySharePayloads");
        h.e(ez8, "storiesLogger");
        this.k = kz8;
        this.l = ez8;
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d, defpackage.hx1
    public void dispose() {
        this.j = null;
        super.dispose();
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d
    public Animator h() {
        AnimatorSet animatorSet = new AnimatorSet();
        mz8 mz8 = this.j;
        if (mz8 != null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            Animator h = wz8.h(mz8.e(), -84.0f, -132.0f, 800, 11400);
            b09 b09 = b09.d;
            h.setInterpolator(b09.c());
            animatorSet2.playTogether(wz8.h(mz8.e(), 0.0f, 48.0f, 1300, 0), wz8.f(mz8.e(), 1.0f, 1.0f, 1300, 0), wz8.d(mz8.e(), 1.0f, 800, 0), wz8.h(mz8.e(), 48.0f, -84.0f, 800, 5300), wz8.d(mz8.e(), 0.0f, 500, 11400), h);
            AnimatorSet animatorSet3 = new AnimatorSet();
            Animator h2 = wz8.h(mz8.b(), -84.0f, -134.0f, 800, 11400);
            h2.setInterpolator(b09.c());
            animatorSet3.playTogether(wz8.h(mz8.b(), 0.0f, 48.0f, 0, 0), wz8.f(mz8.b(), 1.0f, 1.0f, 1000, 700), wz8.d(mz8.b(), 1.0f, 600, 700), wz8.h(mz8.b(), 48.0f, -84.0f, 800, 5300), wz8.d(mz8.b(), 0.0f, 500, 11400), h2);
            AnimatorSet animatorSet4 = new AnimatorSet();
            Animator h3 = wz8.h(mz8.c(), -84.0f, -134.0f, 800, 10900);
            h3.setInterpolator(b09.c());
            animatorSet4.playTogether(wz8.h(mz8.c(), 0.0f, 48.0f, 0, 0), wz8.f(mz8.c(), 1.0f, 1.0f, 1000, 700), wz8.d(mz8.c(), 1.0f, 600, 800), wz8.h(mz8.c(), 48.0f, -84.0f, 800, 5300), wz8.d(mz8.c(), 0.0f, 500, 10900), h3);
            Animator h4 = wz8.h(mz8.f(), -84.0f, -134.0f, 800, 11400);
            h4.setInterpolator(b09.c());
            Animator h5 = wz8.h(mz8.d(), -84.0f, -134.0f, 800, 11400);
            h5.setInterpolator(b09.c());
            animatorSet.playTogether(mz8.e().a(), animatorSet2, animatorSet3, animatorSet4, wz8.h(mz8.g(), 0.0f, 48.0f, 0, 0), wz8.d(mz8.g(), 1.0f, 400, 1300), wz8.h(mz8.g(), 48.0f, -2.0f, 800, 5300), wz8.d(mz8.g(), 0.0f, 400, 5100), wz8.h(mz8.f(), 48.0f, -84.0f, 800, 5300), wz8.d(mz8.f(), 1.0f, 800, 6700), wz8.d(mz8.f(), 0.0f, 500, 11400), h4, wz8.h(mz8.d(), 48.0f, -84.0f, 800, 5300), wz8.d(mz8.d(), 1.0f, 400, 6100), wz8.d(mz8.d(), 0.0f, 500, 11400), h5);
        }
        animatorSet.setStartDelay(200);
        return animatorSet;
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d
    public void i(View view) {
        h.e(view, "view");
        View G = q4.G(view, C0707R.id.story_background);
        h.d(G, "requireViewById(view, R.id.story_background)");
        View G2 = q4.G(view, C0707R.id.gradient_background);
        h.d(G2, "requireViewById(view, R.id.gradient_background)");
        WrappedGradientView wrappedGradientView = (WrappedGradientView) G2;
        View G3 = q4.G(view, C0707R.id.cover_art_image);
        h.d(G3, "requireViewById(view, R.id.cover_art_image)");
        ImageView imageView = (ImageView) G3;
        View G4 = q4.G(view, C0707R.id.covert_art_text);
        h.d(G4, "requireViewById(view, R.id.covert_art_text)");
        TextView textView = (TextView) G4;
        View G5 = q4.G(view, C0707R.id.title);
        h.d(G5, "requireViewById(view, R.id.title)");
        TextView textView2 = (TextView) G5;
        View G6 = q4.G(view, C0707R.id.subtitle);
        h.d(G6, "requireViewById(view, R.id.subtitle)");
        View G7 = q4.G(view, C0707R.id.description);
        h.d(G7, "requireViewById(view, R.id.description)");
        mz8 mz8 = new mz8(G, wrappedGradientView, imageView, textView, (TextView) G6, textView2, (TextView) G7);
        mz8.a().setBackgroundColor(this.k.a());
        Bitmap b = this.k.b();
        if (b != null) {
            mz8.b().setImageBitmap(b);
        }
        mz8.c().setText(this.k.c());
        Integer d = this.k.d();
        if (d != null) {
            mz8.c().setTextColor(d.intValue());
        }
        Integer e = this.k.e();
        if (e != null) {
            mz8.b().setBackgroundColor(e.intValue());
        }
        mz8.g().setText(this.k.j().b());
        mz8.f().setText(this.k.i());
        mz8.d().setText(this.k.f().b());
        mz8.e().setShape(WrappedGradientShape.CIRCLE);
        this.j = mz8;
        this.l.b(this.k.h());
    }
}

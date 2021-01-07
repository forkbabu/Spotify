package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradientView;
import com.spotify.music.C0707R;
import com.spotify.music.features.wrapped2020.stories.templates.d;
import com.spotify.music.features.wrapped2020.stories.views.mirror.MirrorQuadrantImageView;
import defpackage.ex1;
import defpackage.jx1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

/* renamed from: sz8  reason: default package */
public final class sz8 extends d {
    private vz8 j;
    private final ex1 k = ex1.a.a;
    private final tz8 l;
    private final ez8 m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sz8(Activity activity, tz8 tz8, List<? extends cmf<com.spotify.mobile.android.share.menu.preview.api.d>> list, ez8 ez8) {
        super(activity, new jx1.a(12900, TimeUnit.MILLISECONDS), C0707R.layout.story_summary_intro, tz8.h(), tz8.k(), list);
        h.e(activity, "activity");
        h.e(tz8, "viewData");
        h.e(list, "storySharePayloads");
        h.e(ez8, "storiesLogger");
        this.l = tz8;
        this.m = ez8;
    }

    public static final float l(sz8 sz8, ValueAnimator valueAnimator, int i, int i2) {
        sz8.getClass();
        if (i2 == 0) {
            return 0.0f;
        }
        float f = ((float) i) / ((float) i2);
        float a = Float.isNaN(f) ? 0.0f : je.a(f, 1.0f, valueAnimator.getAnimatedFraction(), 1.0f);
        if (Float.isNaN(a)) {
            return 0.0f;
        }
        return a;
    }

    private final MirrorQuadrantImageView m(View view, int i, Bitmap bitmap) {
        View G = q4.G(view, i);
        h.d(G, "requireViewById<MirrorQuadrantImageView>(this, id)");
        MirrorQuadrantImageView mirrorQuadrantImageView = (MirrorQuadrantImageView) G;
        mirrorQuadrantImageView.setImage(bitmap);
        mirrorQuadrantImageView.setImageSizeMultiplier(1.1f);
        return mirrorQuadrantImageView;
    }

    private final TextView n(View view, int i, String str, int i2) {
        View G = q4.G(view, i);
        h.d(G, "requireViewById<TextView>(this, id)");
        TextView textView = (TextView) G;
        textView.setText(str);
        textView.setTextColor(i2);
        return textView;
    }

    private final AnimatorSet o(MirrorQuadrantImageView mirrorQuadrantImageView, long j2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mirrorQuadrantImageView, "positionOffset", 0.0f, 1.0f);
        ofFloat.setDuration(5300L);
        h.d(ofFloat, "ObjectAnimator.ofFloat(t…duration = 5300\n        }");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(mirrorQuadrantImageView, "sizeOffset", 0.3f, 1.0f);
        ofFloat2.setDuration(1000L);
        b09 b09 = b09.d;
        ofFloat2.setInterpolator(b09.a());
        h.d(ofFloat2, "ObjectAnimator.ofFloat(t…dCurves.advance\n        }");
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(mirrorQuadrantImageView, "alpha", 0.0f, 1.0f);
        ofFloat3.setDuration(600L);
        ofFloat3.setInterpolator(b09.b());
        h.d(ofFloat3, "ObjectAnimator.ofFloat(t…dCurves.generic\n        }");
        AnimatorSet k2 = wz8.k(ofFloat, ofFloat2, ofFloat3);
        k2.setStartDelay(j2);
        return k2;
    }

    private final AnimatorSet p(View view) {
        Resources resources = view.getResources();
        h.d(resources, "this.resources");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", wz8.c(30.0f, resources), 0.0f);
        ofFloat.setDuration(1200L);
        b09 b09 = b09.d;
        ofFloat.setInterpolator(b09.a());
        h.d(ofFloat, "ObjectAnimator.ofFloat(t…dCurves.advance\n        }");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat2.setDuration(700L);
        ofFloat2.setInterpolator(b09.b());
        h.d(ofFloat2, "ObjectAnimator.ofFloat(t…dCurves.generic\n        }");
        Resources resources2 = view.getResources();
        h.d(resources2, "this.resources");
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "translationY", 0.0f, wz8.c(-30.0f, resources2));
        ofFloat3.setDuration(500L);
        ofFloat3.setInterpolator(b09.a());
        ofFloat3.setStartDelay(3200);
        h.d(ofFloat3, "ObjectAnimator.ofFloat(t…artDelay = 3200\n        }");
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat4.setDuration(300L);
        ofFloat4.setInterpolator(b09.b());
        ofFloat4.setStartDelay(3200);
        h.d(ofFloat4, "ObjectAnimator.ofFloat(t…artDelay = 3200\n        }");
        AnimatorSet k2 = wz8.k(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        k2.setStartDelay(5300);
        return k2;
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d, defpackage.hx1
    public ex1 d() {
        return this.k;
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d, defpackage.hx1
    public void dispose() {
        this.j = null;
        super.dispose();
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d
    public Animator h() {
        vz8 vz8 = this.j;
        if (vz8 == null) {
            return null;
        }
        WrappedGradientView e = vz8.e();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(e, "circleMaskProgression", 0.2f, 1.0f);
        ofFloat.setDuration(1300L);
        b09 b09 = b09.d;
        ofFloat.setInterpolator(b09.a());
        h.d(ofFloat, "ObjectAnimator.ofFloat(t…dCurves.advance\n        }");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(e, "alpha", 0.0f, 1.0f);
        ofFloat2.setDuration(600L);
        ofFloat2.setInterpolator(b09.b());
        h.d(ofFloat2, "ObjectAnimator.ofFloat(t…dCurves.generic\n        }");
        AnimatorSet k2 = wz8.k(e.a(), ofFloat, ofFloat2);
        k2.setStartDelay(4000);
        View g = vz8.g();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(g, "scaleX", 0.85f, 1.0f);
        ofFloat3.setDuration(1000L);
        ofFloat3.setInterpolator(b09.a());
        h.d(ofFloat3, "ObjectAnimator.ofFloat(t…dCurves.advance\n        }");
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(g, "scaleY", 0.85f, 1.0f);
        ofFloat4.setDuration(1000L);
        ofFloat4.setInterpolator(b09.a());
        h.d(ofFloat4, "ObjectAnimator.ofFloat(t…dCurves.advance\n        }");
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(g, "alpha", 0.0f, 1.0f);
        ofFloat5.setDuration(600L);
        ofFloat5.setInterpolator(b09.b());
        h.d(ofFloat5, "ObjectAnimator.ofFloat(t…dCurves.generic\n        }");
        AnimatorSet k3 = wz8.k(ofFloat3, ofFloat4, ofFloat5);
        k3.setStartDelay(4800);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(vz8.g(), "backgroundColor", this.l.e(), this.l.f());
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.setDuration(400L);
        ofInt.setStartDelay(9000);
        ofInt.setInterpolator(b09.b());
        h.d(ofInt, "rectangle.createRectangleBackgroundAnimator()");
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat6.setStartDelay(9000);
        ofFloat6.setDuration(400L);
        ofFloat6.addUpdateListener(new rz8(this));
        h.d(ofFloat6, "outroRectangle()");
        TextView h = vz8.h();
        Resources resources = h.getResources();
        h.d(resources, "this.resources");
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(h, "translationY", wz8.c(30.0f, resources), 0.0f);
        ofFloat7.setDuration(1000L);
        ofFloat7.setInterpolator(b09.a());
        h.d(ofFloat7, "ObjectAnimator.ofFloat(t…dCurves.advance\n        }");
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(h, "alpha", 0.0f, 1.0f);
        ofFloat8.setDuration(600L);
        ofFloat8.setInterpolator(b09.b());
        h.d(ofFloat8, "ObjectAnimator.ofFloat(t…dCurves.generic\n        }");
        Resources resources2 = h.getResources();
        h.d(resources2, "this.resources");
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(h, "translationY", 0.0f, wz8.c(-30.0f, resources2));
        ofFloat9.setDuration(1000L);
        ofFloat9.setInterpolator(b09.b());
        ofFloat9.setStartDelay(3000);
        h.d(ofFloat9, "ObjectAnimator.ofFloat(t…artDelay = 3000\n        }");
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(h, "alpha", 1.0f, 0.0f);
        ofFloat10.setDuration(600L);
        ofFloat10.setInterpolator(b09.b());
        ofFloat10.setStartDelay(3000);
        h.d(ofFloat10, "ObjectAnimator.ofFloat(t…artDelay = 3000\n        }");
        AnimatorSet k4 = wz8.k(ofFloat7, ofFloat8, ofFloat9, ofFloat10);
        k4.setStartDelay(8900);
        return wz8.k(o(vz8.a(), 0), o(vz8.b(), 1000), o(vz8.c(), 2000), o(vz8.d(), 3000), k2, k3, ofInt, ofFloat6, p(vz8.j()), p(vz8.i()), k4);
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d
    public void i(View view) {
        h.e(view, "view");
        view.setBackgroundColor(this.l.g());
        MirrorQuadrantImageView m2 = m(view, C0707R.id.artistImage1, this.l.a());
        MirrorQuadrantImageView m3 = m(view, C0707R.id.artistImage2, this.l.b());
        MirrorQuadrantImageView m4 = m(view, C0707R.id.artistImage3, this.l.c());
        MirrorQuadrantImageView m5 = m(view, C0707R.id.artistImage4, this.l.d());
        View G = q4.G(view, C0707R.id.gradient);
        h.d(G, "requireViewById(view, R.id.gradient)");
        View G2 = q4.G(view, C0707R.id.rectangle);
        G2.setBackgroundColor(this.l.e());
        h.d(G2, "requireViewById<View>(vi…ackground1)\n            }");
        this.j = new vz8(view, m2, m3, m4, m5, (WrappedGradientView) G, G2, n(view, C0707R.id.textTitle, this.l.n(), this.l.o()), n(view, C0707R.id.textTagline, this.l.l(), this.l.m()), n(view, C0707R.id.textPrompt, this.l.i(), this.l.j()));
        this.m.b(this.l.k());
    }
}

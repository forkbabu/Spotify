package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradientView;
import com.spotify.music.C0707R;
import com.spotify.music.features.wrapped2020.stories.templates.d;
import com.spotify.music.features.wrapped2020.stories.views.mirror.MirrorQuadrantImageView;
import defpackage.jx1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

/* renamed from: nz8  reason: default package */
public final class nz8 extends d {
    private qz8 j;
    private final oz8 k;
    private final ez8 l;

    /* renamed from: nz8$a */
    static final class a implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ qz8 a;
        final /* synthetic */ nz8 b;

        a(qz8 qz8, nz8 nz8) {
            this.a = qz8;
            this.b = nz8;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View g = this.a.g();
            nz8 nz8 = this.b;
            h.d(valueAnimator, "it");
            g.setScaleX(nz8.k(nz8, valueAnimator, this.a.f().getWidth(), this.a.g().getWidth()));
            this.a.g().setScaleY(nz8.k(this.b, valueAnimator, (int) (((float) this.a.f().getHeight()) * 1.025f), this.a.g().getHeight()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nz8(Activity activity, oz8 oz8, List<? extends cmf<com.spotify.mobile.android.share.menu.preview.api.d>> list, ez8 ez8) {
        super(activity, new jx1.a(17100, TimeUnit.MILLISECONDS), C0707R.layout.story_template_intro, oz8.e(), oz8.f(), list);
        h.e(activity, "activity");
        h.e(oz8, "viewData");
        h.e(list, "storySharePayloads");
        h.e(ez8, "storiesLogger");
        this.k = oz8;
        this.l = ez8;
    }

    public static final float k(nz8 nz8, ValueAnimator valueAnimator, int i, int i2) {
        nz8.getClass();
        if (i2 == 0) {
            return 0.0f;
        }
        float f = ((float) i) / ((float) i2);
        float a2 = Float.isNaN(f) ? 0.0f : je.a(f, 1.0f, valueAnimator.getAnimatedFraction(), 1.0f);
        if (Float.isNaN(a2)) {
            return 0.0f;
        }
        return a2;
    }

    private final MirrorQuadrantImageView l(View view, int i, Bitmap bitmap) {
        View G = q4.G(view, i);
        h.d(G, "requireViewById<MirrorQuadrantImageView>(this, id)");
        MirrorQuadrantImageView mirrorQuadrantImageView = (MirrorQuadrantImageView) G;
        mirrorQuadrantImageView.setImage(bitmap);
        mirrorQuadrantImageView.setImageSizeMultiplier(1.1f);
        return mirrorQuadrantImageView;
    }

    private final TextView m(View view, int i, String str, int i2) {
        View G = q4.G(view, i);
        h.d(G, "requireViewById<TextView>(this, id)");
        TextView textView = (TextView) G;
        textView.setText(str);
        textView.setTextColor(i2);
        return textView;
    }

    private final AnimatorSet n(MirrorQuadrantImageView mirrorQuadrantImageView, long j2) {
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

    private final AnimatorSet o(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(500L);
        b09 b09 = b09.d;
        ofFloat.setInterpolator(b09.a());
        h.d(ofFloat, "ObjectAnimator.ofFloat(t…dCurves.advance\n        }");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat2.setDuration(700L);
        ofFloat2.setInterpolator(b09.b());
        ofFloat2.setStartDelay(1000);
        h.d(ofFloat2, "ObjectAnimator.ofFloat(t…artDelay = 1000\n        }");
        AnimatorSet j2 = wz8.j(ofFloat, ofFloat2);
        j2.setStartDelay(7300);
        return j2;
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d, defpackage.hx1
    public void dispose() {
        this.j = null;
        super.dispose();
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d
    public Animator h() {
        qz8 qz8 = this.j;
        if (qz8 == null) {
            return new AnimatorSet();
        }
        WrappedGradientView e = qz8.e();
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
        k2.setStartDelay(5000);
        View g = qz8.g();
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
        k3.setStartDelay(5800);
        TextView l2 = qz8.l();
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(l2, "alpha", 0.0f, 1.0f);
        ofFloat6.setDuration(1000L);
        ofFloat6.setInterpolator(b09.a());
        h.d(ofFloat6, "ObjectAnimator.ofFloat(t…dCurves.advance\n        }");
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(l2, "alpha", 1.0f, 0.0f);
        ofFloat7.setDuration(700L);
        ofFloat7.setInterpolator(b09.b());
        ofFloat7.setStartDelay(1500);
        h.d(ofFloat7, "ObjectAnimator.ofFloat(t…artDelay = 1500\n        }");
        AnimatorSet j2 = wz8.j(ofFloat6, ofFloat7);
        j2.setStartDelay(6300);
        TextView i = qz8.i();
        Resources resources = i.getResources();
        h.d(resources, "this.resources");
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(i, "translationY", wz8.c(30.0f, resources), 0.0f);
        ofFloat8.setDuration(500L);
        ofFloat8.setInterpolator(b09.a());
        h.d(ofFloat8, "ObjectAnimator.ofFloat(t…dCurves.advance\n        }");
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(i, "alpha", 0.0f, 1.0f);
        ofFloat9.setDuration(300L);
        ofFloat9.setInterpolator(b09.b());
        h.d(ofFloat9, "ObjectAnimator.ofFloat(t…dCurves.generic\n        }");
        Resources resources2 = i.getResources();
        h.d(resources2, "this.resources");
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(i, "translationY", 0.0f, wz8.c(-30.0f, resources2));
        ofFloat10.setDuration(800L);
        ofFloat10.setInterpolator(b09.a());
        ofFloat10.setStartDelay(3500);
        h.d(ofFloat10, "ObjectAnimator.ofFloat(t…artDelay = 3500\n        }");
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(i, "alpha", 1.0f, 0.0f);
        ofFloat11.setDuration(400L);
        ofFloat11.setInterpolator(b09.b());
        ofFloat11.setStartDelay(3500);
        h.d(ofFloat11, "ObjectAnimator.ofFloat(t…artDelay = 3500\n        }");
        AnimatorSet k4 = wz8.k(ofFloat8, ofFloat9, ofFloat10, ofFloat11);
        k4.setStartDelay(9500);
        TextView j3 = qz8.j();
        Resources resources3 = j3.getResources();
        h.d(resources3, "this.resources");
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(j3, "translationY", wz8.c(30.0f, resources3), 0.0f);
        ofFloat12.setDuration(800L);
        ofFloat12.setInterpolator(b09.a());
        h.d(ofFloat12, "ObjectAnimator.ofFloat(t…dCurves.advance\n        }");
        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(j3, "alpha", 0.0f, 1.0f);
        ofFloat13.setDuration(400L);
        ofFloat13.setInterpolator(b09.b());
        ofFloat13.setStartDelay(400);
        h.d(ofFloat13, "ObjectAnimator.ofFloat(t…tartDelay = 400\n        }");
        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(j3, "alpha", 1.0f, 0.0f);
        ofFloat14.setDuration(400L);
        ofFloat14.setInterpolator(b09.b());
        ofFloat14.setStartDelay(3800);
        h.d(ofFloat14, "ObjectAnimator.ofFloat(t…artDelay = 3800\n        }");
        AnimatorSet k5 = wz8.k(ofFloat12, ofFloat13, ofFloat14);
        k5.setStartDelay(13000);
        ValueAnimator ofFloat15 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat15.setStartDelay(16800);
        ofFloat15.setDuration(400L);
        ofFloat15.addUpdateListener(new a(qz8, this));
        h.d(ofFloat15, "ValueAnimator.ofFloat(0f…      }\n                }");
        return wz8.k(n(qz8.a(), 1000), n(qz8.b(), 2000), n(qz8.c(), 3000), n(qz8.d(), 4000), k2, k3, j2, o(qz8.h()), o(qz8.k()), k4, k5, ofFloat15);
    }

    @Override // com.spotify.music.features.wrapped2020.stories.templates.d
    public void i(View view) {
        h.e(view, "view");
        View G = q4.G(view, C0707R.id.outerGradient);
        ((WrappedGradientView) G).setGradient(this.k.h());
        h.d(G, "requireViewById<WrappedG…undGradient\n            }");
        WrappedGradientView wrappedGradientView = (WrappedGradientView) G;
        MirrorQuadrantImageView l2 = l(view, C0707R.id.artistImage1, this.k.a());
        MirrorQuadrantImageView l3 = l(view, C0707R.id.artistImage2, this.k.b());
        MirrorQuadrantImageView l4 = l(view, C0707R.id.artistImage3, this.k.c());
        MirrorQuadrantImageView l5 = l(view, C0707R.id.artistImage4, this.k.d());
        View G2 = q4.G(view, C0707R.id.innerGradient);
        ((WrappedGradientView) G2).setGradient(this.k.h());
        h.d(G2, "requireViewById<WrappedG…undGradient\n            }");
        WrappedGradientView wrappedGradientView2 = (WrappedGradientView) G2;
        View G3 = q4.G(view, C0707R.id.rectangle);
        G3.setBackgroundColor(this.k.g());
        h.d(G3, "requireViewById<View>(vi…roundColor)\n            }");
        View G4 = q4.G(view, C0707R.id.spotifyLogo);
        ((ImageView) G4).setColorFilter(this.k.i());
        h.d(G4, "requireViewById<ImageVie….textColor)\n            }");
        this.j = new qz8(view, wrappedGradientView, l2, l3, l4, l5, wrappedGradientView2, G3, (ImageView) G4, m(view, C0707R.id.textTagline, this.k.l(), this.k.i()), m(view, C0707R.id.textTitle, this.k.m(), this.k.i()), m(view, C0707R.id.textLine1, this.k.j(), this.k.i()), m(view, C0707R.id.textLine2, this.k.k(), this.k.i()));
        this.l.b(this.k.f());
    }
}

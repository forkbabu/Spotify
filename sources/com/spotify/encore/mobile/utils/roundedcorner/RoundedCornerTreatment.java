package com.spotify.encore.mobile.utils.roundedcorner;

import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class RoundedCornerTreatment {
    public static final Companion Companion = new Companion(null);
    private final float cornerRadius;
    private final View view;

    public static final class Companion {
        private Companion() {
        }

        public final RoundedCornerTreatment create(View view, float f) {
            RoundedCornerTreatment roundedCornerTreatment;
            h.e(view, "view");
            int i = Build.VERSION.SDK_INT;
            if (i >= 21 && f == 0.0f) {
                RoundedCornerTreatmentByOutline.Companion.reset(view);
                return RoundedCornerTreatmentKt.access$noCornerTreatment(view, f);
            } else if (f == 0.0f) {
                return RoundedCornerTreatmentKt.access$noCornerTreatment(view, f);
            } else {
                if (!(view.getContext() instanceof ContextWrapper) || i < 21) {
                    roundedCornerTreatment = new RoundedCornerTreatmentByClippingPath(view, f);
                } else {
                    roundedCornerTreatment = new RoundedCornerTreatmentByOutline(view, f);
                }
                return roundedCornerTreatment;
            }
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public RoundedCornerTreatment(View view2, float f) {
        h.e(view2, "view");
        this.view = view2;
        this.cornerRadius = f;
    }

    public static final RoundedCornerTreatment create(View view2, float f) {
        return Companion.create(view2, f);
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final View getView() {
        return this.view;
    }

    public abstract void onPostDraw(Canvas canvas);

    public abstract void onPreDraw(Canvas canvas);

    public abstract void onSizeChanged(int i, int i2);
}

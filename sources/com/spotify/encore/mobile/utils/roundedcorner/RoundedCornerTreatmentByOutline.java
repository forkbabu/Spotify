package com.spotify.encore.mobile.utils.roundedcorner;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class RoundedCornerTreatmentByOutline extends RoundedCornerTreatment {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public final void reset(View view) {
            h.e(view, "view");
            view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            view.setClipToOutline(false);
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundedCornerTreatmentByOutline(View view, final float f) {
        super(view, f);
        h.e(view, "view");
        getView().setClipToOutline(true);
        getView().setOutlineProvider(new ViewOutlineProvider() {
            /* class com.spotify.encore.mobile.utils.roundedcorner.RoundedCornerTreatmentByOutline.AnonymousClass1 */

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                h.e(view, "view");
                h.e(outline, "outline");
                if (RoundedCornerTreatmentKt.shouldClipCircle(view.getWidth(), view.getHeight(), f)) {
                    outline.setOval(0, 0, view.getWidth(), view.getHeight());
                } else {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), f);
                }
                outline.setAlpha(0.0f);
            }
        });
    }

    @Override // com.spotify.encore.mobile.utils.roundedcorner.RoundedCornerTreatment
    public void onPostDraw(Canvas canvas) {
        h.e(canvas, "canvas");
    }

    @Override // com.spotify.encore.mobile.utils.roundedcorner.RoundedCornerTreatment
    public void onPreDraw(Canvas canvas) {
        h.e(canvas, "canvas");
    }

    @Override // com.spotify.encore.mobile.utils.roundedcorner.RoundedCornerTreatment
    public void onSizeChanged(int i, int i2) {
    }
}

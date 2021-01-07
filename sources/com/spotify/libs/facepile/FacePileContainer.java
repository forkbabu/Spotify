package com.spotify.libs.facepile;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class FacePileContainer extends LinearLayout {
    private Path a;
    private float b;

    public FacePileContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a(float f, float f2, float f3) {
        this.b = (2.0f * f) + f3;
        if (f2 <= 0.0f) {
            this.a = null;
            return;
        }
        Path path = new Path();
        this.a = path;
        path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        this.a.addCircle(f, f, f2 + f, Path.Direction.CW);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        float f;
        int indexOfChild = indexOfChild(view);
        if (this.a == null || indexOfChild <= 0) {
            return super.drawChild(canvas, view, j);
        }
        int save = canvas.save();
        try {
            if (nud.m(getContext())) {
                f = ((float) view.getLeft()) + this.b;
            } else {
                f = ((float) view.getLeft()) - this.b;
            }
            canvas.translate(f, 0.0f);
            canvas.clipPath(this.a);
            canvas.translate(-f, 0.0f);
            return super.drawChild(canvas, view, j);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public FacePileContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

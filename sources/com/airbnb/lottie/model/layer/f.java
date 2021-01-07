package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.model.content.j;
import com.airbnb.lottie.model.d;
import java.util.Collections;
import java.util.List;

public class f extends b {
    private final ta x;

    f(com.airbnb.lottie.f fVar, Layer layer) {
        super(fVar, layer);
        ta taVar = new ta(fVar, this, new j("__container", layer.l(), false));
        this.x = taVar;
        taVar.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.model.layer.b, defpackage.ua
    public void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        this.x.e(rectF, this.m, z);
    }

    /* access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.model.layer.b
    public void l(Canvas canvas, Matrix matrix, int i) {
        this.x.g(canvas, matrix, i);
    }

    /* access modifiers changed from: protected */
    @Override // com.airbnb.lottie.model.layer.b
    public void q(d dVar, int i, List<d> list, d dVar2) {
        this.x.d(dVar, i, list, dVar2);
    }
}

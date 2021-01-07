package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

class m implements TypeEvaluator<Rect> {
    private Rect a;

    m() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f, Rect rect, Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        int i = rect3.left;
        int i2 = i + ((int) (((float) (rect4.left - i)) * f));
        int i3 = rect3.top;
        int i4 = i3 + ((int) (((float) (rect4.top - i3)) * f));
        int i5 = rect3.right;
        int i6 = i5 + ((int) (((float) (rect4.right - i5)) * f));
        int i7 = rect3.bottom;
        int i8 = i7 + ((int) (((float) (rect4.bottom - i7)) * f));
        Rect rect5 = this.a;
        if (rect5 == null) {
            return new Rect(i2, i4, i6, i8);
        }
        rect5.set(i2, i4, i6, i8);
        return this.a;
    }

    m(Rect rect) {
        this.a = rect;
    }
}

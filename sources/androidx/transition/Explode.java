package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.spotify.music.C0707R;

public class Explode extends Visibility {
    private static final TimeInterpolator R = new DecelerateInterpolator();
    private static final TimeInterpolator S = new AccelerateInterpolator();
    private int[] Q;

    public Explode() {
        this.Q = new int[2];
        this.I = new c();
    }

    private void c0(x xVar) {
        View view = xVar.b;
        view.getLocationOnScreen(this.Q);
        int[] iArr = this.Q;
        int i = iArr[0];
        int i2 = iArr[1];
        xVar.a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    private void l0(View view, Rect rect, int[] iArr) {
        int i;
        int i2;
        view.getLocationOnScreen(this.Q);
        int[] iArr2 = this.Q;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        Rect z = z();
        if (z == null) {
            i2 = Math.round(view.getTranslationX()) + (view.getWidth() / 2) + i3;
            i = Math.round(view.getTranslationY()) + (view.getHeight() / 2) + i4;
        } else {
            i2 = z.centerX();
            i = z.centerY();
        }
        float centerX = (float) (rect.centerX() - i2);
        float centerY = (float) (rect.centerY() - i);
        if (centerX == 0.0f && centerY == 0.0f) {
            centerX = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float sqrt = (float) Math.sqrt((double) ((centerY * centerY) + (centerX * centerX)));
        int i5 = i2 - i3;
        int i6 = i - i4;
        float max = (float) Math.max(i5, view.getWidth() - i5);
        float max2 = (float) Math.max(i6, view.getHeight() - i6);
        float sqrt2 = (float) Math.sqrt((double) ((max2 * max2) + (max * max)));
        iArr[0] = Math.round((centerX / sqrt) * sqrt2);
        iArr[1] = Math.round(sqrt2 * (centerY / sqrt));
    }

    @Override // androidx.transition.Visibility
    public Animator g0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        Rect rect = (Rect) xVar2.a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        l0(viewGroup, rect, this.Q);
        int[] iArr = this.Q;
        return a.c(view, xVar2, rect.left, rect.top, translationX + ((float) iArr[0]), translationY + ((float) iArr[1]), translationX, translationY, R, this);
    }

    @Override // androidx.transition.Visibility
    public Animator i0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        float f;
        float f2;
        Rect rect = (Rect) xVar.a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) xVar.b.getTag(C0707R.id.transition_position);
        if (iArr != null) {
            f2 = ((float) (iArr[0] - rect.left)) + translationX;
            f = ((float) (iArr[1] - rect.top)) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f2 = translationX;
            f = translationY;
        }
        l0(viewGroup, rect, this.Q);
        int[] iArr2 = this.Q;
        return a.c(view, xVar, i, i2, translationX, translationY, f2 + ((float) iArr2[0]), f + ((float) iArr2[1]), S, this);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void j(x xVar) {
        super.j(xVar);
        c0(xVar);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void n(x xVar) {
        super.n(xVar);
        c0(xVar);
    }

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Q = new int[2];
        this.I = new c();
    }
}

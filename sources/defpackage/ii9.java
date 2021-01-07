package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: ii9  reason: default package */
class ii9 implements View.OnTouchListener {
    final /* synthetic */ hi9 a;

    ii9(hi9 hi9) {
        this.a = hi9;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !hi9.j(this.a).isFocused()) {
            return false;
        }
        Rect rect = new Rect();
        hi9.j(this.a).getGlobalVisibleRect(rect);
        if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return false;
        }
        hi9.k(this.a);
        return false;
    }
}

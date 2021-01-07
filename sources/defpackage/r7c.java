package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: r7c  reason: default package */
public class r7c implements RecyclerView.p {
    private final GestureDetector a;
    private final View.OnClickListener b;

    public r7c(GestureDetector gestureDetector, View.OnClickListener onClickListener) {
        this.a = gestureDetector;
        this.b = onClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (!this.a.onTouchEvent(motionEvent)) {
            return false;
        }
        this.b.onClick(recyclerView);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f(boolean z) {
    }
}

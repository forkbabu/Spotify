package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Optional;

/* renamed from: fh8  reason: default package */
public class fh8 {
    private final View a;
    private final GradientDrawable b;
    private boolean c = true;
    private int d = -1;
    private int e;
    private float f;
    private int g = -1;

    public fh8(View view, int i) {
        this.a = view;
        GradientDrawable gradientDrawable = (GradientDrawable) nud.e(view.getContext(), i);
        this.b = gradientDrawable;
        view.setBackground(gradientDrawable);
    }

    public float a() {
        return nud.c(0.0f, 1.0f, ((float) Math.abs(((int) this.a.getY()) - this.d)) / ((float) this.a.getHeight()));
    }

    public boolean b(Drawable drawable) {
        return drawable == this.b;
    }

    public boolean c() {
        return this.a.getBottom() > this.d;
    }

    public void d(int i) {
        this.c = true;
        this.d = -1;
        this.e = i;
    }

    public void e(gh8 gh8) {
        this.c = false;
        this.d = -1;
        this.f = gh8.b();
        this.g = gh8.a();
    }

    public gh8 f() {
        return new eh8(this.g, Math.abs(this.a.getY() - ((float) this.d)));
    }

    public void g(RecyclerView recyclerView, View view, int i) {
        if (recyclerView.getChildCount() != 0) {
            int i2 = 0;
            if (this.d == -1) {
                int round = Math.round(view.getY());
                this.d = round;
                this.a.setY(((float) round) - this.f);
                this.a.setLayoutParams(new RelativeLayout.LayoutParams(-1, this.g));
                if (this.f != 0.0f) {
                    this.f = 0.0f;
                }
            }
            if (this.c) {
                this.c = false;
                int i3 = this.d;
                Optional fromNullable = Optional.fromNullable(recyclerView.getChildAt(Math.min(this.e, recyclerView.getLayoutManager() instanceof LinearLayoutManager ? ((LinearLayoutManager) recyclerView.getLayoutManager()).b2() : 0)));
                if (fromNullable.isPresent()) {
                    int[] iArr = new int[2];
                    ((View) fromNullable.get()).getLocationOnScreen(iArr);
                    i2 = ((View) fromNullable.get()).getMeasuredHeight() + (iArr[1] - i3);
                }
                this.g = i2;
                this.a.setLayoutParams(new RelativeLayout.LayoutParams(-1, i2));
            }
            View view2 = this.a;
            view2.setY(view2.getY() - ((float) i));
        }
    }

    public void h(int i, int i2) {
        this.b.setColors(new int[]{i, i2});
    }
}

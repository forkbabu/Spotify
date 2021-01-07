package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import androidx.mediarouter.app.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
public final class OverlayListView extends ListView {
    private final List<a> a = new ArrayList();

    public static class a {
        private BitmapDrawable a;
        private float b = 1.0f;
        private Rect c;
        private Interpolator d;
        private long e;
        private Rect f;
        private int g;
        private float h = 1.0f;
        private float i = 1.0f;
        private long j;
        private boolean k;
        private boolean l;
        private AbstractC0037a m;

        /* renamed from: androidx.mediarouter.app.OverlayListView$a$a  reason: collision with other inner class name */
        public interface AbstractC0037a {
        }

        public a(BitmapDrawable bitmapDrawable, Rect rect) {
            this.a = bitmapDrawable;
            this.f = rect;
            Rect rect2 = new Rect(rect);
            this.c = rect2;
            BitmapDrawable bitmapDrawable2 = this.a;
            if (bitmapDrawable2 != null && rect2 != null) {
                bitmapDrawable2.setAlpha((int) (this.b * 255.0f));
                this.a.setBounds(this.c);
            }
        }

        public BitmapDrawable a() {
            return this.a;
        }

        public boolean b() {
            return this.k;
        }

        public a c(float f2, float f3) {
            this.h = f2;
            this.i = f3;
            return this;
        }

        public a d(AbstractC0037a aVar) {
            this.m = aVar;
            return this;
        }

        public a e(long j2) {
            this.e = j2;
            return this;
        }

        public a f(Interpolator interpolator) {
            this.d = interpolator;
            return this;
        }

        public a g(int i2) {
            this.g = i2;
            return this;
        }

        public void h(long j2) {
            this.j = j2;
            this.k = true;
        }

        public void i() {
            this.k = true;
            this.l = true;
            AbstractC0037a aVar = this.m;
            if (aVar != null) {
                b.a aVar2 = (b.a) aVar;
                b.this.Q.remove(aVar2.a);
                b.this.M.notifyDataSetChanged();
            }
        }

        public boolean j(long j2) {
            float f2;
            if (this.l) {
                return false;
            }
            float f3 = 0.0f;
            float max = Math.max(0.0f, Math.min(1.0f, ((float) (j2 - this.j)) / ((float) this.e)));
            if (this.k) {
                f3 = max;
            }
            Interpolator interpolator = this.d;
            if (interpolator == null) {
                f2 = f3;
            } else {
                f2 = interpolator.getInterpolation(f3);
            }
            int i2 = (int) (((float) this.g) * f2);
            Rect rect = this.c;
            Rect rect2 = this.f;
            rect.top = rect2.top + i2;
            rect.bottom = rect2.bottom + i2;
            float f4 = this.h;
            float a2 = je.a(this.i, f4, f2, f4);
            this.b = a2;
            BitmapDrawable bitmapDrawable = this.a;
            if (bitmapDrawable != null) {
                bitmapDrawable.setAlpha((int) (a2 * 255.0f));
                this.a.setBounds(this.c);
            }
            if (this.k && f3 >= 1.0f) {
                this.l = true;
                AbstractC0037a aVar = this.m;
                if (aVar != null) {
                    b.a aVar2 = (b.a) aVar;
                    b.this.Q.remove(aVar2.a);
                    b.this.M.notifyDataSetChanged();
                }
            }
            return !this.l;
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a(a aVar) {
        this.a.add(aVar);
    }

    public void b() {
        for (a aVar : this.a) {
            if (!aVar.b()) {
                aVar.h(getDrawingTime());
            }
        }
    }

    public void c() {
        for (a aVar : this.a) {
            aVar.i();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a.size() > 0) {
            Iterator<a> it = this.a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                BitmapDrawable a2 = next.a();
                if (a2 != null) {
                    a2.draw(canvas);
                }
                if (!next.j(getDrawingTime())) {
                    it.remove();
                }
            }
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.e;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;

public class MockView extends View {
    private Paint a = new Paint();
    private Paint b = new Paint();
    private Paint c = new Paint();
    private boolean f = true;
    private boolean n = true;
    protected String o = null;
    private Rect p = new Rect();
    private int q = Color.argb((int) BitmapRenderer.ALPHA_VISIBLE, 0, 0, 0);
    private int r = Color.argb((int) BitmapRenderer.ALPHA_VISIBLE, 200, 200, 200);
    private int s = Color.argb((int) BitmapRenderer.ALPHA_VISIBLE, 50, 50, 50);
    private int t = 4;

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.o = obtainStyledAttributes.getString(index);
                } else if (index == 4) {
                    this.f = obtainStyledAttributes.getBoolean(index, this.f);
                } else if (index == 0) {
                    this.q = obtainStyledAttributes.getColor(index, this.q);
                } else if (index == 2) {
                    this.s = obtainStyledAttributes.getColor(index, this.s);
                } else if (index == 3) {
                    this.r = obtainStyledAttributes.getColor(index, this.r);
                } else if (index == 5) {
                    this.n = obtainStyledAttributes.getBoolean(index, this.n);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.o == null) {
            try {
                this.o = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.a.setColor(this.q);
        this.a.setAntiAlias(true);
        this.b.setColor(this.r);
        this.b.setAntiAlias(true);
        this.c.setColor(this.s);
        this.t = Math.round((getResources().getDisplayMetrics().xdpi / 160.0f) * ((float) this.t));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f) {
            width--;
            height--;
            float f2 = (float) width;
            float f3 = (float) height;
            canvas.drawLine(0.0f, 0.0f, f2, f3, this.a);
            canvas.drawLine(0.0f, f3, f2, 0.0f, this.a);
            canvas.drawLine(0.0f, 0.0f, f2, 0.0f, this.a);
            canvas.drawLine(f2, 0.0f, f2, f3, this.a);
            canvas.drawLine(f2, f3, 0.0f, f3, this.a);
            canvas.drawLine(0.0f, f3, 0.0f, 0.0f, this.a);
        }
        String str = this.o;
        if (str != null && this.n) {
            this.b.getTextBounds(str, 0, str.length(), this.p);
            float width2 = ((float) (width - this.p.width())) / 2.0f;
            float height2 = (((float) (height - this.p.height())) / 2.0f) + ((float) this.p.height());
            this.p.offset((int) width2, (int) height2);
            Rect rect = this.p;
            int i = rect.left;
            int i2 = this.t;
            rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
            canvas.drawRect(this.p, this.c);
            canvas.drawText(this.o, width2, height2, this.b);
        }
    }

    public MockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }
}

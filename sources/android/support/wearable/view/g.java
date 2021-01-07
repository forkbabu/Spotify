package android.support.wearable.view;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.animation.LinearInterpolator;
import com.spotify.encore.mobile.snackbar.SnackbarUtilsKt;

class g extends Drawable {
    private static final Property<g, Integer> f = new a(Integer.class, "level");
    private static final TimeInterpolator g = f.a;
    private final RectF a = new RectF();
    private final Paint b;
    private final ObjectAnimator c;
    private float d;
    private int e;

    class a extends Property<g, Integer> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public Integer get(g gVar) {
            return Integer.valueOf(gVar.getLevel());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(g gVar, Integer num) {
            g gVar2 = gVar;
            gVar2.setLevel(num.intValue());
            gVar2.invalidateSelf();
        }
    }

    public g() {
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, f, 0, 10000);
        this.c = ofInt;
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        ofInt.setDuration(6000L);
        ofInt.setInterpolator(new LinearInterpolator());
    }

    public void a(int i) {
        this.e = i;
    }

    public void b(float f2) {
        this.d = f2;
    }

    public void c() {
        if (!this.c.isStarted()) {
            this.c.start();
        }
    }

    public void d() {
        this.c.cancel();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f2;
        canvas.save();
        this.a.set(getBounds());
        RectF rectF = this.a;
        float f3 = this.d / 2.0f;
        rectF.inset(f3, f3);
        this.b.setStrokeWidth(this.d);
        this.b.setColor(this.e);
        int level = getLevel();
        float f4 = ((float) (level - ((level / SnackbarUtilsKt.SNACKBAR_ACTION_DURATION) * SnackbarUtilsKt.SNACKBAR_ACTION_DURATION))) / 2000.0f;
        boolean z = f4 < 0.5f;
        float f5 = 54.0f * f4;
        if (z) {
            f2 = g.getInterpolation((f4 - 0.0f) / 0.5f);
        } else {
            f2 = 1.0f - g.getInterpolation((f4 - 0.5f) / 0.5f);
        }
        float max = Math.max(1.0f, f2 * 306.0f);
        canvas.rotate(((((((float) level) * 1.0E-4f) * 2.0f) * 360.0f) - 0.049804688f) + f5, this.a.centerX(), this.a.centerY());
        canvas.drawArc(this.a, z ? 0.0f : 306.0f - max, max, false, this.b);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}

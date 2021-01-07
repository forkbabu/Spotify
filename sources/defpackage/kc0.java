package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.spotify.music.C0707R;

/* renamed from: kc0  reason: default package */
public class kc0 extends Drawable {
    private final Paint a = new Paint(1);
    private final Shader b;

    public kc0(Context context) {
        this.b = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, nud.h(context, C0707R.attr.pasteColorBackground), Shader.TileMode.CLAMP);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.scale((float) canvas.getWidth(), (float) canvas.getHeight());
        this.a.setShader(this.b);
        canvas.drawRect(0.0f, 0.0f, 1.0f, 1.0f, this.a);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}

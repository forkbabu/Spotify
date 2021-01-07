package defpackage;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import defpackage.k3d;
import java.util.Locale;

/* renamed from: s3d  reason: default package */
public class s3d implements a3d {
    private final k3d a;
    private final Runnable b;
    private final l3d c;
    private final Picasso f;

    /* renamed from: s3d$a */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s3d.this.b.run();
        }
    }

    public s3d(Picasso picasso, Runnable runnable, l3d l3d, k3d k3d) {
        this.f = picasso;
        this.a = k3d;
        this.c = l3d;
        this.b = runnable;
    }

    static GradientDrawable b(int i) {
        return new GradientDrawable(GradientDrawable.Orientation.TR_BL, new int[]{c(i, 0.1f), c(i, 0.6f)});
    }

    private static int c(int i, float f2) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = (1.0f - f2) * fArr[2];
        return Color.HSVToColor(fArr);
    }

    @Override // defpackage.a3d
    public View M(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        k3d.b e = this.a.e();
        int i2 = viewGroup.getResources().getConfiguration().orientation;
        e.getClass();
        if (i2 == 1) {
            i = e.e();
        } else if (i2 == 2) {
            i = e.c();
        } else {
            throw new IllegalArgumentException(String.format(Locale.getDefault(), "Orientation %s unrecognized", Integer.valueOf(i2)));
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        k3d.b.AbstractC0631b b2 = e.b();
        View findViewById = inflate.findViewById(b2.f());
        findViewById.getClass();
        View findViewById2 = inflate.findViewById(b2.e());
        findViewById2.getClass();
        View findViewById3 = inflate.findViewById(b2.a());
        findViewById3.getClass();
        Button button = (Button) findViewById3;
        this.a.h().a((TextView) findViewById);
        this.a.g().a((TextView) findViewById2);
        this.a.f().a(button);
        button.setOnClickListener(new a());
        ImageView imageView = (ImageView) inflate.findViewById(b2.c());
        int ordinal = this.a.a().b().ordinal();
        if (ordinal == 0) {
            ColorDrawable colorDrawable = new ColorDrawable(this.a.a().a());
            int i3 = q4.g;
            int i4 = Build.VERSION.SDK_INT;
            inflate.setBackground(colorDrawable);
            this.a.c().a(imageView, this.f, null, this.c);
        } else if (ordinal == 1) {
            this.a.c().a(imageView, this.f, new t3d(this, inflate), this.c);
        }
        return inflate;
    }
}

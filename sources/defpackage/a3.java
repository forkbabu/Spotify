package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.comscore.streaming.WindowState;
import defpackage.i3;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: a3  reason: default package */
public class a3 extends b3 {
    @Override // defpackage.b3
    public Typeface a(Context context, l2 l2Var, Resources resources, int i) {
        m2[] a = l2Var.a();
        int length = a.length;
        int i2 = 0;
        FontFamily.Builder builder = null;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= length) {
                break;
            }
            m2 m2Var = a[i3];
            try {
                Font.Builder weight = new Font.Builder(resources, m2Var.b()).setWeight(m2Var.e());
                if (!m2Var.f()) {
                    i4 = 0;
                }
                Font build = weight.setSlant(i4).setTtcIndex(m2Var.c()).setFontVariationSettings(m2Var.d()).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
            } catch (IOException unused) {
            }
            i3++;
        }
        if (builder == null) {
            return null;
        }
        int i5 = (i & 1) != 0 ? 700 : WindowState.NORMAL;
        if ((i & 2) != 0) {
            i2 = 1;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i5, i2)).build();
    }

    @Override // defpackage.b3
    public Typeface b(Context context, CancellationSignal cancellationSignal, i3.f[] fVarArr, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        int length = fVarArr.length;
        int i2 = 0;
        FontFamily.Builder builder = null;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= length) {
                break;
            }
            i3.f fVar = fVarArr[i3];
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(fVar.c(), "r", cancellationSignal);
                if (openFileDescriptor != null) {
                    try {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(fVar.d());
                        if (!fVar.e()) {
                            i4 = 0;
                        }
                        Font build = weight.setSlant(i4).setTtcIndex(fVar.b()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable unused) {
                    }
                } else if (openFileDescriptor == null) {
                    i3++;
                }
                openFileDescriptor.close();
            } catch (IOException unused2) {
            }
            i3++;
        }
        if (builder == null) {
            return null;
        }
        int i5 = (i & 1) != 0 ? 700 : WindowState.NORMAL;
        if ((i & 2) != 0) {
            i2 = 1;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i5, i2)).build();
        throw th;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.b3
    public Typeface c(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // defpackage.b3
    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (IOException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.b3
    public i3.f f(i3.f[] fVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}

package defpackage;

import android.content.Context;
import android.text.TextPaint;
import android.widget.TextView;
import java.util.Locale;

/* renamed from: rud  reason: default package */
public final class rud {
    private static final Locale[] a = {new Locale("th"), new Locale("vi")};

    public static void a(TextView textView, Context context) {
        boolean z;
        Locale r = z42.r(context.getResources().getConfiguration());
        Locale[] localeArr = a;
        int length = localeArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (r.getLanguage().equals(localeArr[i].getLanguage())) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            TextPaint paint = textView.getPaint();
            paint.setFlags(paint.getFlags() | 128 | 1);
            paint.setHinting(0);
        }
    }
}

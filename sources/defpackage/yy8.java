package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.widget.TextView;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradient;
import com.spotify.music.features.yourepisodes.interactor.d;
import com.spotify.music.features.yourepisodes.interactor.g;
import com.spotify.wrapped2020.v1.proto.ColoredText;
import com.spotify.wrapped2020.v1.proto.Gradient;
import com.spotify.wrapped2020.v1.proto.Paragraph;
import com.squareup.picasso.Picasso;
import io.reactivex.s;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

/* renamed from: yy8  reason: default package */
public final class yy8 {
    public static final void a(TextView textView, yz8 yz8) {
        h.e(textView, "$this$setColoredText");
        h.e(yz8, "coloredText");
        textView.setText(yz8.b());
        textView.setTextColor(yz8.a());
    }

    public static /* synthetic */ s b(d dVar, gh0 gh0, int i, Object obj) {
        return dVar.a((i & 1) != 0 ? g.a() : null);
    }

    public static final Bitmap c(String str, Picasso picasso) {
        h.e(str, "$this$toBitmap");
        h.e(picasso, "picasso");
        return picasso.m(str).j();
    }

    public static final int d(String str) {
        h.e(str, "$this$toColor");
        return Color.parseColor(str);
    }

    public static final yz8 e(ColoredText coloredText) {
        h.e(coloredText, "$this$toStoryColoredText");
        String i = coloredText.i();
        h.d(i, "text");
        String l = coloredText.l();
        h.d(l, "textColor");
        return new yz8(i, d(l));
    }

    public static final a09 f(Paragraph paragraph) {
        h.e(paragraph, "$this$toStoryParagraph");
        String i = paragraph.i();
        h.d(i, "text");
        List<String> n = paragraph.n();
        h.d(n, "valuesList");
        String l = paragraph.l();
        h.d(l, "textColor");
        int d = d(l);
        String m = paragraph.m();
        h.d(m, "valuesColor");
        return new a09(i, n, d, d(m));
    }

    public static final Uri g(String str) {
        h.e(str, "$this$toUri");
        return Uri.parse(str);
    }

    public static final WrappedGradient h(Gradient gradient) {
        h.e(gradient, "$this$toWrappedGradient");
        int ordinal = gradient.ordinal();
        if (ordinal == 0) {
            return WrappedGradient.GRADIENT_1;
        }
        if (ordinal == 1) {
            return WrappedGradient.GRADIENT_2;
        }
        if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Illegal gradient value".toString());
    }
}

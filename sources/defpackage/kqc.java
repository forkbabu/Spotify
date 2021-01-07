package defpackage;

import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import defpackage.mqc;
import java.util.regex.Pattern;

/* renamed from: kqc  reason: default package */
public class kqc {
    private static final Pattern e = Pattern.compile(" ");
    private final TextView a;
    private final String b;
    private final String c;
    private final mqc.a d;

    /* renamed from: kqc$a */
    public static class a {
        private static <T> T a(T t, int i) {
            if (t != null) {
                return t;
            }
            throw new IllegalArgumentException(je.p0("Method argument is null but is not marked @Nullable. Argument index: ", i));
        }

        public kqc b(TextView textView, String str, mqc.a aVar) {
            a(textView, 1);
            a(str, 2);
            a(aVar, 3);
            return new kqc(textView, str, aVar);
        }
    }

    public kqc(TextView textView, String str, mqc.a aVar) {
        this.a = textView;
        this.b = str;
        StringBuilder V0 = je.V0("… ");
        V0.append(e.matcher(str).replaceAll(" "));
        this.c = V0.toString();
        this.d = aVar;
    }

    private Layout a(CharSequence charSequence) {
        int width = (this.a.getWidth() - this.a.getPaddingLeft()) - this.a.getPaddingRight();
        Layout.Alignment alignment = this.a.getLayout() != null ? this.a.getLayout().getAlignment() : Layout.Alignment.ALIGN_NORMAL;
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            return new StaticLayout(charSequence, this.a.getPaint(), width, alignment, this.a.getLineSpacingMultiplier(), this.a.getLineSpacingExtra(), this.a.getIncludeFontPadding());
        }
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.a.getPaint(), width).setAlignment(alignment).setTextDirection(TextDirectionHeuristics.ANYRTL_LTR).setLineSpacing(this.a.getLineSpacingExtra(), this.a.getLineSpacingMultiplier()).setIncludePad(this.a.getIncludeFontPadding()).setBreakStrategy(this.a.getBreakStrategy()).setHyphenationFrequency(this.a.getHyphenationFrequency());
        if (i >= 26) {
            hyphenationFrequency.setJustificationMode(this.a.getJustificationMode());
        }
        return hyphenationFrequency.build();
    }

    public Spannable b(Spannable spannable) {
        int length;
        if (this.a.getWidth() == 0) {
            Logger.d("TextView's width need to be set, to be able to markup ellipsis", new Object[0]);
            return spannable;
        }
        if (!(this.a.getMaxLines() > 0 && a(spannable).getLineCount() > this.a.getMaxLines())) {
            return spannable;
        }
        CharSequence subSequence = spannable.subSequence(0, a(spannable).getLineEnd(this.a.getMaxLines() - 1));
        while (subSequence.charAt(subSequence.length() - 1) == '\n') {
            subSequence = subSequence.subSequence(0, subSequence.length() - 1);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subSequence);
        while (true) {
            if (a(((Object) spannableStringBuilder) + this.c).getLineCount() <= this.a.getMaxLines() || (length = spannableStringBuilder.length() - this.c.length()) <= 0 || length >= spannableStringBuilder.length()) {
                break;
            }
            spannableStringBuilder.delete(length, spannableStringBuilder.length());
        }
        this.a.setContentDescription(spannableStringBuilder.toString());
        spannableStringBuilder.append((CharSequence) this.c);
        spannableStringBuilder.setSpan(new mqc(this.d, spannable), spannableStringBuilder.length() - this.b.length(), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }
}

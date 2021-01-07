package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;
import kotlin.text.e;

/* renamed from: tvc  reason: default package */
public final class tvc {
    private final Activity a;

    /* renamed from: tvc$a */
    public static final class a extends ClickableSpan {
        final /* synthetic */ tvc a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(tvc tvc) {
            this.a = tvc;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            h.e(view, "widget");
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://www.spotify.com/us/legal/end-user-agreement/#s9"));
            Activity b = this.a.b();
            int i = androidx.core.content.a.b;
            int i2 = Build.VERSION.SDK_INT;
            b.startActivity(intent, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            h.e(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public tvc(Activity activity) {
        h.e(activity, "activity");
        this.a = activity;
    }

    public final SpannableString a(int i) {
        String string = this.a.getString(C0707R.string.podcast_qna_terms_and_conditions_education_terms_word);
        h.d(string, "activity.getString(R.str…ons_education_terms_word)");
        String string2 = this.a.getString(i, new Object[]{string});
        h.d(string2, "activity.getString(\n    …    termsString\n        )");
        SpannableString spannableString = new SpannableString(string2);
        int l = e.l(string2, string, 0, false, 6, null);
        spannableString.setSpan(new a(this), l, string.length() + l, 33);
        return spannableString;
    }

    public final Activity b() {
        return this.a;
    }
}

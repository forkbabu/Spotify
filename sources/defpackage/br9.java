package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import kotlin.jvm.internal.h;

/* renamed from: br9  reason: default package */
public final class br9 {

    /* renamed from: br9$a */
    public static final class a implements ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ TextView a;

        a(TextView textView) {
            this.a = textView;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            TextView textView = this.a;
            textView.setMaxLines(((textView.getMeasuredHeight() - this.a.getPaddingBottom()) - this.a.getPaddingTop()) / this.a.getLineHeight());
            return false;
        }
    }

    public static final void a(TextView textView) {
        h.e(textView, "textView");
        textView.getViewTreeObserver().addOnPreDrawListener(new a(textView));
    }

    public static final void b(Context context, TextView... textViewArr) {
        h.e(context, "context");
        h.e(textViewArr, "textViews");
        boolean m = nud.m(context);
        int i = m ? 8388613 : 8388611;
        TextUtils.TruncateAt truncateAt = m ? TextUtils.TruncateAt.START : TextUtils.TruncateAt.END;
        for (TextView textView : textViewArr) {
            textView.setGravity(i);
            textView.setEllipsize(truncateAt);
        }
    }
}

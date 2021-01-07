package defpackage;

import android.os.Build;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import kotlin.jvm.internal.h;

/* renamed from: yoa  reason: default package */
public final class yoa {
    public static final TextView a(TextView textView) {
        h.e(textView, "textView");
        textView.setLinksClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        if (Build.VERSION.SDK_INT >= 17) {
            textView.setTextDirection(5);
        }
        return textView;
    }
}

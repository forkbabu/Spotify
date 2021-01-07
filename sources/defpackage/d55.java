package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: d55  reason: default package */
public final class d55 {
    public final TextView a;

    private d55(TextView textView, TextView textView2) {
        this.a = textView2;
    }

    public static d55 a(View view) {
        TextView textView = (TextView) view;
        return new d55(textView, textView);
    }
}

package defpackage;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

/* renamed from: bp1  reason: default package */
public final class bp1 {
    private TextView a;
    private TextView b;

    public final bp1 a(View view) {
        h.e(view, "view");
        View findViewById = view.findViewById(C0707R.id.title);
        h.d(findViewById, "view.findViewById(R.id.title)");
        this.a = (TextView) findViewById;
        View findViewById2 = view.findViewById(C0707R.id.subtitle);
        h.d(findViewById2, "view.findViewById(R.id.subtitle)");
        this.b = (TextView) findViewById2;
        return this;
    }

    public final void b(String str) {
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(str);
        } else {
            h.k("subtitleTextView");
            throw null;
        }
    }

    public final void c(String str) {
        TextView textView = this.a;
        if (textView != null) {
            textView.setText(str);
        } else {
            h.k("titleTextView");
            throw null;
        }
    }
}

package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

/* renamed from: or8  reason: default package */
public final class or8 extends nc0 {
    private final TextView c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public or8(Context context, ViewGroup viewGroup, int i) {
        super(LayoutInflater.from(context).inflate(i, viewGroup, false));
        h.e(context, "context");
        h.e(viewGroup, "parent");
        View G = q4.G(getView(), C0707R.id.header_title);
        h.d(G, "ViewCompat.requireViewBy…(view, R.id.header_title)");
        this.c = (TextView) G;
        View G2 = q4.G(getView(), C0707R.id.header_subtitle);
        h.d(G2, "ViewCompat.requireViewBy…ew, R.id.header_subtitle)");
        TextView textView = (TextView) G2;
    }

    public final void setTitle(CharSequence charSequence) {
        h.e(charSequence, "title");
        this.c.setText(charSequence);
    }
}

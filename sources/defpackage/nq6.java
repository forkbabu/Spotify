package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

/* renamed from: nq6  reason: default package */
public final class nq6 extends nc0 {
    private final TextView c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nq6(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(C0707R.layout.premium_mini_playlist_header_content_view, viewGroup, false));
        h.e(context, "context");
        h.e(viewGroup, "parent");
        View findViewById = getView().findViewById(16908308);
        findViewById.getClass();
        h.d(findViewById, "Preconditions.checkNotNu…ById(android.R.id.text1))");
        this.c = (TextView) findViewById;
    }

    public final TextView E2() {
        return this.c;
    }
}

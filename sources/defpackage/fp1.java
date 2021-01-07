package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.util.ui.TextLabelUtil;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import kotlin.jvm.internal.h;

/* renamed from: fp1  reason: default package */
public final class fp1 {
    private ImageView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private final Context e;
    private final Picasso f;

    public fp1(Context context, Picasso picasso) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        this.e = context;
        this.f = picasso;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x007d: APUT  (r0v17 android.view.View[]), (0 ??[int, short, byte, char]), (r1v5 android.widget.TextView) */
    public final fp1 a(View view) {
        h.e(view, "view");
        View findViewById = view.findViewById(16908294);
        h.d(findViewById, "view.findViewById(android.R.id.icon)");
        this.a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(16908308);
        h.d(findViewById2, "view.findViewById(android.R.id.text1)");
        this.b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(16908309);
        h.d(findViewById3, "view.findViewById(android.R.id.text2)");
        this.d = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C0707R.id.affinity);
        h.d(findViewById4, "view.findViewById(R.id.affinity)");
        this.c = (TextView) findViewById4;
        Context context = this.e;
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.CHEVRON_RIGHT, context.getResources().getDimension(C0707R.dimen.chevron_icon_size));
        spotifyIconDrawable.r(a.b(this.e, R.color.gray_70));
        ((ImageView) view.findViewById(C0707R.id.chevron)).setImageDrawable(spotifyIconDrawable);
        bvd c2 = dvd.c(view);
        View[] viewArr = new View[3];
        TextView textView = this.b;
        if (textView != null) {
            viewArr[0] = textView;
            TextView textView2 = this.c;
            if (textView2 != null) {
                viewArr[1] = textView2;
                TextView textView3 = this.d;
                if (textView3 != null) {
                    viewArr[2] = textView3;
                    c2.g(viewArr);
                    c2.a();
                    return this;
                }
                h.k("subtitleTextView");
                throw null;
            }
            h.k("affinityTextView");
            throw null;
        }
        h.k("songTitleTextView");
        throw null;
    }

    public final void b(String str) {
        TextView textView = this.c;
        if (textView != null) {
            int i = 0;
            if (str == null || str.length() == 0) {
                i = 8;
            }
            textView.setVisibility(i);
            TextView textView2 = this.c;
            if (textView2 != null) {
                textView2.setText("");
                Context context = this.e;
                TextView textView3 = this.c;
                if (textView3 != null) {
                    TextLabelUtil.d(context, textView3, str);
                } else {
                    h.k("affinityTextView");
                    throw null;
                }
            } else {
                h.k("affinityTextView");
                throw null;
            }
        } else {
            h.k("affinityTextView");
            throw null;
        }
    }

    public final void c(String str) {
        z l = this.f.l(str == null || str.length() == 0 ? Uri.EMPTY : Uri.parse(str));
        l.t(yc0.n(this.e));
        ImageView imageView = this.a;
        if (imageView != null) {
            l.m(imageView);
        } else {
            h.k("imageView");
            throw null;
        }
    }

    public final void d(String str) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(str);
        } else {
            h.k("subtitleTextView");
            throw null;
        }
    }

    public final void e(String str) {
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(str);
        } else {
            h.k("songTitleTextView");
            throw null;
        }
    }
}

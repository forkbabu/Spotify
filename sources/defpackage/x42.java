package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.android.paste.app.c;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.Locale;

/* renamed from: x42  reason: default package */
public final class x42 {
    public static Button a(Context context, ViewGroup viewGroup, SpotifyIconV2 spotifyIconV2, int i) {
        String string = context.getString(i);
        ViewGroup.LayoutParams layoutParams = null;
        Button button = (Button) c.b(context, Button.class, null, C0707R.attr.pasteButtonStylePrimary);
        if (viewGroup != null) {
            XmlResourceParser layout = context.getResources().getLayout(C0707R.layout.paste_wrap_content);
            while (layout.nextToken() != 2) {
                try {
                } catch (Exception e) {
                    throw new AssertionError(e);
                }
            }
            layoutParams = viewGroup.generateLayoutParams(layout);
        }
        if (layoutParams != null) {
            button.setLayoutParams(layoutParams);
        }
        int f = nud.f(48.0f, context.getResources());
        button.setPadding(f, 0, f, 0);
        button.setCompoundDrawablePadding(nud.f(8.0f, context.getResources()));
        b(context, button, spotifyIconV2, string);
        return button;
    }

    public static void b(Context context, Button button, SpotifyIconV2 spotifyIconV2, String str) {
        button.setText(str.toUpperCase(Locale.getDefault()));
        if (spotifyIconV2 != null) {
            float g = (float) nud.g(18.0f, context.getResources());
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, g);
            spotifyIconDrawable.s(button.getTextColors());
            spotifyIconDrawable.w(g);
            button.setCompoundDrawablesWithIntrinsicBounds(spotifyIconDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        button.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}

package com.spotify.android.paste.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.spotify.android.paste.app.PasteViewFactories;
import com.spotify.music.C0707R;

public class c {
    private static final b a = new b(null);

    public static final class b {
        b(a aVar) {
        }

        public Button a(Context context) {
            return (Button) c.b(context, Button.class, null, C0707R.attr.solarButtonPrimaryGreen);
        }
    }

    private static View a(Context context, PasteViewFactories.ViewFactory viewFactory, AttributeSet attributeSet, int i) {
        viewFactory.getClass();
        if (i == 0) {
            i = viewFactory.g();
        }
        View d = viewFactory.d(context, attributeSet, i);
        if (d instanceof TextView) {
            rud.a((TextView) d, context);
        }
        return d;
    }

    public static <T extends View> T b(Context context, Class<T> cls, AttributeSet attributeSet, int i) {
        return (T) a(context, PasteViewFactories.a(cls), null, i);
    }

    public static View c(Context context, String str, AttributeSet attributeSet) {
        PasteViewFactories.ViewFactory b2 = PasteViewFactories.b(str);
        if (b2 == null) {
            return null;
        }
        return a(context, b2, attributeSet, 0);
    }

    public static Button d(Context context) {
        return (Button) b(context, Button.class, null, C0707R.attr.pasteButtonStyleSmall);
    }

    public static ToggleButton e(Context context) {
        return (ToggleButton) b(context, ToggleButton.class, null, C0707R.attr.pasteButtonStyleSmall);
    }

    public static TextView f(Context context) {
        return (TextView) b(context, TextView.class, null, 0);
    }

    public static b g() {
        return a;
    }
}

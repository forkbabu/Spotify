package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.music.C0707R;

/* renamed from: ls8  reason: default package */
public final class ls8 {
    private final Button a;
    public final Button b;

    private ls8(Button button, Button button2) {
        this.a = button;
        this.b = button2;
    }

    public static ls8 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0707R.layout.topic_chip, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        if (inflate != null) {
            Button button = (Button) inflate;
            return new ls8(button, button);
        }
        throw new NullPointerException("rootView");
    }

    public Button a() {
        return this.a;
    }
}

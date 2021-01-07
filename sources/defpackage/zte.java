package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.C0707R;

/* renamed from: zte  reason: default package */
public final class zte {
    private final LinearLayout a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final Button e;
    public final Button f;

    private zte(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, Button button, Button button2, ImageView imageView, TextView textView4, TextView textView5) {
        this.a = linearLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = button;
        this.f = button2;
    }

    public static zte b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0707R.layout.voice_onboarding_education, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0707R.id.bubble1;
        TextView textView = (TextView) inflate.findViewById(C0707R.id.bubble1);
        if (textView != null) {
            i = C0707R.id.bubble2;
            TextView textView2 = (TextView) inflate.findViewById(C0707R.id.bubble2);
            if (textView2 != null) {
                i = C0707R.id.bubble3;
                TextView textView3 = (TextView) inflate.findViewById(C0707R.id.bubble3);
                if (textView3 != null) {
                    i = 16908313;
                    Button button = (Button) inflate.findViewById(16908313);
                    if (button != null) {
                        i = 16908327;
                        Button button2 = (Button) inflate.findViewById(16908327);
                        if (button2 != null) {
                            i = C0707R.id.drag;
                            ImageView imageView = (ImageView) inflate.findViewById(C0707R.id.drag);
                            if (imageView != null) {
                                i = C0707R.id.subtitle;
                                TextView textView4 = (TextView) inflate.findViewById(C0707R.id.subtitle);
                                if (textView4 != null) {
                                    i = C0707R.id.title;
                                    TextView textView5 = (TextView) inflate.findViewById(C0707R.id.title);
                                    if (textView5 != null) {
                                        return new zte((LinearLayout) inflate, textView, textView2, textView3, button, button2, imageView, textView4, textView5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public LinearLayout a() {
        return this.a;
    }
}

package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;

/* renamed from: ns8  reason: default package */
public final class ns8 {
    private final ConstraintLayout a;
    public final FrameLayout b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;

    private ns8(ConstraintLayout constraintLayout, FrameLayout frameLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.a = constraintLayout;
        this.b = frameLayout;
        this.c = imageView;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
    }

    public static ns8 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0707R.layout.topic_episode_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0707R.id.accessory;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C0707R.id.accessory);
        if (frameLayout != null) {
            i = C0707R.id.imageView;
            ImageView imageView = (ImageView) inflate.findViewById(C0707R.id.imageView);
            if (imageView != null) {
                i = C0707R.id.metadata;
                TextView textView = (TextView) inflate.findViewById(C0707R.id.metadata);
                if (textView != null) {
                    i = C0707R.id.subtitle;
                    TextView textView2 = (TextView) inflate.findViewById(C0707R.id.subtitle);
                    if (textView2 != null) {
                        i = C0707R.id.title;
                        TextView textView3 = (TextView) inflate.findViewById(C0707R.id.title);
                        if (textView3 != null) {
                            return new ns8((ConstraintLayout) inflate, frameLayout, imageView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public ConstraintLayout a() {
        return this.a;
    }
}

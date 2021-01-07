package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;

/* renamed from: ms8  reason: default package */
public final class ms8 {
    private final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;

    private ms8(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, TextView textView, ImageView imageView2, TextView textView2, TextView textView3) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = imageView2;
        this.e = textView2;
        this.f = textView3;
    }

    public static ms8 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0707R.layout.topic_episode_image_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0707R.id.episode_cover_art;
        ImageView imageView = (ImageView) inflate.findViewById(C0707R.id.episode_cover_art);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            i = C0707R.id.metadata;
            TextView textView = (TextView) inflate.findViewById(C0707R.id.metadata);
            if (textView != null) {
                i = C0707R.id.podcast_cover_art;
                ImageView imageView2 = (ImageView) inflate.findViewById(C0707R.id.podcast_cover_art);
                if (imageView2 != null) {
                    i = C0707R.id.subtitle;
                    TextView textView2 = (TextView) inflate.findViewById(C0707R.id.subtitle);
                    if (textView2 != null) {
                        i = C0707R.id.title;
                        TextView textView3 = (TextView) inflate.findViewById(C0707R.id.title);
                        if (textView3 != null) {
                            return new ms8(constraintLayout, imageView, constraintLayout, textView, imageView2, textView2, textView3);
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

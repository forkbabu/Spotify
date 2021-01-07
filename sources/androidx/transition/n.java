package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;

public class n {
    private ViewGroup a;
    private View b;

    public n(ViewGroup viewGroup, View view) {
        this.a = viewGroup;
        this.b = view;
    }

    public static n c(ViewGroup viewGroup) {
        return (n) viewGroup.getTag(C0707R.id.transition_current_scene);
    }

    public void a() {
        if (this.b != null) {
            this.a.removeAllViews();
            this.a.addView(this.b);
        }
        this.a.setTag(C0707R.id.transition_current_scene, this);
    }

    public void b() {
        c(this.a);
    }

    public ViewGroup d() {
        return this.a;
    }
}

package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
public class n0 extends t {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ View c;
    final /* synthetic */ Visibility f;

    n0(Visibility visibility, ViewGroup viewGroup, View view, View view2) {
        this.f = visibility;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // androidx.transition.t, androidx.transition.Transition.d
    public void a(Transition transition) {
        if (this.b.getParent() == null) {
            d0.b(this.a).a(this.b);
        } else {
            this.f.cancel();
        }
    }

    @Override // androidx.transition.t, androidx.transition.Transition.d
    public void c(Transition transition) {
        d0.b(this.a).b(this.b);
    }

    @Override // androidx.transition.Transition.d
    public void d(Transition transition) {
        this.c.setTag(C0707R.id.save_overlay_view, null);
        d0.b(this.a).b(this.b);
        transition.P(this);
    }
}

package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.spotify.android.goldenpath.a;
import com.spotify.inappmessaging.display.InAppMessagingDisplayFragment;
import com.spotify.mobile.android.ui.view.anchorbar.AnchorBar;
import com.spotify.mobile.android.ui.view.anchorbar.f;
import com.spotify.music.C0707R;

/* renamed from: n08  reason: default package */
public class n08 extends f {
    private final o f;
    private boolean n = false;

    public n08(AnchorBar anchorBar, o oVar) {
        super(anchorBar, C0707R.id.banner_container, n08.class.getCanonicalName());
        this.f = oVar;
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.AnchorItem
    public void a(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        viewGroup.post(new py7(viewGroup, a.g(context) ? a.f(context) : 0));
    }

    public /* synthetic */ void e(InAppMessagingDisplayFragment inAppMessagingDisplayFragment) {
        x i = this.f.i();
        i.p(inAppMessagingDisplayFragment);
        i.j();
        this.n = false;
    }

    public void f(InAppMessagingDisplayFragment inAppMessagingDisplayFragment) {
        x i = this.f.i();
        i.q(d(), inAppMessagingDisplayFragment, "IN_APP_MESSAGING_BANNER_FRAGMENT_TAG");
        i.j();
        this.n = true;
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.f, com.spotify.mobile.android.ui.view.anchorbar.AnchorItem
    public boolean isVisible() {
        return super.isVisible() && this.n;
    }
}

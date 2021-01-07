package defpackage;

import android.app.Activity;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.spotify.inappmessaging.display.InAppMessagingDisplayFragment;
import com.spotify.inappmessaging.display.b;
import com.spotify.inappmessaging.display.e;
import com.spotify.inappmessaging.display.n;
import com.spotify.music.C0707R;
import io.reactivex.functions.g;

/* renamed from: c18  reason: default package */
public class c18 implements n, ws2, g<e> {
    private final o a;
    private final b18 b;
    private InAppMessagingDisplayFragment c;
    private final Activity f;

    c18(Activity activity, o oVar, b18 b18) {
        this.f = activity;
        this.a = oVar;
        this.b = b18;
    }

    private void d() {
        InAppMessagingDisplayFragment inAppMessagingDisplayFragment = this.c;
        if (inAppMessagingDisplayFragment != null) {
            this.b.c(inAppMessagingDisplayFragment.M4());
            x i = this.a.i();
            i.p(this.c);
            i.j();
        }
        this.c = null;
    }

    @Override // com.spotify.inappmessaging.display.n
    public void a(int i) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(e eVar) {
        this.c = eVar.build();
        x i = this.a.i();
        i.q(C0707R.id.quicksilver_card_container, this.c, "IN_APP_MESSAGING_FULLSCREEN_FRAGMENT_TAG");
        i.j();
    }

    @Override // defpackage.ws2
    public boolean b() {
        if (this.c == null) {
            return false;
        }
        d();
        return true;
    }

    @Override // com.spotify.inappmessaging.display.n
    public void c(n.a aVar) {
        if (this.b.b(this.c.N4())) {
            this.c.P4(true);
            ((b) aVar).a();
            this.b.d(this.c.M4());
            Activity activity = this.f;
            if (activity instanceof vs2) {
                ((vs2) activity).I1(this);
                return;
            }
            return;
        }
        InAppMessagingDisplayFragment inAppMessagingDisplayFragment = this.c;
        inAppMessagingDisplayFragment.K4(this.b.a(inAppMessagingDisplayFragment.N4()));
        d();
    }

    @Override // com.spotify.inappmessaging.display.n
    public void dismiss() {
        d();
    }
}

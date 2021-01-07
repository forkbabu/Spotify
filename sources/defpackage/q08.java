package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.inappmessaging.display.InAppMessagingDisplayFragment;
import com.spotify.inappmessaging.display.b;
import com.spotify.inappmessaging.display.e;
import com.spotify.inappmessaging.display.n;
import io.reactivex.functions.g;

/* renamed from: q08  reason: default package */
public class q08 implements n, g<e> {
    private final o08 a;
    private final b18 b;
    private final Activity c;
    private final float f;
    private InAppMessagingDisplayFragment n;
    private n08 o;

    q08(o08 o08, b18 b18, Activity activity) {
        this.a = o08;
        this.b = b18;
        this.c = activity;
        this.f = activity.getResources().getDisplayMetrics().density;
    }

    private void e() {
        this.b.c(this.n.M4());
        this.c.runOnUiThread(new qy7(this));
        n08 n08 = this.o;
        InAppMessagingDisplayFragment inAppMessagingDisplayFragment = this.n;
        n08.getClass();
        new Handler().postDelayed(new oy7(n08, inAppMessagingDisplayFragment), 1000);
        this.n = null;
    }

    @Override // com.spotify.inappmessaging.display.n
    public void a(int i) {
        View a3 = this.n.a3();
        ViewGroup.LayoutParams layoutParams = a3.getLayoutParams();
        layoutParams.height = (int) (((float) i) * this.f);
        this.c.runOnUiThread(new ry7(a3, layoutParams));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(e eVar) {
        e eVar2 = eVar;
        n08 a2 = this.a.a();
        this.o = a2;
        if (a2 != null) {
            InAppMessagingDisplayFragment build = eVar2.build();
            this.n = build;
            this.o.f(build);
        }
    }

    public /* synthetic */ void b() {
        this.o.setVisible(true);
    }

    @Override // com.spotify.inappmessaging.display.n
    public void c(n.a aVar) {
        if (this.b.b(this.n.N4())) {
            ((b) aVar).a();
            this.b.d(this.n.M4());
            this.n.P4(true);
            this.c.runOnUiThread(new sy7(this));
            return;
        }
        InAppMessagingDisplayFragment inAppMessagingDisplayFragment = this.n;
        inAppMessagingDisplayFragment.K4(this.b.a(inAppMessagingDisplayFragment.N4()));
        e();
    }

    public /* synthetic */ void d() {
        this.o.setVisible(false);
    }

    @Override // com.spotify.inappmessaging.display.n
    public void dismiss() {
        e();
    }
}

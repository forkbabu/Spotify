package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.spotify.android.goldenpath.a;
import com.spotify.inappmessaging.InAppMessagingLogger;
import com.spotify.inappmessaging.display.InAppMessagingDisplayFragment;
import com.spotify.inappmessaging.display.b;
import com.spotify.inappmessaging.display.e;
import com.spotify.inappmessaging.display.n;
import com.spotify.music.C0707R;
import com.spotify.music.slate.container.view.SlateView;
import io.reactivex.functions.g;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: v08  reason: default package */
public class v08 implements n, ws2, g<e> {
    private final o a;
    private final b18 b;
    private InAppMessagingDisplayFragment c;
    private final Activity f;
    private SlateView n;

    v08(Activity activity, o oVar, b18 b18) {
        this.f = activity;
        this.a = oVar;
        this.b = b18;
    }

    /* access modifiers changed from: private */
    public void l() {
        InAppMessagingDisplayFragment inAppMessagingDisplayFragment = this.c;
        if (inAppMessagingDisplayFragment != null) {
            this.b.c(inAppMessagingDisplayFragment.M4());
            x i = this.a.i();
            i.p(this.c);
            i.j();
        }
        this.f.runOnUiThread(new az7(this));
        this.c = null;
        this.n = null;
    }

    @Override // com.spotify.inappmessaging.display.n
    public void a(int i) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(e eVar) {
        this.c = eVar.build();
        this.f.runOnUiThread(new zy7(this));
    }

    @Override // defpackage.ws2
    public boolean b() {
        if (this.c == null) {
            return false;
        }
        l();
        return true;
    }

    @Override // com.spotify.inappmessaging.display.n
    public void c(n.a aVar) {
        if (this.b.b(this.c.N4())) {
            this.f.runOnUiThread(new cz7(this));
            this.c.P4(true);
            this.f.runOnUiThread(new vy7(this));
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
        l();
    }

    @Override // com.spotify.inappmessaging.display.n
    public void dismiss() {
        l();
    }

    public void f() {
        this.n = null;
        SlateView slateView = new SlateView(this.f);
        this.n = slateView;
        slateView.setVisibility(4);
        this.n.setBackgroundResource(C0707R.color.black_80);
        this.n.setOnTouchListener(wy7.a);
        SlateView slateView2 = this.n;
        slateView2.setPadding(slateView2.getPaddingLeft() + 30, this.n.getPaddingTop(), this.n.getPaddingRight() + 30, this.n.getPaddingBottom());
        this.n.setFooter(new ty7(this));
        this.n.setHeader(bz7.a);
        this.n.setInteractionListener(new u08(this));
        ((ViewGroup) this.f.findViewById(C0707R.id.quicksilver_card_container)).addView(this.n);
        this.n.d(uy7.a);
        x i = this.a.i();
        i.q(C0707R.id.card_content_container_layout, this.c, "IN_APP_MESSAGING_CARD_FRAGMENT_TAG");
        i.j();
    }

    public b5 g(View view, b5 b5Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        b4 d = b5Var.d();
        if (d != null) {
            i3 = d.b();
            i2 = d.d();
            i = d.c();
            i4 = d.a();
        } else {
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        Activity activity = this.f;
        if (activity == null || activity.getWindow() == null || this.f.getWindow().getDecorView().getSystemUiVisibility() == 0 || this.f.getWindow().getDecorView().getSystemUiVisibility() == 3846) {
            i6 = 0;
        } else {
            i6 = a.e(this.f.getResources());
            Activity activity2 = this.f;
            if (activity2 != null) {
                Resources resources = activity2.getResources();
                Configuration configuration = resources.getConfiguration();
                boolean z = configuration.orientation == 1;
                String str = "navigation_bar_height";
                if (configuration.smallestScreenWidthDp >= 600) {
                    if (!z) {
                        str = "navigation_bar_height_landscape";
                    }
                    i7 = resources.getIdentifier(str, "dimen", "android");
                } else {
                    if (!z) {
                        str = "navigation_bar_width";
                    }
                    i7 = resources.getIdentifier(str, "dimen", "android");
                }
                if (i7 > 0) {
                    i5 = resources.getDimensionPixelSize(i7);
                    view.setPadding(Math.max(i3, b5Var.h()), ((Integer) Collections.max(Arrays.asList(Integer.valueOf(i2), Integer.valueOf(b5Var.j()), Integer.valueOf(i6)))).intValue(), Math.max(i, b5Var.i()), ((Integer) Collections.max(Arrays.asList(Integer.valueOf(i4), Integer.valueOf(b5Var.g()), Integer.valueOf(i5)))).intValue());
                    view.requestLayout();
                    return b5Var;
                }
            }
        }
        i5 = 0;
        view.setPadding(Math.max(i3, b5Var.h()), ((Integer) Collections.max(Arrays.asList(Integer.valueOf(i2), Integer.valueOf(b5Var.j()), Integer.valueOf(i6)))).intValue(), Math.max(i, b5Var.i()), ((Integer) Collections.max(Arrays.asList(Integer.valueOf(i4), Integer.valueOf(b5Var.g()), Integer.valueOf(i5)))).intValue());
        view.requestLayout();
        return b5Var;
    }

    public /* synthetic */ void h(View view) {
        this.c.L4(InAppMessagingLogger.DismissType.DISMISS_CTA);
        l();
    }

    public void i() {
        View findViewById = this.f.findViewById(C0707R.id.quicksilver_card_container);
        q4.F(findViewById);
        q4.P(findViewById, new xy7(this));
    }

    public /* synthetic */ void j() {
        SlateView slateView = this.n;
        if (slateView != null) {
            slateView.setVisibility(0);
        }
    }

    public /* synthetic */ void k() {
        ViewGroup viewGroup = (ViewGroup) this.f.findViewById(C0707R.id.quicksilver_card_container);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
    }
}

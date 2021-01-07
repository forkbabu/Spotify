package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.spotify.inappmessaging.InAppMessagingLogger;
import com.spotify.inappmessaging.display.InAppMessagingDisplayFragment;
import com.spotify.inappmessaging.display.b;
import com.spotify.inappmessaging.display.e;
import com.spotify.inappmessaging.display.n;
import com.spotify.mobile.android.ui.view.anchorbar.AnchorBar;
import com.spotify.music.C0707R;
import com.spotify.music.features.quicksilver.utils.d;
import io.reactivex.functions.g;

/* renamed from: h28  reason: default package */
public class h28 implements n, g<e> {
    private final o a;
    private final b18 b;
    private final Activity c;
    private final s08 f;
    private final View.OnLayoutChangeListener n = new h08(this);
    private final int o;
    private AnchorBar p;
    private InAppMessagingDisplayFragment q;
    private int r;
    private CardView s;
    private boolean t;

    /* renamed from: h28$a */
    class a implements Runnable {
        final /* synthetic */ Handler a;
        final /* synthetic */ n.a b;

        a(Handler handler, n.a aVar) {
            this.a = handler;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h28.this.r == 0) {
                this.a.postDelayed(this, 100);
            } else {
                h28.d(h28.this, this.b);
            }
        }
    }

    h28(Activity activity, o oVar, b18 b18, s08 s08) {
        this.c = activity;
        this.f = s08;
        this.a = oVar;
        this.b = b18;
        this.o = (int) activity.getResources().getDimension(C0707R.dimen.bottom_navigation_height);
    }

    static void d(h28 h28, n.a aVar) {
        h28.t = true;
        ((b) aVar).a();
        h28.b.d(h28.q.M4());
        h28.c.runOnUiThread(new f08(h28));
    }

    private void g() {
        if (this.s == null || Settings.System.getFloat(this.c.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
            m((ViewGroup) this.c.findViewById(C0707R.id.quicksilver_card_container));
            return;
        }
        this.s.animate().yBy(400.0f).setInterpolator(new LinearInterpolator()).setDuration(100).start();
        new Handler().postDelayed(new k08(this), 400);
    }

    private void m(ViewGroup viewGroup) {
        this.c.runOnUiThread(new i08(viewGroup));
        this.p.removeOnLayoutChangeListener(this.n);
        this.b.c(this.q.M4());
        x i = this.a.i();
        i.p(this.q);
        i.j();
        this.q = null;
        this.s = null;
        this.t = false;
    }

    @Override // com.spotify.inappmessaging.display.n
    public void a(int i) {
        this.r = i;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(e eVar) {
        this.q = eVar.build();
        AnchorBar a2 = this.f.a();
        this.p = a2;
        if (a2 != null) {
            a2.addOnLayoutChangeListener(this.n);
        }
        this.c.runOnUiThread(new j08(this));
    }

    @Override // com.spotify.inappmessaging.display.n
    public void c(n.a aVar) {
        if (!this.t) {
            if (this.b.b(this.q.N4())) {
                Handler handler = new Handler();
                handler.post(new a(handler, aVar));
                return;
            }
            InAppMessagingDisplayFragment inAppMessagingDisplayFragment = this.q;
            inAppMessagingDisplayFragment.K4(this.b.a(inAppMessagingDisplayFragment.N4()));
            m((ViewGroup) this.c.findViewById(C0707R.id.quicksilver_card_container));
        }
    }

    @Override // com.spotify.inappmessaging.display.n
    public void dismiss() {
        g();
    }

    public void h() {
        this.s = (CardView) this.c.getLayoutInflater().inflate(C0707R.layout.note_content_container, (ViewGroup) this.c.findViewById(C0707R.id.quicksilver_card_container), false);
        ((ViewGroup) this.c.findViewById(C0707R.id.quicksilver_card_container)).addView(this.s);
        x i = this.a.i();
        i.q(C0707R.id.note_container, this.q, "IN_APP_MESSAGING_NOTE_FRAGMENT_TAG");
        i.j();
    }

    public /* synthetic */ void i() {
        m((ViewGroup) this.c.findViewById(C0707R.id.quicksilver_card_container));
    }

    public /* synthetic */ void j(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup viewGroup = (ViewGroup) this.c.findViewById(C0707R.id.quicksilver_card_container);
        if (viewGroup != null) {
            if (Settings.System.getFloat(this.c.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
                viewGroup.post(new e08(viewGroup, viewGroup.getY() + ((float) (i2 - i6))));
            } else {
                viewGroup.animate().yBy((float) (i2 - i6)).setInterpolator(new LinearInterpolator()).setDuration(200).start();
            }
        }
    }

    public /* synthetic */ void k() {
        this.q.L4(InAppMessagingLogger.DismissType.SWIPE);
        g();
    }

    public /* synthetic */ void l() {
        int i = (int) (((float) this.r) * this.c.getResources().getDisplayMetrics().density);
        int height = this.c.findViewById(C0707R.id.quicksilver_card_container).getHeight() - (this.p.getHeight() + this.o);
        this.s.getLayoutParams().height = i;
        this.c.findViewById(C0707R.id.quicksilver_card_container).setLayoutParams(new FrameLayout.LayoutParams(-1, height));
        this.s.setOnTouchListener(new d(this.s, new g08(this), i / 2));
        if (Settings.System.getFloat(this.c.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
            this.q.P4(true);
            this.s.setVisibility(0);
            this.s.setY((float) ((height - i) - 40));
            return;
        }
        this.s.animate().y((float) ((height - i) - 40)).setInterpolator(new LinearInterpolator()).setDuration(100).setListener(new i28(this)).start();
    }
}

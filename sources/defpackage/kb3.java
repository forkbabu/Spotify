package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.x;
import com.spotify.music.navigation.t;
import com.spotify.voice.experiments.experience.VoiceExperimentsFragment;
import io.reactivex.b;

/* renamed from: kb3  reason: default package */
public class kb3 implements hze, q7f {
    private final c a;
    private final t b;
    private final nsb c;

    /* access modifiers changed from: package-private */
    /* renamed from: kb3$a */
    public static class a extends AnimatorListenerAdapter {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.onComplete();
        }
    }

    kb3(c cVar, t tVar, nsb nsb) {
        this.a = cVar;
        this.b = tVar;
        this.c = nsb;
    }

    private static View d(c cVar) {
        Fragment U = cVar.v0().U("VoiceFragment");
        if (U == null) {
            return null;
        }
        View a3 = U.a3();
        if (!(a3 instanceof ViewGroup)) {
            return null;
        }
        return ((ViewGroup) a3).getChildAt(0);
    }

    static /* synthetic */ void g(c cVar, b bVar) {
        View d = d(cVar);
        if (d == null) {
            bVar.onComplete();
            return;
        }
        int top = d.getTop();
        int height = d.getHeight();
        if (top == height) {
            bVar.onComplete();
        } else {
            d.animate().translationY((float) (height - top)).setInterpolator(ta0.c).setDuration(100).setListener(new a(bVar)).start();
        }
    }

    @Override // defpackage.hze
    public io.reactivex.a a() {
        io.reactivex.a dismiss = dismiss();
        nsb nsb = this.c;
        nsb.getClass();
        return dismiss.d(io.reactivex.a.u(new ib3(nsb)));
    }

    @Override // defpackage.hze
    public io.reactivex.a b(String str) {
        if (str.equals("spotify:voice:interaction")) {
            return c(str, null);
        }
        return dismiss().d(io.reactivex.a.u(new gb3(this, str)));
    }

    @Override // defpackage.hze
    public io.reactivex.a c(String str, Parcelable parcelable) {
        return io.reactivex.a.u(new fb3(this, parcelable, str)).G(io.reactivex.android.schedulers.a.b()).A(io.reactivex.schedulers.a.a());
    }

    @Override // defpackage.hze
    public io.reactivex.a dismiss() {
        io.reactivex.a m = io.reactivex.a.m(new eb3(this.a));
        c cVar = this.a;
        cVar.getClass();
        return m.d(io.reactivex.a.u(new hb3(cVar))).G(io.reactivex.android.schedulers.a.b());
    }

    public /* synthetic */ void e(String str) {
        this.b.d(str);
    }

    public /* synthetic */ void f(Parcelable parcelable, String str) {
        View d = d(this.a);
        if (d != null) {
            ((CoordinatorLayout.e) d.getLayoutParams()).j(null);
        }
        String stringExtra = this.a.getIntent().getStringExtra("com.spotify.voice.experience.KEY_EXTRA_ELEMENT_ID");
        String stringExtra2 = this.a.getIntent().getStringExtra("com.spotify.voice.experience.KEY_EXTRA_SOURCE_ID");
        Fragment U = this.a.v0().U("VoiceFragment");
        if (U != null) {
            U.t4(null);
        }
        VoiceExperimentsFragment L4 = VoiceExperimentsFragment.L4(stringExtra, stringExtra2, parcelable, str);
        x i = this.a.v0().i();
        i.x(0);
        i.q(16908290, L4, "VoiceFragment");
        i.i();
    }
}

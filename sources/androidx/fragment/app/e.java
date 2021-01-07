package androidx.fragment.app;

import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.e0;
import androidx.fragment.app.o;

/* access modifiers changed from: package-private */
public final class e implements Animation.AnimationListener {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ Fragment b;
    final /* synthetic */ e0.a c;
    final /* synthetic */ androidx.core.os.a d;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.b.C2() != null) {
                e.this.b.p4(null);
                e eVar = e.this;
                ((o.b) eVar.c).a(eVar.b, eVar.d);
            }
        }
    }

    e(ViewGroup viewGroup, Fragment fragment, e0.a aVar, androidx.core.os.a aVar2) {
        this.a = viewGroup;
        this.b = fragment;
        this.c = aVar;
        this.d = aVar2;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.a.post(new a());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}

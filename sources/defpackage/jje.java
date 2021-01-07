package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.ProgressBar;
import com.google.common.collect.Collections2;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import defpackage.wie;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jje  reason: default package */
public class jje implements g<zie, yie>, wme {
    private final View a;
    private final Button b;
    private final Button c;
    private final Button f;
    private final ProgressBar n;
    private ViewPropertyAnimator o;
    private final AtomicBoolean p = new AtomicBoolean(false);

    /* access modifiers changed from: package-private */
    /* renamed from: jje$a */
    public class a implements h<zie> {
        a() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            jje.a(jje.this, (zie) obj);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: jje$b */
    public class b extends AnimatorListenerAdapter {
        final /* synthetic */ da2 a;
        final /* synthetic */ wie b;

        b(da2 da2, wie wie) {
            this.a = da2;
            this.b = wie;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!jje.this.p.get()) {
                this.a.accept(yie.a(this.b));
            }
        }
    }

    public jje(wie wie, View view) {
        this.a = view;
        this.b = (Button) view.findViewById(C0707R.id.gender_button_female);
        this.c = (Button) view.findViewById(C0707R.id.gender_button_male);
        this.f = (Button) view.findViewById(C0707R.id.gender_button_neutral);
        this.n = (ProgressBar) view.findViewById(C0707R.id.loader);
        wie.d(dje.a, new fje(this), new ije(this), new cje(this));
    }

    static void a(jje jje, zie zie) {
        if (jje.f.getVisibility() == 0 && !zie.c()) {
            jje.f.setVisibility(8);
        } else if (jje.f.getVisibility() == 8 && zie.c()) {
            jje.f.setVisibility(0);
        }
        if (zie.a()) {
            jje.b.setEnabled(false);
            jje.c.setEnabled(false);
            jje.f.setEnabled(false);
            jje.n.setVisibility(0);
            return;
        }
        jje.b.setEnabled(true);
        jje.c.setEnabled(true);
        jje.f.setEnabled(true);
        jje.n.setVisibility(8);
    }

    private static void d(View... viewArr) {
        for (View view : viewArr) {
            view.setAlpha(0.4f);
        }
    }

    private void e(da2<yie> da2, View view, wie wie, View... viewArr) {
        this.p.set(true);
        Iterator it = ((AbstractList) Collections2.asList(view, viewArr)).iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            view2.animate().setListener(null);
            view2.clearAnimation();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.o;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        for (View view3 : viewArr) {
            view3.animate().alpha(0.4f).setDuration(300).start();
        }
        this.p.set(false);
        ViewPropertyAnimator listener = view.animate().alpha(1.0f).setDuration(300).setListener(new b(da2, wie));
        this.o = listener;
        listener.start();
    }

    @Override // defpackage.wme
    public void c() {
    }

    public /* synthetic */ void f(da2 da2, View view) {
        e(da2, this.b, wie.a(), this.c, this.f);
    }

    public /* synthetic */ void g(da2 da2, View view) {
        e(da2, this.c, wie.b(), this.b, this.f);
    }

    public /* synthetic */ void h(da2 da2, View view) {
        e(da2, this.f, wie.f(), this.b, this.c);
    }

    public /* synthetic */ void i(wie.b bVar) {
        d(this.b, this.f);
    }

    public /* synthetic */ void j(wie.a aVar) {
        d(this.c, this.f);
    }

    public /* synthetic */ void k(wie.d dVar) {
        d(this.c, this.b);
    }

    @Override // com.spotify.mobius.g
    public h<zie> t(da2<yie> da2) {
        this.b.setOnClickListener(new hje(this, da2));
        this.c.setOnClickListener(new gje(this, da2));
        this.f.setOnClickListener(new eje(this, da2));
        return new a();
    }
}

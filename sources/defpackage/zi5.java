package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.spotlets.tooltip.a;
import com.spotify.music.C0707R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.text.e;

/* renamed from: zi5  reason: default package */
public class zi5 {
    private final a a;
    private final bg5 b;
    private final bj5 c;
    private final hha d;

    public zi5(a aVar, bg5 bg5, bj5 bj5, hha hha) {
        this.a = aVar;
        this.b = bg5;
        this.c = bj5;
        this.d = hha;
    }

    public /* synthetic */ void a(View view) {
        this.b.a();
    }

    public /* synthetic */ void b(Runnable runnable) {
        this.d.e();
        if (runnable != null) {
            runnable.run();
        }
    }

    public /* synthetic */ void c(View view, WeakReference weakReference, uu1 uu1, Runnable runnable) {
        if (view.isShown()) {
            a.C0193a a2 = this.a.a((Activity) weakReference.get());
            a2.b(uu1);
            a2.c(view);
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public boolean d(List<Fragment> list) {
        boolean z;
        String X2;
        if (this.d.f() && this.d.c()) {
            h.e(list, "fragments");
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                T next = it.next();
                if (next.l3() && (X2 = next.X2()) != null && e.x(X2, "IN_APP_MESSAGING", false, 2, null)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    public void e(View view, WeakReference<Activity> weakReference, Runnable runnable, Runnable runnable2) {
        Context context = view.getContext();
        this.c.b();
        yi5 yi5 = new yi5(0, C0707R.string.home_tooltip_listening_history_title, C0707R.string.home_tooltip_listening_history_description, context, new wi5(this));
        yi5.d(new vi5(this, runnable));
        view.postDelayed(new ui5(this, view, weakReference, yi5, runnable2), 500);
    }
}

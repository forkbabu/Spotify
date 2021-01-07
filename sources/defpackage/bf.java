package defpackage;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.c;
import com.facebook.appevents.internal.d;
import com.facebook.k;
import java.lang.ref.WeakReference;

/* renamed from: bf  reason: default package */
public class bf {

    /* renamed from: bf$a */
    public static class a implements View.OnTouchListener {
        private EventBinding a;
        private WeakReference<View> b;
        private WeakReference<View> c;
        private View.OnTouchListener f;
        private boolean n = false;

        public a(EventBinding eventBinding, View view, View view2) {
            if (eventBinding != null && view != null && view2 != null) {
                this.f = c.g(view2);
                this.a = eventBinding;
                this.b = new WeakReference<>(view2);
                this.c = new WeakReference<>(view);
                this.n = true;
            }
        }

        public boolean a() {
            return this.n;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            EventBinding eventBinding;
            if (motionEvent.getAction() == 1 && (eventBinding = this.a) != null) {
                String b2 = eventBinding.b();
                Bundle f2 = ze.f(this.a, this.c.get(), this.b.get());
                if (f2.containsKey("_valueToSum")) {
                    f2.putDouble("_valueToSum", d.d(f2.getString("_valueToSum")));
                }
                f2.putString("_is_fb_codeless", "1");
                k.l().execute(new af(this, b2, f2));
            }
            View.OnTouchListener onTouchListener = this.f;
            if (onTouchListener == null || !onTouchListener.onTouch(view, motionEvent)) {
                return false;
            }
            return true;
        }
    }
}

package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.internal.d;
import com.facebook.k;
import java.lang.ref.WeakReference;

/* renamed from: ve  reason: default package */
public class ve {

    /* access modifiers changed from: package-private */
    /* renamed from: ve$a */
    public static class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Bundle b;

        a(String str, Bundle bundle) {
            this.a = str;
            this.b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    AppEventsLogger.g(k.d()).f(this.a, this.b);
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* renamed from: ve$b */
    public static class b implements View.OnClickListener {
        private EventBinding a;
        private WeakReference<View> b;
        private WeakReference<View> c;
        private View.OnClickListener f;
        private boolean n = false;

        b(EventBinding eventBinding, View view, View view2, a aVar) {
            if (eventBinding != null && view != null && view2 != null) {
                this.f = com.facebook.appevents.codeless.internal.c.f(view2);
                this.a = eventBinding;
                this.b = new WeakReference<>(view2);
                this.c = new WeakReference<>(view);
                this.n = true;
            }
        }

        public boolean a() {
            return this.n;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!uf.c(this)) {
                try {
                    View.OnClickListener onClickListener = this.f;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    if (this.c.get() != null && this.b.get() != null) {
                        ve.a(this.a, this.c.get(), this.b.get());
                    }
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* renamed from: ve$c */
    public static class c implements AdapterView.OnItemClickListener {
        private EventBinding a;
        private WeakReference<AdapterView> b;
        private WeakReference<View> c;
        private AdapterView.OnItemClickListener f;
        private boolean n = false;

        c(EventBinding eventBinding, View view, AdapterView adapterView, a aVar) {
            if (eventBinding != null && view != null && adapterView != null) {
                this.f = adapterView.getOnItemClickListener();
                this.a = eventBinding;
                this.b = new WeakReference<>(adapterView);
                this.c = new WeakReference<>(view);
                this.n = true;
            }
        }

        public boolean a() {
            return this.n;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            AdapterView.OnItemClickListener onItemClickListener = this.f;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i, j);
            }
            if (this.c.get() != null && this.b.get() != null) {
                ve.a(this.a, this.c.get(), this.b.get());
            }
        }
    }

    static /* synthetic */ void a(EventBinding eventBinding, View view, View view2) {
        if (!uf.c(ve.class)) {
            try {
                b(eventBinding, view, view2);
            } catch (Throwable th) {
                uf.b(th, ve.class);
            }
        }
    }

    private static void b(EventBinding eventBinding, View view, View view2) {
        if (!uf.c(ve.class)) {
            try {
                String b2 = eventBinding.b();
                Bundle f = ze.f(eventBinding, view, view2);
                if (f.containsKey("_valueToSum")) {
                    f.putDouble("_valueToSum", d.d(f.getString("_valueToSum")));
                }
                f.putString("_is_fb_codeless", "1");
                k.l().execute(new a(b2, f));
            } catch (Throwable th) {
                uf.b(th, ve.class);
            }
        }
    }
}

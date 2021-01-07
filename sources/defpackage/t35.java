package defpackage;

import androidx.fragment.app.Fragment;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.s0;
import com.spotify.pageloader.w0;
import kotlin.jvm.internal.h;

/* renamed from: t35  reason: default package */
public final class t35 {

    /* access modifiers changed from: package-private */
    /* renamed from: t35$a */
    public static final class a implements Runnable {
        final /* synthetic */ Fragment a;

        a(Fragment fragment) {
            this.a = fragment;
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.fragment.app.c B2 = this.a.B2();
            if (B2 != null) {
                B2.onBackPressed();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t35$b */
    public static final class b<I, O> implements sg0<r25, s0> {
        final /* synthetic */ s35 a;
        final /* synthetic */ Runnable b;

        b(s35 s35, Runnable runnable) {
            this.a = s35;
            this.b = runnable;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.sg0
        public s0 apply(r25 r25) {
            r25 r252 = r25;
            h.e(r252, "data");
            return this.a.b(r252, this.b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t35$c */
    public static final class c<T> implements tg0<w0> {
        final /* synthetic */ w0 a;

        c(w0 w0Var) {
            this.a = w0Var;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // defpackage.tg0
        public w0 get() {
            return this.a;
        }
    }

    public static final Runnable a(Fragment fragment) {
        h.e(fragment, "fragment");
        return new a(fragment);
    }

    public static final PageLoaderView.a<r25> b(zac zac, c.a aVar, ij9 ij9, s35 s35, Runnable runnable, w0 w0Var) {
        h.e(zac, "pageLoaderFactory");
        h.e(aVar, "viewUriProvider");
        h.e(ij9, "pageViewObservable");
        h.e(s35, "pageElementFactory");
        h.e(runnable, "backPressedRunnable");
        h.e(w0Var, "placeholderPageElement");
        PageLoaderView.a<r25> b2 = zac.b(aVar.getViewUri(), ij9);
        b2.e(new b(s35, runnable));
        b2.i(new c(w0Var));
        h.d(b2, "pageLoaderFactory\n      … placeholderPageElement }");
        return b2;
    }
}

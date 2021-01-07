package defpackage;

import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.s0;
import kotlin.jvm.internal.h;

/* renamed from: ct8  reason: default package */
public interface ct8 {
    public static final a a = a.a;

    /* renamed from: ct8$a */
    public static final class a {
        static final /* synthetic */ a a = new a();

        /* access modifiers changed from: package-private */
        /* renamed from: ct8$a$a  reason: collision with other inner class name */
        public static final class C0587a<I, O> implements sg0<b91, s0> {
            final /* synthetic */ tt8 a;

            C0587a(tt8 tt8) {
                this.a = tt8;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.sg0
            public s0 apply(b91 b91) {
                b91 b912 = b91;
                h.e(b912, "hubsViewModel");
                return this.a.b(b912);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ct8$a$b */
        public static final class b<T> implements tg0<s0> {
            public static final b a = new b();

            b() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // defpackage.tg0
            public s0 get() {
                return fbc.b(C0707R.string.topic_not_found_error_title, C0707R.string.topic_not_found_error_body);
            }
        }

        private a() {
        }

        public final PageLoaderView.a<b91> a(zac zac, c.a aVar, ij9 ij9, tt8 tt8) {
            h.e(zac, "factory");
            h.e(aVar, "viewUriProvider");
            h.e(ij9, "pageViewObservable");
            h.e(tt8, "pageElementFactory");
            PageLoaderView.a<b91> b2 = zac.b(aVar.getViewUri(), ij9);
            b2.e(new C0587a(tt8));
            b2.g(b.a);
            h.d(b2, "factory.createViewBuilde…      )\n                }");
            return b2;
        }
    }
}

package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import defpackage.ee2;
import io.reactivex.disposables.b;
import io.reactivex.functions.g;
import io.reactivex.z;
import java.util.UUID;
import kotlin.jvm.internal.h;

/* renamed from: he2  reason: default package */
public final class he2 implements de2 {
    private final io.reactivex.subjects.a<ee2> a;
    private final Activity b;
    private final fe2 c;

    /* renamed from: he2$a */
    static final class a<T> implements g<b> {
        final /* synthetic */ he2 a;
        final /* synthetic */ String b;

        a(he2 he2, String str) {
            this.a = he2;
            this.b = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(b bVar) {
            this.a.b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.b)));
        }
    }

    public he2(Activity activity, fe2 fe2) {
        h.e(activity, "activity");
        h.e(fe2, "alexaUriProvider");
        this.b = activity;
        this.c = fe2;
        io.reactivex.subjects.a<ee2> h1 = io.reactivex.subjects.a.h1();
        h.d(h1, "BehaviorSubject.create()");
        this.a = h1;
    }

    @Override // defpackage.de2
    public z<ee2> a() {
        String uuid = UUID.randomUUID().toString();
        h.d(uuid, "UUID.randomUUID().toString()");
        String a2 = this.c.a(uuid);
        z<ee2> B0 = this.a.Q(new ie2(uuid)).N0(1).B0();
        h.d(B0, "mSubject\n            .fi…         .singleOrError()");
        z<ee2> o = B0.o(new a(this, a2));
        h.d(o, "getFirstResultWithState(…ctivity(intent)\n        }");
        return o;
    }

    @Override // defpackage.de2
    public void b(ee2 ee2) {
        h.e(ee2, "resultAlexa");
        if (!(ee2 instanceof ee2.b)) {
            this.a.onNext(ee2);
        }
    }
}

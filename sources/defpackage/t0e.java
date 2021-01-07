package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.reactivex.s;
import io.reactivex.x;

/* renamed from: t0e  reason: default package */
public final class t0e extends s<Intent> {
    private final Context a;
    private final IntentFilter b;

    /* renamed from: t0e$a */
    private static final class a extends io.reactivex.android.a {
        private final x<? super Intent> b;
        private final Context c;
        private final IntentFilter f;
        private final BroadcastReceiver n;

        /* renamed from: t0e$a$a  reason: collision with other inner class name */
        class C0682a extends BroadcastReceiver {
            C0682a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                a.this.b.onNext(intent);
            }
        }

        public a(x<? super Intent> xVar, Context context, IntentFilter intentFilter) {
            this.b = xVar;
            this.c = context;
            this.f = intentFilter;
            C0682a aVar = new C0682a();
            this.n = aVar;
            context.registerReceiver(aVar, intentFilter);
        }

        /* access modifiers changed from: protected */
        @Override // io.reactivex.android.a
        public void a() {
            this.c.unregisterReceiver(this.n);
        }
    }

    t0e(Context context, IntentFilter intentFilter) {
        this.a = context;
        this.b = intentFilter;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super Intent> xVar) {
        xVar.onSubscribe(new a(xVar, this.a, this.b));
    }
}

package defpackage;

import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.rxjava2.q;
import io.reactivex.y;

/* renamed from: fn8  reason: default package */
public class fn8 implements kn8 {
    private final sl8 a;
    private final q b = new q();

    /* renamed from: fn8$a */
    class a extends m {
        a() {
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onStop() {
            fn8.this.b.c();
        }
    }

    public fn8(ho8 ho8, sm8 sm8, y yVar, sl8 sl8, k kVar) {
        this.a = sl8;
        kVar.y0(new a());
    }
}

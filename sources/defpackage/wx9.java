package defpackage;

import com.google.firebase.crashlytics.FirebaseCrashlytics;

/* renamed from: wx9  reason: default package */
public class wx9 extends uw9 {
    private final tf0 b;

    /* renamed from: wx9$a */
    class a implements qg0<String> {
        final /* synthetic */ FirebaseCrashlytics a;

        a(wx9 wx9, FirebaseCrashlytics firebaseCrashlytics) {
            this.a = firebaseCrashlytics;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.qg0
        public void accept(String str) {
            this.a.log(str);
        }
    }

    wx9(tf0 tf0) {
        this.b = tf0;
    }

    @Override // defpackage.uw9, defpackage.xw9
    public void b(FirebaseCrashlytics firebaseCrashlytics, boolean z) {
        if (!z) {
            this.b.f(new a(this, firebaseCrashlytics));
        }
    }
}

package defpackage;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.spotify.music.navigation.q;

/* renamed from: ix9  reason: default package */
public class ix9 extends uw9 {
    private final q b;

    public ix9(q qVar) {
        this.b = qVar;
    }

    @Override // defpackage.uw9, defpackage.xw9
    public void b(FirebaseCrashlytics firebaseCrashlytics, boolean z) {
        if (!z) {
            String j = this.b.j();
            firebaseCrashlytics.setCustomKey("fragment-stack", j.substring(Math.max(j.length() - 512, 0)));
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.offlinetrials.limited.introdialog.LimitedOfflineSlateDialogActivity;

/* renamed from: b9c  reason: default package */
public class b9c {
    public static final SpSharedPreferences.b<Object, Boolean> d = SpSharedPreferences.b.e("user_mix_intro:has_been_exposed");
    private final SpSharedPreferences<Object> a;
    private final Context b;
    private final r8c c;

    public b9c(Context context, r8c r8c, SpSharedPreferences<Object> spSharedPreferences) {
        this.b = context;
        this.c = r8c;
        this.a = spSharedPreferences;
    }

    public void a() {
        if (this.c.c()) {
            SpSharedPreferences<Object> spSharedPreferences = this.a;
            SpSharedPreferences.b<Object, Boolean> bVar = d;
            if (!spSharedPreferences.d(bVar, false)) {
                SpSharedPreferences.a<Object> b2 = this.a.b();
                b2.a(bVar, true);
                b2.i();
                Context context = this.b;
                int i = LimitedOfflineSlateDialogActivity.I;
                context.startActivity(new Intent(context, LimitedOfflineSlateDialogActivity.class));
            }
        }
    }
}

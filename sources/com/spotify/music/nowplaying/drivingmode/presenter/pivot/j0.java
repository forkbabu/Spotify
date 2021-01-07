package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.nowplaying.drivingmode.view.coachmark.b;

public class j0 implements b.a {
    public static final SpSharedPreferences.b<Object, Boolean> e = SpSharedPreferences.b.e("key_driving_mode_coach_mark_2");
    private final SpSharedPreferences<Object> a;
    private final InteractionLogger b;
    private boolean c;
    private b d;

    public j0(SpSharedPreferences<Object> spSharedPreferences, InteractionLogger interactionLogger) {
        this.a = spSharedPreferences;
        this.b = interactionLogger;
        this.c = spSharedPreferences.d(e, false);
    }

    public void a() {
        if (!this.c) {
            SpSharedPreferences.a<Object> b2 = this.a.b();
            b2.a(e, true);
            b2.i();
            this.c = true;
            this.d.b();
            this.b.a(null, "driving_mode_dismiss_coach_marks", 0, InteractionLogger.InteractionType.HIT, "dismiss_coach_marks");
        }
    }

    public void b(b bVar) {
        bVar.getClass();
        this.d = bVar;
        bVar.setListener(this);
        if (!this.c) {
            this.d.a();
        }
    }
}

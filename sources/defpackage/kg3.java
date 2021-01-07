package defpackage;

import com.google.common.base.Optional;
import com.spotify.eventsender.e0;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: kg3  reason: default package */
public class kg3 implements e0 {
    private static final SpSharedPreferences.b<Object, String> b = SpSharedPreferences.b.c("event-sender-event-owner");
    private final SpSharedPreferences<Object> a;

    public kg3(SpSharedPreferences<Object> spSharedPreferences) {
        this.a = spSharedPreferences;
    }

    @Override // com.spotify.eventsender.e0
    public Optional<String> a() {
        return Optional.fromNullable(this.a.m(b, null));
    }

    public void b(Optional<String> optional) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.f(b, optional.or((Optional<String>) ""));
        b2.i();
    }
}

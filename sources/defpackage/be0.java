package defpackage;

import com.spotify.music.spotlets.tracker.identifier.EventIdentifier;
import kotlin.jvm.internal.f;

/* renamed from: be0  reason: default package */
public abstract class be0 {
    private final EventIdentifier a;

    /* renamed from: be0$a */
    public static final class a extends be0 {
        public static final a b = new a();

        private a() {
            super(EventIdentifier.WELCOME_BACK_FACEBOOK_BUTTON_VISIBLE, null);
        }
    }

    public be0(EventIdentifier eventIdentifier, f fVar) {
        this.a = eventIdentifier;
    }

    public final EventIdentifier a() {
        return this.a;
    }
}

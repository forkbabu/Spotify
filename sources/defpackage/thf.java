package defpackage;

import com.spotify.remoteconfig.AndroidMusicLibsVoiceAssistantFlagsProperties;
import io.reactivex.internal.operators.observable.ObservableTimeout;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: thf  reason: default package */
public class thf {
    private final y a;
    private final j4a b;
    private final AndroidMusicLibsVoiceAssistantFlagsProperties c;

    thf(y yVar, j4a j4a, AndroidMusicLibsVoiceAssistantFlagsProperties androidMusicLibsVoiceAssistantFlagsProperties) {
        this.a = yVar;
        this.b = j4a;
        this.c = androidMusicLibsVoiceAssistantFlagsProperties;
    }

    private s<Boolean> a() {
        s<Boolean> b2 = this.b.b();
        s<Long> X0 = s.X0(10, TimeUnit.MILLISECONDS, this.a);
        shf shf = shf.a;
        b2.getClass();
        return new ObservableTimeout(b2, X0, shf, null).p0(this.b.b().G0(Boolean.FALSE));
    }

    public s<Boolean> b() {
        int ordinal = this.c.c().ordinal();
        if (ordinal == 0) {
            return s.i0(Boolean.FALSE);
        }
        if (ordinal == 1 || ordinal == 2) {
            return s.i0(Boolean.TRUE);
        }
        throw new IllegalStateException("Unsupported feature flag value");
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.c.d();
    }

    public s<Boolean> d() {
        int ordinal = this.c.a().ordinal();
        if (ordinal == 0) {
            return s.i0(Boolean.FALSE);
        }
        if (ordinal == 1) {
            return a();
        }
        if (ordinal == 2) {
            return s.i0(Boolean.TRUE);
        }
        throw new IllegalStateException("Unsupported feature flag value");
    }

    public boolean e() {
        int ordinal = this.c.b().ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1) {
            return a().d().booleanValue();
        }
        throw new IllegalStateException("Unsupported feature flag value");
    }

    public s<Boolean> f() {
        int ordinal = this.c.c().ordinal();
        if (ordinal == 0) {
            return s.i0(Boolean.FALSE);
        }
        if (ordinal == 1) {
            return a();
        }
        if (ordinal == 2) {
            return s.i0(Boolean.TRUE);
        }
        throw new IllegalStateException("Unsupported feature flag value");
    }
}

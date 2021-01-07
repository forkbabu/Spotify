package defpackage;

import com.spotify.inappmessaging.TriggerType;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;

/* renamed from: q18  reason: default package */
public class q18 {
    private final PublishSubject<u3<String, TriggerType>> a = PublishSubject.h1();
    private boolean b;

    /* access modifiers changed from: package-private */
    public s<u3<String, TriggerType>> a() {
        s<u3<String, TriggerType>> G0 = !this.b ? this.a.G0(new u3<>("spotify:home", TriggerType.URI)) : this.a;
        this.b = true;
        return G0;
    }

    public void b() {
        this.b = false;
    }

    public void c(String str, TriggerType triggerType) {
        this.a.onNext(new u3<>(str, triggerType));
    }
}

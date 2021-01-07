package defpackage;

import io.reactivex.s;
import io.reactivex.subjects.a;

/* renamed from: h4a  reason: default package */
public class h4a implements g4a {
    private final a<Boolean> a = a.h1();

    @Override // defpackage.g4a
    public void a(boolean z) {
        this.a.onNext(Boolean.valueOf(z));
    }

    @Override // defpackage.g4a
    public s<Boolean> b() {
        return this.a;
    }
}

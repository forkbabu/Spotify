package defpackage;

import com.spotify.libs.callingcode.json.CallingCode;
import io.reactivex.subjects.AsyncSubject;
import io.reactivex.z;
import java.util.List;

/* renamed from: wq0  reason: default package */
public class wq0 implements br0 {
    private final AsyncSubject<List<CallingCode>> a = AsyncSubject.h1();

    @Override // defpackage.br0
    public z<List<CallingCode>> a() {
        return this.a.B0();
    }

    @Override // defpackage.br0
    public /* synthetic */ z b() {
        return ar0.a(this);
    }

    public void c(List<CallingCode> list) {
        if (!this.a.i1()) {
            this.a.onNext(list);
            this.a.onComplete();
        }
    }
}

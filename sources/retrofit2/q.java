package retrofit2;

import java.lang.reflect.Array;

/* access modifiers changed from: package-private */
public class q extends r<Object> {
    final /* synthetic */ r a;

    q(r rVar) {
        this.a = rVar;
    }

    /* access modifiers changed from: package-private */
    @Override // retrofit2.r
    public void a(t tVar, Object obj) {
        if (obj != null) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                this.a.a(tVar, Array.get(obj, i));
            }
        }
    }
}

package retrofit2;

/* access modifiers changed from: package-private */
public class p extends r<Iterable<T>> {
    final /* synthetic */ r a;

    p(r rVar) {
        this.a = rVar;
    }

    /* access modifiers changed from: package-private */
    @Override // retrofit2.r
    public void a(t tVar, Object obj) {
        Iterable<Object> iterable = (Iterable) obj;
        if (iterable != null) {
            for (Object obj2 : iterable) {
                this.a.a(tVar, obj2);
            }
        }
    }
}

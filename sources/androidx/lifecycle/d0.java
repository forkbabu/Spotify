package androidx.lifecycle;

public class d0 {

    static class a implements v<X> {
        final /* synthetic */ s a;
        final /* synthetic */ d1 b;

        a(s sVar, d1 d1Var) {
            this.a = sVar;
            this.b = d1Var;
        }

        @Override // androidx.lifecycle.v
        public void a(X x) {
            this.a.n(this.b.apply(x));
        }
    }

    static class b implements v<X> {
        boolean a = true;
        final /* synthetic */ s b;

        b(s sVar) {
            this.b = sVar;
        }

        @Override // androidx.lifecycle.v
        public void a(X x) {
            Object e = this.b.e();
            if (this.a || ((e == null && x != null) || (e != null && !e.equals(x)))) {
                this.a = false;
                this.b.n(x);
            }
        }
    }

    public static <X> LiveData<X> a(LiveData<X> liveData) {
        s sVar = new s();
        sVar.o(liveData, new b(sVar));
        return sVar;
    }

    public static <X, Y> LiveData<Y> b(LiveData<X> liveData, d1<X, Y> d1Var) {
        s sVar = new s();
        sVar.o(liveData, new a(sVar, d1Var));
        return sVar;
    }
}

package retrofit2;

import okhttp3.e;
import okhttp3.e0;

abstract class l<ResponseT, ReturnT> extends x<ReturnT> {
    private final u a;
    private final e.a b;
    private final j<e0, ResponseT> c;

    /* access modifiers changed from: package-private */
    public static final class a<ResponseT, ReturnT> extends l<ResponseT, ReturnT> {
        private final c<ResponseT, ReturnT> d;

        a(u uVar, e.a aVar, j<e0, ResponseT> jVar, c<ResponseT, ReturnT> cVar) {
            super(uVar, aVar, jVar);
            this.d = cVar;
        }

        /* access modifiers changed from: protected */
        @Override // retrofit2.l
        public ReturnT c(b<ResponseT> bVar, Object[] objArr) {
            return this.d.b(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<ResponseT> extends l<ResponseT, Object> {
        private final c<ResponseT, b<ResponseT>> d;

        b(u uVar, e.a aVar, j<e0, ResponseT> jVar, c<ResponseT, b<ResponseT>> cVar, boolean z) {
            super(uVar, aVar, jVar);
            this.d = cVar;
        }

        /* access modifiers changed from: protected */
        @Override // retrofit2.l
        public Object c(b<ResponseT> bVar, Object[] objArr) {
            b<ResponseT> b = this.d.b(bVar);
            kotlin.coroutines.a aVar = (kotlin.coroutines.a) objArr[objArr.length - 1];
            try {
                return KotlinExtensions.a(b, aVar);
            } catch (Exception e) {
                return KotlinExtensions.c(e, aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<ResponseT> extends l<ResponseT, Object> {
        private final c<ResponseT, b<ResponseT>> d;

        c(u uVar, e.a aVar, j<e0, ResponseT> jVar, c<ResponseT, b<ResponseT>> cVar) {
            super(uVar, aVar, jVar);
            this.d = cVar;
        }

        /* access modifiers changed from: protected */
        @Override // retrofit2.l
        public Object c(b<ResponseT> bVar, Object[] objArr) {
            b<ResponseT> b = this.d.b(bVar);
            kotlin.coroutines.a aVar = (kotlin.coroutines.a) objArr[objArr.length - 1];
            try {
                return KotlinExtensions.b(b, aVar);
            } catch (Exception e) {
                return KotlinExtensions.c(e, aVar);
            }
        }
    }

    l(u uVar, e.a aVar, j<e0, ResponseT> jVar) {
        this.a = uVar;
        this.b = aVar;
        this.c = jVar;
    }

    /* access modifiers changed from: package-private */
    @Override // retrofit2.x
    public final ReturnT a(Object[] objArr) {
        return c(new n(this.a, objArr, this.b, this.c), objArr);
    }

    /* access modifiers changed from: protected */
    public abstract ReturnT c(b<ResponseT> bVar, Object[] objArr);
}

package retrofit2;

import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.h;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class KotlinExtensions {

    public static final class a implements d<T> {
        final /* synthetic */ CancellableContinuation a;

        a(CancellableContinuation cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // retrofit2.d
        public void a(b<T> bVar, Throwable th) {
            h.f(bVar, "call");
            h.f(th, "t");
            this.a.a(yif.m(th));
        }

        @Override // retrofit2.d
        public void b(b<T> bVar, v<T> vVar) {
            h.f(bVar, "call");
            h.f(vVar, "response");
            if (vVar.f()) {
                T a2 = vVar.a();
                if (a2 == null) {
                    Object j = bVar.i().j(m.class);
                    if (j != null) {
                        h.b(j, "call.request().tag(Invocation::class.java)!!");
                        Method a3 = ((m) j).a();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Response from ");
                        h.b(a3, "method");
                        Class<?> declaringClass = a3.getDeclaringClass();
                        h.b(declaringClass, "method.declaringClass");
                        sb.append(declaringClass.getName());
                        sb.append('.');
                        sb.append(a3.getName());
                        sb.append(" was null but response body type was declared as non-null");
                        this.a.a(yif.m(new KotlinNullPointerException(sb.toString())));
                        return;
                    }
                    h.j();
                    throw null;
                }
                this.a.a(a2);
                return;
            }
            this.a.a(yif.m(new HttpException(vVar)));
        }
    }

    public static final class b implements d<T> {
        final /* synthetic */ CancellableContinuation a;

        b(CancellableContinuation cancellableContinuation) {
            this.a = cancellableContinuation;
        }

        @Override // retrofit2.d
        public void a(b<T> bVar, Throwable th) {
            h.f(bVar, "call");
            h.f(th, "t");
            this.a.a(yif.m(th));
        }

        @Override // retrofit2.d
        public void b(b<T> bVar, v<T> vVar) {
            h.f(bVar, "call");
            h.f(vVar, "response");
            this.a.a(vVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {
        final /* synthetic */ kotlin.coroutines.a a;
        final /* synthetic */ Exception b;

        c(kotlin.coroutines.a aVar, Exception exc) {
            this.a = aVar;
            this.b = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            kotlin.coroutines.intrinsics.a.a(this.a).a(yif.m(this.b));
        }
    }

    public static final <T> Object a(b<T> bVar, kotlin.coroutines.a<? super T> aVar) {
        CancellableContinuation cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.a(aVar), 1);
        CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
        cancellableContinuation.invokeOnCancellation(new KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1(bVar));
        bVar.d0(new a(cancellableContinuation));
        Object result = cancellableContinuationImpl.getResult();
        if (result == CoroutineSingletons.a) {
            h.e(aVar, "frame");
        }
        return result;
    }

    public static final <T> Object b(b<T> bVar, kotlin.coroutines.a<? super v<T>> aVar) {
        CancellableContinuation cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.a(aVar), 1);
        CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
        cancellableContinuation.invokeOnCancellation(new KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1(bVar));
        bVar.d0(new b(cancellableContinuation));
        Object result = cancellableContinuationImpl.getResult();
        if (result == CoroutineSingletons.a) {
            h.e(aVar, "frame");
        }
        return result;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(java.lang.Exception r4, kotlin.coroutines.a<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r4 = r0.L$0
            java.lang.Exception r4 = (java.lang.Exception) r4
            boolean r4 = r5 instanceof kotlin.Result$Failure
            if (r4 != 0) goto L_0x002e
            kotlin.f r4 = kotlin.f.a
            return r4
        L_0x002e:
            kotlin.Result$Failure r5 = (kotlin.Result$Failure) r5
            java.lang.Throwable r4 = r5.exception
            throw r4
        L_0x0033:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003b:
            boolean r2 = r5 instanceof kotlin.Result$Failure
            if (r2 != 0) goto L_0x0059
            r0.L$0 = r4
            r0.label = r3
            kotlinx.coroutines.CoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getDefault()
            kotlin.coroutines.c r2 = r0.getContext()
            retrofit2.KotlinExtensions$c r3 = new retrofit2.KotlinExtensions$c
            r3.<init>(r0, r4)
            r5.dispatch(r2, r3)
            java.lang.String r4 = "frame"
            kotlin.jvm.internal.h.e(r0, r4)
            return r1
        L_0x0059:
            kotlin.Result$Failure r5 = (kotlin.Result$Failure) r5
            java.lang.Throwable r4 = r5.exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.c(java.lang.Exception, kotlin.coroutines.a):java.lang.Object");
    }
}

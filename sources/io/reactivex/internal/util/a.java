package io.reactivex.internal.util;

import io.reactivex.functions.n;
import io.reactivex.x;

public class a<T> {
    final Object[] a;
    Object[] b;
    int c;

    /* renamed from: io.reactivex.internal.util.a$a  reason: collision with other inner class name */
    public interface AbstractC0621a<T> extends n<T> {
        @Override // io.reactivex.functions.n
        boolean test(T t);
    }

    public a(int i) {
        Object[] objArr = new Object[(i + 1)];
        this.a = objArr;
        this.b = objArr;
    }

    public <U> boolean a(x<? super U> xVar) {
        Object[] objArr;
        Object[] objArr2 = this.a;
        while (true) {
            int i = 0;
            if (objArr2 == null) {
                return false;
            }
            while (i < 4 && (objArr = objArr2[i]) != null) {
                if (NotificationLite.h(objArr, xVar)) {
                    return true;
                }
                i++;
            }
            objArr2 = objArr2[4];
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0037 A[LOOP:1: B:4:0x0006->B:22:0x0037, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0036 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <U> boolean b(defpackage.upf<? super U> r7) {
        /*
            r6 = this;
            java.lang.Object[] r0 = r6.a
        L_0x0002:
            r1 = 0
            if (r0 == 0) goto L_0x003f
            r2 = 0
        L_0x0006:
            r3 = 4
            if (r2 >= r3) goto L_0x003a
            r4 = r0[r2]
            if (r4 != 0) goto L_0x000e
            goto L_0x003a
        L_0x000e:
            io.reactivex.internal.util.NotificationLite r3 = io.reactivex.internal.util.NotificationLite.COMPLETE
            r5 = 1
            if (r4 != r3) goto L_0x0017
            r7.onComplete()
            goto L_0x0022
        L_0x0017:
            boolean r3 = r4 instanceof io.reactivex.internal.util.NotificationLite.ErrorNotification
            if (r3 == 0) goto L_0x0024
            io.reactivex.internal.util.NotificationLite$ErrorNotification r4 = (io.reactivex.internal.util.NotificationLite.ErrorNotification) r4
            java.lang.Throwable r3 = r4.e
            r7.onError(r3)
        L_0x0022:
            r3 = 1
            goto L_0x0034
        L_0x0024:
            boolean r3 = r4 instanceof io.reactivex.internal.util.NotificationLite.SubscriptionNotification
            if (r3 == 0) goto L_0x0030
            io.reactivex.internal.util.NotificationLite$SubscriptionNotification r4 = (io.reactivex.internal.util.NotificationLite.SubscriptionNotification) r4
            vpf r3 = r4.upstream
            r7.onSubscribe(r3)
            goto L_0x0033
        L_0x0030:
            r7.onNext(r4)
        L_0x0033:
            r3 = 0
        L_0x0034:
            if (r3 == 0) goto L_0x0037
            return r5
        L_0x0037:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x003a:
            r0 = r0[r3]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L_0x0002
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.a.b(upf):boolean");
    }

    public void c(T t) {
        int i = this.c;
        if (i == 4) {
            Object[] objArr = new Object[5];
            this.b[4] = objArr;
            this.b = objArr;
            i = 0;
        }
        this.b[i] = t;
        this.c = i + 1;
    }

    public void d(AbstractC0621a<? super T> aVar) {
        Object obj;
        Object[] objArr = this.a;
        while (objArr != null) {
            int i = 0;
            while (i < 4 && (obj = objArr[i]) != null) {
                if (!aVar.test(obj)) {
                    i++;
                } else {
                    return;
                }
            }
            objArr = objArr[4];
        }
    }

    public void e(T t) {
        this.a[0] = t;
    }
}

package com.jakewharton.rxrelay2;

import com.jakewharton.rxrelay2.b;
import io.reactivex.functions.n;

/* access modifiers changed from: package-private */
public class a<T> {
    private final Object[] a;
    private Object[] b;
    private int c;

    /* renamed from: com.jakewharton.rxrelay2.a$a  reason: collision with other inner class name */
    public interface AbstractC0141a<T> extends n<T> {
    }

    a(int i) {
        Object[] objArr = new Object[(i + 1)];
        this.a = objArr;
        this.b = objArr;
    }

    /* access modifiers changed from: package-private */
    public void a(T t) {
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

    /* access modifiers changed from: package-private */
    public void b(AbstractC0141a<? super T> aVar) {
        Object[] objArr;
        Object[] objArr2 = this.a;
        while (objArr2 != null) {
            int i = 0;
            while (i < 4 && (objArr = objArr2[i]) != null) {
                b.a aVar2 = (b.a) aVar;
                if (!aVar2.p) {
                    aVar2.a.onNext(objArr);
                }
                i++;
            }
            objArr2 = objArr2[4];
        }
    }
}

package io.netty.handler.codec.http;

import io.netty.handler.codec.e;
import io.netty.handler.codec.http.e;
import io.netty.handler.codec.j;
import io.netty.util.c;
import io.netty.util.internal.r;
import io.netty.util.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class b extends e {

    /* access modifiers changed from: private */
    public static final class a extends e<CharSequence, CharSequence, a> {
        private AbstractC0604a<Object> q;

        /* access modifiers changed from: private */
        /* renamed from: io.netty.handler.codec.http.b$a$a  reason: collision with other inner class name */
        public interface AbstractC0604a<T> {
        }

        public a(k<CharSequence> kVar, j<CharSequence> jVar, e.d<CharSequence> dVar) {
            super(kVar, jVar, dVar);
        }

        /* Return type fixed from 'io.netty.handler.codec.g' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // io.netty.handler.codec.e
        public a c(CharSequence charSequence, CharSequence charSequence2) {
            CharSequence charSequence3 = charSequence;
            CharSequence b = r.b(charSequence2);
            CharSequence charSequence4 = (CharSequence) i(charSequence3);
            if (charSequence4 == null) {
                super.c(charSequence3, b);
            } else {
                StringBuilder sb = new StringBuilder(b.length() + charSequence4.length() + 1);
                sb.append(charSequence4);
                sb.append(',');
                sb.append(b);
                n(charSequence3, sb);
            }
            return this;
        }

        /* Return type fixed from 'io.netty.handler.codec.g' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Iterable] */
        @Override // io.netty.handler.codec.e
        public a o(CharSequence charSequence, Iterable iterable) {
            CharSequence charSequence2 = charSequence;
            if (this.q == null) {
                this.q = new a(this);
            }
            AbstractC0604a<Object> aVar = this.q;
            StringBuilder sb = iterable instanceof Collection ? new StringBuilder(((Collection) iterable).size() * 10) : new StringBuilder();
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    sb.append(((a) aVar).a(next));
                    sb.append(',');
                    next = it.next();
                }
                sb.append(((a) aVar).a(next));
            }
            n(charSequence2, sb);
            return this;
        }

        @Override // io.netty.handler.codec.e, io.netty.handler.codec.g
        public List r0(Object obj) {
            List r0 = super.r0((CharSequence) obj);
            if (r0.isEmpty()) {
                return r0;
            }
            LinkedList linkedList = (LinkedList) r0;
            if (linkedList.size() == 1) {
                return r.g((CharSequence) linkedList.get(0));
            }
            throw new IllegalStateException("CombinedHttpHeaders should only have one value");
        }

        /* Return type fixed from 'io.netty.handler.codec.g' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // io.netty.handler.codec.e
        public a t(CharSequence charSequence, Object obj) {
            CharSequence charSequence2 = charSequence;
            if (this.q == null) {
                this.q = new a(this);
            }
            AbstractC0604a<Object> aVar = this.q;
            Object[] objArr = {obj};
            StringBuilder sb = new StringBuilder(10);
            sb.append(((a) aVar).a(objArr[0]));
            n(charSequence2, sb);
            return this;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(boolean z) {
        super(new a(c.p, z ? e.d.b : e.c.a, z ? e.c : e.d.a));
    }
}

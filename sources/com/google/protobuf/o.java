package com.google.protobuf;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

public final class o {
    static final Charset a = Charset.forName(Constants.ENCODING);
    public static final byte[] b;

    public interface a extends i<Boolean> {
        void b0(boolean z);

        boolean o1(int i);

        a p(int i);
    }

    public interface b extends i<Double> {
    }

    public interface c {
        int getNumber();
    }

    public interface d<T extends c> {
    }

    public interface e extends i<Float> {
    }

    public interface f extends i<Integer> {
        int T1(int i);

        void i1(int i);
    }

    public static class g<F, T> extends AbstractList<T> {
        private final List<F> a;
        private final a<F, T> b;

        public interface a<F, T> {
            T convert(F f);
        }

        public g(List<F> list, a<F, T> aVar) {
            this.a = list;
            this.b = aVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return this.b.convert(this.a.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
        public int size() {
            return this.a.size();
        }
    }

    public interface h extends i<Long> {
    }

    public interface i<E> extends List<E>, RandomAccess {
        void C();

        boolean R0();

        @Override // com.google.protobuf.o.a
        i<E> p(int i);
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        g.d(bArr, 0, 0);
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}

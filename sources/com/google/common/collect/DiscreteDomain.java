package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;

public abstract class DiscreteDomain<C extends Comparable> {
    final boolean supportsFastOffset;

    /* access modifiers changed from: private */
    public static final class IntegerDomain extends DiscreteDomain<Integer> implements Serializable {
        private static final IntegerDomain INSTANCE = new IntegerDomain();
        private static final long serialVersionUID = 0;

        IntegerDomain() {
            super(true, null);
        }

        private Object readResolve() {
            return INSTANCE;
        }

        /* Return type fixed from 'java.lang.Comparable' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Comparable] */
        @Override // com.google.common.collect.DiscreteDomain
        public Integer next(Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue + 1);
        }

        /* Return type fixed from 'java.lang.Comparable' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Comparable] */
        @Override // com.google.common.collect.DiscreteDomain
        public Integer previous(Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue - 1);
        }

        @Override // java.lang.Object
        public String toString() {
            return "DiscreteDomain.integers()";
        }
    }

    protected DiscreteDomain() {
        this.supportsFastOffset = false;
    }

    public static DiscreteDomain<Integer> integers() {
        return IntegerDomain.INSTANCE;
    }

    public abstract C next(C c);

    public abstract C previous(C c);

    DiscreteDomain(boolean z, AnonymousClass1 r2) {
        this.supportsFastOffset = z;
    }
}

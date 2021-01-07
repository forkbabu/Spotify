package com.google.common.base;

/* access modifiers changed from: package-private */
public enum Predicates$ObjectPredicate implements Predicate<Object> {
    ALWAYS_TRUE {
        @Override // com.google.common.base.Predicate
        public boolean apply(Object obj) {
            return true;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return "Predicates.alwaysTrue()";
        }
    },
    ALWAYS_FALSE {
        @Override // com.google.common.base.Predicate
        public boolean apply(Object obj) {
            return false;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return "Predicates.alwaysFalse()";
        }
    },
    IS_NULL {
        @Override // com.google.common.base.Predicate
        public boolean apply(Object obj) {
            return obj == null;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return "Predicates.isNull()";
        }
    },
    NOT_NULL {
        @Override // com.google.common.base.Predicate
        public boolean apply(Object obj) {
            return obj != null;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return "Predicates.notNull()";
        }
    };

    Predicates$ObjectPredicate(Predicates$1 predicates$1) {
    }
}

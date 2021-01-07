package com.google.common.cache;

public enum RemovalCause {
    EXPLICIT {
        /* access modifiers changed from: package-private */
        @Override // com.google.common.cache.RemovalCause
        public boolean wasEvicted() {
            return false;
        }
    },
    REPLACED {
        /* access modifiers changed from: package-private */
        @Override // com.google.common.cache.RemovalCause
        public boolean wasEvicted() {
            return false;
        }
    },
    COLLECTED {
        /* access modifiers changed from: package-private */
        @Override // com.google.common.cache.RemovalCause
        public boolean wasEvicted() {
            return true;
        }
    },
    EXPIRED {
        /* access modifiers changed from: package-private */
        @Override // com.google.common.cache.RemovalCause
        public boolean wasEvicted() {
            return true;
        }
    },
    SIZE {
        /* access modifiers changed from: package-private */
        @Override // com.google.common.cache.RemovalCause
        public boolean wasEvicted() {
            return true;
        }
    };

    RemovalCause(AnonymousClass1 r3) {
    }

    /* access modifiers changed from: package-private */
    public abstract boolean wasEvicted();
}
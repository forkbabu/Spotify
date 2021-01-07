package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Map;

/* access modifiers changed from: package-private */
public enum Maps$EntryFunction implements Function<Map.Entry<?, ?>, Object> {
    KEY {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.common.base.Function
        public Object apply(Map.Entry<?, ?> entry) {
            return entry.getKey();
        }
    },
    VALUE {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.common.base.Function
        public Object apply(Map.Entry<?, ?> entry) {
            return entry.getValue();
        }
    };

    Maps$EntryFunction(Maps$1 maps$1) {
    }
}

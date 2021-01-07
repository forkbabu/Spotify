package com.google.android.gms.internal.cast;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class q7 extends r7<FieldDescriptorType, Object> {
    q7(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.cast.r7
    public final void k() {
        if (!a()) {
            for (int i = 0; i < l(); i++) {
                Map.Entry h = h(i);
                if (((o5) h.getKey()).p0()) {
                    h.setValue(Collections.unmodifiableList((List) h.getValue()));
                }
            }
            for (Map.Entry entry : m()) {
                if (((o5) entry.getKey()).p0()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.k();
    }
}

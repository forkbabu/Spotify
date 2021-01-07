package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class b6 extends c6<FieldDescriptorType, Object> {
    b6(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.measurement.c6
    public final void e() {
        if (!i()) {
            for (int i = 0; i < j(); i++) {
                Map.Entry h = h(i);
                if (((b4) h.getKey()).e()) {
                    h.setValue(Collections.unmodifiableList((List) h.getValue()));
                }
            }
            for (Map.Entry entry : m()) {
                if (((b4) entry.getKey()).e()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.e();
    }
}

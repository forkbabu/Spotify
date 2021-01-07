package com.google.protobuf;

import com.google.protobuf.l;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class z extends a0<FieldDescriptorType, Object> {
    z(int i) {
        super(i, null);
    }

    @Override // com.google.protobuf.a0
    public void m() {
        if (!l()) {
            for (int i = 0; i < i(); i++) {
                Map.Entry h = h(i);
                if (((l.a) h.getKey()).Z()) {
                    h.setValue(Collections.unmodifiableList((List) h.getValue()));
                }
            }
            for (Map.Entry entry : j()) {
                if (((l.a) entry.getKey()).Z()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.m();
    }

    @Override // com.google.protobuf.a0, java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((l.a) obj, obj2);
    }
}

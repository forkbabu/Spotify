package com.google.android.gms.internal.recaptcha;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class t1 extends u1<FieldDescriptorType, Object> {
    t1(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.recaptcha.u1
    public final void e() {
        if (!i()) {
            for (int i = 0; i < j(); i++) {
                Map.Entry h = h(i);
                if (((e0) h.getKey()).e()) {
                    h.setValue(Collections.unmodifiableList((List) h.getValue()));
                }
            }
            for (Map.Entry entry : m()) {
                if (((e0) entry.getKey()).e()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.e();
    }
}

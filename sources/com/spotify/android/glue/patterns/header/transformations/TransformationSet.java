package com.spotify.android.glue.patterns.header.transformations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TransformationSet implements b {
    public static final TransformationSet c = new TransformationSet(ExecutionOrder.INDEPENDENT, Collections.emptyList());
    ExecutionOrder a;
    List<b> b;

    /* access modifiers changed from: package-private */
    public enum ExecutionOrder {
        SEQUENTIAL {
            /* access modifiers changed from: package-private */
            @Override // com.spotify.android.glue.patterns.header.transformations.TransformationSet.ExecutionOrder
            public float d(List<b> list, float f) {
                for (b bVar : list) {
                    f = bVar.a(f);
                }
                return f;
            }
        },
        INDEPENDENT {
            /* access modifiers changed from: package-private */
            @Override // com.spotify.android.glue.patterns.header.transformations.TransformationSet.ExecutionOrder
            public float d(List<b> list, float f) {
                for (b bVar : list) {
                    bVar.a(f);
                }
                return f;
            }
        };

        ExecutionOrder(a aVar) {
        }

        /* access modifiers changed from: package-private */
        public abstract float d(List<b> list, float f);
    }

    TransformationSet() {
        this.b = new ArrayList();
    }

    @Override // com.spotify.android.glue.patterns.header.transformations.b
    public float a(float f) {
        return this.a.d(this.b, f);
    }

    private TransformationSet(ExecutionOrder executionOrder, List<b> list) {
        this.a = executionOrder;
        this.b = list;
    }
}

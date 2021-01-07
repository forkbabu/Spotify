package com.spotify.android.glue.patterns.header.transformations;

import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a {

    /* access modifiers changed from: private */
    /* renamed from: com.spotify.android.glue.patterns.header.transformations.a$a  reason: collision with other inner class name */
    public static class C0148a implements g {
        private final View a;
        private final List<Property<View, Float>> b;

        public C0148a(View view, List<Property<View, Float>> list) {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            this.a = view;
            arrayList.addAll(list);
        }

        @Override // com.spotify.android.glue.patterns.header.transformations.g
        public void a(float f) {
            for (Property<View, Float> property : this.b) {
                property.set(this.a, Float.valueOf(f));
            }
        }
    }

    public static g a(View view, List<Property<View, Float>> list) {
        return new C0148a(view, list);
    }

    public static g b(View view, Property<View, Float> property) {
        return new C0148a(view, Collections.singletonList(property));
    }
}

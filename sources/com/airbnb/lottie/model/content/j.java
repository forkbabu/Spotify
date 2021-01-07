package com.airbnb.lottie.model.content;

import com.airbnb.lottie.f;
import com.airbnb.lottie.model.layer.b;
import java.util.Arrays;
import java.util.List;

public class j implements b {
    private final String a;
    private final List<b> b;
    private final boolean c;

    public j(String str, List<b> list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // com.airbnb.lottie.model.content.b
    public sa a(f fVar, b bVar) {
        return new ta(fVar, bVar, this);
    }

    public List<b> b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.c;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ShapeGroup{name='");
        V0.append(this.a);
        V0.append("' Shapes: ");
        V0.append(Arrays.toString(this.b.toArray()));
        V0.append('}');
        return V0.toString();
    }
}

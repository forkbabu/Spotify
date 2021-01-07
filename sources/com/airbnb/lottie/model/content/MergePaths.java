package com.airbnb.lottie.model.content;

import com.airbnb.lottie.f;
import com.airbnb.lottie.model.layer.b;

public class MergePaths implements b {
    private final String a;
    private final MergePathsMode b;
    private final boolean c;

    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z) {
        this.a = str;
        this.b = mergePathsMode;
        this.c = z;
    }

    @Override // com.airbnb.lottie.model.content.b
    public sa a(f fVar, b bVar) {
        if (fVar.j()) {
            return new bb(this);
        }
        ae.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public MergePathsMode b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public String toString() {
        StringBuilder V0 = je.V0("MergePaths{mode=");
        V0.append(this.b);
        V0.append('}');
        return V0.toString();
    }
}

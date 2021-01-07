package defpackage;

import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* access modifiers changed from: package-private */
/* renamed from: jd  reason: default package */
public class jd {
    private static final JsonReader.a a = JsonReader.a.a("nm", "mm", "hd");

    static MergePaths a(JsonReader jsonReader) {
        String str = null;
        MergePaths.MergePathsMode mergePathsMode = null;
        boolean z = false;
        while (jsonReader.h()) {
            int w = jsonReader.w(a);
            if (w == 0) {
                str = jsonReader.q();
            } else if (w == 1) {
                int m = jsonReader.m();
                MergePaths.MergePathsMode mergePathsMode2 = MergePaths.MergePathsMode.MERGE;
                if (m != 1) {
                    if (m == 2) {
                        mergePathsMode = MergePaths.MergePathsMode.ADD;
                    } else if (m == 3) {
                        mergePathsMode = MergePaths.MergePathsMode.SUBTRACT;
                    } else if (m == 4) {
                        mergePathsMode = MergePaths.MergePathsMode.INTERSECT;
                    } else if (m == 5) {
                        mergePathsMode = MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS;
                    }
                }
                mergePathsMode = mergePathsMode2;
            } else if (w != 2) {
                jsonReader.B();
                jsonReader.C();
            } else {
                z = jsonReader.i();
            }
        }
        return new MergePaths(str, mergePathsMode, z);
    }
}

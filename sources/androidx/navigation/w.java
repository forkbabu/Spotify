package androidx.navigation;

import androidx.navigation.v;
import java.util.HashMap;
import java.util.Map;

public class w {
    private static final HashMap<Class<?>, String> b = new HashMap<>();
    private final HashMap<String, v<? extends m>> a = new HashMap<>();

    static String b(Class<? extends v> cls) {
        HashMap<Class<?>, String> hashMap = b;
        String str = hashMap.get(cls);
        if (str == null) {
            v.b bVar = (v.b) cls.getAnnotation(v.b.class);
            str = bVar != null ? bVar.value() : null;
            if (e(str)) {
                hashMap.put(cls, str);
            } else {
                StringBuilder V0 = je.V0("No @Navigator.Name annotation found for ");
                V0.append(cls.getSimpleName());
                throw new IllegalArgumentException(V0.toString());
            }
        }
        return str;
    }

    private static boolean e(String str) {
        return str != null && !str.isEmpty();
    }

    public final v<? extends m> a(v<? extends m> vVar) {
        String b2 = b(vVar.getClass());
        if (e(b2)) {
            return this.a.put(b2, vVar);
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public <T extends v<?>> T c(String str) {
        if (e(str)) {
            v<? extends m> vVar = this.a.get(str);
            if (vVar != null) {
                return vVar;
            }
            throw new IllegalStateException(je.y0("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    /* access modifiers changed from: package-private */
    public Map<String, v<? extends m>> d() {
        return this.a;
    }
}

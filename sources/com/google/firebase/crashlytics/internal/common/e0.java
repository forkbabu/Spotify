package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.IOException;

/* access modifiers changed from: package-private */
public class e0 {
    private final String a;
    private final f00 b;

    public e0(String str, f00 f00) {
        this.a = str;
        this.b = f00;
    }

    private File b() {
        return new File(this.b.a(), this.a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e) {
            ty f = ty.f();
            StringBuilder V0 = je.V0("Error creating marker: ");
            V0.append(this.a);
            f.e(V0.toString(), e);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}

package defpackage;

import com.google.firebase.crashlytics.internal.report.model.Report;
import com.google.firebase.crashlytics.internal.report.model.b;
import com.google.firebase.crashlytics.internal.report.model.c;
import defpackage.h00;
import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: g00  reason: default package */
public class g00 {
    private final h00.c a;

    public g00(h00.c cVar) {
        this.a = cVar;
    }

    public boolean a() {
        File[] b = this.a.b();
        File[] a2 = this.a.a();
        if ((b == null || b.length <= 0) && a2.length <= 0) {
            return false;
        }
        return true;
    }

    public List<Report> b() {
        ty.f().b("Checking for crash reports...");
        File[] b = this.a.b();
        File[] a2 = this.a.a();
        LinkedList linkedList = new LinkedList();
        if (b != null) {
            for (File file : b) {
                ty f = ty.f();
                StringBuilder V0 = je.V0("Found crash report ");
                V0.append(file.getPath());
                f.b(V0.toString());
                linkedList.add(new c(file, Collections.emptyMap()));
            }
        }
        for (File file2 : a2) {
            linkedList.add(new b(file2));
        }
        if (linkedList.isEmpty()) {
            ty.f().b("No reports found.");
        }
        return linkedList;
    }
}

package com.google.firebase.crashlytics.internal.report.model;

import com.google.firebase.crashlytics.internal.report.model.Report;
import java.io.File;
import java.util.Map;

public class b implements Report {
    private final File a;

    public b(File file) {
        this.a = file;
    }

    @Override // com.google.firebase.crashlytics.internal.report.model.Report
    public Map<String, String> a() {
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.report.model.Report
    public String b() {
        return this.a.getName();
    }

    @Override // com.google.firebase.crashlytics.internal.report.model.Report
    public String c() {
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.report.model.Report
    public File d() {
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.report.model.Report
    public File[] e() {
        return this.a.listFiles();
    }

    @Override // com.google.firebase.crashlytics.internal.report.model.Report
    public Report.Type getType() {
        return Report.Type.NATIVE;
    }

    @Override // com.google.firebase.crashlytics.internal.report.model.Report
    public void remove() {
        File[] e = e();
        for (File file : e) {
            ty f = ty.f();
            StringBuilder V0 = je.V0("Removing native report file at ");
            V0.append(file.getPath());
            f.b(V0.toString());
            file.delete();
        }
        ty f2 = ty.f();
        StringBuilder V02 = je.V0("Removing native report directory at ");
        V02.append(this.a);
        f2.b(V02.toString());
        this.a.delete();
    }
}

package com.google.firebase.crashlytics.internal.report.model;

import com.google.firebase.crashlytics.internal.report.model.Report;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class c implements Report {
    private final File a;
    private final File[] b;
    private final Map<String, String> c;

    public c(File file, Map<String, String> map) {
        this.a = file;
        this.b = new File[]{file};
        this.c = new HashMap(map);
    }

    @Override // com.google.firebase.crashlytics.internal.report.model.Report
    public Map<String, String> a() {
        return Collections.unmodifiableMap(this.c);
    }

    @Override // com.google.firebase.crashlytics.internal.report.model.Report
    public String b() {
        String c2 = c();
        return c2.substring(0, c2.lastIndexOf(46));
    }

    @Override // com.google.firebase.crashlytics.internal.report.model.Report
    public String c() {
        return this.a.getName();
    }

    @Override // com.google.firebase.crashlytics.internal.report.model.Report
    public File d() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.report.model.Report
    public File[] e() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.report.model.Report
    public Report.Type getType() {
        return Report.Type.JAVA;
    }

    @Override // com.google.firebase.crashlytics.internal.report.model.Report
    public void remove() {
        ty f = ty.f();
        StringBuilder V0 = je.V0("Removing report at ");
        V0.append(this.a.getPath());
        f.b(V0.toString());
        this.a.delete();
    }
}

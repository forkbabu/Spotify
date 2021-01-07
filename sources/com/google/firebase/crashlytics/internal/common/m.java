package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.h0;
import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import com.google.firebase.crashlytics.internal.report.model.Report;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import defpackage.h00;
import defpackage.hz;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
public class m {
    static final FilenameFilter A = l.a();
    static final FilenameFilter B = new f();
    static final Comparator<File> C = new g();
    static final Comparator<File> D = new h();
    private static final Pattern E = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final Map<String, String> F = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    private static final String[] G = {"SessionUser", "SessionApp", "SessionOS", "SessionDevice"};
    static final FilenameFilter z = new e("BeginSession");
    private final AtomicInteger a = new AtomicInteger(0);
    private final Context b;
    private final i0 c;
    private final e0 d;
    private final x0 e;
    private final h f;
    private final com.google.firebase.crashlytics.internal.network.b g;
    private final n0 h;
    private final f00 i;
    private final b j;
    private final h00.b k;
    private final p l;
    private final hz m;
    private final g00 n;
    private final h00.a o;
    private final sy p;
    private final e10 q;
    private final String r;
    private final xy s;
    private final v0 t;
    private h0 u;
    com.google.android.gms.tasks.h<Boolean> v = new com.google.android.gms.tasks.h<>();
    com.google.android.gms.tasks.h<Boolean> w = new com.google.android.gms.tasks.h<>();
    com.google.android.gms.tasks.h<Void> x = new com.google.android.gms.tasks.h<>();
    AtomicBoolean y = new AtomicBoolean(false);

    /* access modifiers changed from: package-private */
    public class a implements Callable<Void> {
        final /* synthetic */ long a;
        final /* synthetic */ String b;

        a(long j, String str) {
            this.a = j;
            this.b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public Void call() {
            if (m.this.N()) {
                return null;
            }
            m.this.m.f(this.a, this.b);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        final /* synthetic */ Date a;
        final /* synthetic */ Throwable b;
        final /* synthetic */ Thread c;

        b(Date date, Throwable th, Thread thread) {
            this.a = date;
            this.b = th;
            this.c = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!m.this.N()) {
                long time = this.a.getTime() / 1000;
                m.this.t.h(this.b, this.c, time);
                m.l(m.this, this.c, this.b, time);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = m.this;
            mVar.A(mVar.R(new o()));
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements FilenameFilter {
        final /* synthetic */ Set a;

        d(m mVar, Set set) {
            this.a = set;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            if (str.length() < 35) {
                return false;
            }
            return this.a.contains(str.substring(0, 35));
        }
    }

    /* access modifiers changed from: package-private */
    public class e extends n {
        e(String str) {
            super(str);
        }

        @Override // com.google.firebase.crashlytics.internal.common.m.n, java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return super.accept(file, str) && str.endsWith(".cls");
        }
    }

    class f implements FilenameFilter {
        f() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.length() == 39 && str.endsWith(".cls");
        }
    }

    class g implements Comparator<File> {
        g() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }
    }

    class h implements Comparator<File> {
        h() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    }

    /* access modifiers changed from: package-private */
    public class i implements h0.a {
        i() {
        }
    }

    class j implements Callable<com.google.android.gms.tasks.g<Void>> {
        final /* synthetic */ Date a;
        final /* synthetic */ Throwable b;
        final /* synthetic */ Thread c;
        final /* synthetic */ com.google.firebase.crashlytics.internal.settings.d f;

        j(Date date, Throwable th, Thread thread, com.google.firebase.crashlytics.internal.settings.d dVar) {
            this.a = date;
            this.b = th;
            this.c = thread;
            this.f = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public com.google.android.gms.tasks.g<Void> call() {
            m.this.d.a();
            long time = this.a.getTime() / 1000;
            m.this.t.g(this.b, this.c, time);
            m.s(m.this, this.c, this.b, time);
            m.this.X(this.a.getTime());
            t00 l = ((com.google.firebase.crashlytics.internal.settings.c) this.f).l();
            int i = l.b().a;
            l.b().getClass();
            m.this.B(i);
            m.u(m.this);
            m mVar = m.this;
            File J = mVar.J();
            File H = mVar.H();
            Comparator<File> comparator = m.D;
            int e = 4 - z0.e(J, H, 4, comparator);
            z0.c(mVar.I(), m.B, e - z0.b(mVar.K(), e, comparator), comparator);
            if (!m.this.c.c()) {
                return com.google.android.gms.tasks.j.e(null);
            }
            Executor c2 = m.this.f.c();
            return ((com.google.firebase.crashlytics.internal.settings.c) this.f).j().t(c2, new w(this, c2));
        }
    }

    /* access modifiers changed from: package-private */
    public class k implements com.google.android.gms.tasks.f<Boolean, Void> {
        final /* synthetic */ com.google.android.gms.tasks.g a;
        final /* synthetic */ float b;

        k(com.google.android.gms.tasks.g gVar, float f) {
            this.a = gVar;
            this.b = f;
        }

        /* Return type fixed from 'com.google.android.gms.tasks.g' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.android.gms.tasks.f
        public com.google.android.gms.tasks.g<Void> a(Boolean bool) {
            return m.this.f.e(new z(this, bool));
        }
    }

    /* access modifiers changed from: private */
    public static class l implements FilenameFilter {
        l(e eVar) {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return !m.B.accept(file, str) && m.E.matcher(str).matches();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.firebase.crashlytics.internal.common.m$m  reason: collision with other inner class name */
    public interface AbstractC0115m {
        void a(CodedOutputStream codedOutputStream);
    }

    /* access modifiers changed from: package-private */
    public static class n implements FilenameFilter {
        private final String a;

        public n(String str) {
            this.a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.contains(this.a) && !str.endsWith(".cls_temp");
        }
    }

    static class o implements FilenameFilter {
        o() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return com.google.firebase.crashlytics.internal.proto.b.f.accept(file, str) || str.contains("SessionMissingBinaryImages");
        }
    }

    /* access modifiers changed from: private */
    public static final class p implements hz.b {
        private final f00 a;

        public p(f00 f00) {
            this.a = f00;
        }

        @Override // defpackage.hz.b
        public File a() {
            File file = new File(this.a.a(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    private final class q implements h00.c {
        q(e eVar) {
        }

        @Override // defpackage.h00.c
        public File[] a() {
            File[] listFiles = m.this.J().listFiles();
            return listFiles == null ? new File[0] : listFiles;
        }

        @Override // defpackage.h00.c
        public File[] b() {
            return m.this.P();
        }
    }

    private final class r implements h00.a {
        r(e eVar) {
        }

        @Override // defpackage.h00.a
        public boolean a() {
            return m.this.N();
        }
    }

    private static final class s implements Runnable {
        private final Context a;
        private final Report b;
        private final h00 c;
        private final boolean f;

        public s(Context context, Report report, h00 h00, boolean z) {
            this.a = context;
            this.b = report;
            this.c = h00;
            this.f = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CommonUtils.b(this.a)) {
                ty.f().b("Attempting to send crash report at time of crash...");
                this.c.d(this.b, this.f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class t implements FilenameFilter {
        private final String a;

        public t(String str) {
            this.a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            if (!str.equals(this.a + ".cls") && str.contains(this.a) && !str.endsWith(".cls_temp")) {
                return true;
            }
            return false;
        }
    }

    m(Context context, h hVar, com.google.firebase.crashlytics.internal.network.b bVar, n0 n0Var, i0 i0Var, f00 f00, e0 e0Var, b bVar2, g00 g00, h00.b bVar3, sy syVar, g10 g10, xy xyVar, com.google.firebase.crashlytics.internal.settings.d dVar) {
        this.b = context;
        this.f = hVar;
        this.g = bVar;
        this.h = n0Var;
        this.c = i0Var;
        this.i = f00;
        this.d = e0Var;
        this.j = bVar2;
        this.k = new a0(this);
        this.p = syVar;
        this.r = g10.a();
        this.s = xyVar;
        x0 x0Var = new x0();
        this.e = x0Var;
        p pVar = new p(f00);
        this.l = pVar;
        hz hzVar = new hz(context, pVar);
        this.m = hzVar;
        this.n = new g00(new q(null));
        this.o = new r(null);
        b10 b10 = new b10(1024, new d10(10));
        this.q = b10;
        this.t = new v0(new f0(context, n0Var, bVar2, b10), new e00(new File(f00.b()), dVar), o00.a(context), hzVar, x0Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:96:0x03d7 A[LOOP:3: B:95:0x03d5->B:96:0x03d7, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void C(int r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 1014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.m.C(int, boolean):void");
    }

    /* access modifiers changed from: private */
    public String F() {
        File[] S = S();
        if (S.length > 0) {
            return L(S[0]);
        }
        return null;
    }

    private static long G() {
        return new Date().getTime() / 1000;
    }

    static String L(File file) {
        return file.getName().substring(0, 35);
    }

    private File[] Q(File file, FilenameFilter filenameFilter) {
        File[] listFiles = file.listFiles(filenameFilter);
        return listFiles == null ? new File[0] : listFiles;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private File[] R(FilenameFilter filenameFilter) {
        File[] listFiles = I().listFiles(filenameFilter);
        return listFiles == null ? new File[0] : listFiles;
    }

    private File[] S() {
        File[] R = R(z);
        Arrays.sort(R, C);
        return R;
    }

    private void W(String str, int i2) {
        z0.c(I(), new n(je.x0(str, "SessionEvent")), i2, D);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void X(long j2) {
        try {
            File I = I();
            new File(I, ".ae" + j2).createNewFile();
        } catch (IOException unused) {
            ty.f().b("Could not write app exception marker.");
        }
    }

    private void Y(CodedOutputStream codedOutputStream, String str) {
        String[] strArr = G;
        for (String str2 : strArr) {
            File[] R = R(new n(je.y0(str, str2, ".cls")));
            if (R.length == 0) {
                ty.f().b("Can't find " + str2 + " data for session ID " + str);
            } else {
                ty.f().b("Collecting " + str2 + " data for session ID " + str);
                d0(codedOutputStream, R[0]);
            }
        }
    }

    private static void Z(CodedOutputStream codedOutputStream, File[] fileArr, String str) {
        Arrays.sort(fileArr, CommonUtils.c);
        for (File file : fileArr) {
            try {
                ty.f().b(String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", str, file.getName()));
                d0(codedOutputStream, file);
            } catch (Exception e2) {
                ty.f().e("Error writting non-fatal to session.", e2);
            }
        }
    }

    private void b0(CodedOutputStream codedOutputStream, Thread thread, Throwable th, long j2, String str, boolean z2) {
        Thread[] threadArr;
        TreeMap treeMap;
        Map<String, String> map;
        f10 f10 = new f10(th, this.q);
        Context context = this.b;
        e a2 = e.a(context);
        Float b2 = a2.b();
        int c2 = a2.c();
        boolean m2 = CommonUtils.m(context);
        int i2 = context.getResources().getConfiguration().orientation;
        long p2 = CommonUtils.p();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j3 = p2 - memoryInfo.availMem;
        long a3 = CommonUtils.a(Environment.getDataDirectory().getPath());
        ActivityManager.RunningAppProcessInfo i3 = CommonUtils.i(context.getPackageName(), context);
        LinkedList linkedList = new LinkedList();
        StackTraceElement[] stackTraceElementArr = f10.c;
        String str2 = this.j.b;
        String b3 = this.h.b();
        int i4 = 0;
        if (z2) {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            Thread[] threadArr2 = new Thread[allStackTraces.size()];
            for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                threadArr2[i4] = entry.getKey();
                linkedList.add(this.q.a(entry.getValue()));
                i4++;
            }
            threadArr = threadArr2;
        } else {
            threadArr = new Thread[0];
        }
        if (!CommonUtils.j(context, "com.crashlytics.CollectCustomKeys", true)) {
            map = new TreeMap<>();
        } else {
            map = this.e.a();
            if (map != null && map.size() > 1) {
                treeMap = new TreeMap(map);
                com.google.firebase.crashlytics.internal.proto.c.p(codedOutputStream, j2, str, f10, thread, stackTraceElementArr, threadArr, linkedList, 8, treeMap, this.m.c(), i3, i2, b3, str2, b2, c2, m2, j3, a3);
                this.m.a();
            }
        }
        treeMap = map;
        com.google.firebase.crashlytics.internal.proto.c.p(codedOutputStream, j2, str, f10, thread, stackTraceElementArr, threadArr, linkedList, 8, treeMap, this.m.c(), i3, i2, b3, str2, b2, c2, m2, j3, a3);
        this.m.a();
    }

    static void c(m mVar, q00 q00, boolean z2) {
        Context context = mVar.b;
        h00 a2 = ((a0) mVar.k).a(q00);
        File[] P = mVar.P();
        for (File file : P) {
            w(q00.e, file);
            com.google.firebase.crashlytics.internal.report.model.c cVar = new com.google.firebase.crashlytics.internal.report.model.c(file, F);
            h hVar = mVar.f;
            hVar.d(new i(hVar, new s(context, cVar, a2, z2)));
        }
    }

    private void c0(String str, String str2, AbstractC0115m mVar) {
        Throwable th;
        com.google.firebase.crashlytics.internal.proto.b bVar;
        CodedOutputStream i2;
        CodedOutputStream codedOutputStream = null;
        try {
            bVar = new com.google.firebase.crashlytics.internal.proto.b(I(), str + str2);
            try {
                i2 = CodedOutputStream.i(bVar);
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.h(codedOutputStream, "Failed to flush to session " + str2 + " file.");
                CommonUtils.c(bVar, "Failed to close session " + str2 + " file.");
                throw th;
            }
            try {
                mVar.a(i2);
                CommonUtils.h(i2, "Failed to flush to session " + str2 + " file.");
                CommonUtils.c(bVar, "Failed to close session " + str2 + " file.");
            } catch (Throwable th3) {
                th = th3;
                codedOutputStream = i2;
                CommonUtils.h(codedOutputStream, "Failed to flush to session " + str2 + " file.");
                CommonUtils.c(bVar, "Failed to close session " + str2 + " file.");
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            bVar = null;
            CommonUtils.h(codedOutputStream, "Failed to flush to session " + str2 + " file.");
            CommonUtils.c(bVar, "Failed to close session " + str2 + " file.");
            throw th;
        }
    }

    static com.google.android.gms.tasks.g d(m mVar) {
        boolean z2;
        com.google.android.gms.tasks.g gVar;
        mVar.getClass();
        ArrayList arrayList = new ArrayList();
        File[] R = mVar.R(A);
        for (File file : R) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    z2 = true;
                } catch (ClassNotFoundException unused) {
                    z2 = false;
                }
                if (z2) {
                    ty.f().b("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
                    gVar = com.google.android.gms.tasks.j.e(null);
                } else {
                    gVar = com.google.android.gms.tasks.j.c(new ScheduledThreadPoolExecutor(1), new v(mVar, parseLong));
                }
                arrayList.add(gVar);
            } catch (NumberFormatException unused2) {
                ty f2 = ty.f();
                StringBuilder V0 = je.V0("Could not parse timestamp from file ");
                V0.append(file.getName());
                f2.b(V0.toString());
            }
            file.delete();
        }
        return com.google.android.gms.tasks.j.f(arrayList);
    }

    private static void d0(CodedOutputStream codedOutputStream, File file) {
        Throwable th;
        if (!file.exists()) {
            ty f2 = ty.f();
            StringBuilder V0 = je.V0("Tried to include a file that doesn't exist: ");
            V0.append(file.getName());
            f2.d(V0.toString());
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                int length = (int) file.length();
                byte[] bArr = new byte[length];
                int i2 = 0;
                while (i2 < length) {
                    int read = fileInputStream2.read(bArr, i2, length - i2);
                    if (read < 0) {
                        break;
                    }
                    i2 += read;
                }
                codedOutputStream.p(bArr);
                CommonUtils.c(fileInputStream2, "Failed to close file input stream.");
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                CommonUtils.c(fileInputStream, "Failed to close file input stream.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.c(fileInputStream, "Failed to close file input stream.");
            throw th;
        }
    }

    static j00 h(m mVar, String str, String str2) {
        Context context = mVar.b;
        int n2 = CommonUtils.n(context, "com.crashlytics.ApiEndpoint", "string");
        String string = n2 > 0 ? context.getString(n2) : "";
        return new i00(new k00(string, str, mVar.g, "17.2.1"), new l00(string, str2, mVar.g, "17.2.1"));
    }

    static void l(m mVar, Thread thread, Throwable th, long j2) {
        com.google.firebase.crashlytics.internal.proto.b bVar;
        Throwable th2;
        Exception e2;
        CodedOutputStream i2;
        String F2 = mVar.F();
        if (F2 == null) {
            ty.f().b("Tried to write a non-fatal exception while no session was open.");
            return;
        }
        CodedOutputStream codedOutputStream = null;
        try {
            ty.f().b("Crashlytics is logging non-fatal exception \"" + th + "\" from thread " + thread.getName());
            bVar = new com.google.firebase.crashlytics.internal.proto.b(mVar.I(), F2 + "SessionEvent" + CommonUtils.u(mVar.a.getAndIncrement()));
            try {
                i2 = CodedOutputStream.i(bVar);
            } catch (Exception e3) {
                e2 = e3;
                try {
                    ty.f().e("An error occurred in the non-fatal exception logger", e2);
                    CommonUtils.h(codedOutputStream, "Failed to flush to non-fatal file.");
                    CommonUtils.c(bVar, "Failed to close non-fatal file output stream.");
                    mVar.W(F2, 64);
                } catch (Throwable th3) {
                    th2 = th3;
                    CommonUtils.h(codedOutputStream, "Failed to flush to non-fatal file.");
                    CommonUtils.c(bVar, "Failed to close non-fatal file output stream.");
                    throw th2;
                }
            }
            try {
                mVar.b0(i2, thread, th, j2, AppProtocol.LogMessage.SEVERITY_ERROR, false);
                CommonUtils.h(i2, "Failed to flush to non-fatal file.");
            } catch (Exception e4) {
                e2 = e4;
                codedOutputStream = i2;
                ty.f().e("An error occurred in the non-fatal exception logger", e2);
                CommonUtils.h(codedOutputStream, "Failed to flush to non-fatal file.");
                CommonUtils.c(bVar, "Failed to close non-fatal file output stream.");
                mVar.W(F2, 64);
            } catch (Throwable th4) {
                th2 = th4;
                codedOutputStream = i2;
                CommonUtils.h(codedOutputStream, "Failed to flush to non-fatal file.");
                CommonUtils.c(bVar, "Failed to close non-fatal file output stream.");
                throw th2;
            }
        } catch (Exception e5) {
            e2 = e5;
            bVar = null;
            ty.f().e("An error occurred in the non-fatal exception logger", e2);
            CommonUtils.h(codedOutputStream, "Failed to flush to non-fatal file.");
            CommonUtils.c(bVar, "Failed to close non-fatal file output stream.");
            mVar.W(F2, 64);
        } catch (Throwable th5) {
            th2 = th5;
            bVar = null;
            CommonUtils.h(codedOutputStream, "Failed to flush to non-fatal file.");
            CommonUtils.c(bVar, "Failed to close non-fatal file output stream.");
            throw th2;
        }
        CommonUtils.c(bVar, "Failed to close non-fatal file output stream.");
        try {
            mVar.W(F2, 64);
        } catch (Exception e6) {
            ty.f().e("An error occurred when trimming non-fatal files.", e6);
        }
    }

    static void s(m mVar, Thread thread, Throwable th, long j2) {
        com.google.firebase.crashlytics.internal.proto.b bVar;
        Throwable th2;
        Exception e2;
        mVar.getClass();
        CodedOutputStream codedOutputStream = null;
        try {
            String F2 = mVar.F();
            if (F2 == null) {
                ty.f().d("Tried to write a fatal exception while no session was open.");
                CommonUtils.h(null, "Failed to flush to session begin file.");
                CommonUtils.c(null, "Failed to close fatal exception file output stream.");
                return;
            }
            bVar = new com.google.firebase.crashlytics.internal.proto.b(mVar.I(), F2 + "SessionCrash");
            try {
                codedOutputStream = CodedOutputStream.i(bVar);
                mVar.b0(codedOutputStream, thread, th, j2, "crash", true);
            } catch (Exception e3) {
                e2 = e3;
            }
            CommonUtils.h(codedOutputStream, "Failed to flush to session begin file.");
            CommonUtils.c(bVar, "Failed to close fatal exception file output stream.");
        } catch (Exception e4) {
            e2 = e4;
            bVar = null;
            try {
                ty.f().e("An error occurred in the fatal exception logger", e2);
                CommonUtils.h(codedOutputStream, "Failed to flush to session begin file.");
                CommonUtils.c(bVar, "Failed to close fatal exception file output stream.");
            } catch (Throwable th3) {
                th2 = th3;
                CommonUtils.h(codedOutputStream, "Failed to flush to session begin file.");
                CommonUtils.c(bVar, "Failed to close fatal exception file output stream.");
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            bVar = null;
            CommonUtils.h(codedOutputStream, "Failed to flush to session begin file.");
            CommonUtils.c(bVar, "Failed to close fatal exception file output stream.");
            throw th2;
        }
    }

    static void u(m mVar) {
        mVar.getClass();
        long G2 = G();
        String gVar = new g(mVar.h).toString();
        ty f2 = ty.f();
        f2.b("Opening a new session with ID " + gVar);
        mVar.p.d(gVar);
        String format = String.format(Locale.US, "Crashlytics Android SDK/%s", "17.2.1");
        mVar.c0(gVar, "BeginSession", new q(mVar, gVar, format, G2));
        mVar.p.c(gVar, format, G2);
        String b2 = mVar.h.b();
        b bVar = mVar.j;
        String str = bVar.e;
        String str2 = bVar.f;
        String c2 = mVar.h.c();
        int g2 = DeliveryMechanism.d(mVar.j.c).g();
        mVar.c0(gVar, "SessionApp", new r(mVar, b2, str, str2, c2, g2));
        mVar.p.g(gVar, b2, str, str2, c2, g2, mVar.r);
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.VERSION.CODENAME;
        boolean t2 = CommonUtils.t(mVar.b);
        mVar.c0(gVar, "SessionOS", new s(mVar, str3, str4, t2));
        mVar.p.h(gVar, str3, str4, t2);
        Context context = mVar.b;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int ordinal = CommonUtils.Architecture.d().ordinal();
        String str5 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long p2 = CommonUtils.p();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean r2 = CommonUtils.r(context);
        int k2 = CommonUtils.k(context);
        String str6 = Build.MANUFACTURER;
        String str7 = Build.PRODUCT;
        mVar.c0(gVar, "SessionDevice", new t(mVar, ordinal, str5, availableProcessors, p2, blockCount, r2, k2, str6, str7));
        mVar.p.e(gVar, ordinal, str5, availableProcessors, p2, blockCount, r2, k2, str6, str7);
        mVar.m.e(gVar);
        mVar.t.d(gVar.replaceAll("-", ""), G2);
    }

    /* access modifiers changed from: private */
    public static void w(String str, File file) {
        Throwable th;
        FileOutputStream fileOutputStream;
        if (str != null) {
            CodedOutputStream codedOutputStream = null;
            try {
                fileOutputStream = new FileOutputStream(file, true);
                try {
                    codedOutputStream = CodedOutputStream.i(fileOutputStream);
                    com.google.firebase.crashlytics.internal.proto.c.n(codedOutputStream, str);
                    StringBuilder V0 = je.V0("Failed to flush to append to ");
                    V0.append(file.getPath());
                    CommonUtils.h(codedOutputStream, V0.toString());
                    CommonUtils.c(fileOutputStream, "Failed to close " + file.getPath());
                } catch (Throwable th2) {
                    th = th2;
                    StringBuilder V02 = je.V0("Failed to flush to append to ");
                    V02.append(file.getPath());
                    CommonUtils.h(codedOutputStream, V02.toString());
                    CommonUtils.c(fileOutputStream, "Failed to close " + file.getPath());
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                StringBuilder V022 = je.V0("Failed to flush to append to ");
                V022.append(file.getPath());
                CommonUtils.h(codedOutputStream, V022.toString());
                CommonUtils.c(fileOutputStream, "Failed to close " + file.getPath());
                throw th;
            }
        }
    }

    private void y(com.google.firebase.crashlytics.internal.proto.b bVar) {
        if (bVar != null) {
            try {
                bVar.a();
            } catch (IOException e2) {
                ty.f().e("Error closing session file stream in the presence of an exception", e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void A(File[] fileArr) {
        HashSet hashSet = new HashSet();
        for (File file : fileArr) {
            ty.f().b("Found invalid session part file: " + file);
            hashSet.add(L(file));
        }
        if (!hashSet.isEmpty()) {
            File[] R = R(new d(this, hashSet));
            for (File file2 : R) {
                ty.f().b("Deleting invalid session file: " + file2);
                file2.delete();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void B(int i2) {
        C(i2, true);
    }

    /* access modifiers changed from: package-private */
    public void D(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.google.firebase.crashlytics.internal.settings.d dVar) {
        this.f.d(new p(this));
        h0 h0Var = new h0(new i(), dVar, uncaughtExceptionHandler);
        this.u = h0Var;
        Thread.setDefaultUncaughtExceptionHandler(h0Var);
    }

    /* access modifiers changed from: package-private */
    public boolean E(int i2) {
        this.f.b();
        if (N()) {
            ty.f().b("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        ty.f().b("Finalizing previously open sessions.");
        try {
            C(i2, false);
            ty.f().b("Closed all previously open sessions");
            return true;
        } catch (Exception e2) {
            ty.f().e("Unable to finalize previously open sessions.", e2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public File H() {
        return new File(I(), "fatal-sessions");
    }

    /* access modifiers changed from: package-private */
    public File I() {
        return this.i.a();
    }

    /* access modifiers changed from: package-private */
    public File J() {
        return new File(I(), "native-sessions");
    }

    /* access modifiers changed from: package-private */
    public File K() {
        return new File(I(), "nonfatal-sessions");
    }

    /* access modifiers changed from: package-private */
    public synchronized void M(com.google.firebase.crashlytics.internal.settings.d dVar, Thread thread, Throwable th) {
        ty f2 = ty.f();
        f2.b("Crashlytics is handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            z0.a(this.f.e(new j(new Date(), th, thread, dVar)));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public boolean N() {
        h0 h0Var = this.u;
        return h0Var != null && h0Var.a();
    }

    /* access modifiers changed from: package-private */
    public File[] O() {
        return R(A);
    }

    /* access modifiers changed from: package-private */
    public File[] P() {
        LinkedList linkedList = new LinkedList();
        File H = H();
        FilenameFilter filenameFilter = B;
        Collections.addAll(linkedList, Q(H, filenameFilter));
        Collections.addAll(linkedList, Q(K(), filenameFilter));
        Collections.addAll(linkedList, Q(I(), filenameFilter));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    /* access modifiers changed from: package-private */
    public void T(String str, String str2) {
        try {
            this.e.d(str, str2);
            this.f.d(new o(this, this.e.a()));
        } catch (IllegalArgumentException e2) {
            Context context = this.b;
            if (context != null) {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    throw e2;
                }
            }
            ty.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* access modifiers changed from: package-private */
    public void U(String str) {
        this.e.e(str);
        this.f.d(new n(this, this.e));
    }

    /* access modifiers changed from: package-private */
    public com.google.android.gms.tasks.g<Void> V(float f2, com.google.android.gms.tasks.g<q00> gVar) {
        com.google.android.gms.tasks.g gVar2;
        Boolean bool = Boolean.FALSE;
        if (!this.n.a()) {
            ty.f().b("No reports are available.");
            this.v.e(bool);
            return com.google.android.gms.tasks.j.e(null);
        }
        ty.f().b("Unsent reports are available.");
        Boolean bool2 = Boolean.TRUE;
        if (this.c.c()) {
            ty.f().b("Automatic data collection is enabled. Allowing upload.");
            this.v.e(bool);
            gVar2 = com.google.android.gms.tasks.j.e(bool2);
        } else {
            ty.f().b("Automatic data collection is disabled.");
            ty.f().b("Notifying that unsent reports are available.");
            this.v.e(bool2);
            com.google.android.gms.tasks.g<TContinuationResult> s2 = this.c.e().s(new x(this));
            ty.f().b("Waiting for send/deleteUnsentReports to be called.");
            com.google.android.gms.tasks.g<Boolean> a2 = this.w.a();
            int i2 = z0.c;
            com.google.android.gms.tasks.h hVar = new com.google.android.gms.tasks.h();
            a1 a1Var = new a1(hVar);
            s2.j(a1Var);
            a2.j(a1Var);
            gVar2 = hVar.a();
        }
        return gVar2.s(new k(gVar, f2));
    }

    /* access modifiers changed from: package-private */
    public void a0(Thread thread, Throwable th) {
        Date date = new Date();
        h hVar = this.f;
        hVar.d(new i(hVar, new b(date, th, thread)));
    }

    /* access modifiers changed from: package-private */
    public void e0(long j2, String str) {
        this.f.d(new a(j2, str));
    }

    /* access modifiers changed from: package-private */
    public void x() {
        h hVar = this.f;
        hVar.d(new i(hVar, new c()));
    }

    /* access modifiers changed from: package-private */
    public boolean z() {
        if (!this.d.c()) {
            String F2 = F();
            if (F2 == null || !this.p.f(F2)) {
                return false;
            }
            return true;
        }
        ty.f().b("Found previous crash marker.");
        this.d.d();
        return true;
    }
}

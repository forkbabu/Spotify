package defpackage;

import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.g0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.v;
import com.google.firebase.crashlytics.internal.settings.c;
import com.google.firebase.crashlytics.internal.settings.d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: e00  reason: default package */
public class e00 {
    private static final Charset g = Charset.forName(Constants.ENCODING);
    private static final int h = 15;
    private static final sz i = new sz();
    private static final Comparator<? super File> j = c00.a();
    private static final FilenameFilter k = d00.a();
    public static final /* synthetic */ int l = 0;
    private final AtomicInteger a = new AtomicInteger(0);
    private final File b;
    private final File c;
    private final File d;
    private final File e;
    private final d f;

    public e00(File file, d dVar) {
        File file2 = new File(file, "report-persistence");
        this.b = new File(file2, "sessions");
        this.c = new File(file2, "priority-reports");
        this.d = new File(file2, "reports");
        this.e = new File(file2, "native-reports");
        this.f = dVar;
    }

    static int a(File file, File file2) {
        String name = file.getName();
        int i2 = h;
        return name.substring(0, i2).compareTo(file2.getName().substring(0, i2));
    }

    private static List<File> b(List<File>... listArr) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (List<File> list : listArr) {
            i2 += list.size();
        }
        arrayList.ensureCapacity(i2);
        for (List<File> list2 : listArr) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    private static List<File> g(File file) {
        return i(file, null);
    }

    private List<File> h() {
        List[] listArr = {b(g(this.c), g(this.e)), g(this.d)};
        for (int i2 = 0; i2 < 2; i2++) {
            Collections.sort(listArr[i2], j);
        }
        return b(listArr);
    }

    private static List<File> i(File file, FileFilter fileFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    private static List<File> j(File file, FilenameFilter filenameFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = filenameFilter == null ? file.listFiles() : file.listFiles(filenameFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    private File k(String str) {
        return new File(this.b, str);
    }

    private static File p(File file) {
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        throw new IOException("Could not create directory " + file);
    }

    private static String q(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), g);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable unused) {
            }
        }
        throw th;
    }

    private static void r(File file) {
        if (file != null) {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    r(file2);
                }
            }
            file.delete();
        }
    }

    private static void s(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), g);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public void c() {
        Iterator it = ((ArrayList) h()).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public void d(String str) {
        FilenameFilter a2 = yz.a(str);
        Iterator it = ((ArrayList) b(j(this.c, a2), j(this.e, a2), j(this.d, a2))).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public void e(String str, long j2) {
        boolean z;
        List<File> i2 = i(this.b, zz.a(str));
        Collections.sort(i2, j);
        if (i2.size() > 8) {
            for (File file : i2.subList(8, i2.size())) {
                r(file);
            }
            i2 = i2.subList(0, 8);
        }
        for (File file2 : i2) {
            List<File> j3 = j(file2, k);
            if (!j3.isEmpty()) {
                Collections.sort(j3);
                ArrayList arrayList = new ArrayList();
                Iterator<File> it = j3.iterator();
                while (true) {
                    z = false;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        File next = it.next();
                        try {
                            arrayList.add(i.e(q(next)));
                            if (!z) {
                                String name = next.getName();
                                if (!(name.startsWith("event") && name.endsWith("_"))) {
                                }
                            }
                            z = true;
                        } catch (IOException e2) {
                            ty f2 = ty.f();
                            f2.c("Could not add event to report for " + next, e2);
                        }
                    }
                }
                String str2 = null;
                File file3 = new File(file2, "user");
                if (file3.isFile()) {
                    try {
                        str2 = q(file3);
                    } catch (IOException e3) {
                        ty f3 = ty.f();
                        StringBuilder V0 = je.V0("Could not read user ID file in ");
                        V0.append(file2.getName());
                        f3.c(V0.toString(), e3);
                    }
                }
                File file4 = new File(file2, "report");
                File file5 = z ? this.c : this.d;
                try {
                    sz szVar = i;
                    CrashlyticsReport l2 = szVar.l(q(file4)).n(j2, z, str2).l(v.c(arrayList));
                    CrashlyticsReport.d j4 = l2.j();
                    if (j4 != null) {
                        p(file5);
                        s(new File(file5, j4.h()), szVar.m(l2));
                    }
                } catch (IOException e4) {
                    ty f4 = ty.f();
                    f4.c("Could not synthesize final report file for " + file4, e4);
                }
            }
            r(file2);
        }
        ((c) this.f).l().b().getClass();
        ArrayList arrayList2 = (ArrayList) h();
        int size = arrayList2.size();
        if (size > 4) {
            for (File file6 : arrayList2.subList(4, size)) {
                file6.delete();
            }
        }
    }

    public void f(String str, CrashlyticsReport.c cVar) {
        File file = new File(k(str), "report");
        File file2 = this.e;
        try {
            sz szVar = i;
            CrashlyticsReport m = szVar.l(q(file)).m(cVar);
            p(file2);
            s(new File(file2, str), szVar.m(m));
        } catch (IOException e2) {
            ty f2 = ty.f();
            f2.c("Could not synthesize final native report file for " + file, e2);
        }
    }

    public List<g0> l() {
        List<File> h2 = h();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(((ArrayList) h2).size());
        Iterator it = ((ArrayList) h()).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                arrayList.add(g0.a(i.l(q(file)), file.getName()));
            } catch (IOException e2) {
                ty f2 = ty.f();
                f2.c("Could not load report file " + file + "; deleting", e2);
                file.delete();
            }
        }
        return arrayList;
    }

    public void m(CrashlyticsReport.d.AbstractC0117d dVar, String str, boolean z) {
        int i2 = ((c) this.f).l().b().a;
        File k2 = k(str);
        try {
            s(new File(k2, je.y0("event", String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement())), z ? "_" : "")), i.f(dVar));
        } catch (IOException e2) {
            ty.f().c("Could not persist event for session " + str, e2);
        }
        List<File> j2 = j(k2, a00.a());
        Collections.sort(j2, b00.a());
        int size = j2.size();
        for (File file : j2) {
            if (size > i2) {
                r(file);
                size--;
            } else {
                return;
            }
        }
    }

    public void n(CrashlyticsReport crashlyticsReport) {
        CrashlyticsReport.d j2 = crashlyticsReport.j();
        if (j2 == null) {
            ty.f().b("Could not get session for report");
            return;
        }
        String h2 = j2.h();
        try {
            File k2 = k(h2);
            p(k2);
            s(new File(k2, "report"), i.m(crashlyticsReport));
        } catch (IOException e2) {
            ty f2 = ty.f();
            f2.c("Could not persist report for session " + h2, e2);
        }
    }

    public void o(String str, String str2) {
        try {
            s(new File(k(str2), "user"), str);
        } catch (IOException e2) {
            ty f2 = ty.f();
            f2.c("Could not persist user ID for session " + str2, e2);
        }
    }
}

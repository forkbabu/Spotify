package defpackage;

import com.spotify.superbird.ota.logger.pitstopevents.OtaEvent;
import com.spotify.superbird.ota.model.VersionedPackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: bpe  reason: default package */
public final class bpe implements ape {
    private final dpe a;
    private final cqe b;

    public bpe(dpe dpe, cqe cqe) {
        h.e(dpe, "pitstopLogger");
        h.e(cqe, "clock");
        this.a = dpe;
        this.b = cqe;
    }

    @Override // defpackage.ape
    public void a(String str, String str2, String str3, String str4) {
        h.e(str, "serial");
        h.e(str2, "packageName");
        h.e(str3, "version");
        h.e(str4, "fromVersion");
        this.a.a(str, new OtaEvent(OtaEvent.Event.DOWNLOAD_START, str2, this.b.d(), str4, str3, null, null, 96));
    }

    @Override // defpackage.ape
    public void b(String str, String str2, String str3, String str4, String str5) {
        h.e(str, "serial");
        h.e(str2, "packageName");
        h.e(str3, "version");
        h.e(str4, "fromVersion");
        h.e(str5, "errorMessage");
        this.a.a(str, new OtaEvent(OtaEvent.Event.DOWNLOAD_ERROR, str2, this.b.d(), str4, str3, str5, null, 64));
    }

    @Override // defpackage.ape
    public void c(String str, List<? extends VersionedPackage> list, String str2) {
        h.e(str, "serial");
        h.e(list, "packages");
        h.e(str2, "errorMessage");
        long d = this.b.d();
        ArrayList arrayList = new ArrayList(d.e(list, 10));
        for (Iterator<T> it = list.iterator(); it.hasNext(); it = it) {
            T next = it.next();
            OtaEvent.Event event = OtaEvent.Event.CHECK_FOR_UPDATES_ERROR;
            String packageName = next.packageName();
            h.d(packageName, "it.packageName()");
            String version = next.version();
            h.d(version, "it.version()");
            arrayList.add(new OtaEvent(event, packageName, d, version, null, str2, null, 80));
        }
        this.a.b(arrayList);
    }

    @Override // defpackage.ape
    public void d(String str, String str2, String str3, String str4) {
        h.e(str, "serial");
        h.e(str2, "packageName");
        h.e(str3, "version");
        h.e(str4, "fromVersion");
        this.a.a(str, new OtaEvent(OtaEvent.Event.DOWNLOAD_COMPLETE, str2, this.b.d(), str4, str3, null, null, 96));
    }

    @Override // defpackage.ape
    public void e(String str, List<? extends VersionedPackage> list, OtaEvent.Trigger trigger) {
        h.e(str, "serial");
        h.e(list, "packages");
        h.e(trigger, "trigger");
        long d = this.b.d();
        ArrayList arrayList = new ArrayList(d.e(list, 10));
        for (Iterator<T> it = list.iterator(); it.hasNext(); it = it) {
            T next = it.next();
            OtaEvent.Event event = OtaEvent.Event.CHECK_FOR_UPDATES;
            String packageName = next.packageName();
            h.d(packageName, "it.packageName()");
            String version = next.version();
            h.d(version, "it.version()");
            arrayList.add(new OtaEvent(event, packageName, d, version, null, null, trigger, 48));
        }
        this.a.b(arrayList);
    }
}

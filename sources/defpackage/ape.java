package defpackage;

import com.spotify.superbird.ota.logger.pitstopevents.OtaEvent;
import com.spotify.superbird.ota.model.VersionedPackage;
import java.util.List;

/* renamed from: ape  reason: default package */
public interface ape {
    void a(String str, String str2, String str3, String str4);

    void b(String str, String str2, String str3, String str4, String str5);

    void c(String str, List<? extends VersionedPackage> list, String str2);

    void d(String str, String str2, String str3, String str4);

    void e(String str, List<? extends VersionedPackage> list, OtaEvent.Trigger trigger);
}

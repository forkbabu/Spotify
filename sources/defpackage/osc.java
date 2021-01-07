package defpackage;

import com.spotify.music.libs.podcast.download.DownloadDialogLifecycleAwareUtil;
import com.spotify.music.libs.podcast.download.a0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: osc  reason: default package */
public final class osc implements qsc {
    private final tsc a;
    private final m8a b;
    private final DownloadDialogLifecycleAwareUtil c;

    /* renamed from: osc$a */
    static final class a implements a0.a {
        final /* synthetic */ osc a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ int d;

        a(osc osc, String str, String str2, int i) {
            this.a = osc;
            this.b = str;
            this.c = str2;
            this.d = i;
        }

        @Override // com.spotify.music.libs.podcast.download.a0.a
        public final void a() {
            osc.c(this.a, this.b, this.c, this.d);
        }
    }

    /* renamed from: osc$b */
    static final class b implements a0.b {
        final /* synthetic */ osc a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ int d;

        b(osc osc, String str, String str2, int i) {
            this.a = osc;
            this.b = str;
            this.c = str2;
            this.d = i;
        }

        @Override // com.spotify.music.libs.podcast.download.a0.b
        public final void a(List<String> list) {
            h.e(list, "playlistUrisToUndownload");
            osc.b(this.a, this.b, this.c, this.d, list);
        }
    }

    public osc(tsc tsc, m8a m8a, DownloadDialogLifecycleAwareUtil downloadDialogLifecycleAwareUtil) {
        h.e(tsc, "interactionLogger");
        h.e(m8a, "contentMarkedForDownload");
        h.e(downloadDialogLifecycleAwareUtil, "downloadDialogUtil");
        this.a = tsc;
        this.b = m8a;
        this.c = downloadDialogLifecycleAwareUtil;
    }

    public static final void b(osc osc, String str, String str2, int i, List list) {
        osc.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            osc.b.b((String) it.next());
        }
        osc.b.b(str);
        osc.a.f(str, str2, i);
    }

    public static final void c(osc osc, String str, String str2, int i) {
        osc.b.a(str);
        osc.a.i(str, str2, i);
    }

    @Override // defpackage.qsc
    public void a(String str, com.spotify.playlist.models.offline.a aVar, String str2, int i) {
        h.e(str, "episodeUri");
        h.e(aVar, "offlineState");
        h.e(str2, "sectionName");
        this.c.b(aVar, str, new a(this, str, str2, i), new b(this, str, str2, i));
    }
}

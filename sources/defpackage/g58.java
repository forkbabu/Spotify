package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.search.ondemand.editorial.EditorialOnDemandInfo;
import com.spotify.music.libs.search.ondemand.editorial.e;

/* renamed from: g58  reason: default package */
public class g58 implements a71 {
    public static final /* synthetic */ int c = 0;
    private final e a;
    private final r58 b;

    public g58(e eVar, r58 r58) {
        this.a = eVar;
        this.b = r58;
    }

    public void a(String str, n61 n61, EditorialOnDemandInfo editorialOnDemandInfo) {
        Optional fromNullable = Optional.fromNullable(l0.z(editorialOnDemandInfo.b()).D(editorialOnDemandInfo.c()));
        if (fromNullable.isPresent()) {
            this.b.a((String) fromNullable.get(), str, n61);
        } else {
            this.b.b(str, n61);
        }
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0058: APUT  (r6v2 java.lang.Object[]), (1 ??[boolean, int, float, short, byte, char]), (r2v1 java.lang.String) */
    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        String string = o81.data().string("trackUri");
        EditorialOnDemandInfo editorialOnDemandInfo = (EditorialOnDemandInfo) o81.data().get("editorialOnDemandInfo");
        if (editorialOnDemandInfo != null) {
            if (!MoreObjects.isNullOrEmpty(string) && !MoreObjects.isNullOrEmpty(editorialOnDemandInfo.c()) && !MoreObjects.isNullOrEmpty(editorialOnDemandInfo.b())) {
                this.a.a(editorialOnDemandInfo, new b58(this, string, n61), new a58(this, string, n61));
                return;
            }
        }
        Object[] objArr = new Object[3];
        objArr[0] = string;
        String str = "null";
        objArr[1] = editorialOnDemandInfo != null ? editorialOnDemandInfo.c() : str;
        if (editorialOnDemandInfo != null) {
            str = editorialOnDemandInfo.b();
        }
        objArr[2] = str;
        Assertion.g(Logger.f("Invalid on demand data: trackUri=%s, onDemandTrackUri=%s, onDemandPlaylistUri=%s", objArr));
    }

    public void c(String str, n61 n61, EditorialOnDemandInfo editorialOnDemandInfo) {
        this.b.b(str, n61);
    }
}

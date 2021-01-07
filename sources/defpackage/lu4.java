package defpackage;

import android.content.Context;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.music.C0707R;
import com.spotify.playlist.endpoints.p;
import com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.FolderRequestPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import com.spotify.playlist.models.f;
import io.reactivex.z;

/* renamed from: lu4  reason: default package */
public class lu4 {
    private static final p.a c;
    private final Context a;
    private final p b;

    static {
        PlaylistMetadataDecorationPolicy.a builder = PlaylistMetadataDecorationPolicy.builder();
        builder.n(true);
        PlaylistMetadataDecorationPolicy c2 = builder.c();
        FolderMetadataDecorationPolicy.a builder2 = FolderMetadataDecorationPolicy.builder();
        builder2.e(true);
        FolderMetadataDecorationPolicy b2 = builder2.b();
        RootlistRequestDecorationPolicy.a builder3 = RootlistRequestDecorationPolicy.builder();
        builder3.d(true);
        RootlistRequestDecorationPolicy a2 = builder3.a();
        RootlistRequestPayload.a builder4 = RootlistRequestPayload.builder();
        FolderRequestPolicy.a builder5 = FolderRequestPolicy.builder();
        builder5.c(c2);
        builder5.b(b2);
        builder5.d(a2);
        builder4.b(builder5.a());
        RootlistRequestPayload a3 = builder4.a();
        p.a.C0375a b3 = p.a.b();
        b3.c(true);
        b3.f(new qxd(0, 0));
        b3.d(Boolean.TRUE);
        b3.e(a3);
        c = b3.b();
    }

    public lu4(Context context, p pVar) {
        this.a = context;
        this.b = pVar;
    }

    public /* synthetic */ String a(String str, f fVar) {
        return MoreObjects.isNullOrEmpty(str) ? this.a.getString(C0707R.string.create_playlist_default_name, Integer.valueOf(fVar.getUnrangedLength() + 1)) : str;
    }

    public z<String> b(String str) {
        return this.b.b(Optional.absent(), c).A(new ku4(this, str));
    }
}

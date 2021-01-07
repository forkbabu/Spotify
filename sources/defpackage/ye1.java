package defpackage;

import com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy;

/* renamed from: ye1  reason: default package */
public final class ye1 implements fjf<FolderMetadataDecorationPolicy> {

    /* access modifiers changed from: private */
    /* renamed from: ye1$a */
    public static final class a {
        private static final ye1 a = new ye1();
    }

    public static ye1 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        FolderMetadataDecorationPolicy.a builder = FolderMetadataDecorationPolicy.builder();
        builder.f(true);
        builder.g(true);
        builder.c(true);
        builder.h(true);
        return builder.b();
    }
}

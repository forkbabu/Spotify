package com.spotify.music.features.album.encore;

import com.spotify.encore.consumer.elements.downloadbutton.DownloadButton;
import com.spotify.encore.consumer.elements.downloadbutton.DownloadState;
import com.spotify.music.navigation.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class b implements i {
    private final String a;
    private final hf3 b;
    private final t c;
    private final t8a d;
    private final uk9 e;
    private final tw3 f;
    private final iy3 g;
    private final PlayFromContextOrPauseCommandHandler h;

    public b(String str, hf3 hf3, t tVar, t8a t8a, uk9 uk9, tw3 tw3, iy3 iy3, PlayFromContextOrPauseCommandHandler playFromContextOrPauseCommandHandler) {
        h.e(str, "albumUri");
        h.e(hf3, "contextMenuController");
        h.e(tVar, "navigator");
        h.e(t8a, "likedContent");
        h.e(uk9, "freeTierInteractionLogger");
        h.e(tw3, "albumToolbarUBIInteractionLogger");
        h.e(iy3, "albumOfflineManager");
        h.e(playFromContextOrPauseCommandHandler, "playFromContextOrPauseCommandHandler");
        this.a = str;
        this.b = hf3;
        this.c = tVar;
        this.d = t8a;
        this.e = uk9;
        this.f = tw3;
        this.g = iy3;
        this.h = playFromContextOrPauseCommandHandler;
    }

    @Override // com.spotify.music.features.album.encore.i
    public void a(s81 s81) {
        h.e(s81, "model");
        List<? extends s81> children = s81.children();
        if (!children.isEmpty()) {
            s81 s812 = (s81) children.get(0);
            o81 o81 = (o81) s812.events().get("click");
            n61 b2 = n61.b("click", s812);
            if (o81 != null && h.a(o81.name(), "playFromContext")) {
                this.h.b(o81, b2);
            }
        }
    }

    @Override // com.spotify.music.features.album.encore.i
    public void b() {
        this.b.a();
    }

    @Override // com.spotify.music.features.album.encore.i
    public void c(DownloadButton.Model model) {
        h.e(model, "downloadButtonModel");
        if (model.getDownloadState() instanceof DownloadState.Downloaded) {
            this.f.e(this.a);
            this.g.e();
            return;
        }
        this.f.d(this.a);
        this.g.a();
    }

    @Override // com.spotify.music.features.album.encore.i
    public void d() {
        this.c.a();
    }

    @Override // com.spotify.music.features.album.encore.i
    public void e(boolean z) {
        if (!z) {
            t8a t8a = this.d;
            String str = this.a;
            t8a.a(str, str, true);
            this.f.a(this.a);
        } else {
            this.d.f(this.a, true);
            this.f.b(this.a);
        }
        String str2 = this.a;
        this.e.b(!z, str2, str2);
    }

    @Override // com.spotify.music.features.album.encore.i
    public void f(s81 s81) {
        ArrayList arrayList;
        String str;
        p81[] bundleArray;
        h.e(s81, "model");
        p81 bundle = s81.metadata().bundle("album");
        if (bundle == null || (bundleArray = bundle.bundleArray("artists")) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(bundleArray.length);
            for (p81 p81 : bundleArray) {
                arrayList.add(p81.string("uri"));
            }
        }
        if (!(arrayList == null || arrayList.size() != 1 || (str = (String) d.j(arrayList)) == null)) {
            this.c.d(str);
        }
    }
}

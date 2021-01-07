package com.spotify.mobile.android.video.cosmos;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.video.model.VideoPlayerCommand;
import io.reactivex.disposables.b;
import io.reactivex.y;

public class j {
    private final y a;
    private final y b;
    private final m c;
    private b d;
    private a e;

    /* access modifiers changed from: package-private */
    public interface a {
    }

    public j(m mVar, y yVar, y yVar2) {
        this.c = mVar;
        this.a = yVar;
        this.b = yVar2;
    }

    public static void c(j jVar, VideoPlayerCommand videoPlayerCommand) {
        jVar.getClass();
        Logger.b("%s", videoPlayerCommand);
        switch (videoPlayerCommand.type.ordinal()) {
            case 0:
            case 8:
                ((i) jVar.e).k(videoPlayerCommand);
                return;
            case 1:
                ((i) jVar.e).p(videoPlayerCommand);
                return;
            case 2:
                ((i) jVar.e).q(videoPlayerCommand);
                return;
            case 3:
                ((i) jVar.e).l(videoPlayerCommand);
                return;
            case 4:
                ((i) jVar.e).m(videoPlayerCommand);
                return;
            case 5:
                ((i) jVar.e).n(videoPlayerCommand);
                return;
            case 6:
                ((i) jVar.e).o(videoPlayerCommand);
                return;
            case 7:
            default:
                return;
        }
    }

    public void a() {
        if (b()) {
            this.d.dispose();
        }
    }

    public boolean b() {
        b bVar = this.d;
        return bVar != null && !bVar.d();
    }

    public void d(a aVar) {
        if (!b()) {
            this.e = aVar;
            this.d = this.c.a().I0(this.b).o0(this.a).subscribe(new c(this), d.a);
        }
    }
}

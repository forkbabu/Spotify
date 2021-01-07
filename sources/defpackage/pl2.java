package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.music.canvas.model.CanvasContentType;
import com.spotify.music.canvas.model.b;
import com.spotify.player.model.ContextTrack;

/* renamed from: pl2  reason: default package */
public class pl2 {
    public b a(ContextTrack contextTrack) {
        String str = contextTrack.metadata().get("canvas.type");
        if (str == null) {
            return null;
        }
        return b.g(contextTrack.uri(), contextTrack.metadata().get("canvas.url"), contextTrack.metadata().get("canvas.fileId"), contextTrack.metadata().get("canvas.id"), CanvasContentType.valueOf(str), contextTrack.metadata().get("canvas.artist.name"), contextTrack.metadata().get("canvas.artist.uri"), MoreObjects.emptyToNull(contextTrack.metadata().get("canvas.artist.avatar")));
    }

    public CanvasContentType b(ContextTrack contextTrack) {
        String str = contextTrack.metadata().get("canvas.type");
        if (str == null) {
            return null;
        }
        return CanvasContentType.valueOf(str);
    }

    public String c(ContextTrack contextTrack) {
        return contextTrack.metadata().get("canvas.url");
    }

    public boolean d(ContextTrack contextTrack) {
        String str = contextTrack.metadata().get("canvas.id");
        return str != null && !str.isEmpty();
    }
}

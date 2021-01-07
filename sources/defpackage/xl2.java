package defpackage;

import com.spotify.music.canvas.model.CanvasContentType;
import java.util.Random;

/* renamed from: xl2  reason: default package */
public class xl2 {
    private final Random a;

    public xl2(Random random) {
        this.a = random;
    }

    public long a(CanvasContentType canvasContentType) {
        if (canvasContentType == CanvasContentType.VIDEO_LOOPING_RANDOM) {
            return (long) this.a.nextInt(8000);
        }
        return 0;
    }
}

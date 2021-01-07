package defpackage;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: m67  reason: default package */
public class m67 implements x57 {
    private final ImpressionLogger a;
    private final InteractionLogger b;

    public m67(ImpressionLogger impressionLogger, InteractionLogger interactionLogger) {
        this.a = impressionLogger;
        this.b = interactionLogger;
    }

    @Override // defpackage.x57
    public String d(String str) {
        this.b.a(str, "podcast-trailer", -1, InteractionLogger.InteractionType.HIT, "toggle-trailer-pause");
        return "";
    }

    @Override // defpackage.x57
    public void j(String str) {
        this.a.a(str, "podcast-trailer", -1, ImpressionLogger.ImpressionType.ITEM, ImpressionLogger.RenderType.LIST);
    }

    @Override // defpackage.x57
    public String k(String str) {
        this.b.a(str, "podcast-trailer", -1, InteractionLogger.InteractionType.HIT, "toggle-trailer-playback");
        return "";
    }
}

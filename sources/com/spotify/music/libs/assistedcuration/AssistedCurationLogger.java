package com.spotify.music.libs.assistedcuration;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.ubi.specification.factories.t;

public class AssistedCurationLogger {
    private final t a;
    private final ere b;
    private final ImpressionLogger c;
    private final InteractionLogger d;

    /* access modifiers changed from: package-private */
    public enum UserIntent {
        ADDED_FROM_SEARCH("added-from-search"),
        SHOW_MORE("show-more"),
        PLAY_PREVIEW_VIA_ROW("play-preview-via-row"),
        ADD_TRACK_VIA_ACCESSORY("add-track-via-accessory"),
        PLAY_PREVIEW_VIA_IMAGE("play-preview-via-image"),
        CLOSE("close"),
        BACK_NAVIGATION("back-navigation"),
        SEARCH("search");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    public interface a {
        AssistedCurationLogger a(com.spotify.instrumentation.a aVar);
    }

    public AssistedCurationLogger(f fVar, h hVar, t tVar, ere ere, com.spotify.instrumentation.a aVar) {
        this.c = fVar.a(aVar);
        this.d = hVar.a(aVar);
        this.a = tVar;
        this.b = ere;
    }

    private void l(String str, String str2, int i, InteractionLogger.InteractionType interactionType, UserIntent userIntent) {
        this.d.a(str, str2, i, interactionType, userIntent.toString());
    }

    public void a(String str) {
        l(str, "search", 0, InteractionLogger.InteractionType.HIT, UserIntent.ADDED_FROM_SEARCH);
    }

    public void b() {
        l(null, "view", 0, InteractionLogger.InteractionType.HIT, UserIntent.BACK_NAVIGATION);
    }

    public void c(String str, int i, String str2, int i2, String str3) {
        l(str2, str, i2, InteractionLogger.InteractionType.HIT, UserIntent.ADD_TRACK_VIA_ACCESSORY);
        this.b.a(this.a.b().b(str, Integer.valueOf(i)).c(Integer.valueOf(i2), str2).b().a(str3, str2));
    }

    public void d(String str, int i, String str2, int i2) {
        l(str2, str, i2, InteractionLogger.InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_IMAGE);
        this.b.a(this.a.b().b(str, Integer.valueOf(i)).c(Integer.valueOf(i2), str2).c().a(str2));
    }

    public void e(String str, int i, String str2, int i2) {
        this.b.a(this.a.b().b(str, Integer.valueOf(i)).c(Integer.valueOf(i2), str2).d(str2));
    }

    public void f(String str, int i, String str2, int i2) {
        l(str2, str, i2, InteractionLogger.InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_ROW);
        this.b.a(this.a.b().b(str, Integer.valueOf(i)).c(Integer.valueOf(i2), str2).e(str2));
    }

    public void g(String str, int i, String str2, int i2) {
        this.b.a(this.a.b().b(str, Integer.valueOf(i)).c(Integer.valueOf(i2), str2).d(str2));
    }

    public void h(String str) {
        l(null, str, 0, InteractionLogger.InteractionType.HIT, UserIntent.SHOW_MORE);
    }

    public void i(String str, int i) {
        this.c.a(null, str, i, ImpressionLogger.ImpressionType.ITEM, ImpressionLogger.RenderType.CAROUSEL);
        this.b.a(this.a.b().b(str, Integer.valueOf(i)).b());
    }

    public void j() {
        l(null, "toolbar", 0, InteractionLogger.InteractionType.HIT, UserIntent.CLOSE);
        this.b.a(this.a.f().b().a());
    }

    public void k() {
        this.b.a(this.a.c().a());
    }

    public void m() {
        this.b.a(this.a.d().a());
    }

    public void n() {
        l(null, "search-box", 0, InteractionLogger.InteractionType.HIT, UserIntent.SEARCH);
        this.b.a(this.a.e().a(ViewUris.G.toString()));
    }
}

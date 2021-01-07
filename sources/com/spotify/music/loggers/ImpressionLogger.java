package com.spotify.music.loggers;

import com.spotify.instrumentation.a;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.libs.viewuri.c;

public class ImpressionLogger {
    private final String a;
    private final c b;
    private final jz1 c;
    private final cqe d;

    public enum ImpressionType {
        ERROR(AppProtocol.LogMessage.SEVERITY_ERROR),
        ITEM("item"),
        EXTENDED_SEARCH_ITEM("extended_search_item"),
        BUTTON("button"),
        CARD_STACK("card-stack"),
        DIALOG("dialog"),
        SNACKBAR("toastie"),
        PROGRESS_BAR("progress-bar"),
        PAGE("page"),
        BANNER("banner");
        
        private final String mStrValue;

        private ImpressionType(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    public enum RenderType {
        PAGE("page"),
        STACK("stack"),
        GRID("grid"),
        CAROUSEL("carousel"),
        LIST("list"),
        DIALOG("dialog"),
        SNACKBAR("toastie"),
        BANNER("banner");
        
        private final String mStrValue;

        private RenderType(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    public ImpressionLogger(jz1 jz1, c cVar, a aVar, cqe cqe) {
        this.c = jz1;
        this.b = cVar;
        this.a = aVar.path();
        this.d = cqe;
    }

    public void a(String str, String str2, int i, ImpressionType impressionType, RenderType renderType) {
        b("", str, str2, i, impressionType, renderType);
    }

    public void b(String str, String str2, String str3, int i, ImpressionType impressionType, RenderType renderType) {
        this.c.a(new da1(str, this.a, this.b.toString(), str3, (long) i, str2, impressionType.toString(), renderType.toString(), (double) this.d.d()));
    }

    public ImpressionLogger(jz1 jz1, c cVar, String str, cqe cqe) {
        this.c = jz1;
        this.b = cVar;
        this.a = str;
        this.d = cqe;
    }
}

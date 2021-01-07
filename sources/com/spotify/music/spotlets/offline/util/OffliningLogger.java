package com.spotify.music.spotlets.offline.util;

import com.google.protobuf.u;
import com.spotify.messages.DownloadInteraction;
import com.spotify.music.libs.viewuri.c;

public class OffliningLogger {
    private final c a;
    private final gl0<u> b;

    public enum SourceElement {
        HEADER_TOGGLE("header-toggle"),
        HEADER_ACTION("header-button"),
        ITEM_ROW("item-row"),
        CONTEXT_MENU("context-menu"),
        OPTIONS_MENU("options-menu");
        
        private final String mName;

        private SourceElement(String str) {
            this.mName = str;
        }

        public String d() {
            return this.mName;
        }
    }

    public OffliningLogger(gl0<u> gl0, c cVar) {
        this.a = cVar;
        this.b = gl0;
    }

    public void a(String str, SourceElement sourceElement, boolean z) {
        c cVar = this.a;
        DownloadInteraction.b n = DownloadInteraction.n();
        n.m(str);
        n.o(z);
        n.p(cVar.toString());
        n.n(sourceElement.d());
        this.b.c(n.build());
    }
}

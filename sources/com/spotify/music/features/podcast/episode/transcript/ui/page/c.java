package com.spotify.music.features.podcast.episode.transcript.ui.page;

import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public abstract class c {
    private final TranscriptItemType a;

    public static final class a extends c {
        public static final a b = new a();

        private a() {
            super(TranscriptItemType.AUTO_GENERATED_DISCLAIMER, null);
        }
    }

    public static final class b extends c {
        private final String b;
        private final List<String> c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, List<String> list) {
            super(TranscriptItemType.TEXT_SECTION, null);
            h.e(str, "time");
            h.e(list, "paragraphs");
            this.b = str;
            this.c = list;
        }

        public final List<String> b() {
            return this.c;
        }

        public final String c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return h.a(this.b, bVar.b) && h.a(this.c, bVar.c);
        }

        public int hashCode() {
            String str = this.b;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<String> list = this.c;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("TextSection(time=");
            V0.append(this.b);
            V0.append(", paragraphs=");
            return je.L0(V0, this.c, ")");
        }
    }

    public c(TranscriptItemType transcriptItemType, f fVar) {
        this.a = transcriptItemType;
    }

    public final TranscriptItemType a() {
        return this.a;
    }
}

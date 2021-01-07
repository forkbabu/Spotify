package defpackage;

import com.spotify.music.features.go.protocol.GoProtocolParseException;
import java.util.List;

/* renamed from: ne5  reason: default package */
public abstract class ne5 implements me5 {

    /* renamed from: ne5$a */
    public static class a extends com.spotify.music.features.go.protocol.a<ne5> {
        /* Return type fixed from 'me5' to match base method */
        /* access modifiers changed from: protected */
        @Override // com.spotify.music.features.go.protocol.a
        public ne5 b(List list) {
            if (list.size() == 3) {
                return new le5((String) list.get(0), (String) list.get(1), (String) list.get(2));
            }
            throw new GoProtocolParseException();
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.music.features.go.protocol.a
        public int c() {
            return 1;
        }
    }

    public static ne5 c(String str, String str2, String str3) {
        return new le5(str, str2, str3);
    }

    public abstract String a();

    public abstract String b();

    public abstract String d();
}

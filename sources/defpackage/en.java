package defpackage;

import com.google.android.exoplayer2.util.f0;
import java.nio.ByteBuffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: en  reason: default package */
public final class en implements wm {
    private static final Pattern a = Pattern.compile("(.+?)='(.*?)';", 32);

    @Override // defpackage.wm
    public um a(ym ymVar) {
        ByteBuffer byteBuffer = ymVar.b;
        byteBuffer.getClass();
        String n = f0.n(byteBuffer.array(), 0, byteBuffer.limit());
        Matcher matcher = a.matcher(n);
        String str = null;
        String str2 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String Q = f0.Q(matcher.group(1));
            String group = matcher.group(2);
            Q.hashCode();
            if (Q.equals("streamurl")) {
                str2 = group;
            } else if (Q.equals("streamtitle")) {
                str = group;
            }
        }
        return new um(new gn(n, str, str2));
    }
}

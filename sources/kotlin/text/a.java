package kotlin.text;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import kotlin.jvm.internal.h;

public final class a {
    public static final Charset a;

    static {
        Charset forName = Charset.forName(Constants.ENCODING);
        h.d(forName, "Charset.forName(\"UTF-8\")");
        a = forName;
        h.d(Charset.forName("UTF-16"), "Charset.forName(\"UTF-16\")");
        h.d(Charset.forName("UTF-16BE"), "Charset.forName(\"UTF-16BE\")");
        h.d(Charset.forName("UTF-16LE"), "Charset.forName(\"UTF-16LE\")");
        h.d(Charset.forName("US-ASCII"), "Charset.forName(\"US-ASCII\")");
        h.d(Charset.forName("ISO-8859-1"), "Charset.forName(\"ISO-8859-1\")");
    }
}

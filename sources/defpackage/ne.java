package defpackage;

import com.coremedia.iso.boxes.MovieBox;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.a;
import java.io.Closeable;
import java.io.UnsupportedEncodingException;

/* renamed from: ne  reason: default package */
public class ne extends BasicContainer implements Closeable {
    static {
        j50.a(ne.class);
    }

    public ne(a aVar) {
        initContainer(aVar, aVar.size(), new qe(new String[0]));
    }

    public static String a(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, 4));
        try {
            return new String(bArr2, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new Error("Required character encoding is missing", e);
        }
    }

    public static byte[] b(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i = 0; i < Math.min(4, str.length()); i++) {
                bArr[i] = (byte) str.charAt(i);
            }
        }
        return bArr;
    }

    @Override // com.googlecode.mp4parser.BasicContainer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.dataSource.close();
    }

    public MovieBox d() {
        for (com.coremedia.iso.boxes.a aVar : getBoxes()) {
            if (aVar instanceof MovieBox) {
                return (MovieBox) aVar;
            }
        }
        return null;
    }

    @Override // com.googlecode.mp4parser.BasicContainer, java.lang.Object
    public String toString() {
        return "model(" + this.dataSource.toString() + ")";
    }
}

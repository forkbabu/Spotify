package com.googlecode.mp4parser.boxes.microsoft;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.d;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;
import org.mp4parser.aspectj.lang.a;

public class XtraBox extends AbstractBox {
    private static final long FILETIME_EPOCH_DIFF = 11644473600000L;
    private static final long FILETIME_ONE_MILLISECOND = 10000;
    public static final int MP4_XTRA_BT_FILETIME = 21;
    public static final int MP4_XTRA_BT_GUID = 72;
    public static final int MP4_XTRA_BT_INT64 = 19;
    public static final int MP4_XTRA_BT_UNICODE = 8;
    public static final String TYPE = "Xtra";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_10 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_8 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_9 = null;
    ByteBuffer data;
    private boolean successfulParse = false;
    Vector<a> tags = new Vector<>();

    /* access modifiers changed from: private */
    public static class b {
        public int a;
        public String b;
        public long c;
        public byte[] d;
        public Date e;

        private b() {
        }

        static void a(b bVar, ByteBuffer byteBuffer) {
            bVar.getClass();
            try {
                byteBuffer.putInt(bVar.c());
                byteBuffer.putShort((short) bVar.a);
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                int i = bVar.a;
                if (i == 8) {
                    XtraBox.writeUtf16String(byteBuffer, bVar.b);
                } else if (i == 19) {
                    byteBuffer.putLong(bVar.c);
                } else if (i != 21) {
                    byteBuffer.put(bVar.d);
                } else {
                    byteBuffer.putLong(XtraBox.millisToFiletime(bVar.e.getTime()));
                }
            } finally {
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private int c() {
            int i;
            int i2 = this.a;
            if (i2 == 8) {
                i = (this.b.length() * 2) + 2;
            } else if (i2 == 19 || i2 == 21) {
                return 14;
            } else {
                i = this.d.length;
            }
            return i + 6;
        }

        public String toString() {
            int i = this.a;
            if (i == 8) {
                return "[string]" + this.b;
            } else if (i == 19) {
                return "[long]" + String.valueOf(this.c);
            } else if (i != 21) {
                return "[GUID](nonParsed)";
            } else {
                return "[filetime]" + this.e.toString();
            }
        }

        b(b bVar) {
        }

        b(String str, b bVar) {
            this.a = 8;
            this.b = str;
        }

        b(long j, b bVar) {
            this.a = 19;
            this.c = j;
        }

        b(Date date, b bVar) {
            this.a = 21;
            this.e = date;
        }
    }

    static {
        ajc$preClinit();
    }

    public XtraBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("XtraBox.java", XtraBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "toString", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "", "", "", "java.lang.String"), 88);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "getAllTagNames", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "", "", "", "[Ljava.lang.String;"), 151);
        ajc$tjp_10 = bpf.g("method-execution", bpf.f("1", "setTagValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:long", "name:value", "", "void"), 289);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getFirstStringValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "java.lang.String"), 166);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "getFirstDateValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "java.util.Date"), 183);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getFirstLongValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "java.lang.Long"), 200);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "getValues", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "[Ljava.lang.Object;"), 216);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "removeTag", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", "name", "", "void"), 236);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "setTagValues", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:[Ljava.lang.String;", "name:values", "", "void"), 249);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "setTagValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:java.lang.String", "name:value", "", "void"), 265);
        ajc$tjp_9 = bpf.g("method-execution", bpf.f("1", "setTagValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:java.util.Date", "name:date", "", "void"), 276);
    }

    private int detailSize() {
        int i = 0;
        for (int i2 = 0; i2 < this.tags.size(); i2++) {
            i += this.tags.elementAt(i2).f();
        }
        return i;
    }

    /* access modifiers changed from: private */
    public static long filetimeToMillis(long j) {
        return (j / FILETIME_ONE_MILLISECOND) - FILETIME_EPOCH_DIFF;
    }

    private a getTagByName(String str) {
        Iterator<a> it = this.tags.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.b.equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static long millisToFiletime(long j) {
        return (j + FILETIME_EPOCH_DIFF) * FILETIME_ONE_MILLISECOND;
    }

    /* access modifiers changed from: private */
    public static String readAsciiString(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Shouldn't happen", e);
        }
    }

    /* access modifiers changed from: private */
    public static String readUtf16String(ByteBuffer byteBuffer, int i) {
        int i2 = (i / 2) - 1;
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = byteBuffer.getChar();
        }
        byteBuffer.getChar();
        return new String(cArr);
    }

    /* access modifiers changed from: private */
    public static void writeAsciiString(ByteBuffer byteBuffer, String str) {
        try {
            byteBuffer.put(str.getBytes("US-ASCII"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Shouldn't happen", e);
        }
    }

    /* access modifiers changed from: private */
    public static void writeUtf16String(ByteBuffer byteBuffer, String str) {
        char[] charArray;
        for (char c : str.toCharArray()) {
            byteBuffer.putChar(c);
        }
        byteBuffer.putChar(0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        this.data = byteBuffer.slice();
        this.successfulParse = false;
        try {
            this.tags.clear();
            while (byteBuffer.remaining() > 0) {
                a aVar = new a(null);
                a.d(aVar, byteBuffer);
                this.tags.addElement(aVar);
            }
            int detailSize = detailSize();
            if (remaining == detailSize) {
                this.successfulParse = true;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                return;
            }
            throw new RuntimeException("Improperly handled Xtra tag: Calculated sizes don't match ( " + remaining + "/" + detailSize + ")");
        } catch (Exception e) {
            this.successfulParse = false;
            PrintStream printStream = System.err;
            printStream.println("Malformed Xtra Tag detected: " + e.toString());
            e.printStackTrace();
            byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
        } catch (Throwable th) {
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
            throw th;
        }
    }

    public String[] getAllTagNames() {
        d.a().b(bpf.b(ajc$tjp_1, this, this));
        String[] strArr = new String[this.tags.size()];
        for (int i = 0; i < this.tags.size(); i++) {
            strArr[i] = this.tags.elementAt(i).b;
        }
        return strArr;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        if (this.successfulParse) {
            for (int i = 0; i < this.tags.size(); i++) {
                a.e(this.tags.elementAt(i), byteBuffer);
            }
            return;
        }
        this.data.rewind();
        byteBuffer.put(this.data);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        int limit;
        if (this.successfulParse) {
            limit = detailSize();
        } else {
            limit = this.data.limit();
        }
        return (long) limit;
    }

    public Date getFirstDateValue(String str) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, str));
        Object[] values = getValues(str);
        for (Object obj : values) {
            if (obj instanceof Date) {
                return (Date) obj;
            }
        }
        return null;
    }

    public Long getFirstLongValue(String str) {
        d.a().b(bpf.c(ajc$tjp_4, this, this, str));
        Object[] values = getValues(str);
        for (Object obj : values) {
            if (obj instanceof Long) {
                return (Long) obj;
            }
        }
        return null;
    }

    public String getFirstStringValue(String str) {
        d.a().b(bpf.c(ajc$tjp_2, this, this, str));
        Object[] values = getValues(str);
        for (Object obj : values) {
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return null;
    }

    public Object[] getValues(String str) {
        Object obj;
        d.a().b(bpf.c(ajc$tjp_5, this, this, str));
        a tagByName = getTagByName(str);
        if (tagByName == null) {
            return new Object[0];
        }
        Object[] objArr = new Object[tagByName.c.size()];
        for (int i = 0; i < tagByName.c.size(); i++) {
            b bVar = (b) tagByName.c.elementAt(i);
            int i2 = bVar.a;
            if (i2 == 8) {
                obj = bVar.b;
            } else if (i2 == 19) {
                obj = new Long(bVar.c);
            } else if (i2 != 21) {
                obj = bVar.d;
            } else {
                obj = bVar.e;
            }
            objArr[i] = obj;
        }
        return objArr;
    }

    public void removeTag(String str) {
        d.a().b(bpf.c(ajc$tjp_6, this, this, str));
        a tagByName = getTagByName(str);
        if (tagByName != null) {
            this.tags.remove(tagByName);
        }
    }

    public void setTagValue(String str, long j) {
        d.a().b(bpf.d(ajc$tjp_10, this, this, str, new Long(j)));
        removeTag(str);
        a aVar = new a(str, null);
        aVar.c.addElement(new b(j, (b) null));
        this.tags.addElement(aVar);
    }

    public void setTagValues(String str, String[] strArr) {
        d.a().b(bpf.d(ajc$tjp_7, this, this, str, strArr));
        removeTag(str);
        a aVar = new a(str, null);
        for (String str2 : strArr) {
            aVar.c.addElement(new b(str2, (b) null));
        }
        this.tags.addElement(aVar);
    }

    public String toString() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        if (!isParsed()) {
            parseDetails();
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("XtraBox[");
        Iterator<a> it = this.tags.iterator();
        while (it.hasNext()) {
            a next = it.next();
            Iterator it2 = next.c.iterator();
            while (it2.hasNext()) {
                stringBuffer.append(next.b);
                stringBuffer.append("=");
                stringBuffer.append(((b) it2.next()).toString());
                stringBuffer.append(";");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    /* access modifiers changed from: private */
    public static class a {
        private int a;
        private String b;
        private Vector<b> c = new Vector<>();

        private a() {
        }

        static void d(a aVar, ByteBuffer byteBuffer) {
            aVar.a = byteBuffer.getInt();
            aVar.b = XtraBox.readAsciiString(byteBuffer, byteBuffer.getInt());
            int i = byteBuffer.getInt();
            for (int i2 = 0; i2 < i; i2++) {
                b bVar = new b(null);
                int i3 = byteBuffer.getInt() - 6;
                bVar.a = byteBuffer.getShort();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                int i4 = bVar.a;
                if (i4 == 8) {
                    bVar.b = XtraBox.readUtf16String(byteBuffer, i3);
                } else if (i4 == 19) {
                    bVar.c = byteBuffer.getLong();
                } else if (i4 != 21) {
                    byte[] bArr = new byte[i3];
                    bVar.d = bArr;
                    byteBuffer.get(bArr);
                } else {
                    bVar.e = new Date(XtraBox.filetimeToMillis(byteBuffer.getLong()));
                }
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                aVar.c.addElement(bVar);
            }
            if (aVar.a != aVar.f()) {
                throw new RuntimeException("Improperly handled Xtra tag: Sizes don't match ( " + aVar.a + "/" + aVar.f() + ") on " + aVar.b);
            }
        }

        static void e(a aVar, ByteBuffer byteBuffer) {
            byteBuffer.putInt(aVar.f());
            byteBuffer.putInt(aVar.b.length());
            XtraBox.writeAsciiString(byteBuffer, aVar.b);
            byteBuffer.putInt(aVar.c.size());
            for (int i = 0; i < aVar.c.size(); i++) {
                b.a(aVar.c.elementAt(i), byteBuffer);
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private int f() {
            int length = this.b.length() + 12;
            for (int i = 0; i < this.c.size(); i++) {
                length += this.c.elementAt(i).c();
            }
            return length;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.b);
            stringBuffer.append(" [");
            stringBuffer.append(this.a);
            stringBuffer.append("/");
            stringBuffer.append(this.c.size());
            stringBuffer.append("]:\n");
            for (int i = 0; i < this.c.size(); i++) {
                stringBuffer.append("  ");
                stringBuffer.append(this.c.elementAt(i).toString());
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        }

        a(a aVar) {
        }

        a(String str, a aVar) {
            this.b = str;
        }
    }

    public XtraBox(String str) {
        super(str);
    }

    public void setTagValue(String str, String str2) {
        d.a().b(bpf.d(ajc$tjp_8, this, this, str, str2));
        setTagValues(str, new String[]{str2});
    }

    public void setTagValue(String str, Date date) {
        d.a().b(bpf.d(ajc$tjp_9, this, this, str, date));
        removeTag(str);
        a aVar = new a(str, null);
        aVar.c.addElement(new b(date, (b) null));
        this.tags.addElement(aVar);
    }
}

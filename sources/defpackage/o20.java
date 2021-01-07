package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.j;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.b;
import com.google.gson.w;
import com.google.gson.x;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: o20  reason: default package */
public final class o20 extends w<Date> {
    public static final x b = new a();
    private final DateFormat a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: o20$a */
    class a implements x {
        a() {
        }

        @Override // com.google.gson.x
        public <T> w<T> b(j jVar, z20<T> z20) {
            if (z20.c() == Date.class) {
                return new o20();
            }
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.w
    public Date read(com.google.gson.stream.a aVar) {
        Date date;
        synchronized (this) {
            if (aVar.J() == JsonToken.NULL) {
                aVar.D();
                date = null;
            } else {
                try {
                    date = new Date(this.a.parse(aVar.G()).getTime());
                } catch (ParseException e) {
                    throw new JsonSyntaxException(e);
                }
            }
        }
        return date;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
    @Override // com.google.gson.w
    public void write(b bVar, Date date) {
        String str;
        Date date2 = date;
        synchronized (this) {
            if (date2 == null) {
                str = null;
            } else {
                str = this.a.format((java.util.Date) date2);
            }
            bVar.O(str);
        }
    }
}

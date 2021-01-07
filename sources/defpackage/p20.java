package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.j;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.b;
import com.google.gson.w;
import com.google.gson.x;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: p20  reason: default package */
public final class p20 extends w<Time> {
    public static final x b = new a();
    private final DateFormat a = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: p20$a */
    class a implements x {
        a() {
        }

        @Override // com.google.gson.x
        public <T> w<T> b(j jVar, z20<T> z20) {
            if (z20.c() == Time.class) {
                return new p20();
            }
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.w
    public Time read(com.google.gson.stream.a aVar) {
        synchronized (this) {
            if (aVar.J() == JsonToken.NULL) {
                aVar.D();
                return null;
            }
            try {
                return new Time(this.a.parse(aVar.G()).getTime());
            } catch (ParseException e) {
                throw new JsonSyntaxException(e);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
    @Override // com.google.gson.w
    public void write(b bVar, Time time) {
        String str;
        Time time2 = time;
        synchronized (this) {
            if (time2 == null) {
                str = null;
            } else {
                str = this.a.format((Date) time2);
            }
            bVar.O(str);
        }
    }
}

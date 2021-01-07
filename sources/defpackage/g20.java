package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.o;
import com.google.gson.internal.r;
import com.google.gson.j;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.b;
import com.google.gson.w;
import com.google.gson.x;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: g20  reason: default package */
public final class g20 extends w<Date> {
    public static final x b = new a();
    private final List<DateFormat> a;

    /* renamed from: g20$a */
    class a implements x {
        a() {
        }

        @Override // com.google.gson.x
        public <T> w<T> b(j jVar, z20<T> z20) {
            if (z20.c() == Date.class) {
                return new g20();
            }
            return null;
        }
    }

    public g20() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (o.b()) {
            arrayList.add(r.a(2, 2));
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.w
    public Date read(com.google.gson.stream.a aVar) {
        if (aVar.J() == JsonToken.NULL) {
            aVar.D();
            return null;
        }
        String G = aVar.G();
        synchronized (this) {
            for (DateFormat dateFormat : this.a) {
                try {
                    return dateFormat.parse(G);
                } catch (ParseException unused) {
                }
            }
            try {
                return v20.b(G, new ParsePosition(0));
            } catch (ParseException e) {
                throw new JsonSyntaxException(G, e);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
    @Override // com.google.gson.w
    public void write(b bVar, Date date) {
        Date date2 = date;
        synchronized (this) {
            if (date2 == null) {
                bVar.r();
            } else {
                bVar.O(this.a.get(0).format(date2));
            }
        }
    }
}

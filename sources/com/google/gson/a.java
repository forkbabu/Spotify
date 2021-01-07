package com.google.gson;

import com.google.gson.internal.o;
import com.google.gson.internal.r;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.b;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

final class a extends w<Date> {
    private final Class<? extends Date> a;
    private final List<DateFormat> b;

    public a(Class<? extends Date> cls, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        a(cls);
        this.a = cls;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (o.b()) {
            arrayList.add(r.a(i, i2));
        }
    }

    private static Class<? extends Date> a(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.w
    public Date read(com.google.gson.stream.a aVar) {
        Date date;
        Date date2;
        if (aVar.J() == JsonToken.NULL) {
            aVar.D();
            return null;
        }
        String G = aVar.G();
        synchronized (this.b) {
            Iterator<DateFormat> it = this.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    try {
                        date = it.next().parse(G);
                        break;
                    } catch (ParseException unused) {
                    }
                } else {
                    try {
                        date = v20.b(G, new ParsePosition(0));
                        break;
                    } catch (ParseException e) {
                        throw new JsonSyntaxException(G, e);
                    }
                }
            }
        }
        Class<? extends Date> cls = this.a;
        if (cls == Date.class) {
            return date;
        }
        if (cls == Timestamp.class) {
            date2 = new Timestamp(date.getTime());
        } else if (cls == java.sql.Date.class) {
            date2 = new java.sql.Date(date.getTime());
        } else {
            throw new AssertionError();
        }
        return date2;
    }

    public String toString() {
        DateFormat dateFormat = this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            StringBuilder V0 = je.V0("DefaultDateTypeAdapter(");
            V0.append(((SimpleDateFormat) dateFormat).toPattern());
            V0.append(')');
            return V0.toString();
        }
        StringBuilder V02 = je.V0("DefaultDateTypeAdapter(");
        V02.append(dateFormat.getClass().getSimpleName());
        V02.append(')');
        return V02.toString();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.stream.b, java.lang.Object] */
    @Override // com.google.gson.w
    public void write(b bVar, Date date) {
        Date date2 = date;
        if (date2 == null) {
            bVar.r();
            return;
        }
        synchronized (this.b) {
            bVar.O(this.b.get(0).format(date2));
        }
    }
}

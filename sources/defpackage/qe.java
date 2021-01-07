package defpackage;

import com.coremedia.iso.boxes.UserBox;
import com.coremedia.iso.boxes.a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: qe  reason: default package */
public class qe extends ke {
    static String[] h = new String[0];
    Properties c;
    Pattern d = Pattern.compile("(.*)\\((.*?)\\)");
    StringBuilder e = new StringBuilder();
    ThreadLocal<String> f = new ThreadLocal<>();
    ThreadLocal<String[]> g = new ThreadLocal<>();

    public qe(String... strArr) {
        InputStream resourceAsStream = qe.class.getResourceAsStream("/isoparser-default.properties");
        try {
            Properties properties = new Properties();
            this.c = properties;
            try {
                properties.load(resourceAsStream);
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                Enumeration<URL> resources = (contextClassLoader == null ? ClassLoader.getSystemClassLoader() : contextClassLoader).getResources("isoparser-custom.properties");
                while (resources.hasMoreElements()) {
                    InputStream openStream = resources.nextElement().openStream();
                    try {
                        this.c.load(openStream);
                    } finally {
                        openStream.close();
                    }
                }
                for (String str : strArr) {
                    this.c.load(getClass().getResourceAsStream(str));
                }
                try {
                    resourceAsStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        } catch (Throwable th) {
            try {
                resourceAsStream.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            throw th;
        }
    }

    @Override // defpackage.ke
    public a a(String str, byte[] bArr, String str2) {
        String str3;
        String[] strArr = h;
        if (bArr == null) {
            str3 = this.c.getProperty(str);
            if (str3 == null) {
                StringBuilder sb = this.e;
                sb.append(str2);
                sb.append('-');
                sb.append(str);
                String sb2 = sb.toString();
                this.e.setLength(0);
                str3 = this.c.getProperty(sb2);
            }
        } else if (UserBox.TYPE.equals(str)) {
            Properties properties = this.c;
            str3 = properties.getProperty("uuid[" + me.b(bArr, 0).toUpperCase() + "]");
            if (str3 == null) {
                Properties properties2 = this.c;
                str3 = properties2.getProperty(String.valueOf(str2) + "-uuid[" + me.b(bArr, 0).toUpperCase() + "]");
            }
            if (str3 == null) {
                str3 = this.c.getProperty(UserBox.TYPE);
            }
        } else {
            throw new RuntimeException("we have a userType but no uuid box type. Something's wrong");
        }
        if (str3 == null) {
            str3 = this.c.getProperty("default");
        }
        if (str3 != null) {
            if (!str3.endsWith(")")) {
                this.g.set(strArr);
                this.f.set(str3);
            } else {
                Matcher matcher = this.d.matcher(str3);
                if (matcher.matches()) {
                    this.f.set(matcher.group(1));
                    if (matcher.group(2).length() == 0) {
                        this.g.set(strArr);
                    } else {
                        this.g.set(matcher.group(2).length() > 0 ? matcher.group(2).split(",") : new String[0]);
                    }
                } else {
                    throw new RuntimeException("Cannot work with that constructor: " + str3);
                }
            }
            String[] strArr2 = this.g.get();
            try {
                Class<?> cls = Class.forName(this.f.get());
                if (strArr2.length <= 0) {
                    return (a) cls.newInstance();
                }
                Class<?>[] clsArr = new Class[strArr2.length];
                Object[] objArr = new Object[strArr2.length];
                for (int i = 0; i < strArr2.length; i++) {
                    if ("userType".equals(strArr2[i])) {
                        objArr[i] = bArr;
                        clsArr[i] = byte[].class;
                    } else if ("type".equals(strArr2[i])) {
                        objArr[i] = str;
                        clsArr[i] = String.class;
                    } else if ("parent".equals(strArr2[i])) {
                        objArr[i] = str2;
                        clsArr[i] = String.class;
                    } else {
                        throw new InternalError("No such param: " + strArr2[i]);
                    }
                }
                return (a) cls.getConstructor(clsArr).newInstance(objArr);
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException(e3);
            } catch (IllegalAccessException e4) {
                throw new RuntimeException(e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException(e5);
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException(e6);
            }
        } else {
            throw new RuntimeException("No box object found for " + str);
        }
    }
}

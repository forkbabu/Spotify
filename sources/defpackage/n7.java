package defpackage;

import android.database.Cursor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: n7  reason: default package */
public class n7 {
    public final String a;
    public final Map<String, a> b;
    public final Set<b> c;
    public final Set<d> d;

    /* renamed from: n7$a */
    public static class a {
        public final String a;
        public final String b;
        public final int c;
        public final boolean d;
        public final int e;
        public final String f;
        private final int g;

        public a(String str, String str2, boolean z, int i, String str3, int i2) {
            this.a = str;
            this.b = str2;
            this.d = z;
            this.e = i;
            int i3 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i3 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i3 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.c = i3;
            this.f = str3;
            this.g = i2;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (Build.VERSION.SDK_INT < 20) {
                if ((this.e > 0) != (aVar.e > 0)) {
                    return false;
                }
            } else if (this.e != aVar.e) {
                return false;
            }
            if (!this.a.equals(aVar.a) || this.d != aVar.d) {
                return false;
            }
            if (this.g == 1 && aVar.g == 2 && (str3 = this.f) != null && !str3.equals(aVar.f)) {
                return false;
            }
            if (this.g == 2 && aVar.g == 1 && (str2 = aVar.f) != null && !str2.equals(this.f)) {
                return false;
            }
            int i = this.g;
            if ((i == 0 || i != aVar.g || ((str = this.f) == null ? aVar.f == null : str.equals(aVar.f))) && this.c == aVar.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.c) * 31) + (this.d ? 1231 : 1237)) * 31) + this.e;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Column{name='");
            je.A(V0, this.a, '\'', ", type='");
            je.A(V0, this.b, '\'', ", affinity='");
            V0.append(this.c);
            V0.append('\'');
            V0.append(", notNull=");
            V0.append(this.d);
            V0.append(", primaryKeyPosition=");
            V0.append(this.e);
            V0.append(", defaultValue='");
            V0.append(this.f);
            V0.append('\'');
            V0.append('}');
            return V0.toString();
        }
    }

    /* renamed from: n7$b */
    public static class b {
        public final String a;
        public final String b;
        public final String c;
        public final List<String> d;
        public final List<String> e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = Collections.unmodifiableList(list);
            this.e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d)) {
                return this.e.equals(bVar.e);
            }
            return false;
        }

        public int hashCode() {
            int Y0 = je.Y0(this.c, je.Y0(this.b, this.a.hashCode() * 31, 31), 31);
            return this.e.hashCode() + ((this.d.hashCode() + Y0) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("ForeignKey{referenceTable='");
            je.A(V0, this.a, '\'', ", onDelete='");
            je.A(V0, this.b, '\'', ", onUpdate='");
            je.A(V0, this.c, '\'', ", columnNames=");
            V0.append(this.d);
            V0.append(", referenceColumnNames=");
            V0.append(this.e);
            V0.append('}');
            return V0.toString();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n7$c */
    public static class c implements Comparable<c> {
        final int a;
        final int b;
        final String c;
        final String f;

        c(int i, int i2, String str, String str2) {
            this.a = i;
            this.b = i2;
            this.c = str;
            this.f = str2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public int compareTo(c cVar) {
            c cVar2 = cVar;
            int i = this.a - cVar2.a;
            return i == 0 ? this.b - cVar2.b : i;
        }
    }

    /* renamed from: n7$d */
    public static class d {
        public final String a;
        public final boolean b;
        public final List<String> c;

        public d(String str, boolean z, List<String> list) {
            this.a = str;
            this.b = z;
            this.c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.b != dVar.b || !this.c.equals(dVar.c)) {
                return false;
            }
            if (this.a.startsWith("index_")) {
                return dVar.a.startsWith("index_");
            }
            return this.a.equals(dVar.a);
        }

        public int hashCode() {
            int i;
            if (this.a.startsWith("index_")) {
                i = -1184239155;
            } else {
                i = this.a.hashCode();
            }
            return this.c.hashCode() + (((i * 31) + (this.b ? 1 : 0)) * 31);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Index{name='");
            je.A(V0, this.a, '\'', ", unique=");
            V0.append(this.b);
            V0.append(", columns=");
            V0.append(this.c);
            V0.append('}');
            return V0.toString();
        }
    }

    public n7(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        Set<d> set3;
        this.a = str;
        this.b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            set3 = null;
        } else {
            set3 = Collections.unmodifiableSet(set2);
        }
        this.d = set3;
    }

    /* JADX INFO: finally extract failed */
    public static n7 a(p7 p7Var, String str) {
        List<c> list;
        int i;
        int i2;
        int i3;
        Cursor D1 = p7Var.D1("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (D1.getColumnCount() > 0) {
                int columnIndex = D1.getColumnIndex("name");
                int columnIndex2 = D1.getColumnIndex("type");
                int columnIndex3 = D1.getColumnIndex("notnull");
                int columnIndex4 = D1.getColumnIndex("pk");
                int columnIndex5 = D1.getColumnIndex("dflt_value");
                while (D1.moveToNext()) {
                    String string = D1.getString(columnIndex);
                    hashMap.put(string, new a(string, D1.getString(columnIndex2), D1.getInt(columnIndex3) != 0, D1.getInt(columnIndex4), D1.getString(columnIndex5), 2));
                }
            }
            D1.close();
            HashSet hashSet = new HashSet();
            Cursor D12 = p7Var.D1("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = D12.getColumnIndex("id");
                int columnIndex7 = D12.getColumnIndex("seq");
                int columnIndex8 = D12.getColumnIndex("table");
                int columnIndex9 = D12.getColumnIndex("on_delete");
                int columnIndex10 = D12.getColumnIndex("on_update");
                List<c> b2 = b(D12);
                int count = D12.getCount();
                int i4 = 0;
                while (i4 < count) {
                    D12.moveToPosition(i4);
                    if (D12.getInt(columnIndex7) != 0) {
                        i3 = columnIndex6;
                        i2 = columnIndex7;
                        list = b2;
                        i = count;
                    } else {
                        int i5 = D12.getInt(columnIndex6);
                        i3 = columnIndex6;
                        ArrayList arrayList = new ArrayList();
                        i2 = columnIndex7;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = ((ArrayList) b2).iterator();
                        while (it.hasNext()) {
                            c cVar = (c) it.next();
                            if (cVar.a == i5) {
                                arrayList.add(cVar.c);
                                arrayList2.add(cVar.f);
                            }
                            count = count;
                            b2 = b2;
                        }
                        list = b2;
                        i = count;
                        hashSet.add(new b(D12.getString(columnIndex8), D12.getString(columnIndex9), D12.getString(columnIndex10), arrayList, arrayList2));
                    }
                    i4++;
                    columnIndex6 = i3;
                    columnIndex7 = i2;
                    count = i;
                    b2 = list;
                }
                D12.close();
                Cursor D13 = p7Var.D1("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = D13.getColumnIndex("name");
                    int columnIndex12 = D13.getColumnIndex("origin");
                    int columnIndex13 = D13.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1) {
                        if (columnIndex13 != -1) {
                            HashSet hashSet3 = new HashSet();
                            while (D13.moveToNext()) {
                                if ("c".equals(D13.getString(columnIndex12))) {
                                    d c2 = c(p7Var, D13.getString(columnIndex11), D13.getInt(columnIndex13) == 1);
                                    if (c2 != null) {
                                        hashSet3.add(c2);
                                    }
                                }
                            }
                            D13.close();
                            hashSet2 = hashSet3;
                            return new n7(str, hashMap, hashSet, hashSet2);
                        }
                    }
                    return new n7(str, hashMap, hashSet, hashSet2);
                } finally {
                    D13.close();
                }
            } catch (Throwable th) {
                D12.close();
                throw th;
            }
        } catch (Throwable th2) {
            D1.close();
            throw th2;
        }
    }

    private static List<c> b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static d c(p7 p7Var, String str, boolean z) {
        Cursor D1 = p7Var.D1("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = D1.getColumnIndex("seqno");
            int columnIndex2 = D1.getColumnIndex("cid");
            int columnIndex3 = D1.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (D1.moveToNext()) {
                        if (D1.getInt(columnIndex2) >= 0) {
                            int i = D1.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i), D1.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    d dVar = new d(str, z, arrayList);
                    D1.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            D1.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || n7.class != obj.getClass()) {
            return false;
        }
        n7 n7Var = (n7) obj;
        String str = this.a;
        if (str == null ? n7Var.a != null : !str.equals(n7Var.a)) {
            return false;
        }
        Map<String, a> map = this.b;
        if (map == null ? n7Var.b != null : !map.equals(n7Var.b)) {
            return false;
        }
        Set<b> set2 = this.c;
        if (set2 == null ? n7Var.c != null : !set2.equals(n7Var.c)) {
            return false;
        }
        Set<d> set3 = this.d;
        if (set3 == null || (set = n7Var.d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TableInfo{name='");
        je.A(V0, this.a, '\'', ", columns=");
        V0.append(this.b);
        V0.append(", foreignKeys=");
        V0.append(this.c);
        V0.append(", indices=");
        V0.append(this.d);
        V0.append('}');
        return V0.toString();
    }
}

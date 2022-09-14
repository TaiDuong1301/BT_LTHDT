package bai12;

public class ListCD {
    public CD[] ls;
    int count;

    public ListCD(int n) {
        ls = new CD[n];
        count = 0;
    }
    
    public void tangKT() {
        if (ls.length == count) {
            CD[] tam = new CD[ls.length + 2];
            System.arraycopy(ls, 0, tam, 0, count);
            ls = tam;
        }
    }

    public boolean themCD(CD cdr) {
        for (int i = 0; i < count; i++)
            if (cdr.getMaCD() == ls[i].getMaCD()) {
                return false;
            }
        if (ls.length == count) {
            tangKT();
        }
        ls[count] = cdr;
        count++;
        return true;
    }

    public void inKQ() {
        System.out.println("List CD: ");
        for (CD cd : ls)
            if (cd != null)
                System.out.println(cd);
    }

    public void sapXep() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                CD tam = null;
                if (ls[i].getMaCD().compareToIgnoreCase(ls[j].getMaCD()) > 0) {
                    tam = ls[i];
                    ls[i] = ls[j];
                    ls[j] = tam;
                }
            }
        }
    }

    public int findPosCDbyMaCD(String maCD) {
        for (int i = 0; i < ls.length; i++) {
            if (ls[i].getMaCD().equalsIgnoreCase(maCD))
                return i;
        }
        return -1;
    }

    public CD findCDbyMaCd(String maCD) {
        for (int i = 0; i < ls.length; i++) {
            if (ls[i].getMaCD().equalsIgnoreCase(maCD))
                return ls[i];
        }
        return null;
    }

    

}

package bai12_CD;

public class ListCD {
    public CD[] ls;
    int count;

    public ListCD(int n) {
        ls = new CD[n];
        count = 0;
    }
    
    public boolean themCD(CD cdr) {
        for (int i = 0; i < count; i++)
            if (cdr.getMaCD() == ls[i].getMaCD()) {
                return false;
            }
            ls[count] = cdr;
            count++;
            return true;
    }

    public void inKQ() {
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

}

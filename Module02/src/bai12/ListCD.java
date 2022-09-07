package bai12;

public class ListCD {
    public CD[] list;
    int count;

    public ListCD(int n) {
        list = new CD[n];
        count = 0;
    }

    public boolean addCD(CD cd) {
        for (int i = 0; i < count; i++) {
            if (cd.getMaCD() == list[i].getMaCD()) {
                return false;
            }
        }
            list[count] = cd;
            count++;
        return true;
    }

    public void output() {
        for (CD cd : list) {
            if (cd != null) {
                System.out.println(cd);
            }
        }
    }

    public void sort() {
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                if (list[i].getMaCD().compareToIgnoreCase(list[j].getMaCD()) > 0) {
                    CD tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
            }
        }


    }
}

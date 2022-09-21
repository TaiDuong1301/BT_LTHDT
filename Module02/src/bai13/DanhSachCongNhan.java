package bai13;

public class DanhSachCongNhan {
    public CongNhan[] list;
    int soCN;
    /**
     * @brief Khởi tạo n công nhân cho danh sách công nhân
     * @param n
     */
    public DanhSachCongNhan(int n) {
        list = new CongNhan[n];
        soCN = 0;
    }

    public CongNhan[] getList() {
        return list;
    }

    public void setList(CongNhan[] list) {
        this.list = list;
    }

    public int getSoCN() {
        return soCN;
    }

    public void setSoCN(int soCN) {
        this.soCN = soCN;
    }
    /**
     * @brief Thêm một công nhân vào danh sách công nhân
     * @param cn
     * @return
     */
    public boolean themCongNhan(CongNhan cn) {
        if (list.length == soCN)
            return false;
        list[soCN] = cn;
        soCN++;
        return true;
    }

    public int findPosCNbyMaCN(String macn) {
        for (int i = 0; i < soCN; i++) {
            if (list[i].getMaCN().equalsIgnoreCase(macn))
                return i;
        }
        return -1;
    }

    public boolean xoaCongNhan(String macn) {
        int pos = findPosCNbyMaCN(macn);
        if (pos == -1)
            return false;
        for (int i = 0; i < soCN; i++) {
            list[i] = list[i+1];
            soCN--;
        }
        return true;
    }
    /**
     * @brief danh sách công nhân làm trên 200 sản phẩm
     * @return
     */
    public void dsCN200() {
        CongNhan[] cn200 = new CongNhan[soCN];
        int count = 0;
        for (int i = 0; i < soCN; i++) {
            if (list[i].getmSoSP() >= 200) {
                cn200[count] = list[i];
                count++;
            }
        }
        System.out.println("Danh Sach Cong Nhan lam tren 200 san pham:\n");
        for (CongNhan i : cn200) {
            if (i != null)
                System.out.println(i);
        }
    }
    /**
     * @brief sắp xếp công nhân theo số sản phẩm giảm dần
     */
    public void sort() {
        CongNhan temp;
        for (int i = 0; i < soCN - 1; i++) {
            for (int j = i + 1; j < soCN; j++) {
                temp = null;
                if (list[i].getmSoSP() < list[j].getmSoSP()) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    // public void sapXep() {
    //     Arrays.sort(list, 0, soCN);
    // }

    @Override
    public String toString() {
        String s = "DanhSachCongNhan:\n";
        for (CongNhan i : list) {
            if (i != null)
                s += i + "\n";
        }
        return s;
    }
}

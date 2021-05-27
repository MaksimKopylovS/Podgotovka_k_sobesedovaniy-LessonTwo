package max_sk.list;

public class ArrayList<E> {

    private Object[] mass;

    public ArrayList(Object... mass) {
        this.mass = mass;
    }

    public void add(Object object) {
        Object[] newMass = new Object[mass.length + 1];
        for (int i = 0; i < newMass.length - 1; i++) {
            newMass[i] = mass[i];
        }
        newMass[mass.length] = object;
        this.mass = newMass;
    }

    public void show() {
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
    }

    public void del(Object object) {
        Object[] o = new Object[mass.length];
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < mass.length; i++) {
            if (object.equals(mass[i])) {
                mass[i] = null;
                flag = true;
            }
            if (mass[i] != null) {
                o[index] = mass[i];
                index++;
            }
        }
        mass = o;
        if (flag) {
            mass = delZero(mass);
        }
    }


    public Object[] delZero(Object[] mass) {
        int n = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] != null) {
                n++;
            }
        }
        Object[] b = new Object[n];
        int j = 0;

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] != null) {
                b[j++] = mass[i];
            }
        }
        return b;
    }

    public Object find(Object find) {
        for (int i = 0; i < mass.length; i++) {
            if (find.equals(mass[i])) {
                return i;
            }
        }
        return -1;
    }

    public void sortVstavka() {
        int n = mass.length;
        for (int i = 0; i < n; i++) {
            int key = (int) mass[i];
            int j = i - 1;

            while ((j > -1) && ((int) mass[j] > key)) {
                mass[j + 1] = mass[j];
                j--;
            }
            mass[j + 1] = key;
        }
    }
}
